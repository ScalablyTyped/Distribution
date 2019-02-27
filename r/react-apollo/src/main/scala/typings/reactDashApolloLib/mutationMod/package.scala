package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mutationMod {
  type FetchResult[TData, C, E] = ExecutionResult[TData] with (reactDashApolloLib.Anon_Context[E, C])
  type MutationFn[TData, TVariables] = js.Function1[
    /* options */ js.UndefOr[MutationOptions[TData, TVariables]], 
    js.Promise[
      scala.Unit | (FetchResult[
        TData, 
        stdLib.Record[java.lang.String, js.Any], 
        stdLib.Record[java.lang.String, js.Any]
      ])
    ]
  ]
  type MutationUpdaterFn[T] = js.Function2[
    /* proxy */ apolloDashCacheLib.libTypesDataProxyMod.DataProxy, 
    /* mutationResult */ FetchResult[T, stdLib.Record[java.lang.String, js.Any], stdLib.Record[java.lang.String, js.Any]], 
    scala.Unit
  ]
}
