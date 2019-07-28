package typings.reactDashApollo

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: DocumentNode
  var variables: js.Any
}

object Anon_Query {
  @scala.inline
  def apply(query: DocumentNode, variables: js.Any): Anon_Query = {
    val __obj = js.Dynamic.literal(query = query, variables = variables)
  
    __obj.asInstanceOf[Anon_Query]
  }
}

