package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorDocument extends js.Object {
  var errorDocument: js.UndefOr[String] = js.undefined
  var indexDocument: js.UndefOr[String] = js.undefined
  var redirectAllRequestsTo: js.UndefOr[String] = js.undefined
  var routingRules: js.UndefOr[String] = js.undefined
}

object Anon_ErrorDocument {
  @scala.inline
  def apply(
    errorDocument: String = null,
    indexDocument: String = null,
    redirectAllRequestsTo: String = null,
    routingRules: String = null
  ): Anon_ErrorDocument = {
    val __obj = js.Dynamic.literal()
    if (errorDocument != null) __obj.updateDynamic("errorDocument")(errorDocument)
    if (indexDocument != null) __obj.updateDynamic("indexDocument")(indexDocument)
    if (redirectAllRequestsTo != null) __obj.updateDynamic("redirectAllRequestsTo")(redirectAllRequestsTo)
    if (routingRules != null) __obj.updateDynamic("routingRules")(routingRules)
    __obj.asInstanceOf[Anon_ErrorDocument]
  }
}

