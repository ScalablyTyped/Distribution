package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.MuxedAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Amount extends StObject {
  
  var amount: Int64 = js.native
  
  var asset: typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  var destination: MuxedAccount = js.native
}
object Amount {
  
  @scala.inline
  def apply(amount: Int64, asset: typings.stellarBase.xdrMod.xdr.Asset, destination: MuxedAccount): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  
  @scala.inline
  implicit class AmountMutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Int64): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: MuxedAccount): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
