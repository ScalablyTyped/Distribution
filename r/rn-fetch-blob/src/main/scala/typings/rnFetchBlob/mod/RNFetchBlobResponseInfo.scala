package typings.rnFetchBlob.mod

import typings.rnFetchBlob.rnFetchBlobStrings._empty
import typings.rnFetchBlob.rnFetchBlobStrings.ascii
import typings.rnFetchBlob.rnFetchBlobStrings.base64
import typings.rnFetchBlob.rnFetchBlobStrings.blob
import typings.rnFetchBlob.rnFetchBlobStrings.json
import typings.rnFetchBlob.rnFetchBlobStrings.path
import typings.rnFetchBlob.rnFetchBlobStrings.text
import typings.rnFetchBlob.rnFetchBlobStrings.utf8
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
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class RNFetchBlobResponseInfoMutableBuilder[Self <: RNFetchBlobResponseInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespType(value: text | blob | _empty | json): Self = StObject.set(x, "respType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRnfbEncode(value: path | base64 | ascii | utf8): Self = StObject.set(x, "rnfbEncode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
