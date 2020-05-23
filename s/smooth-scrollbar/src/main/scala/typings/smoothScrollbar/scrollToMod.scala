package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollToOptionsCallback
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrolling/scroll-to", JSImport.Namespace)
@js.native
object scrollToMod extends js.Object {
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double): Unit = js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double, duration: Double): Unit = js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Double,
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = js.native
}

