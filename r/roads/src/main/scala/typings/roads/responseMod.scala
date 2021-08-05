package typings.roads

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseMod {
  
  @JSImport("roads/types/core/response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("roads/types/core/response", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Response {
    /**
      * Creates a new Response object.
      *
      * @param {string} body - Your response body
      * @param {number} [status] - Your response status
      * @param {object} [headers] - Your response headers
      */
    def this(body: String) = this()
    def this(body: String, status: Double) = this()
    def this(body: String, status: Double, headers: js.Object) = this()
    def this(body: String, status: Unit, headers: js.Object) = this()
    
    /* CompleteClass */
    var body: String = js.native
    
    /* CompleteClass */
    var headers: StringDictionary[js.Any] = js.native
    
    /* CompleteClass */
    var status: Double = js.native
  }
  
  inline def wrap(promise: js.Promise[js.Any]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  trait Response extends StObject {
    
    var body: String
    
    var headers: StringDictionary[js.Any]
    
    var status: Double
  }
  object Response {
    
    inline def apply(body: String, headers: StringDictionary[js.Any], status: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
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
          /* headers */ js.Object, 
          Response
        ]
}
