package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionPage[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var records: js.Array[T]
  def next(): js.Promise[CollectionPage[T]]
  def prev(): js.Promise[CollectionPage[T]]
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
}

