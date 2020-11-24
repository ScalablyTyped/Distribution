package typings.reactRequest.mod

import typings.std.Error
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchResponse[T] extends js.Object {
  
  var data: T | Null = js.native
  
  var didUnmount: Boolean = js.native
  
  var error: Error | Null = js.native
  
  var failed: Boolean = js.native
  
  var init: js.Any = js.native
  
  var requestKey: String = js.native
  
  var response: Response | Null = js.native
  
  var url: String = js.native
}
object FetchResponse {
  
  @scala.inline
  def apply[T](didUnmount: Boolean, failed: Boolean, init: js.Any, requestKey: String, url: String): FetchResponse[T] = {
    val __obj = js.Dynamic.literal(didUnmount = didUnmount.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], requestKey = requestKey.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResponse[T]]
  }
  
  @scala.inline
  implicit class FetchResponseOps[Self <: FetchResponse[_], T] (val x: Self with FetchResponse[T]) extends AnyVal {
    
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
    def setDidUnmount(value: Boolean): Self = this.set("didUnmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: Boolean): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: js.Any): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestKey(value: String): Self = this.set("requestKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    
    @scala.inline
    def setResponse(value: Response): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseNull: Self = this.set("response", null)
  }
}
