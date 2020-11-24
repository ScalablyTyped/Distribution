package typings.reactRelay.usePaginationFragmentMod

import typings.reactRelay.anon.OnComplete
import typings.reactRelay.helpersMod.KeyType
import typings.reactRelay.useLoadMoreFunctionMod.LoadMoreFn
import typings.reactRelay.useRefetchableFragmentNodeMod.Options
import typings.reactRelay.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnType[TQuery /* <: OperationType */, TKey /* <: KeyType[_] | Null */, TFragmentData] extends js.Object {
  
  var data: TFragmentData = js.native
  
  var hasNext: Boolean = js.native
  
  var hasPrevious: Boolean = js.native
  
  var isLoadingNext: Boolean = js.native
  
  var isLoadingPrevious: Boolean = js.native
  
  var loadNext: LoadMoreFn[TQuery] = js.native
  
  var loadPrevious: LoadMoreFn[TQuery] = js.native
  
  var refetch: RefetchFnDynamic[TQuery, TKey, Options] = js.native
}
object ReturnType {
  
  @scala.inline
  def apply[TQuery /* <: OperationType */, TKey /* <: KeyType[_] | Null */, TFragmentData](
    data: TFragmentData,
    hasNext: Boolean,
    hasPrevious: Boolean,
    isLoadingNext: Boolean,
    isLoadingPrevious: Boolean,
    loadNext: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable,
    loadPrevious: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable,
    refetch: RefetchFnDynamic[TQuery, TKey, Options]
  ): ReturnType[TQuery, TKey, TFragmentData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], isLoadingNext = isLoadingNext.asInstanceOf[js.Any], isLoadingPrevious = isLoadingPrevious.asInstanceOf[js.Any], loadNext = js.Any.fromFunction2(loadNext), loadPrevious = js.Any.fromFunction2(loadPrevious), refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnType[TQuery, TKey, TFragmentData]]
  }
  
  @scala.inline
  implicit class ReturnTypeOps[Self <: ReturnType[_, _, _], TQuery /* <: OperationType */, TKey /* <: KeyType[_] | Null */, TFragmentData] (val x: Self with (ReturnType[TQuery, TKey, TFragmentData])) extends AnyVal {
    
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
    def setData(value: TFragmentData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNext(value: Boolean): Self = this.set("hasNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPrevious(value: Boolean): Self = this.set("hasPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoadingNext(value: Boolean): Self = this.set("isLoadingNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoadingPrevious(value: Boolean): Self = this.set("isLoadingPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadNext(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable): Self = this.set("loadNext", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadPrevious(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable): Self = this.set("loadPrevious", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRefetch(value: RefetchFnDynamic[TQuery, TKey, Options]): Self = this.set("refetch", value.asInstanceOf[js.Any])
  }
}
