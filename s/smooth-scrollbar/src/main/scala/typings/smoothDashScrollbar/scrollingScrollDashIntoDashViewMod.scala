package typings.smoothDashScrollbar

import typings.smoothDashScrollbar.interfacesScrollbarMod.ScrollIntoViewOptions
import typings.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrolling/scroll-into-view", JSImport.Namespace)
@js.native
object scrollingScrollDashIntoDashViewMod extends js.Object {
  def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = js.native
  def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: Partial[ScrollIntoViewOptions]
  ): Unit = js.native
}

