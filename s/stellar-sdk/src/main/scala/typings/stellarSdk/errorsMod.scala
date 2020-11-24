package typings.stellarSdk

import typings.std.Error
import typings.stellarSdk.anon.Data
import typings.stellarSdk.anon.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk/lib/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  class AccountRequiresMemoError protected () extends Error {
    def this(message: String, accountId: String, operationIndex: Double) = this()
    
    var __proto__ : AccountRequiresMemoError = js.native
    
    var accountId: String = js.native
    
    var operationIndex: Double = js.native
  }
  
  @js.native
  class BadRequestError protected () extends NetworkError {
    def this(message: String, response: js.Any) = this()
  }
  
  @js.native
  class BadResponseError protected () extends NetworkError {
    def this(message: String, response: js.Any) = this()
  }
  
  @js.native
  class InvalidSep10ChallengeError protected () extends Error {
    def this(message: String) = this()
    
    var __proto__ : InvalidSep10ChallengeError = js.native
  }
  
  @js.native
  class NetworkError protected () extends Error {
    def this(message: String, response: js.Any) = this()
    
    var __proto__ : NetworkError = js.native
    
    def getResponse(): Status = js.native
    
    var response: Data = js.native
  }
  
  @js.native
  class NotFoundError protected () extends NetworkError {
    def this(message: String, response: js.Any) = this()
  }
}
