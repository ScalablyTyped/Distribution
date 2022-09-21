package typings.responselike

import typings.node.bufferMod.global.Buffer
import typings.node.nodeStreamMod.Readable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("responselike", JSImport.Default)
  @js.native
  open class default () extends Response {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
    	The response body.
    	The contents will be streamable but is also exposed directly as `response.body`.
    	*/
    val body: Buffer
    
    /**
    	The HTTP headers object.
    	Keys are in lowercase.
    	*/
    val headers: Record[String, String]
    
    /**
    	The HTTP response status code.
    	*/
    val statusCode: Double
    
    /**
    	The request URL string.
    	*/
    val url: String
  }
  object Options {
    
    inline def apply(body: Buffer, headers: Record[String, String], statusCode: Double, url: String): Options = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response extends Readable {
    
    /**
    	The response body.
    	*/
    val body: Buffer = js.native
    
    /**
    	The HTTP headers.
    	Keys will be automatically lowercased.
    	*/
    val headers: Record[String, String] = js.native
    
    /**
    	The HTTP response status code.
    	*/
    val statusCode: Double = js.native
    
    /**
    	The request URL string.
    	*/
    val url: String = js.native
  }
}
