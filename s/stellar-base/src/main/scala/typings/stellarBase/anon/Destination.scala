package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destination extends js.Object {
  
  var destination: typings.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var startingBalance: Int64 = js.native
}
object Destination {
  
  @scala.inline
  def apply(destination: typings.stellarBase.xdrMod.xdr.AccountId, startingBalance: Int64): Destination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
    
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
    def setStartingBalance(value: Int64): Self = this.set("startingBalance", value.asInstanceOf[js.Any])
  }
}
