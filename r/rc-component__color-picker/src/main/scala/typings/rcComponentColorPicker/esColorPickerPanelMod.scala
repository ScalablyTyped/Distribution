package typings.rcComponentColorPicker

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentColorPicker.esColorMod.Color
import typings.rcComponentColorPicker.esInterfaceMod.BaseColorPickerProps
import typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerPanelMod extends Shortcut {
  
  @JSImport("@rc-component/color-picker/es/ColorPickerPanel", JSImport.Default)
  @js.native
  val default: FC[ColorPickerPanelProps] = js.native
  
  trait ColorPickerPanelProps
    extends StObject
       with BaseColorPickerProps {
    
    var defaultValue: js.UndefOr[ColorGenInput[Color]] = js.undefined
    
    /** Get panel element  */
    var panelRender: js.UndefOr[js.Function1[/* panel */ ReactElement, ReactElement]] = js.undefined
    
    var value: js.UndefOr[ColorGenInput[Color]] = js.undefined
  }
  object ColorPickerPanelProps {
    
    inline def apply(): ColorPickerPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPickerPanelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPickerPanelProps] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: ColorGenInput[Color]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setPanelRender(value: /* panel */ ReactElement => ReactElement): Self = StObject.set(x, "panelRender", js.Any.fromFunction1(value))
      
      inline def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
      
      inline def setValue(value: ColorGenInput[Color]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = FC[ColorPickerPanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `esColorPickerPanelMod.foo` */
  override def _to: FC[ColorPickerPanelProps] = default
}
