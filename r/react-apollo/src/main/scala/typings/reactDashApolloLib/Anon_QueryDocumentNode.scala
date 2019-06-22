package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryDocumentNode extends js.Object {
  var query: js.UndefOr[graphqlLib.languageAstMod.DocumentNode] = js.undefined
}

object Anon_QueryDocumentNode {
  @scala.inline
  def apply(query: graphqlLib.languageAstMod.DocumentNode = null): Anon_QueryDocumentNode = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_QueryDocumentNode]
  }
}

