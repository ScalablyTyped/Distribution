package typings.sharepoint.SP

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestInfo extends js.Object {
  
  var binaryStringRequestBody: js.UndefOr[Boolean] = js.native
  
  /** Currently need fix to get ginary response. Details: http:// techmikael.blogspot.ru/2013/07/how-to-copy-files-between-sites-using.html */
  var binaryStringResponseBody: js.UndefOr[Boolean] = js.native
  
  /** Can be string or bytearray depending on binaryStringRequestBody field */
  var body: js.UndefOr[String | Uint8Array] = js.native
  
  var error: js.UndefOr[
    js.Function3[
      /* response */ ResponseInfo, 
      /* error */ RequestExecutorErrors, 
      /* statusText */ String, 
      Unit
    ]
  ] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[js.Any] = js.native
  
  var success: js.UndefOr[js.Function1[/* response */ ResponseInfo, Unit]] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: String = js.native
}
object RequestInfo {
  
  @scala.inline
  def apply(url: String): RequestInfo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInfo]
  }
  
  @scala.inline
  implicit class RequestInfoOps[Self <: RequestInfo] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryStringRequestBody(value: Boolean): Self = this.set("binaryStringRequestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryStringRequestBody: Self = this.set("binaryStringRequestBody", js.undefined)
    
    @scala.inline
    def setBinaryStringResponseBody(value: Boolean): Self = this.set("binaryStringResponseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryStringResponseBody: Self = this.set("binaryStringResponseBody", js.undefined)
    
    @scala.inline
    def setBody(value: String | Uint8Array): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setError(
      value: (/* response */ ResponseInfo, /* error */ RequestExecutorErrors, /* statusText */ String) => Unit
    ): Self = this.set("error", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* response */ ResponseInfo => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
