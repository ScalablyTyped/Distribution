package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardMod {
  
  @JSImport("smooth-scrollbar/events/keyboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def keyboardHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keyboardHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
