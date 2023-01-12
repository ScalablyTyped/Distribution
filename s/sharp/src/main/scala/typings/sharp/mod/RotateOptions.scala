package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateOptions extends StObject {
  
  /** parsed by the color module to extract values for red, green, blue and alpha. (optional, default "#000000") */
  var background: js.UndefOr[Color] = js.undefined
}
object RotateOptions {
  
  inline def apply(): RotateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotateOptions] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
  }
}
