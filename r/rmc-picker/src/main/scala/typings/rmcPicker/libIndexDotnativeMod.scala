package typings.rmcPicker

import typings.rmcPicker.anon.ComponentDidUpdate
import typings.rmcPicker.anon.ComponentWillMount
import typings.rmcPicker.libPickerMixinMod.IItemProps
import typings.rmcPicker.libPickerTypesMod.IPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIndexDotnativeMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker/lib/index.native", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ComponentDidUpdate {
    def this(props: IPickerProps) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: IPickerProps, context: Any) = this()
  }
  object default {
    
    @JSImport("rmc-picker/lib/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Item(_props: IItemProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(_props.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker/lib/index.native", "Popup")
  @js.native
  open class Popup protected ()
    extends StObject
       with ComponentWillMount {
    def this(props: Any) = this()
  }
  object Popup {
    
    @JSImport("rmc-picker/lib/index.native", "Popup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-picker/lib/index.native", "Popup.defaultProps")
    @js.native
    def defaultProps: Any = js.native
    inline def defaultProps_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-picker/lib/index.native", "PopupStyles")
  @js.native
  val PopupStyles: Any = js.native
}
