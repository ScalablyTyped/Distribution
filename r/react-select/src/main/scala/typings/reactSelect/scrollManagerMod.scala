package typings.reactSelect

import typings.emotionReact.emotionReactMod.jsx.JSX.Element
import typings.react.mod.ReactElement
import typings.react.mod.RefCallback
import typings.std.HTMLElement
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollManagerMod {
  
  @JSImport("react-select/dist/declarations/src/internal/ScrollManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildrenLockEnabledCaptureEnabledOnBottomArriveOnBottomLeaveOnTopArriveOnTopLeave: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenLockEnabledCaptureEnabledOnBottomArriveOnBottomLeaveOnTopArriveOnTopLeave.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    val captureEnabled: Boolean
    
    def children(ref: RefCallback[HTMLElement]): ReactElement
    
    val lockEnabled: Boolean
    
    val onBottomArrive: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
    
    val onBottomLeave: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
    
    val onTopArrive: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
    
    val onTopLeave: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
  }
  object Props {
    
    inline def apply(captureEnabled: Boolean, children: RefCallback[HTMLElement] => ReactElement, lockEnabled: Boolean): Props = {
      val __obj = js.Dynamic.literal(captureEnabled = captureEnabled.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), lockEnabled = lockEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCaptureEnabled(value: Boolean): Self = StObject.set(x, "captureEnabled", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: RefCallback[HTMLElement] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setLockEnabled(value: Boolean): Self = StObject.set(x, "lockEnabled", value.asInstanceOf[js.Any])
      
      inline def setOnBottomArrive(value: /* event */ WheelEvent | TouchEvent => Unit): Self = StObject.set(x, "onBottomArrive", js.Any.fromFunction1(value))
      
      inline def setOnBottomArriveUndefined: Self = StObject.set(x, "onBottomArrive", js.undefined)
      
      inline def setOnBottomLeave(value: /* event */ WheelEvent | TouchEvent => Unit): Self = StObject.set(x, "onBottomLeave", js.Any.fromFunction1(value))
      
      inline def setOnBottomLeaveUndefined: Self = StObject.set(x, "onBottomLeave", js.undefined)
      
      inline def setOnTopArrive(value: /* event */ WheelEvent | TouchEvent => Unit): Self = StObject.set(x, "onTopArrive", js.Any.fromFunction1(value))
      
      inline def setOnTopArriveUndefined: Self = StObject.set(x, "onTopArrive", js.undefined)
      
      inline def setOnTopLeave(value: /* event */ WheelEvent | TouchEvent => Unit): Self = StObject.set(x, "onTopLeave", js.Any.fromFunction1(value))
      
      inline def setOnTopLeaveUndefined: Self = StObject.set(x, "onTopLeave", js.undefined)
    }
  }
}
