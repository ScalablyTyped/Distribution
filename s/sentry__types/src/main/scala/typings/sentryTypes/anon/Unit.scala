package typings.sentryTypes.anon

import typings.sentryTypes.typesMeasurementMod.MeasurementUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unit extends StObject {
  
  var unit: MeasurementUnit
  
  var value: Double
}
object Unit {
  
  inline def apply(unit: MeasurementUnit, value: Double): Unit = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
    
    inline def setUnit(value: MeasurementUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
