package typings.stellarBase.mod

import typings.stellarBase.xdrMod.default.ClaimPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "Claimant")
@js.native
class Claimant protected () extends js.Object {
  def this(destination: String) = this()
  def this(destination: String, predicate: ClaimPredicate) = this()
  
  val destination: String = js.native
  
  val predicate: ClaimPredicate = js.native
  
  def toXDRObject(): typings.stellarBase.xdrMod.default.Claimant = js.native
}
/* static members */
@JSImport("stellar-base", "Claimant")
@js.native
object Claimant extends js.Object {
  
  def fromXDR(claimantXdr: typings.stellarBase.xdrMod.default.Claimant): Claimant = js.native
  
  def predicateAnd(left: ClaimPredicate, right: ClaimPredicate): ClaimPredicate = js.native
  
  def predicateBeforeAbsoluteTime(absBefore: String): ClaimPredicate = js.native
  
  def predicateBeforeRelativeTime(seconds: String): ClaimPredicate = js.native
  
  def predicateNot(predicate: ClaimPredicate): ClaimPredicate = js.native
  
  def predicateOr(left: ClaimPredicate, right: ClaimPredicate): ClaimPredicate = js.native
  
  def predicateUnconditional(): ClaimPredicate = js.native
}
