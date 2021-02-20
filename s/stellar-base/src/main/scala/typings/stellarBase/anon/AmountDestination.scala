package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmountDestination extends StObject {
  
  var amount: Int64 = js.native
  
  var destination: typings.stellarBase.xdrMod.xdr.AccountId = js.native
}
object AmountDestination {
  
  @scala.inline
  def apply(amount: Int64, destination: typings.stellarBase.xdrMod.xdr.AccountId): AmountDestination = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountDestination]
  }
  
  @scala.inline
  implicit class AmountDestinationMutableBuilder[Self <: AmountDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Int64): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
