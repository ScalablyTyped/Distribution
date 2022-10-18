package typings.rcVirtualList

import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseFrameWheelMod {
  
  @JSImport("rc-virtual-list/es/hooks/useFrameWheel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    inVirtual: Boolean,
    isScrollAtTop: Boolean,
    isScrollAtBottom: Boolean,
    onWheelDelta: js.Function1[/* offset */ Double, Unit]
  ): js.Tuple2[
    js.Function1[/* e */ WheelEvent, Unit], 
    js.Function1[/* e */ FireFoxDOMMouseScrollEvent, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inVirtual.asInstanceOf[js.Any], isScrollAtTop.asInstanceOf[js.Any], isScrollAtBottom.asInstanceOf[js.Any], onWheelDelta.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Function1[/* e */ WheelEvent, Unit], 
    js.Function1[/* e */ FireFoxDOMMouseScrollEvent, Unit]
  ]]
  
  trait FireFoxDOMMouseScrollEvent extends StObject {
    
    var detail: Double
    
    var preventDefault: js.Function
  }
  object FireFoxDOMMouseScrollEvent {
    
    inline def apply(detail: Double, preventDefault: js.Function): FireFoxDOMMouseScrollEvent = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
      __obj.asInstanceOf[FireFoxDOMMouseScrollEvent]
    }
    
    extension [Self <: FireFoxDOMMouseScrollEvent](x: Self) {
      
      inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    }
  }
}
