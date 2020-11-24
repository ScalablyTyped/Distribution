package typings.stellarSdk.mod

import typings.stellarBase.xdrMod.default.ClaimPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "Claimant")
@js.native
class Claimant protected ()
  extends typings.stellarBase.mod.Claimant {
  def this(destination: String) = this()
  def this(destination: String, predicate: ClaimPredicate) = this()
}
/* static members */
@JSImport("stellar-sdk", "Claimant")
@js.native
object Claimant extends js.Object {
  
  def fromXDR(claimantXdr: typings.stellarBase.xdrMod.default.Claimant): typings.stellarBase.mod.Claimant = js.native
  
  def predicateAnd(left: ClaimPredicate, right: ClaimPredicate): ClaimPredicate = js.native
  
  def predicateBeforeAbsoluteTime(absBefore: String): ClaimPredicate = js.native
  
  def predicateBeforeRelativeTime(seconds: String): ClaimPredicate = js.native
  
  def predicateNot(predicate: ClaimPredicate): ClaimPredicate = js.native
  
  def predicateOr(left: ClaimPredicate, right: ClaimPredicate): ClaimPredicate = js.native
  
  def predicateUnconditional(): ClaimPredicate = js.native
}
