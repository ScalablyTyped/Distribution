package typings.soap

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.request.mod.Response
import typings.soap.typesMod.IHeaders
import typings.soap.typesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("soap/lib/http", "HttpClient")
  @js.native
  class HttpClient () extends StObject {
    def this(options: IOptions) = this()
    
    /* private */ var _request: js.Any = js.native
    
    /**
      * Build the HTTP request (method, uri, headers, ...)
      * @param {String} rurl The resource url
      * @param {Object|String} data The payload
      * @param {Object} exheaders Extra http headers
      * @param {Object} exoptions Extra options
      * @returns {Object} The http request object for the `request` module
      */
    def buildRequest(rurl: String, data: js.Any): js.Any = js.native
    def buildRequest(rurl: String, data: js.Any, exheaders: Unit, exoptions: IExOptions): js.Any = js.native
    def buildRequest(rurl: String, data: js.Any, exheaders: IHeaders): js.Any = js.native
    def buildRequest(rurl: String, data: js.Any, exheaders: IHeaders, exoptions: IExOptions): js.Any = js.native
    
    /**
      * Handle the http response
      * @param {Object} The req object
      * @param {Object} res The res object
      * @param {Object} body The http body
      * @param {Object} The parsed body
      */
    def handleResponse(req: typings.request.mod.Request, res: Response, body: js.Any): js.Any = js.native
    
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[
          /* error */ js.Any, 
          /* res */ js.UndefOr[js.Any], 
          /* body */ js.UndefOr[js.Any], 
          js.Any
        ]
    ): typings.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[
          /* error */ js.Any, 
          /* res */ js.UndefOr[js.Any], 
          /* body */ js.UndefOr[js.Any], 
          js.Any
        ],
      exheaders: Unit,
      exoptions: Unit,
      caller: js.Any
    ): typings.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[
          /* error */ js.Any, 
          /* res */ js.UndefOr[js.Any], 
          /* body */ js.UndefOr[js.Any], 
          js.Any
        ],
      exheaders: Unit,
      exoptions: IExOptions
    ): typings.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[
          /* error */ js.Any, 
          /* res */ js.UndefOr[js.Any], 
          /* body */ js.UndefOr[js.Any], 
          js.Any
        ],
      exheaders: Unit,
      exoptions: IExOptions,
      caller: js.Any
    ): typings.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[
          /* error */ js.Any, 
          /* res */ js.UndefOr[js.Any], 
          /* body */ js.UndefOr[js.Any], 
          js.Any
        ],
      exheaders: IHeaders
    ): typings.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[
          /* error */ js.Any, 
          /* res */ js.UndefOr[js.Any], 
          /* body */ js.UndefOr[js.Any], 
          js.Any
        ],
      exheaders: IHeaders,
      exoptions: Unit,
      caller: js.Any
    ): typings.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[
          /* error */ js.Any, 
          /* res */ js.UndefOr[js.Any], 
          /* body */ js.UndefOr[js.Any], 
          js.Any
        ],
      exheaders: IHeaders,
      exoptions: IExOptions
    ): typings.request.mod.Request = js.native
    def request(
      rurl: String,
      data: js.Any,
      callback: js.Function3[
          /* error */ js.Any, 
          /* res */ js.UndefOr[js.Any], 
          /* body */ js.UndefOr[js.Any], 
          js.Any
        ],
      exheaders: IHeaders,
      exoptions: IExOptions,
      caller: js.Any
    ): typings.request.mod.Request = js.native
    
    def requestStream(rurl: String, data: js.Any): typings.request.mod.Request = js.native
    def requestStream(rurl: String, data: js.Any, exheaders: Unit, exoptions: Unit, caller: js.Any): typings.request.mod.Request = js.native
    def requestStream(rurl: String, data: js.Any, exheaders: Unit, exoptions: IExOptions): typings.request.mod.Request = js.native
    def requestStream(rurl: String, data: js.Any, exheaders: Unit, exoptions: IExOptions, caller: js.Any): typings.request.mod.Request = js.native
    def requestStream(rurl: String, data: js.Any, exheaders: IHeaders): typings.request.mod.Request = js.native
    def requestStream(rurl: String, data: js.Any, exheaders: IHeaders, exoptions: Unit, caller: js.Any): typings.request.mod.Request = js.native
    def requestStream(rurl: String, data: js.Any, exheaders: IHeaders, exoptions: IExOptions): typings.request.mod.Request = js.native
    def requestStream(rurl: String, data: js.Any, exheaders: IHeaders, exoptions: IExOptions, caller: js.Any): typings.request.mod.Request = js.native
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
    
    extension [Self <: IAttachment](x: Self) {
      
      inline def setBody(value: ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type IExOptions = StringDictionary[js.Any]
  
  type Request = typings.request.mod.Request
}
