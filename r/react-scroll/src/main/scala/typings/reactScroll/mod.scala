package typings.reactScroll

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactScroll.anon.Smooth
import typings.reactScroll.scrollElementMod.ScrollElementProps
import typings.reactScroll.scrollEventsMod.Events.ScrollEvent
import typings.reactScroll.scrollLinkMod.ScrollLinkProps
import typings.reactScroll.scrollSpyMod.ScrollSpy
import typings.reactScroll.scrollerMod.Scroller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scroll", "Button")
  @js.native
  class Button ()
    extends typings.reactScroll.modulesMod.Button
  
  @JSImport("react-scroll", "Element")
  @js.native
  class Element ()
    extends typings.reactScroll.modulesMod.Element
  
  object Events {
    
    @JSImport("react-scroll", "Events.scrollEvent")
    @js.native
    val scrollEvent: ScrollEvent = js.native
  }
  
  object Helpers {
    
    @JSImport("react-scroll", "Helpers.Element")
    @js.native
    def Element(component: js.Any): js.Any = js.native
    
    @JSImport("react-scroll", "Helpers.Scroll")
    @js.native
    def Scroll(component: js.Any): js.Any = js.native
    @JSImport("react-scroll", "Helpers.Scroll")
    @js.native
    def Scroll(component: js.Any, customScroller: js.Any): js.Any = js.native
  }
  
  @JSImport("react-scroll", "Link")
  @js.native
  class Link ()
    extends typings.reactScroll.modulesMod.Link
  
  @JSImport("react-scroll", "ScrollElement")
  @js.native
  def ScrollElement[P](component: ComponentType[P]): ComponentClass[ScrollElementProps[P], ComponentState] = js.native
  
  @JSImport("react-scroll", "ScrollLink")
  @js.native
  def ScrollLink[P](component: ComponentType[P]): ComponentClass[ScrollLinkProps[P], ComponentState] = js.native
  @JSImport("react-scroll", "ScrollLink")
  @js.native
  def ScrollLink[P](component: ComponentType[P], customScroller: Scroller): ComponentClass[ScrollLinkProps[P], ComponentState] = js.native
  
  object animateScroll {
    
    @JSImport("react-scroll", "animateScroll.animateTopScroll")
    @js.native
    def animateTopScroll(y: Double, options: js.Any, to: String, target: js.Any): Unit = js.native
    
    @JSImport("react-scroll", "animateScroll.getAnimationType")
    @js.native
    def getAnimationType(options: Smooth): js.Function1[/* x */ Double, Double] = js.native
    
    @JSImport("react-scroll", "animateScroll.scrollMore")
    @js.native
    def scrollMore(toY: Double): Unit = js.native
    @JSImport("react-scroll", "animateScroll.scrollMore")
    @js.native
    def scrollMore(toY: Double, options: js.Any): Unit = js.native
    
    @JSImport("react-scroll", "animateScroll.scrollTo")
    @js.native
    def scrollTo(toY: Double): Unit = js.native
    @JSImport("react-scroll", "animateScroll.scrollTo")
    @js.native
    def scrollTo(toY: Double, options: js.Any): Unit = js.native
    
    @JSImport("react-scroll", "animateScroll.scrollToBottom")
    @js.native
    def scrollToBottom(): Unit = js.native
    @JSImport("react-scroll", "animateScroll.scrollToBottom")
    @js.native
    def scrollToBottom(options: js.Any): Unit = js.native
    
    @JSImport("react-scroll", "animateScroll.scrollToTop")
    @js.native
    def scrollToTop(): Unit = js.native
    @JSImport("react-scroll", "animateScroll.scrollToTop")
    @js.native
    def scrollToTop(options: js.Any): Unit = js.native
  }
  
  @JSImport("react-scroll", "scrollSpy")
  @js.native
  val scrollSpy: ScrollSpy = js.native
  
  object scroller {
    
    @JSImport("react-scroll", "scroller.get")
    @js.native
    def get(name: String): js.Any = js.native
    
    @JSImport("react-scroll", "scroller.getActiveLink")
    @js.native
    def getActiveLink(): String = js.native
    
    @JSImport("react-scroll", "scroller.register")
    @js.native
    def register(name: String, element: js.Any): Unit = js.native
    
    @JSImport("react-scroll", "scroller.scrollTo")
    @js.native
    def scrollTo(to: String, props: js.Any): Unit = js.native
    
    @JSImport("react-scroll", "scroller.setActiveLink")
    @js.native
    def setActiveLink(link: String): Unit = js.native
    
    @JSImport("react-scroll", "scroller.unmount")
    @js.native
    def unmount(): Unit = js.native
    
    @JSImport("react-scroll", "scroller.unregister")
    @js.native
    def unregister(name: String): Unit = js.native
  }
}
