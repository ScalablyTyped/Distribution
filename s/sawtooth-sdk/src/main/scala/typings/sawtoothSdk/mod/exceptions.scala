package typings.sawtoothSdk.mod

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  class AuthorizationException ()
    extends typings.sawtoothSdk.exceptionsMod.AuthorizationException {
    def this(message: String) = this()
  }
  
  @JSImport("sawtooth-sdk", "exceptions.InternalError")
  @js.native
  class InternalError protected ()
    extends typings.sawtoothSdk.exceptionsMod.InternalError {
    protected def this(message: String) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: Buffer) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: Uint8Array) = this()
    protected def this(message: String, extendedData: Buffer) = this()
    protected def this(message: String, extendedData: Uint8Array) = this()
  }
  
  @JSImport("sawtooth-sdk", "exceptions.InvalidTransaction")
  @js.native
  class InvalidTransaction protected ()
    extends typings.sawtoothSdk.exceptionsMod.InvalidTransaction {
    protected def this(message: String) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: Buffer) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: Uint8Array) = this()
    protected def this(message: String, extendedData: Buffer) = this()
    protected def this(message: String, extendedData: Uint8Array) = this()
  }
  
  @JSImport("sawtooth-sdk", "exceptions._TransactionProcessorError")
  @js.native
  class TransactionProcessorError protected ()
    extends typings.sawtoothSdk.exceptionsMod.TransactionProcessorError {
    protected def this(message: String) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: Buffer) = this()
    protected def this(message: js.UndefOr[scala.Nothing], extendedData: Uint8Array) = this()
    protected def this(message: String, extendedData: Buffer) = this()
    protected def this(message: String, extendedData: Uint8Array) = this()
  }
  
  @JSImport("sawtooth-sdk", "exceptions.ValidatorConnectionError")
  @js.native
  /**
    * Construcs a new ValidatorConnectionError
    *
    * @param [message] - an optional message, defaults to the empty
    * string
    */
  class ValidatorConnectionError ()
    extends typings.sawtoothSdk.exceptionsMod.ValidatorConnectionError {
    def this(message: String) = this()
  }
}
