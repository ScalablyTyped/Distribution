package typings.reactDashApollo

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryDocumentNode extends js.Object {
  var query: js.UndefOr[DocumentNode] = js.undefined
}

object Anon_QueryDocumentNode {
  @scala.inline
  def apply(query: DocumentNode = null): Anon_QueryDocumentNode = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_QueryDocumentNode]
  }
}

