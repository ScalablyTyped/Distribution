package typings.pulumiAws.outputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification extends js.Object {
  
  /**
    * The metric type.
    */
  var predefinedMetricType: String = js.native
  
  /**
    * Reserved for future use. Must be less than or equal to 1023 characters in length.
    */
  var resourceLabel: js.UndefOr[String] = js.native
}
object PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification {
  
  @scala.inline
  def apply(predefinedMetricType: String): PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification]
  }
  
  @scala.inline
  implicit class PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationOps[Self <: PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPredefinedMetricType(value: String): Self = this.set("predefinedMetricType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabel(value: String): Self = this.set("resourceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLabel: Self = this.set("resourceLabel", js.undefined)
  }
}
