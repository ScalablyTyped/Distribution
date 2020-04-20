package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarSdk.AnonNext
import typings.stellarSdk.AnonRecords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseCollection[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var _embedded: AnonRecords[T]
  var _links: AnonNext
}

object ResponseCollection {
  @scala.inline
  def apply[T /* <: BaseResponse[scala.Nothing] */](_embedded: AnonRecords[T], _links: AnonNext): ResponseCollection[T] = {
    val __obj = js.Dynamic.literal(_embedded = _embedded.asInstanceOf[js.Any], _links = _links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCollection[T]]
  }
}

