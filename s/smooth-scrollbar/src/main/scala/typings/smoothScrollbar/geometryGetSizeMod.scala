package typings.smoothScrollbar

import typings.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import typings.smoothScrollbar.interfacesScrollbarMod.ScrollbarSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryGetSizeMod {
  
  @JSImport("smooth-scrollbar/geometry/get-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSize(scrollbar: Scrollbar): ScrollbarSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[ScrollbarSize]
}
