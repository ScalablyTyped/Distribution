package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollIntoViewOpti
import typings.smoothScrollbar.anon.PartialScrollToOptionsCallback
import typings.smoothScrollbar.scrollbarMod.ScrollStatus
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollingMod {
  
  @JSImport("smooth-scrollbar/scrolling", "scrollIntoView")
  @js.native
  def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling", "scrollIntoView")
  @js.native
  def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: PartialScrollIntoViewOpti
  ): Unit = js.native
  
  @JSImport("smooth-scrollbar/scrolling", "scrollTo")
  @js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling", "scrollTo")
  @js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling", "scrollTo")
  @js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double, duration: Double): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling", "scrollTo")
  @js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Double,
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = js.native
  
  @JSImport("smooth-scrollbar/scrolling", "setPosition")
  @js.native
  def setPosition(scrollbar: Scrollbar, x: Double, y: Double): ScrollStatus | Null = js.native
}
