package typings.rmcPicker

import typings.rmcPicker.anon.ComponentDidUpdate
import typings.rmcPicker.libPickerMixinMod.IItemProps
import typings.rmcPicker.libPickerTypesMod.IPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ComponentDidUpdate {
    def this(props: IPickerProps) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: IPickerProps, context: Any) = this()
  }
  object default {
    
    @JSImport("rmc-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Item(_props: IItemProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(_props.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
