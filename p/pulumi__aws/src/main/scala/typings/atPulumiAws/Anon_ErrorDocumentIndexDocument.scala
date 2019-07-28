package typings.atPulumiAws

import typings.atPulumiAws.s3RoutingRulesMod.RoutingRule
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorDocumentIndexDocument extends js.Object {
  var errorDocument: js.UndefOr[Input[String]] = js.undefined
  var indexDocument: js.UndefOr[Input[String]] = js.undefined
  var redirectAllRequestsTo: js.UndefOr[Input[String]] = js.undefined
  var routingRules: js.UndefOr[Input[String | js.Array[RoutingRule]]] = js.undefined
}

object Anon_ErrorDocumentIndexDocument {
  @scala.inline
  def apply(
    errorDocument: Input[String] = null,
    indexDocument: Input[String] = null,
    redirectAllRequestsTo: Input[String] = null,
    routingRules: Input[String | js.Array[RoutingRule]] = null
  ): Anon_ErrorDocumentIndexDocument = {
    val __obj = js.Dynamic.literal()
    if (errorDocument != null) __obj.updateDynamic("errorDocument")(errorDocument.asInstanceOf[js.Any])
    if (indexDocument != null) __obj.updateDynamic("indexDocument")(indexDocument.asInstanceOf[js.Any])
    if (redirectAllRequestsTo != null) __obj.updateDynamic("redirectAllRequestsTo")(redirectAllRequestsTo.asInstanceOf[js.Any])
    if (routingRules != null) __obj.updateDynamic("routingRules")(routingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorDocumentIndexDocument]
  }
}

