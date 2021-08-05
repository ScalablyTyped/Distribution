package typings.reactMdUtils

import typings.reactMdUtils.hexToRGBMod.HexString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getContrastRatioMod {
  
  @JSImport("@react-md/utils/types/colors/getContrastRatio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContrastRatio(background: HexString, foreground: HexString): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Double]
}
