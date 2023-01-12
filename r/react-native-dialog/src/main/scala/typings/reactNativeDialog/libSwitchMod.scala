package typings.reactNativeDialog

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.SwitchProps
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwitchMod extends Shortcut {
  
  @JSImport("react-native-dialog/lib/Switch", JSImport.Default)
  @js.native
  val default: FC[DialogSwitchProps] = js.native
  
  trait DialogSwitchProps
    extends StObject
       with SwitchProps {
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var unstableLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object DialogSwitchProps {
    
    inline def apply(): DialogSwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogSwitchProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogSwitchProps] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setUnstableLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "unstableLabelStyle", value.asInstanceOf[js.Any])
      
      inline def setUnstableLabelStyleNull: Self = StObject.set(x, "unstableLabelStyle", null)
      
      inline def setUnstableLabelStyleUndefined: Self = StObject.set(x, "unstableLabelStyle", js.undefined)
    }
  }
  
  type _To = FC[DialogSwitchProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSwitchMod.foo` */
  override def _to: FC[DialogSwitchProps] = default
}
