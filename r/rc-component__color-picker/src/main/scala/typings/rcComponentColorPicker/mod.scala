package typings.rcComponentColorPicker

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentColorPicker.esColorPickerMod.ColorPickerProps
import typings.rcComponentColorPicker.esColorPickerPanelMod.ColorPickerPanelProps
import typings.rcComponentColorPicker.esComponentsColorBlockMod.ColorBlockProps
import typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@rc-component/color-picker", JSImport.Default)
  @js.native
  val default: FC[ColorPickerProps] = js.native
  
  @JSImport("@rc-component/color-picker", "Color")
  @js.native
  open class Color protected ()
    extends typings.rcComponentColorPicker.esColorMod.Color {
    def this(color: ColorGenInput[typings.rcComponentColorPicker.esColorMod.Color]) = this()
  }
  
  @JSImport("@rc-component/color-picker", "ColorBlock")
  @js.native
  val ColorBlock: FC[ColorBlockProps] = js.native
  
  @JSImport("@rc-component/color-picker", "ColorPickerPanel")
  @js.native
  val ColorPickerPanel: FC[ColorPickerPanelProps] = js.native
  
  type _To = FC[ColorPickerProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[ColorPickerProps] = default
}
