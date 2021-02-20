package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerCloseMetaV0")
@js.native
class LedgerCloseMetaV0 protected ()
  extends typings.stellarBase.xdrMod.default.LedgerCloseMetaV0 {
  def this(attributes: typings.stellarBase.anon.LedgerHeader) = this()
}
object LedgerCloseMetaV0 {
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerCloseMetaV0 = js.native
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerCloseMetaV0 = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerCloseMetaV0 = js.native
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerCloseMetaV0 = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerCloseMetaV0): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerCloseMetaV0 = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerCloseMetaV0): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerCloseMetaV0.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerCloseMetaV0, io: Buffer): Unit = js.native
}
