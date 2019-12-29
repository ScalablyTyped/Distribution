package typings.sipDotJs.libEnumsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialogStatus extends js.Object

@JSImport("sip.js/lib/Enums", "DialogStatus")
@js.native
object DialogStatus extends js.Object {
  @js.native
  sealed trait STATUS_CONFIRMED extends DialogStatus
  
  @js.native
  sealed trait STATUS_EARLY extends DialogStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialogStatus with Double] = js.native
  /* 2 */ @js.native
  object STATUS_CONFIRMED extends TopLevel[STATUS_CONFIRMED with Double]
  
  /* 1 */ @js.native
  object STATUS_EARLY extends TopLevel[STATUS_EARLY with Double]
  
}

