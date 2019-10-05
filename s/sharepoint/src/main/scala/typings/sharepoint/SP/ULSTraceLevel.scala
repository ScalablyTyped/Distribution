package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ULSTraceLevel extends js.Object

@JSGlobal("SP.ULSTraceLevel")
@js.native
object ULSTraceLevel extends js.Object {
  @js.native
  sealed trait verbose extends ULSTraceLevel
  
  /* 0 */ val verbose: typings.sharepoint.SP.ULSTraceLevel.verbose with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ULSTraceLevel with Double] = js.native
}

