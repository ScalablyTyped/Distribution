package typings.reactNativeFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobFetchRepsonse extends StObject {
  
  def arrayBuffer(): js.Promise[js.Array[js.Any]]
  
  def blob(): js.Promise[PolyfillBlob]
  
  var bodyUsed: Boolean
  
  var headers: js.Any
  
  def json(): js.Promise[js.Any]
  
  var ok: Boolean
  
  def rawResp(): js.Promise[FetchBlobResponse]
  
  var resp: FetchBlobResponse
  
  var rnfbResp: FetchBlobResponse
  
  var rnfbRespInfo: RNFetchBlobResponseInfo
  
  var status: Double
  
  def text(): js.Promise[String]
  
  var `type`: String
}
object RNFetchBlobFetchRepsonse {
  
  inline def apply(
    arrayBuffer: () => js.Promise[js.Array[js.Any]],
    blob: () => js.Promise[PolyfillBlob],
    bodyUsed: Boolean,
    headers: js.Any,
    json: () => js.Promise[js.Any],
    ok: Boolean,
    rawResp: () => js.Promise[FetchBlobResponse],
    resp: FetchBlobResponse,
    rnfbResp: FetchBlobResponse,
    rnfbRespInfo: RNFetchBlobResponseInfo,
    status: Double,
    text: () => js.Promise[String],
    `type`: String
  ): RNFetchBlobFetchRepsonse = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], rawResp = js.Any.fromFunction0(rawResp), resp = resp.asInstanceOf[js.Any], rnfbResp = rnfbResp.asInstanceOf[js.Any], rnfbRespInfo = rnfbRespInfo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobFetchRepsonse]
  }
  
  extension [Self <: RNFetchBlobFetchRepsonse](x: Self) {
    
    inline def setArrayBuffer(value: () => js.Promise[js.Array[js.Any]]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    inline def setBlob(value: () => js.Promise[PolyfillBlob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setJson(value: () => js.Promise[js.Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setRawResp(value: () => js.Promise[FetchBlobResponse]): Self = StObject.set(x, "rawResp", js.Any.fromFunction0(value))
    
    inline def setResp(value: FetchBlobResponse): Self = StObject.set(x, "resp", value.asInstanceOf[js.Any])
    
    inline def setRnfbResp(value: FetchBlobResponse): Self = StObject.set(x, "rnfbResp", value.asInstanceOf[js.Any])
    
    inline def setRnfbRespInfo(value: RNFetchBlobResponseInfo): Self = StObject.set(x, "rnfbRespInfo", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
