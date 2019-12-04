package typings.smoothDashScrollbar

import typings.smoothDashScrollbar.interfacesScrollbarMod.ScrollToOptions
import typings.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrolling/scroll-to", JSImport.Namespace)
@js.native
object scrollingScrollDashToMod extends js.Object {
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double): Unit = js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double, duration: Double): Unit = js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Double,
    hasEasingCallback: Partial[ScrollToOptions]
  ): Unit = js.native
}

