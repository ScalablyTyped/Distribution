package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomizedPageStatus extends js.Object

@JSGlobal("SP.CustomizedPageStatus")
@js.native
object CustomizedPageStatus extends js.Object {
  @js.native
  sealed trait customized extends CustomizedPageStatus
  
  @js.native
  sealed trait none extends CustomizedPageStatus
  
  @js.native
  sealed trait uncustomized extends CustomizedPageStatus
  
  /* 2 */ val customized: typings.sharepoint.SP.CustomizedPageStatus.customized with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.CustomizedPageStatus.none with Double = js.native
  /* 1 */ val uncustomized: typings.sharepoint.SP.CustomizedPageStatus.uncustomized with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomizedPageStatus with Double] = js.native
}

