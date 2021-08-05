package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isVisibleMod {
  
  @JSImport("smooth-scrollbar/geometry/is-visible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isVisible(scrollbar: Scrollbar, elem: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(scrollbar.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
