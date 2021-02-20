package typings.stellarSdk

import typings.std.Error
import typings.stellarSdk.anon.Data
import typings.stellarSdk.anon.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("stellar-sdk/lib/errors", "AccountRequiresMemoError")
  @js.native
  class AccountRequiresMemoError protected () extends Error {
    def this(message: String, accountId: String, operationIndex: Double) = this()
    
    var __proto__ : AccountRequiresMemoError = js.native
    
    var accountId: String = js.native
    
    var operationIndex: Double = js.native
  }
  
  @JSImport("stellar-sdk/lib/errors", "BadRequestError")
  @js.native
  class BadRequestError protected () extends NetworkError {
    def this(message: String, response: js.Any) = this()
  }
  
  @JSImport("stellar-sdk/lib/errors", "BadResponseError")
  @js.native
  class BadResponseError protected () extends NetworkError {
    def this(message: String, response: js.Any) = this()
  }
  
  @JSImport("stellar-sdk/lib/errors", "InvalidSep10ChallengeError")
  @js.native
  class InvalidSep10ChallengeError protected () extends Error {
    def this(message: String) = this()
    
    var __proto__ : InvalidSep10ChallengeError = js.native
  }
  
  @JSImport("stellar-sdk/lib/errors", "NetworkError")
  @js.native
  class NetworkError protected () extends Error {
    def this(message: String, response: js.Any) = this()
    
    var __proto__ : NetworkError = js.native
    
    def getResponse(): Status = js.native
    
    var response: Data = js.native
  }
  
  @JSImport("stellar-sdk/lib/errors", "NotFoundError")
  @js.native
  class NotFoundError protected () extends NetworkError {
    def this(message: String, response: js.Any) = this()
  }
}
