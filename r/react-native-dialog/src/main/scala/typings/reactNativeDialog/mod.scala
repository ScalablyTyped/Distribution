package typings.reactNativeDialog

import typings.react.mod.FC
import typings.reactNative.mod.TextProps
import typings.reactNativeDialog.libButtonMod.DialogButtonProps
import typings.reactNativeDialog.libCodeInputMod.DialogCodeInputProps
import typings.reactNativeDialog.libContainerMod.DialogContainerProps
import typings.reactNativeDialog.libInputMod.DialogInputProps
import typings.reactNativeDialog.libSwitchMod.DialogSwitchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-dialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-dialog", "default.Button")
    @js.native
    def Button: FC[DialogButtonProps] = js.native
    inline def Button_=(x: FC[DialogButtonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-dialog", "default.CodeInput")
    @js.native
    def CodeInput: FC[DialogCodeInputProps] = js.native
    inline def CodeInput_=(x: FC[DialogCodeInputProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CodeInput")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-dialog", "default.Container")
    @js.native
    def Container: FC[DialogContainerProps] = js.native
    inline def Container_=(x: FC[DialogContainerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-dialog", "default.Description")
    @js.native
    def Description: FC[TextProps] = js.native
    inline def Description_=(x: FC[TextProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Description")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-dialog", "default.Input")
    @js.native
    def Input: FC[DialogInputProps] = js.native
    inline def Input_=(x: FC[DialogInputProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Input")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-dialog", "default.Switch")
    @js.native
    def Switch: FC[DialogSwitchProps] = js.native
    inline def Switch_=(x: FC[DialogSwitchProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Switch")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-dialog", "default.Title")
    @js.native
    def Title: FC[TextProps] = js.native
    inline def Title_=(x: FC[TextProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  }
}
