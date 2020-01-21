package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.ScrollIntoViewOptions
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrolling/scroll-into-view", JSImport.Namespace)
@js.native
object scrollIntoViewMod extends js.Object {
  def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = js.native
  def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: Partial[ScrollIntoViewOptions]
  ): Unit = js.native
}

