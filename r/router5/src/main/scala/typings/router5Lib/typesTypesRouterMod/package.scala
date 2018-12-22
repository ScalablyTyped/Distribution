package typings
package router5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesTypesRouterMod {
  type ActivationFn = js.Function3[
    /* toState */ router5Lib.typesTypesBaseMod.State, 
    /* fromState */ router5Lib.typesTypesBaseMod.State, 
    /* done */ router5Lib.typesTypesBaseMod.DoneFn, 
    scala.Boolean | js.Promise[scala.Boolean] | scala.Unit
  ]
  type ActivationFnFactory = js.Function2[/* router */ Router, /* dependencies */ js.UndefOr[Dependencies], ActivationFn]
  type CreateRouter = js.Function3[
    /* routes */ js.UndefOr[js.Array[Route] | routeDashNodeLib.routeDashNodeMod.default], 
    /* options */ js.UndefOr[stdLib.Partial[Options]], 
    /* dependencies */ js.UndefOr[Dependencies], 
    Router
  ]
  type Dependencies = stdLib.Record[java.lang.String, js.Any]
  type Middleware = js.Function3[
    /* toState */ router5Lib.typesTypesBaseMod.State, 
    /* fromState */ router5Lib.typesTypesBaseMod.State, 
    /* done */ router5Lib.typesTypesBaseMod.DoneFn, 
    scala.Boolean | js.Promise[js.Any] | scala.Unit
  ]
  type MiddlewareFactory = js.Function2[/* router */ Router, /* dependencies */ Dependencies, Middleware]
  type PluginFactory = js.Function2[/* router */ js.UndefOr[Router], /* dependencies */ js.UndefOr[Dependencies], Plugin]
  type SubscribeFn = js.Function1[/* state */ SubscribeState, scala.Unit]
}
