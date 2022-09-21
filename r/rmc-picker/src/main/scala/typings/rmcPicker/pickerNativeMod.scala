package typings.rmcPicker

import typings.react.mod.Component
import typings.rmcPicker.pickerTypesMod.IPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerNativeMod {
  
  @JSImport("rmc-picker/lib/Picker.native", JSImport.Default)
  @js.native
  open class default () extends Picker
  object default {
    
    @JSImport("rmc-picker/lib/Picker.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def Item(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")().asInstanceOf[Unit]
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-picker/lib/Picker.native", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-picker/lib/Picker.native", "default.defaultProps.children")
      @js.native
      def children: js.Array[Any] = js.native
      inline def children_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Picker
    extends Component[IPickerProps, js.Object, Any] {
    
    def getValue(): Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MPicker(nextProps: Any): Boolean = js.native
  }
}
