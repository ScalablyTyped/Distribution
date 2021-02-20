package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destination extends StObject {
  
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
  implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingBalance(value: Int64): Self = StObject.set(x, "startingBalance", value.asInstanceOf[js.Any])
  }
}
