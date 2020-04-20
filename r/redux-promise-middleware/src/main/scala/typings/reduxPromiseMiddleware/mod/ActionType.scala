package typings.reduxPromiseMiddleware.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionType extends js.Object

@JSImport("redux-promise-middleware", "ActionType")
@js.native
object ActionType extends js.Object {
  @js.native
  sealed trait Fulfilled extends ActionType
  
  @js.native
  sealed trait Pending extends ActionType
  
  @js.native
  sealed trait Rejected extends ActionType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionType with String] = js.native
  /* "FULFILLED" */ @js.native
  object Fulfilled extends TopLevel[Fulfilled with String]
  
  /* "PENDING" */ @js.native
  object Pending extends TopLevel[Pending with String]
  
  /* "REJECTED" */ @js.native
  object Rejected extends TopLevel[Rejected with String]
  
}

