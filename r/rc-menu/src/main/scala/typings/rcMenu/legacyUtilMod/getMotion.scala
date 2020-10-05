package typings.rcMenu.legacyUtilMod

import typings.rcMenu.interfaceMod.MenuMode
import typings.rcTrigger.interfaceMod.MotionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-menu/es/utils/legacyUtil", "getMotion")
@js.native
object getMotion extends js.Object {
  def apply(
    hasPrefixClsMotionDefaultMotionsOpenAnimationOpenTransitionName: GetMotionProps,
    hasSwitchingModeFromInline: GetMotionState,
    menuMode: MenuMode
  ): MotionType = js.native
}

