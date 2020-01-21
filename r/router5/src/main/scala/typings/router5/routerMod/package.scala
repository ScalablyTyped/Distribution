package typings.router5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type ActivationFn = js.Function3[
    /* toState */ typings.router5.baseMod.State, 
    /* fromState */ typings.router5.baseMod.State, 
    /* done */ typings.router5.baseMod.DoneFn, 
    scala.Boolean | js.Promise[scala.Boolean] | scala.Unit
  ]
  type ActivationFnFactory = js.Function2[
    /* router */ typings.router5.routerMod.Router, 
    /* dependencies */ js.UndefOr[typings.router5.routerMod.Dependencies], 
    typings.router5.routerMod.ActivationFn
  ]
  type CreateRouter = js.Function3[
    /* routes */ js.UndefOr[js.Array[typings.router5.routerMod.Route] | typings.routeNode.mod.default], 
    /* options */ js.UndefOr[typings.std.Partial[typings.router5.routerMod.Options]], 
    /* dependencies */ js.UndefOr[typings.router5.routerMod.Dependencies], 
    typings.router5.routerMod.Router
  ]
  type Dependencies = typings.std.Record[java.lang.String, js.Any]
  type Middleware = js.Function3[
    /* toState */ typings.router5.baseMod.State, 
    /* fromState */ typings.router5.baseMod.State, 
    /* done */ typings.router5.baseMod.DoneFn, 
    scala.Boolean | js.Promise[js.Any] | scala.Unit
  ]
  type MiddlewareFactory = js.Function2[
    /* router */ typings.router5.routerMod.Router, 
    /* dependencies */ typings.router5.routerMod.Dependencies, 
    typings.router5.routerMod.Middleware
  ]
  type PluginFactory = js.Function2[
    /* router */ js.UndefOr[typings.router5.routerMod.Router], 
    /* dependencies */ js.UndefOr[typings.router5.routerMod.Dependencies], 
    typings.router5.routerMod.Plugin
  ]
  type SubscribeFn = js.Function1[/* state */ typings.router5.routerMod.SubscribeState, scala.Unit]
}
