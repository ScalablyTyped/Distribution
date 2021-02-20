package typings.reactNativeFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RNFetchBlobFetchRepsonse extends StObject {
  
  def arrayBuffer(): js.Promise[js.Array[_]] = js.native
  
  def blob(): js.Promise[PolyfillBlob] = js.native
  
  var bodyUsed: Boolean = js.native
  
  var headers: js.Any = js.native
  
  def json(): js.Promise[_] = js.native
  
  var ok: Boolean = js.native
  
  def rawResp(): js.Promise[FetchBlobResponse] = js.native
  
  var resp: FetchBlobResponse = js.native
  
  var rnfbResp: FetchBlobResponse = js.native
  
  var rnfbRespInfo: RNFetchBlobResponseInfo = js.native
  
  var status: Double = js.native
  
  def text(): js.Promise[String] = js.native
  
  var `type`: String = js.native
}
object RNFetchBlobFetchRepsonse {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.Array[_]],
    blob: () => js.Promise[PolyfillBlob],
    bodyUsed: Boolean,
    headers: js.Any,
    json: () => js.Promise[_],
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
  
  @scala.inline
  implicit class RNFetchBlobFetchRepsonseMutableBuilder[Self <: RNFetchBlobFetchRepsonse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: () => js.Promise[js.Array[_]]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlob(value: () => js.Promise[PolyfillBlob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJson(value: () => js.Promise[_]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawResp(value: () => js.Promise[FetchBlobResponse]): Self = StObject.set(x, "rawResp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResp(value: FetchBlobResponse): Self = StObject.set(x, "resp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRnfbResp(value: FetchBlobResponse): Self = StObject.set(x, "rnfbResp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRnfbRespInfo(value: RNFetchBlobResponseInfo): Self = StObject.set(x, "rnfbRespInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
