package typings.pulumiAws.inputMod.apigateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanApiStage extends js.Object {
  /**
    * API Id of the associated API stage in a usage plan.
    */
  var apiId: Input[String] = js.native
  /**
    * API stage name of the associated API stage in a usage plan.
    */
  var stage: Input[String] = js.native
}

object UsagePlanApiStage {
  @scala.inline
  def apply(apiId: Input[String], stage: Input[String]): UsagePlanApiStage = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanApiStage]
  }
}

