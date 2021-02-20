package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollToOptionsCallback
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollToMod {
  
  @JSImport("smooth-scrollbar/scrolling/scroll-to", "scrollTo")
  @js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling/scroll-to", "scrollTo")
  @js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling/scroll-to", "scrollTo")
  @js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double, duration: Double): Unit = js.native
  @JSImport("smooth-scrollbar/scrolling/scroll-to", "scrollTo")
  @js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Double,
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = js.native
}
