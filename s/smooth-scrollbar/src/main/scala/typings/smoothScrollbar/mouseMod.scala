package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mouseMod {
  
  @JSImport("smooth-scrollbar/events/mouse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mouseHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
