package typings.reactNativeCommunityPicker

import typings.react.mod.ComponentType
import typings.reactNativeCommunityPicker.pickerIOSMod.PickerIOSProps
import typings.reactNativeCommunityPicker.pickerMod.PickerItemProps
import typings.reactNativeCommunityPicker.pickerMod.PickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/picker", "Picker")
  @js.native
  open class Picker protected ()
    extends typings.reactNativeCommunityPicker.pickerMod.Picker {
    def this(props: PickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerProps, context: Any) = this()
  }
  object Picker {
    
    @JSImport("@react-native-community/picker", "Picker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@react-native-community/picker", "Picker.Item")
    @js.native
    def Item: ComponentType[PickerItemProps] = js.native
    inline def Item_=(x: ComponentType[PickerItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dialog.
      */
    /* static member */
    @JSImport("@react-native-community/picker", "Picker.MODE_DIALOG")
    @js.native
    def MODE_DIALOG: String = js.native
    inline def MODE_DIALOG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DIALOG")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dropdown (this is the default).
      */
    /* static member */
    @JSImport("@react-native-community/picker", "Picker.MODE_DROPDOWN")
    @js.native
    def MODE_DROPDOWN: String = js.native
    inline def MODE_DROPDOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DROPDOWN")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-native-community/picker", "PickerIOS")
  @js.native
  open class PickerIOS protected ()
    extends typings.reactNativeCommunityPicker.pickerIOSMod.PickerIOS {
    def this(props: PickerIOSProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerIOSProps, context: Any) = this()
  }
  object PickerIOS {
    
    /* was `typeof PickerIOSItem` */
    @JSImport("@react-native-community/picker", "PickerIOS.Item")
    @js.native
    open class Item ()
      extends typings.reactNativeCommunityPicker.pickerIOSMod.PickerIOS.Item
  }
}
