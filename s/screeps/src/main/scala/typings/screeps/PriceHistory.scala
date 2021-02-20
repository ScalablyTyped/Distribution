package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriceHistory extends StObject {
  
  var avgPrice: Double = js.native
  
  var date: String = js.native
  
  var resourceType: MarketResourceConstant = js.native
  
  var stddevPrice: Double = js.native
  
  var transactions: Double = js.native
  
  var volume: Double = js.native
}
object PriceHistory {
  
  @scala.inline
  def apply(
    avgPrice: Double,
    date: String,
    resourceType: MarketResourceConstant,
    stddevPrice: Double,
    transactions: Double,
    volume: Double
  ): PriceHistory = {
    val __obj = js.Dynamic.literal(avgPrice = avgPrice.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], stddevPrice = stddevPrice.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriceHistory]
  }
  
  @scala.inline
  implicit class PriceHistoryMutableBuilder[Self <: PriceHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvgPrice(value: Double): Self = StObject.set(x, "avgPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: MarketResourceConstant): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStddevPrice(value: Double): Self = StObject.set(x, "stddevPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactions(value: Double): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
