package typings.stellarDashSdk.stellarDashSdkMod.Server

import typings.stellarDashSdk.Anon_Next
import typings.stellarDashSdk.Anon_Records
import typings.stellarDashSdk.stellarDashSdkMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Due to a bug with the recursive function requests */
trait CollectionRecord[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var _embedded: Anon_Records[T]
  var _links: Anon_Next
}

object CollectionRecord {
  @scala.inline
  def apply[T /* <: BaseResponse[scala.Nothing] */](_embedded: Anon_Records[T], _links: Anon_Next): CollectionRecord[T] = {
    val __obj = js.Dynamic.literal(_embedded = _embedded, _links = _links)
  
    __obj.asInstanceOf[CollectionRecord[T]]
  }
}

