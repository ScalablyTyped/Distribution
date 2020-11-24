package typings.servicenow.global_

import typings.servicenow.servicenow.RestHTTPMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sn_ws")
@js.native
object snWs extends js.Object {
  
  @js.native
  class RESTMessageV2 ()
    extends typings.servicenow.snWs.RESTMessageV2 {
    def this(name: String, methodName: RestHTTPMethods) = this()
  }
  
  @js.native
  class SOAPMessageV2 ()
    extends typings.servicenow.snWs.SOAPMessageV2 {
    def this(soapMessage: String, soapFunction: String) = this()
  }
}
