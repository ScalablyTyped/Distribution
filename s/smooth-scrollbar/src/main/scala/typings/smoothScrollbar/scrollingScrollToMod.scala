package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollToOptionsCallback
import typings.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollingScrollToMod {
  
  @JSImport("smooth-scrollbar/scrolling/scroll-to", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
