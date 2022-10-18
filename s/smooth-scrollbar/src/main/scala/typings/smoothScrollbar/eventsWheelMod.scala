package typings.smoothScrollbar

import typings.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsWheelMod {
  
  @JSImport("smooth-scrollbar/events/wheel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wheelHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wheelHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
