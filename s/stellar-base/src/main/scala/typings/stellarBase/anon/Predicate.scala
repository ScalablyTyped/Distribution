package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ClaimPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predicate extends js.Object {
  
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
  implicit class PredicateOps[Self <: Predicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestination(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicate(value: ClaimPredicate): Self = this.set("predicate", value.asInstanceOf[js.Any])
  }
}
