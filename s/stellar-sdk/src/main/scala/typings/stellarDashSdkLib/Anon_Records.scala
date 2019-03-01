package typings
package stellarDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Records[T /* <: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] */] extends js.Object {
  var records: js.Array[T]
}

object Anon_Records {
  @scala.inline
  def apply[T /* <: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] */](records: js.Array[T]): Anon_Records[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("records")(records)
    __obj.asInstanceOf[Anon_Records[T]]
  }
}

