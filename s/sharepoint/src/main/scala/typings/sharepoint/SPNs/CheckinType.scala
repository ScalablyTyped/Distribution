package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CheckinType extends js.Object

@JSGlobal("SP.CheckinType")
@js.native
object CheckinType extends js.Object {
  @js.native
  sealed trait majorCheckIn extends CheckinType
  
  @js.native
  sealed trait minorCheckIn extends CheckinType
  
  @js.native
  sealed trait overwriteCheckIn extends CheckinType
  
  /* 1 */ val majorCheckIn: typings.sharepoint.SPNs.CheckinType.majorCheckIn with Double = js.native
  /* 0 */ val minorCheckIn: typings.sharepoint.SPNs.CheckinType.minorCheckIn with Double = js.native
  /* 2 */ val overwriteCheckIn: typings.sharepoint.SPNs.CheckinType.overwriteCheckIn with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckinType with Double] = js.native
}

