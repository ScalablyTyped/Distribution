package typings.realmNetworkTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchRequestInit extends js.Object {
  
  /**
    * A BodyInit object or null to set request's body.
    */
  var body: js.UndefOr[FetchBodyInit | Null] = js.native
  
  /**
    * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
    */
  var headers: js.UndefOr[FetchHeadersInit] = js.native
  
  /**
    * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
    */
  var integrity: js.UndefOr[String] = js.native
  
  /**
    * A boolean to set request's keepalive.
    */
  var keepalive: js.UndefOr[Boolean] = js.native
  
  /**
    * A string to set request's method.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * An AbortSignal to set request's signal.
    */
  var signal: js.UndefOr[AbortSignal | Null] = js.native
}
object FetchRequestInit {
  
  @scala.inline
  def apply(): FetchRequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchRequestInit]
  }
  
  @scala.inline
  implicit class FetchRequestInitOps[Self <: FetchRequestInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: FetchBodyInit): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    
    @scala.inline
    def setHeadersVarargs(value: js.Array[String]*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: FetchHeadersInit): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    
    @scala.inline
    def setKeepalive(value: Boolean): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setSignalNull: Self = this.set("signal", null)
  }
}
