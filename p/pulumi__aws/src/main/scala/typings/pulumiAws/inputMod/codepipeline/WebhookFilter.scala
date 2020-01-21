package typings.pulumiAws.inputMod.codepipeline

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookFilter extends js.Object {
  var jsonPath: Input[String] = js.native
  var matchEquals: Input[String] = js.native
}

object WebhookFilter {
  @scala.inline
  def apply(jsonPath: Input[String], matchEquals: Input[String]): WebhookFilter = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], matchEquals = matchEquals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookFilter]
  }
}

