package typings.reactQuery.anon

import typings.reactQuery.mod.AnyQueryKey
import typings.reactQuery.mod.AnyVariables
import typings.reactQuery.mod.InfiniteQueryFunctionWithVariables
import typings.reactQuery.mod.InfiniteQueryOptions
import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryKey[TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TResult, TMoreVariable] extends js.Object {
  var config: js.UndefOr[InfiniteQueryOptions[TResult, TMoreVariable]] = js.native
  var queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable] = js.native
  var queryKey: js.UndefOr[TKey | `false` | Null | (js.Function0[js.UndefOr[TKey | `false` | Null]])] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object QueryKey {
  @scala.inline
  def apply[/* <: typings.reactQuery.mod.AnyQueryKey */ TKey, /* <: typings.reactQuery.mod.AnyVariables */ TVariables, TResult, TMoreVariable](
    queryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Append<_.List.Concat<TKey, TVariables>, TMoreVariable> */ /* keysAndVariablesAndMore */ js.Any => js.Promise[TResult]
  ): QueryKey[TKey, TVariables, TResult, TMoreVariable] = {
    val __obj = js.Dynamic.literal(queryFn = js.Any.fromFunction1(queryFn))
    __obj.asInstanceOf[QueryKey[TKey, TVariables, TResult, TMoreVariable]]
  }
  @scala.inline
  implicit class QueryKeyOps[Self <: QueryKey[_, _, _, _], /* <: typings.reactQuery.mod.AnyQueryKey */ TKey, /* <: typings.reactQuery.mod.AnyVariables */ TVariables, TResult, TMoreVariable] (val x: Self with (QueryKey[TKey, TVariables, TResult, TMoreVariable])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQueryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _.List.Append<_.List.Concat<TKey, TVariables>, TMoreVariable> */ /* keysAndVariablesAndMore */ js.Any => js.Promise[TResult]
    ): Self = this.set("queryFn", js.Any.fromFunction1(value))
    @scala.inline
    def setConfig(value: InfiniteQueryOptions[TResult, TMoreVariable]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setQueryKeyFunction0(value: () => js.UndefOr[TKey | `false` | Null]): Self = this.set("queryKey", js.Any.fromFunction0(value))
    @scala.inline
    def setQueryKey(value: TKey | `false` | (js.Function0[js.UndefOr[TKey | `false` | Null]])): Self = this.set("queryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryKey: Self = this.set("queryKey", js.undefined)
    @scala.inline
    def setQueryKeyNull: Self = this.set("queryKey", null)
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

