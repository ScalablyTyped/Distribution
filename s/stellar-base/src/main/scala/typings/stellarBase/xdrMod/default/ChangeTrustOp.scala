package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.Limit
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "ChangeTrustOp")
@js.native
class ChangeTrustOp protected ()
  extends typings.stellarBase.xdrMod.xdr.ChangeTrustOp {
  def this(attributes: Limit) = this()
}
/* static members */
@JSImport("stellar-base/types/xdr", "ChangeTrustOp")
@js.native
object ChangeTrustOp extends js.Object {
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.ChangeTrustOp): Boolean = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ChangeTrustOp): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.ChangeTrustOp, io: Buffer): Unit = js.native
}
