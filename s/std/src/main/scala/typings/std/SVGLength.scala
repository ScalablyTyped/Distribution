package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Correspond to the <length> basic data type. */
trait SVGLength extends StObject {
  
  /* standard dom */
  val SVG_LENGTHTYPE_CM: Double
  
  /* standard dom */
  val SVG_LENGTHTYPE_EMS: Double
  
  /* standard dom */
  val SVG_LENGTHTYPE_EXS: Double
  
  /* standard dom */
  val SVG_LENGTHTYPE_IN: Double
  
  /* standard dom */
  val SVG_LENGTHTYPE_MM: Double
  
  /* standard dom */
  val SVG_LENGTHTYPE_NUMBER: Double
  
  /* standard dom */
  val SVG_LENGTHTYPE_PC: Double
  
  /* standard dom */
  val SVG_LENGTHTYPE_PERCENTAGE: Double
  
  /* standard dom */
  val SVG_LENGTHTYPE_PT: Double
  
  /* standard dom */
  val SVG_LENGTHTYPE_PX: Double
  
  /* standard dom */
  val SVG_LENGTHTYPE_UNKNOWN: Double
  
  /* standard dom */
  def convertToSpecifiedUnits(unitType: Double): Unit
  
  /* standard dom */
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit
  
  /* standard dom */
  val unitType: Double
  
  /* standard dom */
  var value: Double
  
  /* standard dom */
  var valueAsString: java.lang.String
  
  /* standard dom */
  var valueInSpecifiedUnits: Double
}
object SVGLength {
  
  inline def apply(
    SVG_LENGTHTYPE_CM: Double,
    SVG_LENGTHTYPE_EMS: Double,
    SVG_LENGTHTYPE_EXS: Double,
    SVG_LENGTHTYPE_IN: Double,
    SVG_LENGTHTYPE_MM: Double,
    SVG_LENGTHTYPE_NUMBER: Double,
    SVG_LENGTHTYPE_PC: Double,
    SVG_LENGTHTYPE_PERCENTAGE: Double,
    SVG_LENGTHTYPE_PT: Double,
    SVG_LENGTHTYPE_PX: Double,
    SVG_LENGTHTYPE_UNKNOWN: Double,
    convertToSpecifiedUnits: Double => Unit,
    newValueSpecifiedUnits: (Double, Double) => Unit,
    unitType: Double,
    value: Double,
    valueAsString: java.lang.String,
    valueInSpecifiedUnits: Double
  ): SVGLength = {
    val __obj = js.Dynamic.literal(SVG_LENGTHTYPE_CM = SVG_LENGTHTYPE_CM.asInstanceOf[js.Any], SVG_LENGTHTYPE_EMS = SVG_LENGTHTYPE_EMS.asInstanceOf[js.Any], SVG_LENGTHTYPE_EXS = SVG_LENGTHTYPE_EXS.asInstanceOf[js.Any], SVG_LENGTHTYPE_IN = SVG_LENGTHTYPE_IN.asInstanceOf[js.Any], SVG_LENGTHTYPE_MM = SVG_LENGTHTYPE_MM.asInstanceOf[js.Any], SVG_LENGTHTYPE_NUMBER = SVG_LENGTHTYPE_NUMBER.asInstanceOf[js.Any], SVG_LENGTHTYPE_PC = SVG_LENGTHTYPE_PC.asInstanceOf[js.Any], SVG_LENGTHTYPE_PERCENTAGE = SVG_LENGTHTYPE_PERCENTAGE.asInstanceOf[js.Any], SVG_LENGTHTYPE_PT = SVG_LENGTHTYPE_PT.asInstanceOf[js.Any], SVG_LENGTHTYPE_PX = SVG_LENGTHTYPE_PX.asInstanceOf[js.Any], SVG_LENGTHTYPE_UNKNOWN = SVG_LENGTHTYPE_UNKNOWN.asInstanceOf[js.Any], convertToSpecifiedUnits = js.Any.fromFunction1(convertToSpecifiedUnits), newValueSpecifiedUnits = js.Any.fromFunction2(newValueSpecifiedUnits), unitType = unitType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any], valueInSpecifiedUnits = valueInSpecifiedUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGLength] (val x: Self) extends AnyVal {
    
    inline def setConvertToSpecifiedUnits(value: Double => Unit): Self = StObject.set(x, "convertToSpecifiedUnits", js.Any.fromFunction1(value))
    
    inline def setNewValueSpecifiedUnits(value: (Double, Double) => Unit): Self = StObject.set(x, "newValueSpecifiedUnits", js.Any.fromFunction2(value))
    
    inline def setSVG_LENGTHTYPE_CM(value: Double): Self = StObject.set(x, "SVG_LENGTHTYPE_CM", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_EMS(value: Double): Self = StObject.set(x, "SVG_LENGTHTYPE_EMS", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_EXS(value: Double): Self = StObject.set(x, "SVG_LENGTHTYPE_EXS", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_IN(value: Double): Self = StObject.set(x, "SVG_LENGTHTYPE_IN", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_MM(value: Double): Self = StObject.set(x, "SVG_LENGTHTYPE_MM", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_NUMBER(value: Double): Self = StObject.set(x, "SVG_LENGTHTYPE_NUMBER", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_PC(value: Double): Self = StObject.set(x, "SVG_LENGTHTYPE_PC", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_PERCENTAGE(value: Double): Self = StObject.set(x, "SVG_LENGTHTYPE_PERCENTAGE", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_PT(value: Double): Self = StObject.set(x, "SVG_LENGTHTYPE_PT", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_PX(value: Double): Self = StObject.set(x, "SVG_LENGTHTYPE_PX", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_UNKNOWN(value: Double): Self = StObject.set(x, "SVG_LENGTHTYPE_UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setUnitType(value: Double): Self = StObject.set(x, "unitType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueAsString(value: java.lang.String): Self = StObject.set(x, "valueAsString", value.asInstanceOf[js.Any])
    
    inline def setValueInSpecifiedUnits(value: Double): Self = StObject.set(x, "valueInSpecifiedUnits", value.asInstanceOf[js.Any])
  }
}
