package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitPriceMeasurement extends StObject {
  
  var measuredType: js.UndefOr[UnitPriceMeasurementMeasuredType] = js.undefined
  
  var quantityUnit: js.UndefOr[UnitPriceMeasurementMeasuredUnit] = js.undefined
  
  var quantityValue: Double
  
  var referenceUnit: js.UndefOr[UnitPriceMeasurementMeasuredUnit] = js.undefined
  
  var referenceValue: Double
}
object UnitPriceMeasurement {
  
  inline def apply(quantityValue: Double, referenceValue: Double): UnitPriceMeasurement = {
    val __obj = js.Dynamic.literal(quantityValue = quantityValue.asInstanceOf[js.Any], referenceValue = referenceValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitPriceMeasurement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnitPriceMeasurement] (val x: Self) extends AnyVal {
    
    inline def setMeasuredType(value: UnitPriceMeasurementMeasuredType): Self = StObject.set(x, "measuredType", value.asInstanceOf[js.Any])
    
    inline def setMeasuredTypeUndefined: Self = StObject.set(x, "measuredType", js.undefined)
    
    inline def setQuantityUnit(value: UnitPriceMeasurementMeasuredUnit): Self = StObject.set(x, "quantityUnit", value.asInstanceOf[js.Any])
    
    inline def setQuantityUnitUndefined: Self = StObject.set(x, "quantityUnit", js.undefined)
    
    inline def setQuantityValue(value: Double): Self = StObject.set(x, "quantityValue", value.asInstanceOf[js.Any])
    
    inline def setReferenceUnit(value: UnitPriceMeasurementMeasuredUnit): Self = StObject.set(x, "referenceUnit", value.asInstanceOf[js.Any])
    
    inline def setReferenceUnitUndefined: Self = StObject.set(x, "referenceUnit", js.undefined)
    
    inline def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
  }
}
