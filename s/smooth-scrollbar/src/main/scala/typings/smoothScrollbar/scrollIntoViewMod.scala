package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollIntoViewOpti
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollIntoViewMod {
  
  @JSImport("smooth-scrollbar/scrolling/scroll-into-view", "scrollIntoView")
  @js.native
  def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling/scroll-into-view", "scrollIntoView")
  @js.native
  def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: PartialScrollIntoViewOpti
  ): Unit = js.native
}
