package typings.rmcPicker

import typings.react.mod.Component
import typings.rmcPicker.pickerTypesMod.IPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerNativeMod {
  
  @JSImport("rmc-picker/lib/Picker.native", JSImport.Default)
  @js.native
  class default () extends Picker
  object default {
    
    /* static member */
    @JSImport("rmc-picker/lib/Picker.native", "default.Item")
    @js.native
    def Item(): Unit = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-picker/lib/Picker.native", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-picker/lib/Picker.native", "default.defaultProps.children")
      @js.native
      def children: js.Array[js.Any] = js.native
      @scala.inline
      def children_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Picker
    extends Component[IPickerProps, js.Object, js.Any] {
    
    def getValue(): js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MPicker(nextProps: js.Any): Boolean = js.native
  }
}
