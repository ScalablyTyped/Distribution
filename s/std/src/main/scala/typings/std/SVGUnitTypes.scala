package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A commonly used set of constants used for reflecting gradientUnits, patternContentUnits and other similar attributes.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGUnitTypes)
  */
trait SVGUnitTypes extends StObject {
  
  /* standard dom */
  val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: `2`
  
  /* standard dom */
  val SVG_UNIT_TYPE_UNKNOWN: `0`
  
  /* standard dom */
  val SVG_UNIT_TYPE_USERSPACEONUSE: `1`
}
object SVGUnitTypes {
  
  inline def apply(): SVGUnitTypes = {
    val __obj = js.Dynamic.literal(SVG_UNIT_TYPE_OBJECTBOUNDINGBOX = 2, SVG_UNIT_TYPE_UNKNOWN = 0, SVG_UNIT_TYPE_USERSPACEONUSE = 1)
    __obj.asInstanceOf[SVGUnitTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGUnitTypes] (val x: Self) extends AnyVal {
    
    inline def setSVG_UNIT_TYPE_OBJECTBOUNDINGBOX(value: `2`): Self = StObject.set(x, "SVG_UNIT_TYPE_OBJECTBOUNDINGBOX", value.asInstanceOf[js.Any])
    
    inline def setSVG_UNIT_TYPE_UNKNOWN(value: `0`): Self = StObject.set(x, "SVG_UNIT_TYPE_UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setSVG_UNIT_TYPE_USERSPACEONUSE(value: `1`): Self = StObject.set(x, "SVG_UNIT_TYPE_USERSPACEONUSE", value.asInstanceOf[js.Any])
  }
}
