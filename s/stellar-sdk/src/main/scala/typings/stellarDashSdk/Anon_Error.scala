package typings.stellarDashSdk

import typings.std.Error
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var onerror: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var onmessage: js.UndefOr[js.Function1[/* record */ T, Unit]] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply[T /* <: BaseResponse[scala.Nothing] */](onerror: /* error */ Error => Unit = null, onmessage: /* record */ T => Unit = null): Anon_Error[T] = {
    val __obj = js.Dynamic.literal()
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onmessage != null) __obj.updateDynamic("onmessage")(js.Any.fromFunction1(onmessage))
    __obj.asInstanceOf[Anon_Error[T]]
  }
}

