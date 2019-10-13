package typings.reactDashScroll

import typings.react.reactMod.Component
import typings.reactDashScroll.modulesComponentsButtonMod.ButtonProps
import typings.reactDashScroll.modulesComponentsElementMod.ElementProps
import typings.reactDashScroll.modulesComponentsLinkMod.LinkProps
import typings.reactDashScroll.modulesMixinsScrollDashEventsMod.Events.ScrollEvent
import typings.reactDashScroll.modulesMixinsScrollDashSpyMod.ScrollSpy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-scroll", JSImport.Namespace)
@js.native
object reactDashScrollMod extends js.Object {
  @js.native
  class Button ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  @js.native
  class Element ()
    extends Component[ElementProps, js.Object, js.Any]
  
  @js.native
  class Link ()
    extends Component[LinkProps, js.Object, js.Any]
  
  val scrollSpy: ScrollSpy = js.native
  @js.native
  object Events extends js.Object {
    val scrollEvent: ScrollEvent = js.native
  }
  
  @js.native
  object Helpers extends js.Object {
    def Element(component: js.Any): js.Any = js.native
    def Scroll(component: js.Any): js.Any = js.native
    def Scroll(component: js.Any, customScroller: js.Any): js.Any = js.native
  }
  
  @js.native
  object animateScroll extends js.Object {
    def animateTopScroll(y: Double, options: js.Any, to: String, target: js.Any): Unit = js.native
    def getAnimationType(options: Anon_Smooth): js.Function1[/* x */ Double, Double] = js.native
    def scrollMore(toY: Double): Unit = js.native
    def scrollMore(toY: Double, options: js.Any): Unit = js.native
    def scrollTo(toY: Double): Unit = js.native
    def scrollTo(toY: Double, options: js.Any): Unit = js.native
    def scrollToBottom(): Unit = js.native
    def scrollToBottom(options: js.Any): Unit = js.native
    def scrollToTop(): Unit = js.native
    def scrollToTop(options: js.Any): Unit = js.native
  }
  
  @js.native
  object scroller extends js.Object {
    def get(name: String): js.Any = js.native
    def getActiveLink(): String = js.native
    def register(name: String, element: js.Any): Unit = js.native
    def scrollTo(to: String, props: js.Any): Unit = js.native
    def setActiveLink(link: String): Unit = js.native
    def unmount(): Unit = js.native
    def unregister(name: String): Unit = js.native
  }
  
}

