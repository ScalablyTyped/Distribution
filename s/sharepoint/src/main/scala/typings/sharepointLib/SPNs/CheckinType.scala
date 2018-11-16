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
  
  val majorCheckIn: majorCheckIn with java.lang.String = js.native
  val minorCheckIn: minorCheckIn with java.lang.String = js.native
  val overwriteCheckIn: overwriteCheckIn with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.CheckinType with java.lang.String] = js.native
}

