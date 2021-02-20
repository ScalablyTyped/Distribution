package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.ClaimPredicate")
@js.native
class ClaimPredicate ()
  extends typings.stellarBase.xdrMod.default.ClaimPredicate
object ClaimPredicate {
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.claimPredicateAnd")
  @js.native
  def claimPredicateAnd(value: js.Array[typings.stellarBase.xdrMod.xdr.ClaimPredicate]): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.claimPredicateBeforeAbsoluteTime")
  @js.native
  def claimPredicateBeforeAbsoluteTime(value: typings.stellarBase.xdrMod.xdr.Int64): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.claimPredicateBeforeRelativeTime")
  @js.native
  def claimPredicateBeforeRelativeTime(value: typings.stellarBase.xdrMod.xdr.Int64): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.claimPredicateNot")
  @js.native
  def claimPredicateNot(): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  @JSImport("stellar-base", "xdr.ClaimPredicate.claimPredicateNot")
  @js.native
  def claimPredicateNot(value: typings.stellarBase.xdrMod.xdr.ClaimPredicate): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.claimPredicateOr")
  @js.native
  def claimPredicateOr(value: js.Array[typings.stellarBase.xdrMod.xdr.ClaimPredicate]): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.claimPredicateUnconditional")
  @js.native
  def claimPredicateUnconditional(): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  @JSImport("stellar-base", "xdr.ClaimPredicate.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  @JSImport("stellar-base", "xdr.ClaimPredicate.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ClaimPredicate): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ClaimPredicate): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.ClaimPredicate.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.ClaimPredicate.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimPredicate.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ClaimPredicate, io: Buffer): Unit = js.native
}
