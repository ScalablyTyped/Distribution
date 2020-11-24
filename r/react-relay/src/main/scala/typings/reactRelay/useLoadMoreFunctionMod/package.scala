package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useLoadMoreFunctionMod {
  
  type LoadMoreFn[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */] = js.Function2[
    /* count */ scala.Double, 
    /* options */ js.UndefOr[typings.reactRelay.anon.OnComplete[TQuery]], 
    typings.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
}
