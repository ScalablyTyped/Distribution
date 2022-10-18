package typings.smoothScrollbar

import typings.smoothScrollbar.anon.XY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsGetPositionMod {
  
  @JSImport("smooth-scrollbar/utils/get-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPosition(evt: Any): XY = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(evt.asInstanceOf[js.Any]).asInstanceOf[XY]
}
