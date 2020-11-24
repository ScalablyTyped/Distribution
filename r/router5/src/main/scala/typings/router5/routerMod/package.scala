package typings.router5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routerMod {
  
  type ActivationFn = js.Function3[
    /* toState */ typings.router5.baseMod.State, 
    /* fromState */ typings.router5.baseMod.State, 
    /* done */ typings.router5.baseMod.DoneFn, 
    scala.Boolean | js.Promise[scala.Boolean] | scala.Unit
  ]
  
  type ActivationFnFactory[Dependencies /* <: typings.router5.routerMod.DefaultDependencies */] = js.Function2[
    /* router */ typings.router5.routerMod.Router[typings.router5.routerMod.DefaultDependencies], 
    /* dependencies */ js.UndefOr[Dependencies], 
    typings.router5.routerMod.ActivationFn
  ]
  
  type DefaultDependencies = typings.std.Record[java.lang.String, js.Any]
  
  type Middleware = js.Function3[
    /* toState */ typings.router5.baseMod.State, 
    /* fromState */ typings.router5.baseMod.State, 
    /* done */ typings.router5.baseMod.DoneFn, 
    scala.Boolean | js.Promise[js.Any] | scala.Unit
  ]
  
  type MiddlewareFactory[Dependencies /* <: typings.router5.routerMod.DefaultDependencies */] = js.Function2[
    /* router */ typings.router5.routerMod.Router[typings.router5.routerMod.DefaultDependencies], 
    /* dependencies */ Dependencies, 
    typings.router5.routerMod.Middleware
  ]
  
  type PluginFactory[Dependencies /* <: typings.router5.routerMod.DefaultDependencies */] = js.Function2[
    /* router */ js.UndefOr[typings.router5.routerMod.Router[typings.router5.routerMod.DefaultDependencies]], 
    /* dependencies */ js.UndefOr[Dependencies], 
    typings.router5.routerMod.Plugin
  ]
  
  type SubscribeFn = js.Function1[/* state */ typings.router5.routerMod.SubscribeState, scala.Unit]
}
