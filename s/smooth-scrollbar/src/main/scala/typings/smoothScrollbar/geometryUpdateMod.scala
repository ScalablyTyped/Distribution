package typings.smoothScrollbar

import typings.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryUpdateMod {
  
  @JSImport("smooth-scrollbar/geometry/update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def update(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
