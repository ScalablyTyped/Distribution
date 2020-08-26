package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionPage[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var records: js.Array[T] = js.native
  def next(): js.Promise[CollectionPage[T]] = js.native
  def prev(): js.Promise[CollectionPage[T]] = js.native
}

object CollectionPage {
  @scala.inline
  def apply[/* <: typings.stellarSdk.horizonApiMod.Horizon.BaseResponse[scala.Nothing] */ T](
    next: () => js.Promise[CollectionPage[T]],
    prev: () => js.Promise[CollectionPage[T]],
    records: js.Array[T]
  ): CollectionPage[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionPage[T]]
  }
  @scala.inline
  implicit class CollectionPageOps[Self <: CollectionPage[_], /* <: typings.stellarSdk.horizonApiMod.Horizon.BaseResponse[scala.Nothing] */ T] (val x: Self with CollectionPage[T]) extends AnyVal {
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
    def setNext(value: () => js.Promise[CollectionPage[T]]): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setPrev(value: () => js.Promise[CollectionPage[T]]): Self = this.set("prev", js.Any.fromFunction0(value))
    @scala.inline
    def setRecordsVarargs(value: T*): Self = this.set("records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: js.Array[T]): Self = this.set("records", value.asInstanceOf[js.Any])
  }
  
}

