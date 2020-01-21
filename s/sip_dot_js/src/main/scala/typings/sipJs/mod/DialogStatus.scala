package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "DialogStatus")
@js.native
object DialogStatus extends js.Object {
  /* 2 */ val STATUS_CONFIRMED: typings.sipJs.enumsMod.DialogStatus.STATUS_CONFIRMED with Double = js.native
  /* 1 */ val STATUS_EARLY: typings.sipJs.enumsMod.DialogStatus.STATUS_EARLY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.sipJs.enumsMod.DialogStatus with Double] = js.native
}

