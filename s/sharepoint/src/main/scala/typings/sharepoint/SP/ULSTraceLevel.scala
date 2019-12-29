package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ULSTraceLevel with Double] = js.native
  /* 0 */ @js.native
  object verbose extends TopLevel[verbose with Double]
  
}

