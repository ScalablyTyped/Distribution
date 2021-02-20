package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.ScpStatementPledges")
@js.native
class ScpStatementPledges ()
  extends typings.stellarBase.xdrMod.xdr.ScpStatementPledges
object ScpStatementPledges {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ScpStatementPledges): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.scpStConfirm")
  @js.native
  def scpStConfirm(value: typings.stellarBase.xdrMod.xdr.ScpStatementConfirm): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.scpStExternalize")
  @js.native
  def scpStExternalize(value: typings.stellarBase.xdrMod.xdr.ScpStatementExternalize): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.scpStNominate")
  @js.native
  def scpStNominate(value: typings.stellarBase.xdrMod.xdr.ScpNomination): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.scpStPrepare")
  @js.native
  def scpStPrepare(value: typings.stellarBase.xdrMod.xdr.ScpStatementPrepare): typings.stellarBase.xdrMod.xdr.ScpStatementPledges = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ScpStatementPledges): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.ScpStatementPledges.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ScpStatementPledges, io: Buffer): Unit = js.native
}
