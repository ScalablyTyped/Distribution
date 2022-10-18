package typings.smoothScrollbar

import typings.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsResizeMod {
  
  @JSImport("smooth-scrollbar/events/resize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resizeHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
