package typings.reduxPromiseMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Action payload types
  type AsyncFunction = js.Function0[js.Promise[js.Any]]
  
  type AsyncPayload = js.Promise[js.Any] | typings.reduxPromiseMiddleware.mod.AsyncFunction | typings.reduxPromiseMiddleware.anon.Data
  
  type FulfilledActionType = typings.reduxPromiseMiddleware.mod.ActionType.Fulfilled | java.lang.String
  
  // Action type types
  type PendingActionType = typings.reduxPromiseMiddleware.mod.ActionType.Pending | java.lang.String
  
  type RejectedActionType = typings.reduxPromiseMiddleware.mod.ActionType.Rejected | java.lang.String
}
