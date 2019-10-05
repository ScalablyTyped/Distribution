package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import typings.stellarDashSdk.Anon_NextPrev
import typings.stellarDashSdk.Anon_Records
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseCollection[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var _embedded: Anon_Records[T]
  var _links: Anon_NextPrev
}

object ResponseCollection {
  @scala.inline
  def apply[T /* <: BaseResponse[scala.Nothing] */](_embedded: Anon_Records[T], _links: Anon_NextPrev): ResponseCollection[T] = {
    val __obj = js.Dynamic.literal(_embedded = _embedded, _links = _links)
  
    __obj.asInstanceOf[ResponseCollection[T]]
  }
}

