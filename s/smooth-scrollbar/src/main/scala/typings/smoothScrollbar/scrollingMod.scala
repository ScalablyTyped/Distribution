package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollIntoViewOpti
import typings.smoothScrollbar.anon.PartialScrollToOptionsCallback
import typings.smoothScrollbar.scrollbarMod.ScrollStatus
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrolling", JSImport.Namespace)
@js.native
object scrollingMod extends js.Object {
  def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = js.native
  def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: PartialScrollIntoViewOpti
  ): Unit = js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double): Unit = js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double, duration: Double): Unit = js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Double,
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = js.native
  def setPosition(scrollbar: Scrollbar, x: Double, y: Double): ScrollStatus | Null = js.native
}

