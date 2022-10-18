package typings.reactScroll

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactScroll.anon.Smooth
import typings.reactScroll.modulesComponentsButtonMod.default
import typings.reactScroll.modulesMixinsScrollElementMod.ScrollElementProps
import typings.reactScroll.modulesMixinsScrollEventsMod.Events.ScrollEvent
import typings.reactScroll.modulesMixinsScrollLinkMod.ScrollLinkProps
import typings.reactScroll.modulesMixinsScrollSpyMod.ScrollSpy
import typings.reactScroll.modulesMixinsScrollerMod.Scroller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMod {
  
  @JSImport("react-scroll/modules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-scroll/modules", "Button")
  @js.native
  open class Button () extends default
  
  @JSImport("react-scroll/modules", "Element")
  @js.native
  open class Element ()
    extends typings.reactScroll.modulesComponentsElementMod.default
  
  object Events {
    
    @JSImport("react-scroll/modules", "Events.scrollEvent")
    @js.native
    val scrollEvent: ScrollEvent = js.native
  }
  
  object Helpers {
    
    @JSImport("react-scroll/modules", "Helpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Element(component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Element")(component.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def Scroll(component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Scroll")(component.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def Scroll(component: Any, customScroller: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Scroll")(component.asInstanceOf[js.Any], customScroller.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("react-scroll/modules", "Link")
  @js.native
  open class Link ()
    extends typings.reactScroll.modulesComponentsLinkMod.default
  
  inline def ScrollElement[P](component: ComponentType[P]): ComponentClass[ScrollElementProps[P], ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("ScrollElement")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[ScrollElementProps[P], ComponentState]]
  
  inline def ScrollLink[P](component: ComponentType[P]): ComponentClass[ScrollLinkProps[P], ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("ScrollLink")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[ScrollLinkProps[P], ComponentState]]
  inline def ScrollLink[P](component: ComponentType[P], customScroller: Scroller): ComponentClass[ScrollLinkProps[P], ComponentState] = (^.asInstanceOf[js.Dynamic].applyDynamic("ScrollLink")(component.asInstanceOf[js.Any], customScroller.asInstanceOf[js.Any])).asInstanceOf[ComponentClass[ScrollLinkProps[P], ComponentState]]
  
  object animateScroll {
    
    @JSImport("react-scroll/modules", "animateScroll")
    @js.native
    val ^ : js.Any = js.native
    
    inline def animateTopScroll(y: Double, options: Any, to: String, target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animateTopScroll")(y.asInstanceOf[js.Any], options.asInstanceOf[js.Any], to.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getAnimationType(options: Smooth): js.Function1[/* x */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimationType")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ Double, Double]]
    
    inline def scrollMore(toY: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollMore")(toY.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def scrollMore(toY: Double, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollMore")(toY.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def scrollTo(toY: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(toY.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def scrollTo(toY: Double, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(toY.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def scrollToBottom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToBottom")().asInstanceOf[Unit]
    inline def scrollToBottom(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToBottom")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def scrollToTop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToTop")().asInstanceOf[Unit]
    inline def scrollToTop(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToTop")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("react-scroll/modules", "scrollSpy")
  @js.native
  val scrollSpy: ScrollSpy = js.native
  
  object scroller {
    
    @JSImport("react-scroll/modules", "scroller")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getActiveLink(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveLink")().asInstanceOf[String]
    
    inline def register(name: String, element: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(name.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def scrollTo(to: String, props: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(to.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setActiveLink(link: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setActiveLink")(link.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def unmount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")().asInstanceOf[Unit]
    
    inline def unregister(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
