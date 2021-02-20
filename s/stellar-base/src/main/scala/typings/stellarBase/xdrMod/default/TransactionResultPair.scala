package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.TransactionHash
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.TransactionResultPair")
@js.native
class TransactionResultPair protected ()
  extends typings.stellarBase.xdrMod.xdr.TransactionResultPair {
  def this(attributes: TransactionHash) = this()
}
object TransactionResultPair {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionResultPair = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionResultPair = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionResultPair = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionResultPair = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionResultPair): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionResultPair = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionResultPair): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultPair.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionResultPair, io: Buffer): Unit = js.native
}
