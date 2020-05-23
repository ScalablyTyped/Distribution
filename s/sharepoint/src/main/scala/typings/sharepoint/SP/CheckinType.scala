package typings.sharepoint.SP

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
  
}

