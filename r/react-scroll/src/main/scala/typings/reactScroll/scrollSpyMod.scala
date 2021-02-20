package typings.reactScroll

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollSpyMod extends Shortcut {
  
  @JSImport("react-scroll/modules/mixins/scroll-spy", JSImport.Default)
  @js.native
  val default: ScrollSpy = js.native
  
  @js.native
  trait ScrollSpy extends StObject {
    
    def addSpyHandler(handler: js.Any, scrollSpyContainer: js.Any): Unit = js.native
    
    def addStateHandler(handler: js.Any): Unit = js.native
    
    def currentPositionY(scrollSpyContainer: js.Any): Double = js.native
    
    def isMounted(scrollSpyContainer: js.Any): Boolean = js.native
    
    def mount(scrollSpyContainer: js.Any): Unit = js.native
    
    def scrollHandler(scrollSpyContainer: js.Any): Unit = js.native
    
    var scrollSpyContainers: js.Array[_] = js.native
    
    var spyCallbacks: js.Array[_] = js.native
    
    var spySetState: js.Array[_] = js.native
    
    def unmount(stateHandler: js.Any, spyHandler: js.Any): Unit = js.native
    
    def update(): Unit = js.native
    
    def updateStates(): Unit = js.native
  }
  object ScrollSpy {
    
    @scala.inline
    def apply(
      addSpyHandler: (js.Any, js.Any) => Unit,
      addStateHandler: js.Any => Unit,
      currentPositionY: js.Any => Double,
      isMounted: js.Any => Boolean,
      mount: js.Any => Unit,
      scrollHandler: js.Any => Unit,
      scrollSpyContainers: js.Array[_],
      spyCallbacks: js.Array[_],
      spySetState: js.Array[_],
      unmount: (js.Any, js.Any) => Unit,
      update: () => Unit,
      updateStates: () => Unit
    ): ScrollSpy = {
      val __obj = js.Dynamic.literal(addSpyHandler = js.Any.fromFunction2(addSpyHandler), addStateHandler = js.Any.fromFunction1(addStateHandler), currentPositionY = js.Any.fromFunction1(currentPositionY), isMounted = js.Any.fromFunction1(isMounted), mount = js.Any.fromFunction1(mount), scrollHandler = js.Any.fromFunction1(scrollHandler), scrollSpyContainers = scrollSpyContainers.asInstanceOf[js.Any], spyCallbacks = spyCallbacks.asInstanceOf[js.Any], spySetState = spySetState.asInstanceOf[js.Any], unmount = js.Any.fromFunction2(unmount), update = js.Any.fromFunction0(update), updateStates = js.Any.fromFunction0(updateStates))
      __obj.asInstanceOf[ScrollSpy]
    }
    
    @scala.inline
    implicit class ScrollSpyMutableBuilder[Self <: ScrollSpy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddSpyHandler(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "addSpyHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddStateHandler(value: js.Any => Unit): Self = StObject.set(x, "addStateHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCurrentPositionY(value: js.Any => Double): Self = StObject.set(x, "currentPositionY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsMounted(value: js.Any => Boolean): Self = StObject.set(x, "isMounted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMount(value: js.Any => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollHandler(value: js.Any => Unit): Self = StObject.set(x, "scrollHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollSpyContainers(value: js.Array[_]): Self = StObject.set(x, "scrollSpyContainers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSpyContainersVarargs(value: js.Any*): Self = StObject.set(x, "scrollSpyContainers", js.Array(value :_*))
      
      @scala.inline
      def setSpyCallbacks(value: js.Array[_]): Self = StObject.set(x, "spyCallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpyCallbacksVarargs(value: js.Any*): Self = StObject.set(x, "spyCallbacks", js.Array(value :_*))
      
      @scala.inline
      def setSpySetState(value: js.Array[_]): Self = StObject.set(x, "spySetState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpySetStateVarargs(value: js.Any*): Self = StObject.set(x, "spySetState", js.Array(value :_*))
      
      @scala.inline
      def setUnmount(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateStates(value: () => Unit): Self = StObject.set(x, "updateStates", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ScrollSpy
  
  /* This means you don't have to write `default`, but can instead just say `scrollSpyMod.foo` */
  override def _to: ScrollSpy = default
}
