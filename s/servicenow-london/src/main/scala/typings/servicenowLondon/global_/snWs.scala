package typings.servicenowLondon.global_

import typings.servicenowLondon.snWs.RestHTTPMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sn_ws")
@js.native
object snWs extends js.Object {
  
  /**
    * The RESTMessageV2 API allows you to send outbound REST messages using JavaScript.
    * Use the RESTResponseV2 API to manage the response returned by the REST provider.
    *
    * You can use this API in scoped applications, or within the global scope.
    */
  @js.native
  /**
    * Instantiates an empty RESTMessageV2 object.
    *
    * When using an object instantiated this way, you must manually specify an HTTP method an
    * endpoint.
    * @example
    *
    * var sm = new sn_ws.RESTMessageV2();
    */
  class RESTMessageV2 ()
    extends typings.servicenowLondon.snWs.RESTMessageV2 {
    /**
      * Instantiates a RESTMessageV2 object using information from a REST message record.
      *
      * You must have a REST message record defined before you can use this constructor.
      *
      * In the following example, replace `REST_message_record` with the name of the REST message
      * record from your instance.
      *
      * @param name The name of the REST message record.
      * @param methodName The name of the HTTP method to use, such as GET or PUT.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      */
    def this(name: String, methodName: RestHTTPMethods) = this()
  }
  
  /**
    * The RESTResponseV2 API allows you to use the data returned by an outbound REST message
    * in JavaScript code.
    */
  @js.native
  class RESTResponseV2 ()
    extends typings.servicenowLondon.snWs.RESTResponseV2
  
  @js.native
  class SOAPMessageV2 ()
    extends typings.servicenowLondon.snWs.SOAPMessageV2 {
    def this(soapMessage: String, soapFunction: String) = this()
  }
}
