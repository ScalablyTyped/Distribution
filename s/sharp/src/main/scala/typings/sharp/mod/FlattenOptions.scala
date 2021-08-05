package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlattenOptions extends StObject {
  
  /** background colour, parsed by the color module, defaults to black. (optional, default {r:0,g:0,b:0}) */
  var background: js.UndefOr[Color] = js.undefined
}
object FlattenOptions {
  
  inline def apply(): FlattenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlattenOptions]
  }
  
  extension [Self <: FlattenOptions](x: Self) {
    
    inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
  }
}
