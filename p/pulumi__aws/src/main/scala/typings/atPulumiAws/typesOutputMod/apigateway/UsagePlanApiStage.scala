package typings.atPulumiAws.typesOutputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanApiStage extends js.Object {
  /**
    * API Id of the associated API stage in a usage plan.
    */
  var apiId: String = js.native
  /**
    * API stage name of the associated API stage in a usage plan.
    */
  var stage: String = js.native
}

object UsagePlanApiStage {
  @scala.inline
  def apply(apiId: String, stage: String): UsagePlanApiStage = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsagePlanApiStage]
  }
}

