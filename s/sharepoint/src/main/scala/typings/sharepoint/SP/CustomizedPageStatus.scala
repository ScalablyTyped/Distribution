package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomizedPageStatus with Double] = js.native
  /* 2 */ @js.native
  object customized extends TopLevel[customized with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object uncustomized extends TopLevel[uncustomized with Double]
  
}

