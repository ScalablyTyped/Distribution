package typings.reactQuery.mod

import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteQueryOptions[TResult, TMoreVariable]
  extends QueryOptions[js.Array[TResult]] {
  def getFetchMore(lastPage: TResult, allPages: js.Array[TResult]): TMoreVariable | `false` = js.native
}

object InfiniteQueryOptions {
  @scala.inline
  def apply[TResult, TMoreVariable](getFetchMore: (TResult, js.Array[TResult]) => TMoreVariable | `false`): InfiniteQueryOptions[TResult, TMoreVariable] = {
    val __obj = js.Dynamic.literal(getFetchMore = js.Any.fromFunction2(getFetchMore))
    __obj.asInstanceOf[InfiniteQueryOptions[TResult, TMoreVariable]]
  }
  @scala.inline
  implicit class InfiniteQueryOptionsOps[Self <: InfiniteQueryOptions[_, _], TResult, TMoreVariable] (val x: Self with (InfiniteQueryOptions[TResult, TMoreVariable])) extends AnyVal {
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
    def setGetFetchMore(value: (TResult, js.Array[TResult]) => TMoreVariable | `false`): Self = this.set("getFetchMore", js.Any.fromFunction2(value))
  }
  
}

