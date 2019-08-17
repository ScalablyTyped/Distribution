package typings.reduxDashImmutableDashStateDashInvariant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashImmutableDashStateDashInvariantMod {
  import typings.redux.reduxMod.AnyAction
  import typings.redux.reduxMod.Dispatch
  import typings.redux.reduxMod.Middleware

  type immutableStateInvariantMiddlewareInterface = js.Function1[
    /* options */ js.UndefOr[immutableStateInvariantMiddlewareOptions], 
    Middleware[js.Object, js.Any, Dispatch[AnyAction]]
  ]
}
