package typings.soap.typesMod

import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequiredUriUrl
import typings.soap.httpMod.HttpClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends IWsdlBaseOptions {
  
  var customDeserializer: js.UndefOr[js.Any] = js.native
  
  /** don't cache WSDL files, request them every time. */
  var disableCache: js.UndefOr[Boolean] = js.native
  
  /** override the SOAP service's host specified in the .wsdl file. */
  var endpoint: js.UndefOr[String] = js.native
  
  /** set specific key instead of <pre><soap:Body></soap:Body></pre>. */
  var envelopeKey: js.UndefOr[String] = js.native
  
  /** provide your own http client that implements request(rurl, data, callback, exheaders, exoptions) */
  var httpClient: js.UndefOr[HttpClient] = js.native
  
  /** if your wsdl operations contains names with Async suffix, you will need to override the default promise suffix to a custom one, default: Async. */
  var overridePromiseSuffix: js.UndefOr[String] = js.native
  
  /** override the request module. */
  var request: js.UndefOr[RequestAPI[Request, CoreOptions, RequiredUriUrl]] = js.native
  
  var returnSaxStream: js.UndefOr[Boolean] = js.native
  
  var stream: js.UndefOr[Boolean] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomDeserializer(value: js.Any): Self = this.set("customDeserializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDeserializer: Self = this.set("customDeserializer", js.undefined)
    
    @scala.inline
    def setDisableCache(value: Boolean): Self = this.set("disableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCache: Self = this.set("disableCache", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setEnvelopeKey(value: String): Self = this.set("envelopeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeKey: Self = this.set("envelopeKey", js.undefined)
    
    @scala.inline
    def setHttpClient(value: HttpClient): Self = this.set("httpClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpClient: Self = this.set("httpClient", js.undefined)
    
    @scala.inline
    def setOverridePromiseSuffix(value: String): Self = this.set("overridePromiseSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverridePromiseSuffix: Self = this.set("overridePromiseSuffix", js.undefined)
    
    @scala.inline
    def setRequest(value: RequestAPI[Request, CoreOptions, RequiredUriUrl]): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setReturnSaxStream(value: Boolean): Self = this.set("returnSaxStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnSaxStream: Self = this.set("returnSaxStream", js.undefined)
    
    @scala.inline
    def setStream(value: Boolean): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
}
