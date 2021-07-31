package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wheelMod {
  
  @JSImport("smooth-scrollbar/events/wheel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wheelHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wheelHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
