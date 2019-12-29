package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckinType with Double] = js.native
  /* 1 */ @js.native
  object majorCheckIn extends TopLevel[majorCheckIn with Double]
  
  /* 0 */ @js.native
  object minorCheckIn extends TopLevel[minorCheckIn with Double]
  
  /* 2 */ @js.native
  object overwriteCheckIn extends TopLevel[overwriteCheckIn with Double]
  
}

