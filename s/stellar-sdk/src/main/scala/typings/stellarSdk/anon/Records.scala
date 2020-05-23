package typings.stellarSdk.anon

import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Records[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var records: js.Array[T]
}

object Records {
  @scala.inline
  def apply[T](records: js.Array[T]): Records[T] = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[Records[T]]
  }
}

