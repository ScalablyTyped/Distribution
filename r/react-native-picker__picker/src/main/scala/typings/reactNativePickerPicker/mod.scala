package typings.reactNativePickerPicker

import typings.react.mod.ComponentType
import typings.reactNativePickerPicker.reactNativePickerPickerStrings.dialog
import typings.reactNativePickerPicker.reactNativePickerPickerStrings.dropdown
import typings.reactNativePickerPicker.typingsPickerIOSMod.PickerIOSProps
import typings.reactNativePickerPicker.typingsPickerMod.PickerItemProps
import typings.reactNativePickerPicker.typingsPickerMod.PickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-picker/picker", "Picker")
  @js.native
  open class Picker[T] protected ()
    extends typings.reactNativePickerPicker.typingsPickerMod.Picker[T] {
    def this(props: PickerProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerProps[T], context: Any) = this()
  }
  object Picker {
    
    @JSImport("@react-native-picker/picker", "Picker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@react-native-picker/picker", "Picker.Item")
    @js.native
    def Item: ComponentType[
        PickerItemProps[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T */ Any
        ]
      ] = js.native
    inline def Item_=(
      x: ComponentType[
          PickerItemProps[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T */ Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dialog (this is the default).
      */
    /* static member */
    @JSImport("@react-native-picker/picker", "Picker.MODE_DIALOG")
    @js.native
    val MODE_DIALOG: dialog = js.native
    
    /**
      * On Android, display the options in a dropdown.
      */
    /* static member */
    @JSImport("@react-native-picker/picker", "Picker.MODE_DROPDOWN")
    @js.native
    val MODE_DROPDOWN: dropdown = js.native
  }
  
  @JSImport("@react-native-picker/picker", "PickerIOS")
  @js.native
  open class PickerIOS protected ()
    extends typings.reactNativePickerPicker.typingsPickerIOSMod.PickerIOS {
    def this(props: PickerIOSProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerIOSProps, context: Any) = this()
  }
  object PickerIOS {
    
    /* was `typeof PickerIOSItem` */
    @JSImport("@react-native-picker/picker", "PickerIOS.Item")
    @js.native
    open class Item ()
      extends typings.reactNativePickerPicker.typingsPickerIOSMod.PickerIOS.Item
  }
}
