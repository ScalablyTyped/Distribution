package typings.reactDashApollo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mutationMod {
  import typings.apolloDashCache.libTypesDataProxyMod.DataProxy
  import typings.reactDashApollo.Anon_Context
  import typings.std.Record

  type FetchResult[TData, C, E] = ExecutionResult[TData] with (Anon_Context[E, C])
  type MutationFn[TData, TVariables] = js.Function1[
    /* options */ js.UndefOr[MutationOptions[TData, TVariables]], 
    js.Promise[Unit | (FetchResult[TData, Record[String, js.Any], Record[String, js.Any]])]
  ]
  type MutationUpdaterFn[T] = js.Function2[
    /* proxy */ DataProxy, 
    /* mutationResult */ FetchResult[T, Record[String, js.Any], Record[String, js.Any]], 
    Unit
  ]
}
