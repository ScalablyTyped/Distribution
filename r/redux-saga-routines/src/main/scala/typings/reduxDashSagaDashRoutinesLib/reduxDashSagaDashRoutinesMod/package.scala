package typings
package reduxDashSagaDashRoutinesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashSagaDashRoutinesMod {
  type ActionCreator = reduxDashActionsLib.reduxDashActionsMod.ActionFunctions[js.Any] | (reduxDashActionsLib.reduxDashActionsMod.ActionWithMetaFunctions[js.Any, js.Any])
  type BoundPromiseCreator[TPayload] = js.Function1[/* payload */ TPayload, js.Thenable[js.Any]]
  type PromiseCreator[TPayload] = js.Function2[
    /* payload */ TPayload, 
    /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction], 
    js.Thenable[js.Any]
  ]
  type Routine[TTriggerActionCreator] = reduxDashSagaDashRoutinesLib.Anon_FAILURE[TTriggerActionCreator] with TTriggerActionCreator
}
