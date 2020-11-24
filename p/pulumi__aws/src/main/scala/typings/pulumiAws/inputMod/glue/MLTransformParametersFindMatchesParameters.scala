package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MLTransformParametersFindMatchesParameters extends js.Object {
  
  /**
    * The value that is selected when tuning your transform for a balance between accuracy and cost.
    */
  var accuracyCostTradeOff: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The value to switch on or off to force the output to match the provided labels from users.
    */
  var enforceProvidedLabels: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The value selected when tuning your transform for a balance between precision and recall.
    */
  var precisionRecallTradeOff: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The name of a column that uniquely identifies rows in the source table.
    */
  var primaryKeyColumnName: js.UndefOr[Input[String]] = js.native
}
object MLTransformParametersFindMatchesParameters {
  
  @scala.inline
  def apply(): MLTransformParametersFindMatchesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MLTransformParametersFindMatchesParameters]
  }
  
  @scala.inline
  implicit class MLTransformParametersFindMatchesParametersOps[Self <: MLTransformParametersFindMatchesParameters] (val x: Self) extends AnyVal {
    
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
    def setAccuracyCostTradeOff(value: Input[Double]): Self = this.set("accuracyCostTradeOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccuracyCostTradeOff: Self = this.set("accuracyCostTradeOff", js.undefined)
    
    @scala.inline
    def setEnforceProvidedLabels(value: Input[Boolean]): Self = this.set("enforceProvidedLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceProvidedLabels: Self = this.set("enforceProvidedLabels", js.undefined)
    
    @scala.inline
    def setPrecisionRecallTradeOff(value: Input[Double]): Self = this.set("precisionRecallTradeOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecisionRecallTradeOff: Self = this.set("precisionRecallTradeOff", js.undefined)
    
    @scala.inline
    def setPrimaryKeyColumnName(value: Input[String]): Self = this.set("primaryKeyColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKeyColumnName: Self = this.set("primaryKeyColumnName", js.undefined)
  }
}
