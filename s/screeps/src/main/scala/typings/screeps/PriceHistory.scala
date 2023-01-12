package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriceHistory extends StObject {
  
  var avgPrice: Double
  
  var date: String
  
  var resourceType: MarketResourceConstant
  
  var stddevPrice: Double
  
  var transactions: Double
  
  var volume: Double
}
object PriceHistory {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PriceHistory] (val x: Self) extends AnyVal {
    
    inline def setAvgPrice(value: Double): Self = StObject.set(x, "avgPrice", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: MarketResourceConstant): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStddevPrice(value: Double): Self = StObject.set(x, "stddevPrice", value.asInstanceOf[js.Any])
    
    inline def setTransactions(value: Double): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
