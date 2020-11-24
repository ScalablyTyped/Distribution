package typings.sawtoothSdk.exceptionsMod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/processor/exceptions", "_TransactionProcessorError")
@js.native
class TransactionProcessorError protected () extends js.Object {
  protected def this(message: String) = this()
  protected def this(message: js.UndefOr[scala.Nothing], extendedData: Buffer) = this()
  protected def this(message: js.UndefOr[scala.Nothing], extendedData: Uint8Array) = this()
  protected def this(message: String, extendedData: Buffer) = this()
  protected def this(message: String, extendedData: Uint8Array) = this()
}
