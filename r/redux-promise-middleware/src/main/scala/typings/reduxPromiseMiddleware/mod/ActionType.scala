package typings.reduxPromiseMiddleware.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionType extends js.Object
@JSImport("redux-promise-middleware", "ActionType")
@js.native
object ActionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ActionType with String] = js.native
  
  @js.native
  sealed trait Fulfilled extends ActionType
  /* "FULFILLED" */ @js.native
  object Fulfilled extends TopLevel[Fulfilled with String]
  
  @js.native
  sealed trait Pending extends ActionType
  /* "PENDING" */ @js.native
  object Pending extends TopLevel[Pending with String]
  
  @js.native
  sealed trait Rejected extends ActionType
  /* "REJECTED" */ @js.native
  object Rejected extends TopLevel[Rejected with String]
}
