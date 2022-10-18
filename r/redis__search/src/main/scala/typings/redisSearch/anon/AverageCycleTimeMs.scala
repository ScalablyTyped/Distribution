package typings.redisSearch.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AverageCycleTimeMs extends StObject {
  
  var averageCycleTimeMs: RedisCommandArgument
  
  var bytesCollected: RedisCommandArgument
  
  var gcBlocksDenied: RedisCommandArgument
  
  var gcNumericTreesMissed: RedisCommandArgument
  
  var lastRunTimeMs: RedisCommandArgument
  
  var totalCycles: RedisCommandArgument
  
  var totalMsRun: RedisCommandArgument
}
object AverageCycleTimeMs {
  
  inline def apply(
    averageCycleTimeMs: RedisCommandArgument,
    bytesCollected: RedisCommandArgument,
    gcBlocksDenied: RedisCommandArgument,
    gcNumericTreesMissed: RedisCommandArgument,
    lastRunTimeMs: RedisCommandArgument,
    totalCycles: RedisCommandArgument,
    totalMsRun: RedisCommandArgument
  ): AverageCycleTimeMs = {
    val __obj = js.Dynamic.literal(averageCycleTimeMs = averageCycleTimeMs.asInstanceOf[js.Any], bytesCollected = bytesCollected.asInstanceOf[js.Any], gcBlocksDenied = gcBlocksDenied.asInstanceOf[js.Any], gcNumericTreesMissed = gcNumericTreesMissed.asInstanceOf[js.Any], lastRunTimeMs = lastRunTimeMs.asInstanceOf[js.Any], totalCycles = totalCycles.asInstanceOf[js.Any], totalMsRun = totalMsRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[AverageCycleTimeMs]
  }
  
  extension [Self <: AverageCycleTimeMs](x: Self) {
    
    inline def setAverageCycleTimeMs(value: RedisCommandArgument): Self = StObject.set(x, "averageCycleTimeMs", value.asInstanceOf[js.Any])
    
    inline def setBytesCollected(value: RedisCommandArgument): Self = StObject.set(x, "bytesCollected", value.asInstanceOf[js.Any])
    
    inline def setGcBlocksDenied(value: RedisCommandArgument): Self = StObject.set(x, "gcBlocksDenied", value.asInstanceOf[js.Any])
    
    inline def setGcNumericTreesMissed(value: RedisCommandArgument): Self = StObject.set(x, "gcNumericTreesMissed", value.asInstanceOf[js.Any])
    
    inline def setLastRunTimeMs(value: RedisCommandArgument): Self = StObject.set(x, "lastRunTimeMs", value.asInstanceOf[js.Any])
    
    inline def setTotalCycles(value: RedisCommandArgument): Self = StObject.set(x, "totalCycles", value.asInstanceOf[js.Any])
    
    inline def setTotalMsRun(value: RedisCommandArgument): Self = StObject.set(x, "totalMsRun", value.asInstanceOf[js.Any])
  }
}
