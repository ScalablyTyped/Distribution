package typings.sawtoothSdk

import typings.node.bufferMod.global.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processorExceptionsMod {
  
  @JSImport("sawtooth-sdk/processor/exceptions", "AuthorizationException")
  @js.native
  /**
    * Construcs a new AuthorizationException
    *
    * @param [message] - an optional message, defaults to the empty
    * string
    */
  open class AuthorizationException ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sawtooth-sdk/processor/exceptions", "InternalError")
  @js.native
  /* protected */ open class InternalError () extends TransactionProcessorError {
    /* protected */ def this(message: String) = this()
    /* protected */ def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: String, extendedData: Buffer) = this()
    /* protected */ def this(message: Unit, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: Unit, extendedData: Buffer) = this()
  }
  
  @JSImport("sawtooth-sdk/processor/exceptions", "InvalidTransaction")
  @js.native
  /* protected */ open class InvalidTransaction () extends TransactionProcessorError {
    /* protected */ def this(message: String) = this()
    /* protected */ def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: String, extendedData: Buffer) = this()
    /* protected */ def this(message: Unit, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: Unit, extendedData: Buffer) = this()
  }
  
  @JSImport("sawtooth-sdk/processor/exceptions", "_TransactionProcessorError")
  @js.native
  /* protected */ open class TransactionProcessorError () extends StObject {
    /* protected */ def this(message: String) = this()
    /* protected */ def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: String, extendedData: Buffer) = this()
    /* protected */ def this(message: Unit, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: Unit, extendedData: Buffer) = this()
  }
  
  @JSImport("sawtooth-sdk/processor/exceptions", "ValidatorConnectionError")
  @js.native
  /**
    * Construcs a new ValidatorConnectionError
    *
    * @param [message] - an optional message, defaults to the empty
    * string
    */
  open class ValidatorConnectionError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
