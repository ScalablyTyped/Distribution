package typings.reactDashQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashQueryMod {
  import typings.reactDashQuery.Anon_UpdateQuery
  import typings.reactDashQuery.reactDashQueryNumbers.`false`

  type MutateFunction[TResults, TVariables /* <: js.Object */] = js.Function2[
    /* variables */ js.UndefOr[TVariables], 
    /* options */ js.UndefOr[Anon_UpdateQuery], 
    js.Promise[TResults]
  ]
  type MutationFunction[TResults, TVariables /* <: js.Object */] = js.Function1[/* variables */ TVariables, js.Promise[TResults]]
  type QueryFunction[TResult, TVariables /* <: js.Object */] = js.Function1[/* variables */ TVariables, js.Promise[TResult]]
  type QueryKey[TVariables] = String | (js.Tuple2[String, TVariables]) | `false` | Null | QueryKeyFunction[TVariables]
  type QueryKeyFunction[TVariables] = js.Function0[String | (js.Tuple2[String, TVariables]) | `false` | Null]
}
