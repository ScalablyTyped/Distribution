package typings.roads

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseMod {
  
  @JSImport("roads/types/core/response", JSImport.Default)
  @js.native
  class default protected () extends Response {
    /**
      * Creates a new Response object.
      *
      * @param {string} body - Your response body
      * @param {number} [status] - Your response status
      * @param {object} [headers] - Your response headers
      */
    def this(body: String) = this()
    def this(body: String, status: Double) = this()
    def this(body: String, status: js.UndefOr[scala.Nothing], headers: js.Object) = this()
    def this(body: String, status: Double, headers: js.Object) = this()
  }
  
  @JSImport("roads/types/core/response", "wrap")
  @js.native
  def wrap(promise: js.Promise[_]): js.Promise[_] = js.native
  
  @js.native
  trait Response extends StObject {
    
    var body: String = js.native
    
    var headers: StringDictionary[js.Any] = js.native
    
    var status: Double = js.native
  }
  object Response {
    
    @scala.inline
    def apply(body: String, headers: StringDictionary[js.Any], status: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponseConstructor
    extends Instantiable1[/* body */ String, Response]
       with Instantiable2[/* body */ String, /* status */ Double, Response]
       with Instantiable3[/* body */ String, js.UndefOr[/* status */ Double], /* headers */ js.Object, Response]
}
