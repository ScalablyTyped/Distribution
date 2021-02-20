package typings.stellarBase.mod

import typings.stellarBase.xdrMod.default.ClaimPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "Claimant")
@js.native
class Claimant protected () extends StObject {
  def this(destination: String) = this()
  def this(destination: String, predicate: ClaimPredicate) = this()
  
  val destination: String = js.native
  
  val predicate: ClaimPredicate = js.native
  
  def toXDRObject(): typings.stellarBase.xdrMod.default.Claimant = js.native
}
/* static members */
object Claimant {
  
  @JSImport("stellar-base", "Claimant.fromXDR")
  @js.native
  def fromXDR(claimantXdr: typings.stellarBase.xdrMod.default.Claimant): Claimant = js.native
  
  @JSImport("stellar-base", "Claimant.predicateAnd")
  @js.native
  def predicateAnd(left: ClaimPredicate, right: ClaimPredicate): ClaimPredicate = js.native
  
  @JSImport("stellar-base", "Claimant.predicateBeforeAbsoluteTime")
  @js.native
  def predicateBeforeAbsoluteTime(absBefore: String): ClaimPredicate = js.native
  
  @JSImport("stellar-base", "Claimant.predicateBeforeRelativeTime")
  @js.native
  def predicateBeforeRelativeTime(seconds: String): ClaimPredicate = js.native
  
  @JSImport("stellar-base", "Claimant.predicateNot")
  @js.native
  def predicateNot(predicate: ClaimPredicate): ClaimPredicate = js.native
  
  @JSImport("stellar-base", "Claimant.predicateOr")
  @js.native
  def predicateOr(left: ClaimPredicate, right: ClaimPredicate): ClaimPredicate = js.native
  
  @JSImport("stellar-base", "Claimant.predicateUnconditional")
  @js.native
  def predicateUnconditional(): ClaimPredicate = js.native
}
