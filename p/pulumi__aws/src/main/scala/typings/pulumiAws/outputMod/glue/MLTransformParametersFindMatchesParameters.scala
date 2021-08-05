package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MLTransformParametersFindMatchesParameters extends StObject {
  
  /**
    * The value that is selected when tuning your transform for a balance between accuracy and cost.
    */
  var accuracyCostTradeOff: js.UndefOr[Double] = js.undefined
  
  /**
    * The value to switch on or off to force the output to match the provided labels from users.
    */
  var enforceProvidedLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value selected when tuning your transform for a balance between precision and recall.
    */
  var precisionRecallTradeOff: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of a column that uniquely identifies rows in the source table.
    */
  var primaryKeyColumnName: js.UndefOr[String] = js.undefined
}
object MLTransformParametersFindMatchesParameters {
  
  inline def apply(): MLTransformParametersFindMatchesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MLTransformParametersFindMatchesParameters]
  }
  
  extension [Self <: MLTransformParametersFindMatchesParameters](x: Self) {
    
    inline def setAccuracyCostTradeOff(value: Double): Self = StObject.set(x, "accuracyCostTradeOff", value.asInstanceOf[js.Any])
    
    inline def setAccuracyCostTradeOffUndefined: Self = StObject.set(x, "accuracyCostTradeOff", js.undefined)
    
    inline def setEnforceProvidedLabels(value: Boolean): Self = StObject.set(x, "enforceProvidedLabels", value.asInstanceOf[js.Any])
    
    inline def setEnforceProvidedLabelsUndefined: Self = StObject.set(x, "enforceProvidedLabels", js.undefined)
    
    inline def setPrecisionRecallTradeOff(value: Double): Self = StObject.set(x, "precisionRecallTradeOff", value.asInstanceOf[js.Any])
    
    inline def setPrecisionRecallTradeOffUndefined: Self = StObject.set(x, "precisionRecallTradeOff", js.undefined)
    
    inline def setPrimaryKeyColumnName(value: String): Self = StObject.set(x, "primaryKeyColumnName", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyColumnNameUndefined: Self = StObject.set(x, "primaryKeyColumnName", js.undefined)
  }
}
