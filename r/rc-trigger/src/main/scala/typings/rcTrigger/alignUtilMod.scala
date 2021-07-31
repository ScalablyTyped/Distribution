package typings.rcTrigger

import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.BuildInPlacements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignUtilMod {
  
  @JSImport("rc-trigger/es/utils/alignUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAlignFromPlacement(builtinPlacements: BuildInPlacements, placementStr: String, align: AlignType): AlignType = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignFromPlacement")(builtinPlacements.asInstanceOf[js.Any], placementStr.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[AlignType]
  
  @scala.inline
  def getAlignPopupClassName(builtinPlacements: BuildInPlacements, prefixCls: String, align: AlignType, isAlignPoint: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignPopupClassName")(builtinPlacements.asInstanceOf[js.Any], prefixCls.asInstanceOf[js.Any], align.asInstanceOf[js.Any], isAlignPoint.asInstanceOf[js.Any])).asInstanceOf[String]
}
