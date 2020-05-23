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
  
}

