package typings.rcTrigger

import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.BuildInPlacements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-trigger/lib/utils/alignUtil", JSImport.Namespace)
@js.native
object alignUtilMod extends js.Object {
  def getAlignFromPlacement(builtinPlacements: BuildInPlacements, placementStr: String, align: AlignType): AlignType = js.native
  def getAlignPopupClassName(builtinPlacements: BuildInPlacements, prefixCls: String, align: AlignType, isAlignPoint: Boolean): String = js.native
}

