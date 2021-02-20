package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ClaimPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predicate extends StObject {
  
  var destination: typings.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var predicate: ClaimPredicate = js.native
}
object Predicate {
  
  @scala.inline
  def apply(destination: typings.stellarBase.xdrMod.xdr.AccountId, predicate: ClaimPredicate): Predicate = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Predicate]
  }
  
  @scala.inline
  implicit class PredicateMutableBuilder[Self <: Predicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicate(value: ClaimPredicate): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
  }
}
