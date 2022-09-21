package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRateLimiterStoreOptions
  extends StObject
     with IRateLimiterOptions {
  
  var dbName: js.UndefOr[String] = js.undefined
  
  var inmemoryBlockDuration: js.UndefOr[Double] = js.undefined
  
  var inmemoryBlockOnConsumed: js.UndefOr[Double] = js.undefined
  
  var insuranceLimiter: js.UndefOr[RateLimiterAbstract] = js.undefined
  
  var storeClient: Any
  
  var storeType: js.UndefOr[String] = js.undefined
  
  var tableCreated: js.UndefOr[Boolean] = js.undefined
  
  var tableName: js.UndefOr[String] = js.undefined
}
object IRateLimiterStoreOptions {
  
  inline def apply(storeClient: Any): IRateLimiterStoreOptions = {
    val __obj = js.Dynamic.literal(storeClient = storeClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRateLimiterStoreOptions]
  }
  
  extension [Self <: IRateLimiterStoreOptions](x: Self) {
    
    inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
    
    inline def setInmemoryBlockDuration(value: Double): Self = StObject.set(x, "inmemoryBlockDuration", value.asInstanceOf[js.Any])
    
    inline def setInmemoryBlockDurationUndefined: Self = StObject.set(x, "inmemoryBlockDuration", js.undefined)
    
    inline def setInmemoryBlockOnConsumed(value: Double): Self = StObject.set(x, "inmemoryBlockOnConsumed", value.asInstanceOf[js.Any])
    
    inline def setInmemoryBlockOnConsumedUndefined: Self = StObject.set(x, "inmemoryBlockOnConsumed", js.undefined)
    
    inline def setInsuranceLimiter(value: RateLimiterAbstract): Self = StObject.set(x, "insuranceLimiter", value.asInstanceOf[js.Any])
    
    inline def setInsuranceLimiterUndefined: Self = StObject.set(x, "insuranceLimiter", js.undefined)
    
    inline def setStoreClient(value: Any): Self = StObject.set(x, "storeClient", value.asInstanceOf[js.Any])
    
    inline def setStoreType(value: String): Self = StObject.set(x, "storeType", value.asInstanceOf[js.Any])
    
    inline def setStoreTypeUndefined: Self = StObject.set(x, "storeType", js.undefined)
    
    inline def setTableCreated(value: Boolean): Self = StObject.set(x, "tableCreated", value.asInstanceOf[js.Any])
    
    inline def setTableCreatedUndefined: Self = StObject.set(x, "tableCreated", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
  }
}
