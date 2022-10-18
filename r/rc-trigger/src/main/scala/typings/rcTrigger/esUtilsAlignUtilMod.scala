package typings.rcTrigger

import typings.rcTrigger.esInterfaceMod.AlignType
import typings.rcTrigger.esInterfaceMod.BuildInPlacements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsAlignUtilMod {
  
  @JSImport("rc-trigger/es/utils/alignUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAlignFromPlacement(builtinPlacements: BuildInPlacements, placementStr: String, align: AlignType): AlignType = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignFromPlacement")(builtinPlacements.asInstanceOf[js.Any], placementStr.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[AlignType]
  
  inline def getAlignPopupClassName(builtinPlacements: BuildInPlacements, prefixCls: String, align: AlignType, isAlignPoint: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignPopupClassName")(builtinPlacements.asInstanceOf[js.Any], prefixCls.asInstanceOf[js.Any], align.asInstanceOf[js.Any], isAlignPoint.asInstanceOf[js.Any])).asInstanceOf[String]
}
