package typings.reactMdUtils

import typings.reactMdUtils.hexToRGBMod.HexString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLuminanceMod {
  
  @JSImport("@react-md/utils/types/colors/getLuminance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getLuminance(color: HexString): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLuminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
}
