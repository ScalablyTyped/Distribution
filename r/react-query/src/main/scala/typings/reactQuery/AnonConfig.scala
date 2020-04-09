package typings.reactQuery

import typings.reactQuery.mod.AnyQueryKey
import typings.reactQuery.mod.AnyVariables
import typings.reactQuery.mod.QueryFunctionWithVariables
import typings.reactQuery.mod.QueryOptions
import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig[TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TResult] extends js.Object {
  var config: js.UndefOr[QueryOptions[TResult]] = js.undefined
  var queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  var queryKey: js.UndefOr[TKey | `false` | Null | (js.Function0[js.UndefOr[TKey | `false` | Null]])] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object AnonConfig {
  @scala.inline
  def apply[TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TResult](
    queryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Concat<TKey, TVariables> */ /* key */ js.Any => js.Promise[TResult],
    config: QueryOptions[TResult] = null,
    queryKey: TKey | `false` | (js.Function0[js.UndefOr[TKey | `false` | Null]]) = null,
    variables: TVariables = null
  ): AnonConfig[TKey, TVariables, TResult] = {
    val __obj = js.Dynamic.literal(queryFn = js.Any.fromFunction1(queryFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (queryKey != null) __obj.updateDynamic("queryKey")(queryKey.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig[TKey, TVariables, TResult]]
  }
}

