package typings.reactMdUtils

import typings.reactMdUtils.reactMdUtilsStrings.height
import typings.reactMdUtils.reactMdUtilsStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getViewportSizeMod {
  
  @JSImport("@react-md/utils/types/positioning/getViewportSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getViewportSize(direction: height | width): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportSize")(direction.asInstanceOf[js.Any]).asInstanceOf[Double]
}
