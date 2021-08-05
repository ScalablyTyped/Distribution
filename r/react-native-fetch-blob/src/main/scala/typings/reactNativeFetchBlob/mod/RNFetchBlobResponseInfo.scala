package typings.reactNativeFetchBlob.mod

import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings._empty
import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.ascii
import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.base64
import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.blob
import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.json
import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.path
import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.text
import typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobResponseInfo extends StObject {
  
  var headers: js.Any
  
  var respType: text | blob | _empty | json
  
  var rnfbEncode: path | base64 | ascii | utf8
  
  var state: Double
  
  var status: Double
  
  var taskId: String
}
object RNFetchBlobResponseInfo {
  
  inline def apply(
    headers: js.Any,
    respType: text | blob | _empty | json,
    rnfbEncode: path | base64 | ascii | utf8,
    state: Double,
    status: Double,
    taskId: String
  ): RNFetchBlobResponseInfo = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], respType = respType.asInstanceOf[js.Any], rnfbEncode = rnfbEncode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobResponseInfo]
  }
  
  extension [Self <: RNFetchBlobResponseInfo](x: Self) {
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setRespType(value: text | blob | _empty | json): Self = StObject.set(x, "respType", value.asInstanceOf[js.Any])
    
    inline def setRnfbEncode(value: path | base64 | ascii | utf8): Self = StObject.set(x, "rnfbEncode", value.asInstanceOf[js.Any])
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
