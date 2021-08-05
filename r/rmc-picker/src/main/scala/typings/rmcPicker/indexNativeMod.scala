package typings.rmcPicker

import typings.rmcPicker.anon.ComponentDidUpdate
import typings.rmcPicker.anon.ComponentWillMount
import typings.rmcPicker.pickerMixinMod.IItemProps
import typings.rmcPicker.pickerTypesMod.IPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexNativeMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker/lib/index.native", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ComponentDidUpdate {
    def this(props: IPickerProps) = this()
    def this(props: Unit, context: js.Any) = this()
    def this(props: IPickerProps, context: js.Any) = this()
  }
  object default {
    
    @JSImport("rmc-picker/lib/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Item(_props: IItemProps): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(_props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker/lib/index.native", "Popup")
  @js.native
  class Popup protected ()
    extends StObject
       with ComponentWillMount {
    def this(props: js.Any) = this()
  }
  object Popup {
    
    @JSImport("rmc-picker/lib/index.native", "Popup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-picker/lib/index.native", "Popup.defaultProps")
    @js.native
    def defaultProps: js.Any = js.native
    inline def defaultProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-picker/lib/index.native", "PopupStyles")
  @js.native
  val PopupStyles: js.Any = js.native
}
