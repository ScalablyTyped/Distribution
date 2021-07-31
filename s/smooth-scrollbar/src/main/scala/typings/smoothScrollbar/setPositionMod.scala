package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.ScrollStatus
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setPositionMod {
  
  @JSImport("smooth-scrollbar/scrolling/set-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def setPosition(scrollbar: Scrollbar, x: Double, y: Double): ScrollStatus | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(scrollbar.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[ScrollStatus | Null]
}
