package typings.stellarSdk.mod

import typings.stellarBase.xdrMod.default.ClaimPredicate
import org.scalablytyped.runtime.StObject
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
object Claimant {
  
  @JSImport("stellar-sdk", "Claimant.fromXDR")
  @js.native
  def fromXDR(claimantXdr: typings.stellarBase.xdrMod.default.Claimant): typings.stellarBase.mod.Claimant = js.native
  
  @JSImport("stellar-sdk", "Claimant.predicateAnd")
  @js.native
  def predicateAnd(left: ClaimPredicate, right: ClaimPredicate): ClaimPredicate = js.native
  
  @JSImport("stellar-sdk", "Claimant.predicateBeforeAbsoluteTime")
  @js.native
  def predicateBeforeAbsoluteTime(absBefore: String): ClaimPredicate = js.native
  
  @JSImport("stellar-sdk", "Claimant.predicateBeforeRelativeTime")
  @js.native
  def predicateBeforeRelativeTime(seconds: String): ClaimPredicate = js.native
  
  @JSImport("stellar-sdk", "Claimant.predicateNot")
  @js.native
  def predicateNot(predicate: ClaimPredicate): ClaimPredicate = js.native
  
  @JSImport("stellar-sdk", "Claimant.predicateOr")
  @js.native
  def predicateOr(left: ClaimPredicate, right: ClaimPredicate): ClaimPredicate = js.native
  
  @JSImport("stellar-sdk", "Claimant.predicateUnconditional")
  @js.native
  def predicateUnconditional(): ClaimPredicate = js.native
}
