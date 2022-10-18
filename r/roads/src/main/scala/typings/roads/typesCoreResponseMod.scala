package typings.roads

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreResponseMod {
  
  @JSImport("roads/types/core/response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("roads/types/core/response", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Response {
    /**
      * Creates a new Response object.
      *
      * @param {string | Buffer} body - Your response body
      * @param {number} [status] - Your response status
      * @param {object} [headers] - Your response headers
      */
    def this(body: String) = this()
    def this(body: Buffer) = this()
    def this(body: String, status: Double) = this()
    def this(body: Buffer, status: Double) = this()
    def this(body: String, status: Double, headers: OutgoingHeaders) = this()
    def this(body: String, status: Unit, headers: OutgoingHeaders) = this()
    def this(body: Buffer, status: Double, headers: OutgoingHeaders) = this()
    def this(body: Buffer, status: Unit, headers: OutgoingHeaders) = this()
    
    /* CompleteClass */
    var body: String | Buffer = js.native
    
    /* CompleteClass */
    var headers: OutgoingHeaders = js.native
    
    /* CompleteClass */
    var status: Double = js.native
  }
  
  inline def wrap(promise: js.Promise[Response | String]): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  
  type OutgoingHeaders = Record[String, js.UndefOr[String | js.Array[String]]]
  
  trait Response extends StObject {
    
    var body: String | Buffer
    
    var headers: OutgoingHeaders
    
    var status: Double
  }
  object Response {
    
    inline def apply(body: String | Buffer, headers: OutgoingHeaders, status: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: OutgoingHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponseConstructor
    extends StObject
       with Instantiable1[/* body */ String, Response]
       with Instantiable2[/* body */ String, /* status */ Double, Response]
       with Instantiable3[
          /* body */ String, 
          (/* status */ Double) | (/* status */ Unit), 
          /* headers */ OutgoingHeaders, 
          Response
        ]
}
