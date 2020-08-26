package typings.reactAsync.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.AbortController
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncOptions[T]
  extends /* prop */ StringDictionary[js.Any] {
  var debugLabel: js.UndefOr[String] = js.native
  var deferFn: js.UndefOr[DeferFn[T]] = js.native
  var dispatcher: js.UndefOr[
    js.Function3[
      /* action */ AsyncAction[T], 
      /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], 
      /* props */ AsyncProps[T], 
      Unit
    ]
  ] = js.native
  var initialValue: js.UndefOr[T] = js.native
  var onReject: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  var onResolve: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.native
  var promise: js.UndefOr[js.Promise[T]] = js.native
  var promiseFn: js.UndefOr[PromiseFn[T]] = js.native
  var reducer: js.UndefOr[
    js.Function3[
      /* state */ ReducerAsyncState[T], 
      /* action */ AsyncAction[T], 
      /* internalReducer */ js.Function2[/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], ReducerAsyncState[T]], 
      AsyncState[T, AbstractState[T]]
    ]
  ] = js.native
  var watch: js.UndefOr[js.Any] = js.native
  var watchFn: js.UndefOr[js.Function2[/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T], _]] = js.native
}

object AsyncOptions {
  @scala.inline
  def apply[T](): AsyncOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOptions[T]]
  }
  @scala.inline
  implicit class AsyncOptionsOps[Self <: AsyncOptions[_], T] (val x: Self with AsyncOptions[T]) extends AnyVal {
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
    def setDebugLabel(value: String): Self = this.set("debugLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugLabel: Self = this.set("debugLabel", js.undefined)
    @scala.inline
    def setDeferFn(
      value: (/* args */ js.Array[js.Any], /* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]
    ): Self = this.set("deferFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDeferFn: Self = this.set("deferFn", js.undefined)
    @scala.inline
    def setDispatcher(
      value: (/* action */ AsyncAction[T], /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], /* props */ AsyncProps[T]) => Unit
    ): Self = this.set("dispatcher", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDispatcher: Self = this.set("dispatcher", js.undefined)
    @scala.inline
    def setInitialValue(value: T): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
    @scala.inline
    def setOnReject(value: /* error */ Error => Unit): Self = this.set("onReject", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReject: Self = this.set("onReject", js.undefined)
    @scala.inline
    def setOnResolve(value: /* data */ T => Unit): Self = this.set("onResolve", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResolve: Self = this.set("onResolve", js.undefined)
    @scala.inline
    def setPromise(value: js.Promise[T]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
    @scala.inline
    def setPromiseFn(value: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]): Self = this.set("promiseFn", js.Any.fromFunction2(value))
    @scala.inline
    def deletePromiseFn: Self = this.set("promiseFn", js.undefined)
    @scala.inline
    def setReducer(
      value: (/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], /* internalReducer */ js.Function2[/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], ReducerAsyncState[T]]) => AsyncState[T, AbstractState[T]]
    ): Self = this.set("reducer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteReducer: Self = this.set("reducer", js.undefined)
    @scala.inline
    def setWatch(value: js.Any): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
    @scala.inline
    def setWatchFn(value: (/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T]) => _): Self = this.set("watchFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWatchFn: Self = this.set("watchFn", js.undefined)
  }
  
}

