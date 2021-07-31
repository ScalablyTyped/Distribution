package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchMod {
  
  @JSImport("smooth-scrollbar/events/touch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def touchHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("touchHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
