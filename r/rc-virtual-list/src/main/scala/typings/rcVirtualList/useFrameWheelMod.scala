package typings.rcVirtualList

import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFrameWheelMod {
  
  @JSImport("rc-virtual-list/es/hooks/useFrameWheel", JSImport.Default)
  @js.native
  def default(
    inVirtual: Boolean,
    isScrollAtTop: Boolean,
    isScrollAtBottom: Boolean,
    onWheelDelta: js.Function1[/* offset */ Double, Unit]
  ): js.Tuple2[
    js.Function1[/* e */ WheelEvent, Unit], 
    js.Function1[/* e */ FireFoxDOMMouseScrollEvent, Unit]
  ] = js.native
  
  @js.native
  trait FireFoxDOMMouseScrollEvent extends StObject {
    
    var detail: Double = js.native
    
    var preventDefault: js.Function = js.native
  }
  object FireFoxDOMMouseScrollEvent {
    
    @scala.inline
    def apply(detail: Double, preventDefault: js.Function): FireFoxDOMMouseScrollEvent = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
      __obj.asInstanceOf[FireFoxDOMMouseScrollEvent]
    }
    
    @scala.inline
    implicit class FireFoxDOMMouseScrollEventMutableBuilder[Self <: FireFoxDOMMouseScrollEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    }
  }
}
