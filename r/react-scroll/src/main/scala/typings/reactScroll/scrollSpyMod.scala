package typings.reactScroll

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollSpyMod extends Shortcut {
  
  @JSImport("react-scroll/modules/mixins/scroll-spy", JSImport.Default)
  @js.native
  val default: ScrollSpy = js.native
  
  trait ScrollSpy extends StObject {
    
    def addSpyHandler(handler: Any, scrollSpyContainer: Any): Unit
    
    def addStateHandler(handler: Any): Unit
    
    def currentPositionY(scrollSpyContainer: Any): Double
    
    def isMounted(scrollSpyContainer: Any): Boolean
    
    def mount(scrollSpyContainer: Any): Unit
    
    def scrollHandler(scrollSpyContainer: Any): Unit
    
    var scrollSpyContainers: js.Array[Any]
    
    var spyCallbacks: js.Array[Any]
    
    var spySetState: js.Array[Any]
    
    def unmount(stateHandler: Any, spyHandler: Any): Unit
    
    def update(): Unit
    
    def updateStates(): Unit
  }
  object ScrollSpy {
    
    inline def apply(
      addSpyHandler: (Any, Any) => Unit,
      addStateHandler: Any => Unit,
      currentPositionY: Any => Double,
      isMounted: Any => Boolean,
      mount: Any => Unit,
      scrollHandler: Any => Unit,
      scrollSpyContainers: js.Array[Any],
      spyCallbacks: js.Array[Any],
      spySetState: js.Array[Any],
      unmount: (Any, Any) => Unit,
      update: () => Unit,
      updateStates: () => Unit
    ): ScrollSpy = {
      val __obj = js.Dynamic.literal(addSpyHandler = js.Any.fromFunction2(addSpyHandler), addStateHandler = js.Any.fromFunction1(addStateHandler), currentPositionY = js.Any.fromFunction1(currentPositionY), isMounted = js.Any.fromFunction1(isMounted), mount = js.Any.fromFunction1(mount), scrollHandler = js.Any.fromFunction1(scrollHandler), scrollSpyContainers = scrollSpyContainers.asInstanceOf[js.Any], spyCallbacks = spyCallbacks.asInstanceOf[js.Any], spySetState = spySetState.asInstanceOf[js.Any], unmount = js.Any.fromFunction2(unmount), update = js.Any.fromFunction0(update), updateStates = js.Any.fromFunction0(updateStates))
      __obj.asInstanceOf[ScrollSpy]
    }
    
    extension [Self <: ScrollSpy](x: Self) {
      
      inline def setAddSpyHandler(value: (Any, Any) => Unit): Self = StObject.set(x, "addSpyHandler", js.Any.fromFunction2(value))
      
      inline def setAddStateHandler(value: Any => Unit): Self = StObject.set(x, "addStateHandler", js.Any.fromFunction1(value))
      
      inline def setCurrentPositionY(value: Any => Double): Self = StObject.set(x, "currentPositionY", js.Any.fromFunction1(value))
      
      inline def setIsMounted(value: Any => Boolean): Self = StObject.set(x, "isMounted", js.Any.fromFunction1(value))
      
      inline def setMount(value: Any => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
      
      inline def setScrollHandler(value: Any => Unit): Self = StObject.set(x, "scrollHandler", js.Any.fromFunction1(value))
      
      inline def setScrollSpyContainers(value: js.Array[Any]): Self = StObject.set(x, "scrollSpyContainers", value.asInstanceOf[js.Any])
      
      inline def setScrollSpyContainersVarargs(value: Any*): Self = StObject.set(x, "scrollSpyContainers", js.Array(value*))
      
      inline def setSpyCallbacks(value: js.Array[Any]): Self = StObject.set(x, "spyCallbacks", value.asInstanceOf[js.Any])
      
      inline def setSpyCallbacksVarargs(value: Any*): Self = StObject.set(x, "spyCallbacks", js.Array(value*))
      
      inline def setSpySetState(value: js.Array[Any]): Self = StObject.set(x, "spySetState", value.asInstanceOf[js.Any])
      
      inline def setSpySetStateVarargs(value: Any*): Self = StObject.set(x, "spySetState", js.Array(value*))
      
      inline def setUnmount(value: (Any, Any) => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction2(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      inline def setUpdateStates(value: () => Unit): Self = StObject.set(x, "updateStates", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ScrollSpy
  
  /* This means you don't have to write `default`, but can instead just say `scrollSpyMod.foo` */
  override def _to: ScrollSpy = default
}
