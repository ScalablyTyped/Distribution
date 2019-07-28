package typings.stellarDashSdk

import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Records[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var records: js.Array[T]
}

object Anon_Records {
  @scala.inline
  def apply[T /* <: BaseResponse[scala.Nothing] */](records: js.Array[T]): Anon_Records[T] = {
    val __obj = js.Dynamic.literal(records = records)
  
    __obj.asInstanceOf[Anon_Records[T]]
  }
}

