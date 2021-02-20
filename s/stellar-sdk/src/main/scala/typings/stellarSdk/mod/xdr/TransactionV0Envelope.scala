package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Signatures
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TransactionV0Envelope")
@js.native
class TransactionV0Envelope protected ()
  extends typings.stellarBase.mod.xdr.TransactionV0Envelope {
  def this(attributes: Signatures) = this()
}
object TransactionV0Envelope {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionV0Envelope): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionV0Envelope): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionV0Envelope.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionV0Envelope, io: Buffer): Unit = js.native
}
