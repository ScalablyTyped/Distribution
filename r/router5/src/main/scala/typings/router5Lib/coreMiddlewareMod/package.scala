package typings
package router5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreMiddlewareMod {
  type Middleware = js.Function3[
    /* toState */ router5Lib.createDashRouterMod.State, 
    /* fromState */ router5Lib.createDashRouterMod.State, 
    /* done */ router5Lib.router5Mod.DoneFn, 
    scala.Boolean | stdLib.Promise[js.Any] | scala.Unit
  ]
  type MiddlewareFactory = js.Function2[
    /* router */ router5Lib.coreMiddlewareMod.createDashRouterMod.Router, 
    /* dependencies */ router5Lib.createDashRouterMod.Dependencies, 
    Middleware
  ]
}
