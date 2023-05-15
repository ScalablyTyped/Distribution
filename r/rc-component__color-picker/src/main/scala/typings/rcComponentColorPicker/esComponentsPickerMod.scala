package typings.rcComponentColorPicker

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentColorPicker.esInterfaceMod.BaseColorPickerProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPickerMod extends Shortcut {
  
  @JSImport("@rc-component/color-picker/es/components/Picker", JSImport.Default)
  @js.native
  val default: FC[PickerProps] = js.native
  
  type PickerProps = BaseColorPickerProps
  
  type _To = FC[PickerProps]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsPickerMod.foo` */
  override def _to: FC[PickerProps] = default
}
