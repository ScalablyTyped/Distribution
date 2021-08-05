package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollIntoViewOpti
import typings.smoothScrollbar.anon.PartialScrollToOptionsCallback
import typings.smoothScrollbar.scrollbarMod.ScrollStatus
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollingMod {
  
  @JSImport("smooth-scrollbar/scrolling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(scrollbar.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: PartialScrollIntoViewOpti
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(scrollbar.asInstanceOf[js.Any], elem.asInstanceOf[js.Any], hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scrollTo(scrollbar: Scrollbar, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(scrollbar.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollTo(scrollbar: Scrollbar, x: Double, y: Double, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(scrollbar.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Double,
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(scrollbar.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], hasEasingCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Unit,
    hasEasingCallback: PartialScrollToOptionsCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(scrollbar.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], hasEasingCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPosition(scrollbar: Scrollbar, x: Double, y: Double): ScrollStatus | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(scrollbar.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[ScrollStatus | Null]
}
