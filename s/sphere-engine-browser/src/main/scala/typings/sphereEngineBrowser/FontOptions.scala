package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies options for creating a new `Font` object.
  */
trait FontOptions extends StObject {
  
  /**
    * `true` if text rendered with the font should be antialiased.  Antialiasing generally doesn't
    * look good with small font sizes, but begins to show a benefit at larger sizes. As such, it's
    * recommended that this option only be used in high-resolution games.
    * @default false
    */
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to enable automatic kerning. Kerning adjusts the spacing between each character so the
    * distance between adjacent characters appears uniform.
    * @default true
    */
  var kern: js.UndefOr[Boolean] = js.undefined
}
object FontOptions {
  
  inline def apply(): FontOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontOptions]
  }
  
  extension [Self <: FontOptions](x: Self) {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setKern(value: Boolean): Self = StObject.set(x, "kern", value.asInstanceOf[js.Any])
    
    inline def setKernUndefined: Self = StObject.set(x, "kern", js.undefined)
  }
}
