package typings.sawtoothSdk.mod.exceptions

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
