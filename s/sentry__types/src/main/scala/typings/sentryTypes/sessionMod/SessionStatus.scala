package typings.sentryTypes.sessionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SessionStatus extends js.Object
@JSImport("@sentry/types/dist/session", "SessionStatus")
@js.native
object SessionStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionStatus with String] = js.native
  
  /** JSDoc */
  @js.native
  sealed trait Abnormal extends SessionStatus
  /* "abnormal" */ @js.native
  object Abnormal extends TopLevel[Abnormal with String]
  
  /** JSDoc */
  @js.native
  sealed trait Crashed extends SessionStatus
  /* "crashed" */ @js.native
  object Crashed extends TopLevel[Crashed with String]
  
  /** JSDoc */
  @js.native
  sealed trait Exited extends SessionStatus
  /* "exited" */ @js.native
  object Exited extends TopLevel[Exited with String]
  
  /** JSDoc */
  @js.native
  sealed trait Ok extends SessionStatus
  /* "ok" */ @js.native
  object Ok extends TopLevel[Ok with String]
}
