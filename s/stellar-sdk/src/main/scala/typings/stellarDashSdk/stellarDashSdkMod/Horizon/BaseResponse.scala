package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResponse[T /* <: String */] extends js.Object {
  var _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any
}

object BaseResponse {
  @scala.inline
  def apply[T /* <: String */](
    _links: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
    */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any
  ): BaseResponse[T] = {
    val __obj = js.Dynamic.literal(_links = _links)
  
    __obj.asInstanceOf[BaseResponse[T]]
  }
}

