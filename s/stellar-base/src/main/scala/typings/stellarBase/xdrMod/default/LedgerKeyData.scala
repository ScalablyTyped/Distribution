package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.AccountIdDataName
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.LedgerKeyData")
@js.native
class LedgerKeyData protected ()
  extends typings.stellarBase.xdrMod.xdr.LedgerKeyData {
  def this(attributes: AccountIdDataName) = this()
}
object LedgerKeyData {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyData = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerKeyData = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerKeyData = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerKeyData = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerKeyData): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyData = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerKeyData): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyData.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerKeyData, io: Buffer): Unit = js.native
}
