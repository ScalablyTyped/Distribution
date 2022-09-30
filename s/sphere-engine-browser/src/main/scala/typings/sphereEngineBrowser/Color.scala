package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an RGBA color value for use in rendering operations.
  */
trait Color extends StObject {
  
  /**
    * The value of the color's alpha component, representing its opacity. Use values less than 1.0
    * for translucency.
    */
  var a: Double
  
  /** The value of the color's blue component. */
  var b: Double
  
  /**
    * Gets a new `Color` with the same RGB as this one but with its alpha multiplied by the given
    * factor. Useful for implementing transitions.
    */
  def fadeTo(alphaFactor: Double): Color
  
  /** The value of the color's green component. */
  var g: Double
  
  /** The X11 name of the color for known colors, or else its HTML representation, e.g. `#FF8080FF`. */
  var name: String
  
  /** The value of the color's red component. */
  var r: Double
}
object Color {
  
  inline def apply(a: Double, b: Double, fadeTo: Double => Color, g: Double, name: String, r: Double): Color = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], fadeTo = js.Any.fromFunction1(fadeTo), g = g.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setFadeTo(value: Double => Color): Self = StObject.set(x, "fadeTo", js.Any.fromFunction1(value))
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
