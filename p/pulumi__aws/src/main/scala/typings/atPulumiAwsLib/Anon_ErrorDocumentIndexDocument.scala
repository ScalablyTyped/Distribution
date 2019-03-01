package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorDocumentIndexDocument extends js.Object {
  var errorDocument: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var indexDocument: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var redirectAllRequestsTo: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var routingRules: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_ErrorDocumentIndexDocument {
  @scala.inline
  def apply(
    errorDocument: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    indexDocument: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    redirectAllRequestsTo: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    routingRules: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ErrorDocumentIndexDocument = {
    val __obj = js.Dynamic.literal()
    if (errorDocument != null) __obj.updateDynamic("errorDocument")(errorDocument.asInstanceOf[js.Any])
    if (indexDocument != null) __obj.updateDynamic("indexDocument")(indexDocument.asInstanceOf[js.Any])
    if (redirectAllRequestsTo != null) __obj.updateDynamic("redirectAllRequestsTo")(redirectAllRequestsTo.asInstanceOf[js.Any])
    if (routingRules != null) __obj.updateDynamic("routingRules")(routingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorDocumentIndexDocument]
  }
}

