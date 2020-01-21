package typings.stellarSdk

import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecords[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var records: js.Array[T]
}

object AnonRecords {
  @scala.inline
  def apply[T /* <: BaseResponse[scala.Nothing] */](records: js.Array[T]): AnonRecords[T] = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRecords[T]]
  }
}

