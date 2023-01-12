package typings.soap

import typings.axios.mod.AxiosPromise
import typings.axios.mod.AxiosResponse
import typings.node.NodeJS.ReadableStream
import typings.node.fsMod.ReadStream
import typings.soap.libTypesMod.IExOptions
import typings.soap.libTypesMod.IHeaders
import typings.soap.libTypesMod.IHttpClient
import typings.soap.libTypesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpMod {
  
  @JSImport("soap/lib/http", "HttpClient")
  @js.native
  open class HttpClient ()
    extends StObject
       with IHttpClient {
    def this(options: IOptions) = this()
    
    /* private */ var _request: Any = js.native
    
    /**
      * Build the HTTP request (method, uri, headers, ...)
      * @param {String} rurl The resource url
      * @param {Object|String} data The payload
      * @param {Object} exheaders Extra http headers
      * @param {Object} exoptions Extra options
      * @returns {Object} The http request object for the `request` module
      */
    def buildRequest(rurl: String, data: Any): Any = js.native
    def buildRequest(rurl: String, data: Any, exheaders: Unit, exoptions: IExOptions): Any = js.native
    def buildRequest(rurl: String, data: Any, exheaders: IHeaders): Any = js.native
    def buildRequest(rurl: String, data: Any, exheaders: IHeaders, exoptions: IExOptions): Any = js.native
    
    /**
      * Handle the http response
      * @param {Object} The req object
      * @param {Object} res The res object
      * @param {Object} body The http body
      * @param {Object} The parsed body
      */
    def handleResponse(req: AxiosPromise[Any], res: AxiosResponse[Any, Any], body: Any): Any = js.native
    
    /* private */ var options: Any = js.native
    
    @JSName("requestStream")
    def requestStream_MHttpClient(rurl: String, data: Any): AxiosPromise[ReadStream] = js.native
    @JSName("requestStream")
    def requestStream_MHttpClient(rurl: String, data: Any, exheaders: Unit, exoptions: Unit, caller: Any): AxiosPromise[ReadStream] = js.native
    @JSName("requestStream")
    def requestStream_MHttpClient(rurl: String, data: Any, exheaders: Unit, exoptions: IExOptions): AxiosPromise[ReadStream] = js.native
    @JSName("requestStream")
    def requestStream_MHttpClient(rurl: String, data: Any, exheaders: Unit, exoptions: IExOptions, caller: Any): AxiosPromise[ReadStream] = js.native
    @JSName("requestStream")
    def requestStream_MHttpClient(rurl: String, data: Any, exheaders: IHeaders): AxiosPromise[ReadStream] = js.native
    @JSName("requestStream")
    def requestStream_MHttpClient(rurl: String, data: Any, exheaders: IHeaders, exoptions: Unit, caller: Any): AxiosPromise[ReadStream] = js.native
    @JSName("requestStream")
    def requestStream_MHttpClient(rurl: String, data: Any, exheaders: IHeaders, exoptions: IExOptions): AxiosPromise[ReadStream] = js.native
    @JSName("requestStream")
    def requestStream_MHttpClient(rurl: String, data: Any, exheaders: IHeaders, exoptions: IExOptions, caller: Any): AxiosPromise[ReadStream] = js.native
  }
  
  trait IAttachment extends StObject {
    
    var body: ReadableStream
    
    var contentId: String
    
    var mimetype: String
    
    var name: String
  }
  object IAttachment {
    
    inline def apply(body: ReadableStream, contentId: String, mimetype: String, name: String): IAttachment = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAttachment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAttachment] (val x: Self) extends AnyVal {
      
      inline def setBody(value: ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
