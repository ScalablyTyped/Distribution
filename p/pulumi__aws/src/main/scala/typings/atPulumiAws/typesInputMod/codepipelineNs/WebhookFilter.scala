package typings.atPulumiAws.typesInputMod.codepipelineNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookFilter extends js.Object {
  var jsonPath: Input[String]
  var matchEquals: Input[String]
}

object WebhookFilter {
  @scala.inline
  def apply(jsonPath: Input[String], matchEquals: Input[String]): WebhookFilter = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], matchEquals = matchEquals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookFilter]
  }
}

