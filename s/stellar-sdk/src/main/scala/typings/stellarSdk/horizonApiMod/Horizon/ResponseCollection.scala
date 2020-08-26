package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarSdk.anon.Next
import typings.stellarSdk.anon.Records
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseCollection[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var _embedded: Records[T] = js.native
  var _links: Next = js.native
}

object ResponseCollection {
  @scala.inline
  def apply[/* <: typings.stellarSdk.horizonApiMod.Horizon.BaseResponse[scala.Nothing] */ T](_embedded: Records[T], _links: Next): ResponseCollection[T] = {
    val __obj = js.Dynamic.literal(_embedded = _embedded.asInstanceOf[js.Any], _links = _links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCollection[T]]
  }
  @scala.inline
  implicit class ResponseCollectionOps[Self <: ResponseCollection[_], /* <: typings.stellarSdk.horizonApiMod.Horizon.BaseResponse[scala.Nothing] */ T] (val x: Self with ResponseCollection[T]) extends AnyVal {
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
    def set_embedded(value: Records[T]): Self = this.set("_embedded", value.asInstanceOf[js.Any])
    @scala.inline
    def set_links(value: Next): Self = this.set("_links", value.asInstanceOf[js.Any])
  }
  
}

