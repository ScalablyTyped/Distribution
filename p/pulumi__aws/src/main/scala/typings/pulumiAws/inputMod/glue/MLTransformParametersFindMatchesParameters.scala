package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MLTransformParametersFindMatchesParameters extends StObject {
  
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
  implicit class MLTransformParametersFindMatchesParametersMutableBuilder[Self <: MLTransformParametersFindMatchesParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracyCostTradeOff(value: Input[Double]): Self = StObject.set(x, "accuracyCostTradeOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyCostTradeOffUndefined: Self = StObject.set(x, "accuracyCostTradeOff", js.undefined)
    
    @scala.inline
    def setEnforceProvidedLabels(value: Input[Boolean]): Self = StObject.set(x, "enforceProvidedLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceProvidedLabelsUndefined: Self = StObject.set(x, "enforceProvidedLabels", js.undefined)
    
    @scala.inline
    def setPrecisionRecallTradeOff(value: Input[Double]): Self = StObject.set(x, "precisionRecallTradeOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionRecallTradeOffUndefined: Self = StObject.set(x, "precisionRecallTradeOff", js.undefined)
    
    @scala.inline
    def setPrimaryKeyColumnName(value: Input[String]): Self = StObject.set(x, "primaryKeyColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKeyColumnNameUndefined: Self = StObject.set(x, "primaryKeyColumnName", js.undefined)
  }
}
