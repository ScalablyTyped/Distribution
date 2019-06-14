package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CheckinType extends js.Object

@JSGlobal("SP.CheckinType")
@js.native
object CheckinType extends js.Object {
  @js.native
  sealed trait majorCheckIn
    extends sharepointLib.SPNs.CheckinType
  
  @js.native
  sealed trait minorCheckIn
    extends sharepointLib.SPNs.CheckinType
  
  @js.native
  sealed trait overwriteCheckIn
    extends sharepointLib.SPNs.CheckinType
  
  /* 1 */ val majorCheckIn: majorCheckIn with scala.Double = js.native
  /* 0 */ val minorCheckIn: minorCheckIn with scala.Double = js.native
  /* 2 */ val overwriteCheckIn: overwriteCheckIn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.CheckinType with scala.Double] = js.native
}

