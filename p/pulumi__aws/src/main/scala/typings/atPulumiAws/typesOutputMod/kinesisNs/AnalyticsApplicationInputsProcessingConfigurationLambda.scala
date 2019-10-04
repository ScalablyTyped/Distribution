package typings.atPulumiAws.typesOutputMod.kinesisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsProcessingConfigurationLambda extends js.Object {
  var resourceArn: String
  var roleArn: String
}

object AnalyticsApplicationInputsProcessingConfigurationLambda {
  @scala.inline
  def apply(resourceArn: String, roleArn: String): AnalyticsApplicationInputsProcessingConfigurationLambda = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, roleArn = roleArn)
  
    __obj.asInstanceOf[AnalyticsApplicationInputsProcessingConfigurationLambda]
  }
}

