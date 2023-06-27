package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`10`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import typings.std.stdInts.`6`
import typings.std.stdInts.`7`
import typings.std.stdInts.`8`
import typings.std.stdInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Correspond to the <length> basic data type.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength)
  */
trait SVGLength extends StObject {
  
  /* standard dom */
  val SVG_LENGTHTYPE_CM: `6`
  
  /* standard dom */
  val SVG_LENGTHTYPE_EMS: `3`
  
  /* standard dom */
  val SVG_LENGTHTYPE_EXS: `4`
  
  /* standard dom */
  val SVG_LENGTHTYPE_IN: `8`
  
  /* standard dom */
  val SVG_LENGTHTYPE_MM: `7`
  
  /* standard dom */
  val SVG_LENGTHTYPE_NUMBER: `1`
  
  /* standard dom */
  val SVG_LENGTHTYPE_PC: `10`
  
  /* standard dom */
  val SVG_LENGTHTYPE_PERCENTAGE: `2`
  
  /* standard dom */
  val SVG_LENGTHTYPE_PT: `9`
  
  /* standard dom */
  val SVG_LENGTHTYPE_PX: `5`
  
  /* standard dom */
  val SVG_LENGTHTYPE_UNKNOWN: `0`
  
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
    convertToSpecifiedUnits: Double => Unit,
    newValueSpecifiedUnits: (Double, Double) => Unit,
    unitType: Double,
    value: Double,
    valueAsString: java.lang.String,
    valueInSpecifiedUnits: Double
  ): SVGLength = {
    val __obj = js.Dynamic.literal(SVG_LENGTHTYPE_CM = 6, SVG_LENGTHTYPE_EMS = 3, SVG_LENGTHTYPE_EXS = 4, SVG_LENGTHTYPE_IN = 8, SVG_LENGTHTYPE_MM = 7, SVG_LENGTHTYPE_NUMBER = 1, SVG_LENGTHTYPE_PC = 10, SVG_LENGTHTYPE_PERCENTAGE = 2, SVG_LENGTHTYPE_PT = 9, SVG_LENGTHTYPE_PX = 5, SVG_LENGTHTYPE_UNKNOWN = 0, convertToSpecifiedUnits = js.Any.fromFunction1(convertToSpecifiedUnits), newValueSpecifiedUnits = js.Any.fromFunction2(newValueSpecifiedUnits), unitType = unitType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any], valueInSpecifiedUnits = valueInSpecifiedUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGLength] (val x: Self) extends AnyVal {
    
    inline def setConvertToSpecifiedUnits(value: Double => Unit): Self = StObject.set(x, "convertToSpecifiedUnits", js.Any.fromFunction1(value))
    
    inline def setNewValueSpecifiedUnits(value: (Double, Double) => Unit): Self = StObject.set(x, "newValueSpecifiedUnits", js.Any.fromFunction2(value))
    
    inline def setSVG_LENGTHTYPE_CM(value: `6`): Self = StObject.set(x, "SVG_LENGTHTYPE_CM", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_EMS(value: `3`): Self = StObject.set(x, "SVG_LENGTHTYPE_EMS", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_EXS(value: `4`): Self = StObject.set(x, "SVG_LENGTHTYPE_EXS", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_IN(value: `8`): Self = StObject.set(x, "SVG_LENGTHTYPE_IN", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_MM(value: `7`): Self = StObject.set(x, "SVG_LENGTHTYPE_MM", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_NUMBER(value: `1`): Self = StObject.set(x, "SVG_LENGTHTYPE_NUMBER", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_PC(value: `10`): Self = StObject.set(x, "SVG_LENGTHTYPE_PC", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_PERCENTAGE(value: `2`): Self = StObject.set(x, "SVG_LENGTHTYPE_PERCENTAGE", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_PT(value: `9`): Self = StObject.set(x, "SVG_LENGTHTYPE_PT", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_PX(value: `5`): Self = StObject.set(x, "SVG_LENGTHTYPE_PX", value.asInstanceOf[js.Any])
    
    inline def setSVG_LENGTHTYPE_UNKNOWN(value: `0`): Self = StObject.set(x, "SVG_LENGTHTYPE_UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setUnitType(value: Double): Self = StObject.set(x, "unitType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueAsString(value: java.lang.String): Self = StObject.set(x, "valueAsString", value.asInstanceOf[js.Any])
    
    inline def setValueInSpecifiedUnits(value: Double): Self = StObject.set(x, "valueInSpecifiedUnits", value.asInstanceOf[js.Any])
  }
}
