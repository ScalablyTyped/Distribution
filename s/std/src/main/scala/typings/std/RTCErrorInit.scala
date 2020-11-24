package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCErrorInit extends js.Object {
  
  var errorDetail: RTCErrorDetailType = js.native
  
  var httpRequestStatusCode: js.UndefOr[Double] = js.native
  
  var receivedAlert: js.UndefOr[Double] = js.native
  
  var sctpCauseCode: js.UndefOr[Double] = js.native
  
  var sdpLineNumber: js.UndefOr[Double] = js.native
  
  var sentAlert: js.UndefOr[Double] = js.native
}
object RTCErrorInit {
  
  @scala.inline
  def apply(errorDetail: RTCErrorDetailType): RTCErrorInit = {
    val __obj = js.Dynamic.literal(errorDetail = errorDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorInit]
  }
  
  @scala.inline
  implicit class RTCErrorInitOps[Self <: RTCErrorInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorDetail(value: RTCErrorDetailType): Self = this.set("errorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRequestStatusCode(value: Double): Self = this.set("httpRequestStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpRequestStatusCode: Self = this.set("httpRequestStatusCode", js.undefined)
    
    @scala.inline
    def setReceivedAlert(value: Double): Self = this.set("receivedAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceivedAlert: Self = this.set("receivedAlert", js.undefined)
    
    @scala.inline
    def setSctpCauseCode(value: Double): Self = this.set("sctpCauseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSctpCauseCode: Self = this.set("sctpCauseCode", js.undefined)
    
    @scala.inline
    def setSdpLineNumber(value: Double): Self = this.set("sdpLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdpLineNumber: Self = this.set("sdpLineNumber", js.undefined)
    
    @scala.inline
    def setSentAlert(value: Double): Self = this.set("sentAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentAlert: Self = this.set("sentAlert", js.undefined)
  }
}
