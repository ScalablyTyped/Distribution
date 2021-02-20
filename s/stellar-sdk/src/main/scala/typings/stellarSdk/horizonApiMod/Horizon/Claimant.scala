package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Claimant extends StObject {
  
  var destination: String = js.native
  
  var predicate: Predicate = js.native
}
object Claimant {
  
  @scala.inline
  def apply(destination: String, predicate: Predicate): Claimant = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Claimant]
  }
  
  @scala.inline
  implicit class ClaimantMutableBuilder[Self <: Claimant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicate(value: Predicate): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
  }
}
