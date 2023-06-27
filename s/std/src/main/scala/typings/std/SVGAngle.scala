package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to represent a value that can be an <angle> or <number> value. An SVGAngle reflected through the animVal attribute is always read only.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle)
  */
trait SVGAngle extends StObject {
  
  /* standard dom */
  val SVG_ANGLETYPE_DEG: `2`
  
  /* standard dom */
  val SVG_ANGLETYPE_GRAD: `4`
  
  /* standard dom */
  val SVG_ANGLETYPE_RAD: `3`
  
  /* standard dom */
  val SVG_ANGLETYPE_UNKNOWN: `0`
  
  /* standard dom */
  val SVG_ANGLETYPE_UNSPECIFIED: `1`
  
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
object SVGAngle {
  
  inline def apply(
    convertToSpecifiedUnits: Double => Unit,
    newValueSpecifiedUnits: (Double, Double) => Unit,
    unitType: Double,
    value: Double,
    valueAsString: java.lang.String,
    valueInSpecifiedUnits: Double
  ): SVGAngle = {
    val __obj = js.Dynamic.literal(SVG_ANGLETYPE_DEG = 2, SVG_ANGLETYPE_GRAD = 4, SVG_ANGLETYPE_RAD = 3, SVG_ANGLETYPE_UNKNOWN = 0, SVG_ANGLETYPE_UNSPECIFIED = 1, convertToSpecifiedUnits = js.Any.fromFunction1(convertToSpecifiedUnits), newValueSpecifiedUnits = js.Any.fromFunction2(newValueSpecifiedUnits), unitType = unitType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any], valueInSpecifiedUnits = valueInSpecifiedUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAngle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAngle] (val x: Self) extends AnyVal {
    
    inline def setConvertToSpecifiedUnits(value: Double => Unit): Self = StObject.set(x, "convertToSpecifiedUnits", js.Any.fromFunction1(value))
    
    inline def setNewValueSpecifiedUnits(value: (Double, Double) => Unit): Self = StObject.set(x, "newValueSpecifiedUnits", js.Any.fromFunction2(value))
    
    inline def setSVG_ANGLETYPE_DEG(value: `2`): Self = StObject.set(x, "SVG_ANGLETYPE_DEG", value.asInstanceOf[js.Any])
    
    inline def setSVG_ANGLETYPE_GRAD(value: `4`): Self = StObject.set(x, "SVG_ANGLETYPE_GRAD", value.asInstanceOf[js.Any])
    
    inline def setSVG_ANGLETYPE_RAD(value: `3`): Self = StObject.set(x, "SVG_ANGLETYPE_RAD", value.asInstanceOf[js.Any])
    
    inline def setSVG_ANGLETYPE_UNKNOWN(value: `0`): Self = StObject.set(x, "SVG_ANGLETYPE_UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setSVG_ANGLETYPE_UNSPECIFIED(value: `1`): Self = StObject.set(x, "SVG_ANGLETYPE_UNSPECIFIED", value.asInstanceOf[js.Any])
    
    inline def setUnitType(value: Double): Self = StObject.set(x, "unitType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueAsString(value: java.lang.String): Self = StObject.set(x, "valueAsString", value.asInstanceOf[js.Any])
    
    inline def setValueInSpecifiedUnits(value: Double): Self = StObject.set(x, "valueInSpecifiedUnits", value.asInstanceOf[js.Any])
  }
}
