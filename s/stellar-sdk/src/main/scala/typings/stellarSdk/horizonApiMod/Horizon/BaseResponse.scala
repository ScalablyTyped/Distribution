package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseResponse[T /* <: String */] extends StObject {
  
  var _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any] = js.native
}
object BaseResponse {
  
  @scala.inline
  def apply[T /* <: String */](
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any]
  ): BaseResponse[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResponse[T]]
  }
  
  @scala.inline
  implicit class BaseResponseMutableBuilder[Self <: BaseResponse[_], T /* <: String */] (val x: Self with BaseResponse[T]) extends AnyVal {
    
    @scala.inline
    def set_links(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
      */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any]
    ): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
