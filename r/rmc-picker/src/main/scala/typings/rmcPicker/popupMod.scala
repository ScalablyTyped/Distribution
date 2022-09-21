package typings.rmcPicker

import typings.rmcPicker.anon.ComponentWillMount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker/lib/Popup", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ComponentWillMount {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("rmc-picker/lib/Popup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-picker/lib/Popup", "default.defaultProps")
    @js.native
    def defaultProps: Any = js.native
    inline def defaultProps_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
