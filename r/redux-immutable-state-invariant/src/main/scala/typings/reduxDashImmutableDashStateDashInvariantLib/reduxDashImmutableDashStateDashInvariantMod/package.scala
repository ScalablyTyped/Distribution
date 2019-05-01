package typings
package reduxDashImmutableDashStateDashInvariantLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashImmutableDashStateDashInvariantMod {
  type immutableStateInvariantMiddlewareInterface = js.Function1[
    /* isImmutable */ js.UndefOr[isImmutableDefault], 
    reduxLib.reduxMod.Middleware[js.Object, js.Any, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
  ]
  type isImmutableDefault = js.Function1[/* value */ js.Any, scala.Boolean]
}
