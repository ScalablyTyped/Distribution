package typings.responselike

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a streamable response object similar to a [Node.js HTTP response stream](https://nodejs.org/api/http.html#http_class_http_incomingmessage).
    */
  @JSImport("responselike", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with ResponseLike {
    /**
      * @param statusCode HTTP response status code.
      * @param headers HTTP headers object. Keys will be automatically lowercased.
      * @param body A Buffer containing the response body. The Buffer contents will be streamable but is also exposed directly as `response.body`.
      * @param url Request URL string.
      */
    def this(
      statusCode: Double,
      headers: StringDictionary[js.UndefOr[String | js.Array[String]]],
      body: Buffer,
      url: String
    ) = this()
    
    /* CompleteClass */
    var body: Buffer = js.native
    
    /* CompleteClass */
    var headers: StringDictionary[js.UndefOr[String | js.Array[String]]] = js.native
    
    /* CompleteClass */
    var statusCode: Double = js.native
    
    /* CompleteClass */
    var url: String = js.native
  }
  
  /**
    * Returns a streamable response object similar to a [Node.js HTTP response stream](https://nodejs.org/api/http.html#http_class_http_incomingmessage).
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stream.Readable * / any */ trait ResponseLike extends StObject {
    
    var body: Buffer
    
    var headers: StringDictionary[js.UndefOr[String | js.Array[String]]]
    
    var statusCode: Double
    
    var url: String
  }
  object ResponseLike {
    
    inline def apply(
      body: Buffer,
      headers: StringDictionary[js.UndefOr[String | js.Array[String]]],
      statusCode: Double,
      url: String
    ): ResponseLike = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseLike]
    }
    
    extension [Self <: ResponseLike](x: Self) {
      
      inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
