package typings.reactScroll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollerMod {
  
  @JSImport("react-scroll/modules/mixins/scroller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getActiveLink(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveLink")().asInstanceOf[String]
  
  inline def register(name: String, element: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(name.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scrollTo(to: String, props: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(to.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setActiveLink(link: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setActiveLink")(link.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unmount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")().asInstanceOf[Unit]
  
  inline def unregister(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Scroller extends StObject {
    
    var get: js.Function1[/* name */ String, js.Any]
    
    var getActiveLink: js.Function0[String]
    
    var register: js.Function2[/* name */ String, /* element */ js.Any, Unit]
    
    var scrollTo: js.Function2[/* to */ String, /* props */ js.Any, Unit]
    
    var setActiveLink: js.Function1[/* link */ String, Unit]
    
    var unmount: js.Function0[Unit]
    
    var unregister: js.Function1[/* name */ String, Unit]
  }
  object Scroller {
    
    inline def apply(
      get: /* name */ String => js.Any,
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
    
    extension [Self <: Scroller](x: Self) {
      
      inline def setGet(value: /* name */ String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetActiveLink(value: () => String): Self = StObject.set(x, "getActiveLink", js.Any.fromFunction0(value))
      
      inline def setRegister(value: (/* name */ String, /* element */ js.Any) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
      
      inline def setScrollTo(value: (/* to */ String, /* props */ js.Any) => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction2(value))
      
      inline def setSetActiveLink(value: /* link */ String => Unit): Self = StObject.set(x, "setActiveLink", js.Any.fromFunction1(value))
      
      inline def setUnmount(value: () => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction0(value))
      
      inline def setUnregister(value: /* name */ String => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    }
  }
}
