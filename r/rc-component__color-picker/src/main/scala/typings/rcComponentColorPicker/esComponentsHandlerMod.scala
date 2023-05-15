package typings.rcComponentColorPicker

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentColorPicker.anon.Color
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsHandlerMod extends Shortcut {
  
  @JSImport("@rc-component/color-picker/es/components/Handler", JSImport.Default)
  @js.native
  val default: FC[Color] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.default
    - typings.rcComponentColorPicker.rcComponentColorPickerStrings.small
  */
  trait HandlerSize extends StObject
  object HandlerSize {
    
    inline def default: typings.rcComponentColorPicker.rcComponentColorPickerStrings.default = "default".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.default]
    
    inline def small: typings.rcComponentColorPicker.rcComponentColorPickerStrings.small = "small".asInstanceOf[typings.rcComponentColorPicker.rcComponentColorPickerStrings.small]
  }
  
  type _To = FC[Color]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsHandlerMod.foo` */
  override def _to: FC[Color] = default
}
