package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.AccountIdAsset
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine")
@js.native
class LedgerKeyTrustLine protected ()
  extends typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine {
  def this(attributes: AccountIdAsset) = this()
}
object LedgerKeyTrustLine {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKeyTrustLine.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine, io: Buffer): Unit = js.native
}
