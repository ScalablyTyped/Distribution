package typings.reactScroll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollerMod {
  
  @JSImport("react-scroll/modules/mixins/scroller", "get")
  @js.native
  def get(name: String): js.Any = js.native
  
  @JSImport("react-scroll/modules/mixins/scroller", "getActiveLink")
  @js.native
  def getActiveLink(): String = js.native
  
  @JSImport("react-scroll/modules/mixins/scroller", "register")
  @js.native
  def register(name: String, element: js.Any): Unit = js.native
  
  @JSImport("react-scroll/modules/mixins/scroller", "scrollTo")
  @js.native
  def scrollTo(to: String, props: js.Any): Unit = js.native
  
  @JSImport("react-scroll/modules/mixins/scroller", "setActiveLink")
  @js.native
  def setActiveLink(link: String): Unit = js.native
  
  @JSImport("react-scroll/modules/mixins/scroller", "unmount")
  @js.native
  def unmount(): Unit = js.native
  
  @JSImport("react-scroll/modules/mixins/scroller", "unregister")
  @js.native
  def unregister(name: String): Unit = js.native
  
  @js.native
  trait Scroller extends StObject {
    
    var get: js.Function1[/* name */ String, _] = js.native
    
    var getActiveLink: js.Function0[String] = js.native
    
    var register: js.Function2[/* name */ String, /* element */ js.Any, Unit] = js.native
    
    var scrollTo: js.Function2[/* to */ String, /* props */ js.Any, Unit] = js.native
    
    var setActiveLink: js.Function1[/* link */ String, Unit] = js.native
    
    var unmount: js.Function0[Unit] = js.native
    
    var unregister: js.Function1[/* name */ String, Unit] = js.native
  }
  object Scroller {
    
    @scala.inline
    def apply(
      get: /* name */ String => _,
      getActiveLink: () => String,
      register: (/* name */ String, /* element */ js.Any) => Unit,
      scrollTo: (/* to */ String, /* props */ js.Any) => Unit,
      setActiveLink: /* link */ String => Unit,
      unmount: () => Unit,
      unregister: /* name */ String => Unit
    ): Scroller = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getActiveLink = js.Any.fromFunction0(getActiveLink), register = js.Any.fromFunction2(register), scrollTo = js.Any.fromFunction2(scrollTo), setActiveLink = js.Any.fromFunction1(setActiveLink), unmount = js.Any.fromFunction0(unmount), unregister = js.Any.fromFunction1(unregister))
      __obj.asInstanceOf[Scroller]
    }
    
    @scala.inline
    implicit class ScrollerMutableBuilder[Self <: Scroller] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: /* name */ String => _): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetActiveLink(value: () => String): Self = StObject.set(x, "getActiveLink", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegister(value: (/* name */ String, /* element */ js.Any) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScrollTo(value: (/* to */ String, /* props */ js.Any) => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetActiveLink(value: /* link */ String => Unit): Self = StObject.set(x, "setActiveLink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnmount(value: () => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnregister(value: /* name */ String => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    }
  }
}
