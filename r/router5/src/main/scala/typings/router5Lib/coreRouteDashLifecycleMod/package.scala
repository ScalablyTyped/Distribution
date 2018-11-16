package typings
package router5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreRouteDashLifecycleMod {
  type ActivationFn = js.Function3[
    /* toState */ router5Lib.createDashRouterMod.State, 
    /* fromState */ router5Lib.createDashRouterMod.State, 
    /* done */ router5Lib.router5Mod.DoneFn, 
    scala.Boolean | stdLib.Promise[scala.Boolean] | scala.Unit
  ]
  type ActivationFnFactory = js.Function2[
    /* router */ router5Lib.coreRouteDashLifecycleMod.createDashRouterMod.Router, 
    /* dependencies */ js.UndefOr[router5Lib.createDashRouterMod.Dependencies], 
    ActivationFn
  ]
}
