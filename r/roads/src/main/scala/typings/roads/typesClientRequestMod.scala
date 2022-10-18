package typings.roads

import typings.roads.typesCoreRoadMod.IncomingHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientRequestMod {
  
  @JSImport("roads/types/client/request", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Request {
    /**
      * @todo: port should just be part of the host
      *
      * @param {boolean} secure - Whether or not this request should use HTTPS
      * @param {string} host - The hostname of all requests made by this function
      * @param {number} port - The post of all requests made by this function
      */
    def this(secure: Boolean, host: String, port: Double) = this()
  }
  
  @js.native
  trait Request extends StObject {
    
    /* protected */ var host: String = js.native
    
    /* protected */ var port: Double = js.native
    
    /**
      * Perform the HTTP request
      *
      * @param {string} method - HTTP Request method
      * @param {string} path - HTTP Request path
      * @param {string} [body] - The request body. If an object is provided, the body will be turned to JSON,
      * 		and the appropriate content header set
      * @param {object} [headers] - HTTP Request headers
      * @returns {Promise} The promise will resolve with an object with three properties. The response headers,
      * 		response status and the response body. If the response content-type is "application/json" the body
      * 		will be an object, otherwise it will resolve to a string
      */
    def request(method: String, path: String): js.Promise[typings.roads.typesCoreResponseMod.default] = js.native
    def request(method: String, path: String, body: String): js.Promise[typings.roads.typesCoreResponseMod.default] = js.native
    def request(method: String, path: String, body: String, headers: IncomingHeaders): js.Promise[typings.roads.typesCoreResponseMod.default] = js.native
    def request(method: String, path: String, body: Unit, headers: IncomingHeaders): js.Promise[typings.roads.typesCoreResponseMod.default] = js.native
    
    /* protected */ var secure: Boolean = js.native
  }
}
