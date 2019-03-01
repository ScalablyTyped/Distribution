package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: graphqlLib.languageAstMod.DocumentNode
  var variables: js.Any
}

object Anon_Query {
  @scala.inline
  def apply(query: graphqlLib.languageAstMod.DocumentNode, variables: js.Any): Anon_Query = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Anon_Query]
  }
}

