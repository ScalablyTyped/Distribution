package typings.smoothDashScrollbar

import typings.smoothDashScrollbar.interfacesScrollbarMod.ScrollIntoViewOptions
import typings.smoothDashScrollbar.interfacesScrollbarMod.ScrollStatus
import typings.smoothDashScrollbar.interfacesScrollbarMod.ScrollToOptions
import typings.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import typings.std.HTMLElement
import typings.std.Partial
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
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: Partial[ScrollIntoViewOptions]
  ): Unit = js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double): Unit = js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double, duration: Double): Unit = js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Double,
    hasEasingCallback: Partial[ScrollToOptions]
  ): Unit = js.native
  def setPosition(scrollbar: Scrollbar, x: Double, y: Double): ScrollStatus | Null = js.native
}

