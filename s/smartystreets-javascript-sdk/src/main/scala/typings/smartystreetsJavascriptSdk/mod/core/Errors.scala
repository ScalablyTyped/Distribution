package typings.smartystreetsJavascriptSdk.mod.core

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "core.Errors")
@js.native
object Errors extends js.Object {
  
  @js.native
  class BadCredentialsError () extends SmartyError
  
  @js.native
  class BadRequestError () extends SmartyError
  
  @js.native
  class BatchEmptyError () extends SmartyError
  
  @js.native
  class BatchFullError () extends SmartyError
  
  @js.native
  class GatewayTimeoutError () extends SmartyError
  
  @js.native
  class InternalServerError () extends SmartyError
  
  @js.native
  class PaymentRequiredError () extends SmartyError
  
  @js.native
  class RequestEntityTooLargeError () extends SmartyError
  
  @js.native
  class ServiceUnavailableError () extends SmartyError
  
  @js.native
  class SmartyError protected () extends Error {
    def this(message: String) = this()
  }
  
  @js.native
  class TooManyRequestsError () extends SmartyError
  
  @js.native
  class UndefinedLookupError () extends SmartyError
  
  @js.native
  class UnprocessableEntityError protected () extends SmartyError {
    def this(message: String) = this()
  }
}
