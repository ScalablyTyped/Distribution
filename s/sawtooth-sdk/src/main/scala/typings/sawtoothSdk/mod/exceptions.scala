package typings.sawtoothSdk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptions {
  
  @JSImport("sawtooth-sdk", "exceptions.AuthorizationException")
  @js.native
  /**
    * Construcs a new AuthorizationException
    *
    * @param [message] - an optional message, defaults to the empty
    * string
    */
  open class AuthorizationException ()
    extends typings.sawtoothSdk.exceptionsMod.AuthorizationException {
    def this(message: String) = this()
  }
  
  @JSImport("sawtooth-sdk", "exceptions.InternalError")
  @js.native
  /* protected */ open class InternalError ()
    extends typings.sawtoothSdk.exceptionsMod.InternalError {
    /* protected */ def this(message: String) = this()
    /* protected */ def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: String, extendedData: Buffer) = this()
    /* protected */ def this(message: Unit, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: Unit, extendedData: Buffer) = this()
  }
  
  @JSImport("sawtooth-sdk", "exceptions.InvalidTransaction")
  @js.native
  /* protected */ open class InvalidTransaction ()
    extends typings.sawtoothSdk.exceptionsMod.InvalidTransaction {
    /* protected */ def this(message: String) = this()
    /* protected */ def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: String, extendedData: Buffer) = this()
    /* protected */ def this(message: Unit, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: Unit, extendedData: Buffer) = this()
  }
  
  @JSImport("sawtooth-sdk", "exceptions._TransactionProcessorError")
  @js.native
  /* protected */ open class TransactionProcessorError ()
    extends typings.sawtoothSdk.exceptionsMod.TransactionProcessorError {
    /* protected */ def this(message: String) = this()
    /* protected */ def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: String, extendedData: Buffer) = this()
    /* protected */ def this(message: Unit, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: Unit, extendedData: Buffer) = this()
  }
  
  @JSImport("sawtooth-sdk", "exceptions.ValidatorConnectionError")
  @js.native
  /**
    * Construcs a new ValidatorConnectionError
    *
    * @param [message] - an optional message, defaults to the empty
    * string
    */
  open class ValidatorConnectionError ()
    extends typings.sawtoothSdk.exceptionsMod.ValidatorConnectionError {
    def this(message: String) = this()
  }
}
