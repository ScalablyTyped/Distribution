package typings.realmNetworkTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkTransport extends js.Object {
  
  def fetchAndParse[RequestBody /* <: js.Any */, ResponseBody /* <: js.Any */](request: Request[RequestBody]): js.Promise[ResponseBody] = js.native
  
  def fetchWithCallbacks[RequestBody /* <: js.Any */](request: Request[RequestBody], handler: ResponseHandler): Unit = js.native
}
object NetworkTransport {
  
  @scala.inline
  def apply(
    fetchAndParse: Request[js.Any] => js.Promise[js.Any],
    fetchWithCallbacks: (Request[js.Any], ResponseHandler) => Unit
  ): NetworkTransport = {
    val __obj = js.Dynamic.literal(fetchAndParse = js.Any.fromFunction1(fetchAndParse), fetchWithCallbacks = js.Any.fromFunction2(fetchWithCallbacks))
    __obj.asInstanceOf[NetworkTransport]
  }
  
  @scala.inline
  implicit class NetworkTransportOps[Self <: NetworkTransport] (val x: Self) extends AnyVal {
    
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
    def setFetchAndParse(value: Request[js.Any] => js.Promise[js.Any]): Self = this.set("fetchAndParse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFetchWithCallbacks(value: (Request[js.Any], ResponseHandler) => Unit): Self = this.set("fetchWithCallbacks", js.Any.fromFunction2(value))
  }
}
