package typings.pulumiAws.inputMod.autoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTargetTrackingConfiguration extends js.Object {
  
  /**
    * A customized metric. Conflicts with `predefinedMetricSpecification`.
    */
  var customizedMetricSpecification: js.UndefOr[Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecification]] = js.native
  
  /**
    * Indicates whether scale in by the target tracking policy is disabled.
    */
  var disableScaleIn: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A predefined metric. Conflicts with `customizedMetricSpecification`.
    */
  var predefinedMetricSpecification: js.UndefOr[Input[PolicyTargetTrackingConfigurationPredefinedMetricSpecification]] = js.native
  
  /**
    * The target value for the metric.
    */
  var targetValue: Input[Double] = js.native
}
object PolicyTargetTrackingConfiguration {
  
  @scala.inline
  def apply(targetValue: Input[Double]): PolicyTargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfiguration]
  }
  
  @scala.inline
  implicit class PolicyTargetTrackingConfigurationOps[Self <: PolicyTargetTrackingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setTargetValue(value: Input[Double]): Self = this.set("targetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizedMetricSpecification(value: Input[PolicyTargetTrackingConfigurationCustomizedMetricSpecification]): Self = this.set("customizedMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomizedMetricSpecification: Self = this.set("customizedMetricSpecification", js.undefined)
    
    @scala.inline
    def setDisableScaleIn(value: Input[Boolean]): Self = this.set("disableScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableScaleIn: Self = this.set("disableScaleIn", js.undefined)
    
    @scala.inline
    def setPredefinedMetricSpecification(value: Input[PolicyTargetTrackingConfigurationPredefinedMetricSpecification]): Self = this.set("predefinedMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredefinedMetricSpecification: Self = this.set("predefinedMetricSpecification", js.undefined)
  }
}
