package typings.reactQuery

import typings.reactQuery.mod.AnyQueryKey
import typings.reactQuery.mod.AnyVariables
import typings.reactQuery.mod.InfiniteQueryFunctionWithVariables
import typings.reactQuery.mod.InfiniteQueryOptions
import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryKey[TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TResult, TMoreVariable] extends js.Object {
  var config: js.UndefOr[InfiniteQueryOptions[TResult, TMoreVariable]] = js.undefined
  var queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable]
  var queryKey: js.UndefOr[TKey | `false` | Null | (js.Function0[js.UndefOr[TKey | `false` | Null]])] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object AnonQueryKey {
  @scala.inline
  def apply[TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TResult, TMoreVariable](
    queryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Append<_.List.Concat<TKey, TVariables>, TMoreVariable> */ /* keysAndVariablesAndMore */ js.Any => js.Promise[TResult],
    config: InfiniteQueryOptions[TResult, TMoreVariable] = null,
    queryKey: TKey | `false` | (js.Function0[js.UndefOr[TKey | `false` | Null]]) = null,
    variables: TVariables = null
  ): AnonQueryKey[TKey, TVariables, TResult, TMoreVariable] = {
    val __obj = js.Dynamic.literal(queryFn = js.Any.fromFunction1(queryFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (queryKey != null) __obj.updateDynamic("queryKey")(queryKey.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueryKey[TKey, TVariables, TResult, TMoreVariable]]
  }
}

