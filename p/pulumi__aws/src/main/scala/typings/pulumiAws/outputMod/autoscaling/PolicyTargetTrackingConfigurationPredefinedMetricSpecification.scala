package typings.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTargetTrackingConfigurationPredefinedMetricSpecification extends js.Object {
  
  /**
    * The metric type.
    */
  var predefinedMetricType: String = js.native
  
  /**
    * Identifies the resource associated with the metric type.
    */
  var resourceLabel: js.UndefOr[String] = js.native
}
object PolicyTargetTrackingConfigurationPredefinedMetricSpecification {
  
  @scala.inline
  def apply(predefinedMetricType: String): PolicyTargetTrackingConfigurationPredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationPredefinedMetricSpecification]
  }
  
  @scala.inline
  implicit class PolicyTargetTrackingConfigurationPredefinedMetricSpecificationOps[Self <: PolicyTargetTrackingConfigurationPredefinedMetricSpecification] (val x: Self) extends AnyVal {
    
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
