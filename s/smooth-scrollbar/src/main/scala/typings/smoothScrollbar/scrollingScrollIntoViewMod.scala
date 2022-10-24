package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollIntoViewOpti
import typings.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollingScrollIntoViewMod {
  
  @JSImport("smooth-scrollbar/scrolling/scroll-into-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(scrollbar.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement, param2: PartialScrollIntoViewOpti): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(scrollbar.asInstanceOf[js.Any], elem.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
