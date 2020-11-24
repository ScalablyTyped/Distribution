package typings.reactNativeCommunityPicker

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentType
import typings.reactNativeCommunityPicker.pickerIOSMod.PickerIOSItem
import typings.reactNativeCommunityPicker.pickerMod.PickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/picker", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Picker ()
    extends typings.reactNativeCommunityPicker.pickerMod.Picker
  /* static members */
  @js.native
  object Picker extends js.Object {
    
    var Item: ComponentType[PickerItemProps] = js.native
    
    /**
      * On Android, display the options in a dialog.
      */
    var MODE_DIALOG: String = js.native
    
    /**
      * On Android, display the options in a dropdown (this is the default).
      */
    var MODE_DROPDOWN: String = js.native
  }
  
  @js.native
  class PickerIOS ()
    extends typings.reactNativeCommunityPicker.pickerIOSMod.PickerIOS
  /* static members */
  @js.native
  object PickerIOS extends js.Object {
    
    var Item: Instantiable0[PickerIOSItem] = js.native
  }
}
