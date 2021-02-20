package typings.sharepoint.global.SP.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UI.PagingControl")
@js.native
class PagingControl protected ()
  extends typings.sharepoint.SP.UI.PagingControl {
  def this(id: String) = this()
}
object PagingControl {
  
  /* static member */
  object ButtonIDs {
    
    @JSGlobal("SP.UI.PagingControl.ButtonIDs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("SP.UI.PagingControl.ButtonIDs.next")
    @js.native
    def next: Double = js.native
    @scala.inline
    def next_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("next")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SP.UI.PagingControl.ButtonIDs.prev")
    @js.native
    def prev: Double = js.native
    @scala.inline
    def prev_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prev")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object ButtonState {
    
    @JSGlobal("SP.UI.PagingControl.ButtonState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("SP.UI.PagingControl.ButtonState.disabled")
    @js.native
    def disabled: Double = js.native
    @scala.inline
    def disabled_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SP.UI.PagingControl.ButtonState.enabled")
    @js.native
    def enabled: Double = js.native
    @scala.inline
    def enabled_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SP.UI.PagingControl.ButtonState.hidden")
    @js.native
    def hidden: Double = js.native
    @scala.inline
    def hidden_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hidden")(x.asInstanceOf[js.Any])
  }
}
