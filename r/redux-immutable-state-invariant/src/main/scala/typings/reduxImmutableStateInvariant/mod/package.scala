package typings.reduxImmutableStateInvariant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type immutableStateInvariantMiddlewareInterface = js.Function1[
    /* options */ js.UndefOr[
      typings.reduxImmutableStateInvariant.mod.immutableStateInvariantMiddlewareOptions
    ], 
    typings.redux.mod.Middleware[js.Object, js.Any, typings.redux.mod.Dispatch[typings.redux.mod.AnyAction]]
  ]
}
