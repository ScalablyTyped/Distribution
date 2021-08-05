package typings.reactMdUtils

import typings.reactMdUtils.hexToRGBMod.HexString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isContrastCompliantMod {
  
  @JSImport("@react-md/utils/types/colors/isContrastCompliant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/colors/isContrastCompliant", "AAA_CONTRAST_RATIO")
  @js.native
  val AAA_CONTRAST_RATIO: /* 7 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors/isContrastCompliant", "LARGE_TEXT_CONTRAST_RATIO")
  @js.native
  val LARGE_TEXT_CONTRAST_RATIO: /* 3 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors/isContrastCompliant", "NORMAL_TEXT_CONTRAST_RATIO")
  @js.native
  val NORMAL_TEXT_CONTRAST_RATIO: /* 4.5 */ Double = js.native
  
  inline def isContrastCompliant(background: HexString, foreground: HexString): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.large
    - typings.reactMdUtils.reactMdUtilsStrings.normal
    - typings.reactMdUtils.reactMdUtilsStrings.AAA
  */
  trait ContrastRatioCompliance extends StObject
  object ContrastRatioCompliance {
    
    inline def AAA: typings.reactMdUtils.reactMdUtilsStrings.AAA = "AAA".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.AAA]
    
    inline def large: typings.reactMdUtils.reactMdUtilsStrings.large = "large".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.large]
    
    inline def normal: typings.reactMdUtils.reactMdUtilsStrings.normal = "normal".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.normal]
  }
}
