package typings.sharepoint.global.SP.UI

import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UI.PagingControl")
@js.native
class PagingControl protected ()
  extends StObject
     with typings.sharepoint.SP.UI.PagingControl {
  def this(id: String) = this()
  
  /* CompleteClass */
  override def getButtonState(buttonId: Double): Double = js.native
  
  /* CompleteClass */
  override def get_innerContent(): HTMLSpanElement = js.native
  
  /* CompleteClass */
  override def get_innerContentClass(): String = js.native
  
  /* CompleteClass */
  override def onNext(): Unit = js.native
  
  /**Should override*/
  /* CompleteClass */
  override def onPrev(): Unit = js.native
  
  /* CompleteClass */
  override def onWindowResized(): Unit = js.native
  
  /* CompleteClass */
  override def postRender(): Unit = js.native
  
  /* CompleteClass */
  override def render(innerContent: String): String = js.native
  
  /* CompleteClass */
  override def setButtonState(buttonId: Double, state: Double): Unit = js.native
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
