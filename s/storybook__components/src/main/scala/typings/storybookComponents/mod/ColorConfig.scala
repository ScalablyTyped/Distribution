package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorConfig
  extends StObject
     with _Control {
  
  var presetColors: js.UndefOr[js.Array[PresetColor]] = js.undefined
  
  var startOpen: js.UndefOr[Boolean] = js.undefined
}
object ColorConfig {
  
  inline def apply(): ColorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorConfig] (val x: Self) extends AnyVal {
    
    inline def setPresetColors(value: js.Array[PresetColor]): Self = StObject.set(x, "presetColors", value.asInstanceOf[js.Any])
    
    inline def setPresetColorsUndefined: Self = StObject.set(x, "presetColors", js.undefined)
    
    inline def setPresetColorsVarargs(value: PresetColor*): Self = StObject.set(x, "presetColors", js.Array(value*))
    
    inline def setStartOpen(value: Boolean): Self = StObject.set(x, "startOpen", value.asInstanceOf[js.Any])
    
    inline def setStartOpenUndefined: Self = StObject.set(x, "startOpen", js.undefined)
  }
}
