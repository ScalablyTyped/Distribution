package typings.sipDotJs.libEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialogStatus extends js.Object

@JSImport("sip.js/lib/Enums", "DialogStatus")
@js.native
object DialogStatus extends js.Object {
  @js.native
  sealed trait STATUS_CONFIRMED extends DialogStatus
  
  @js.native
  sealed trait STATUS_EARLY extends DialogStatus
  
  /* 2 */ val STATUS_CONFIRMED: typings.sipDotJs.libEnumsMod.DialogStatus.STATUS_CONFIRMED with Double = js.native
  /* 1 */ val STATUS_EARLY: typings.sipDotJs.libEnumsMod.DialogStatus.STATUS_EARLY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialogStatus with Double] = js.native
}

