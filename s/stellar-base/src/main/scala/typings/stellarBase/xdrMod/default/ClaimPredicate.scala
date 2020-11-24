package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "ClaimPredicate")
@js.native
class ClaimPredicate ()
  extends typings.stellarBase.xdrMod.xdr.ClaimPredicate
/* static members */
@JSImport("stellar-base/types/xdr", "ClaimPredicate")
@js.native
object ClaimPredicate extends js.Object {
  
  def claimPredicateAnd(value: js.Array[typings.stellarBase.xdrMod.xdr.ClaimPredicate]): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  def claimPredicateBeforeAbsoluteTime(value: typings.stellarBase.xdrMod.xdr.Int64): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  def claimPredicateBeforeRelativeTime(value: typings.stellarBase.xdrMod.xdr.Int64): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  def claimPredicateNot(): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  def claimPredicateNot(value: typings.stellarBase.xdrMod.xdr.ClaimPredicate): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  def claimPredicateOr(value: js.Array[typings.stellarBase.xdrMod.xdr.ClaimPredicate]): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  def claimPredicateUnconditional(): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.ClaimPredicate): Boolean = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ClaimPredicate): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.ClaimPredicate, io: Buffer): Unit = js.native
}
