package typings.sipJs.enumsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UAStatus extends js.Object

@JSImport("sip.js/lib/Enums", "UAStatus")
@js.native
object UAStatus extends js.Object {
  @js.native
  sealed trait STATUS_INIT extends UAStatus
  
  @js.native
  sealed trait STATUS_NOT_READY extends UAStatus
  
  @js.native
  sealed trait STATUS_READY extends UAStatus
  
  @js.native
  sealed trait STATUS_STARTING extends UAStatus
  
  @js.native
  sealed trait STATUS_USER_CLOSED extends UAStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UAStatus with Double] = js.native
  /* 0 */ @js.native
  object STATUS_INIT extends TopLevel[STATUS_INIT with Double]
  
  /* 4 */ @js.native
  object STATUS_NOT_READY extends TopLevel[STATUS_NOT_READY with Double]
  
  /* 2 */ @js.native
  object STATUS_READY extends TopLevel[STATUS_READY with Double]
  
  /* 1 */ @js.native
  object STATUS_STARTING extends TopLevel[STATUS_STARTING with Double]
  
  /* 3 */ @js.native
  object STATUS_USER_CLOSED extends TopLevel[STATUS_USER_CLOSED with Double]
  
}

