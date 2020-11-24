package typings.socketIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handshake extends js.Object {
  
  /**
    * The remote address of the connection request
    */
  var address: String = js.native
  
  /**
    * The headers passed along with the request. e.g. 'host',
    * 'connection', 'accept', 'referer', 'cookie'
    */
  var headers: js.Any = js.native
  
  /**
    * The timestamp for when this was issued
    */
  var issued: Double = js.native
  
  /**
    * Any query string parameters in the request url
    */
  var query: js.Any = js.native
  
  /**
    * Is this a secure request?
    */
  var secure: Boolean = js.native
  
  /**
    * The current time, as a string
    */
  var time: String = js.native
  
  /**
    * The request url
    */
  var url: String = js.native
  
  /**
    * Is this a cross-domain request?
    */
  var xdomain: Boolean = js.native
}
object Handshake {
  
  @scala.inline
  def apply(
    address: String,
    headers: js.Any,
    issued: Double,
    query: js.Any,
    secure: Boolean,
    time: String,
    url: String,
    xdomain: Boolean
  ): Handshake = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], issued = issued.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xdomain = xdomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handshake]
  }
  
  @scala.inline
  implicit class HandshakeOps[Self <: Handshake] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssued(value: Double): Self = this.set("issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXdomain(value: Boolean): Self = this.set("xdomain", value.asInstanceOf[js.Any])
  }
}
