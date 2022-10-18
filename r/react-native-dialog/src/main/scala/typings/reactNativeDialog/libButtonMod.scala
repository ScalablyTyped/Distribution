package typings.reactNativeDialog

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonMod extends Shortcut {
  
  @JSImport("react-native-dialog/lib/Button", JSImport.Default)
  @js.native
  val default: FC[DialogButtonProps] = js.native
  
  trait DialogButtonProps
    extends StObject
       with TextProps {
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[ColorValue] = js.undefined
    
    var label: ReactNode
    
    @JSName("onPress")
    def onPress_MDialogButtonProps(): Unit
  }
  object DialogButtonProps {
    
    inline def apply(onPress: () => Unit): DialogButtonProps = {
      val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
      __obj.asInstanceOf[DialogButtonProps]
    }
    
    extension [Self <: DialogButtonProps](x: Self) {
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    }
  }
  
  type _To = FC[DialogButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libButtonMod.foo` */
  override def _to: FC[DialogButtonProps] = default
}
