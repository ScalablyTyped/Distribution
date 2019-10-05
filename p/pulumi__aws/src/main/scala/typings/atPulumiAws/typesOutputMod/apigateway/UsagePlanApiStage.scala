package typings.atPulumiAws.typesOutputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlanApiStage extends js.Object {
  /**
    * API Id of the associated API stage in a usage plan.
    */
  var apiId: String
  /**
    * API stage name of the associated API stage in a usage plan.
    */
  var stage: String
}

object UsagePlanApiStage {
  @scala.inline
  def apply(apiId: String, stage: String): UsagePlanApiStage = {
    val __obj = js.Dynamic.literal(apiId = apiId, stage = stage)
  
    __obj.asInstanceOf[UsagePlanApiStage]
  }
}

