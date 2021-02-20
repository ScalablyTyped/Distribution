package typings.rmcPicker

import typings.react.mod.ComponentType
import typings.reactNative.mod.Picker
import typings.reactNative.mod.PickerItemProps
import typings.reactNative.mod.PickerProps
import typings.rmcPicker.anon.ReadonlyPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativePickerIosMod {
  
  @JSImport("rmc-picker/lib/NativePicker.ios", JSImport.Default)
  @js.native
  class default protected () extends Picker {
    def this(props: PickerProps) = this()
    def this(props: ReadonlyPickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerProps, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rmc-picker/lib/NativePicker.ios", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-picker/lib/NativePicker.ios", "default.Item")
    @js.native
    def Item: ComponentType[PickerItemProps] = js.native
    @scala.inline
    def Item_=(x: ComponentType[PickerItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dialog.
      */
    @JSImport("rmc-picker/lib/NativePicker.ios", "default.MODE_DIALOG")
    @js.native
    def MODE_DIALOG: String = js.native
    @scala.inline
    def MODE_DIALOG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DIALOG")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dropdown (this is the default).
      */
    @JSImport("rmc-picker/lib/NativePicker.ios", "default.MODE_DROPDOWN")
    @js.native
    def MODE_DROPDOWN: String = js.native
    @scala.inline
    def MODE_DROPDOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DROPDOWN")(x.asInstanceOf[js.Any])
  }
}
