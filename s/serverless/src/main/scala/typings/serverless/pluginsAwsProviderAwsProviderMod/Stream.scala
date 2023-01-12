package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessStrings.dynamodb
import typings.serverless.serverlessStrings.kinesis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  var arn: String | StringDictionary[Any]
  
  var batchSize: js.UndefOr[Double | String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var filterPatterns: js.UndefOr[js.Array[FilterPattern]] = js.undefined
  
  var startingPosition: js.UndefOr[Double | String] = js.undefined
  
  var `type`: js.UndefOr[dynamodb | kinesis] = js.undefined
}
object Stream {
  
  inline def apply(arn: String | StringDictionary[Any]): Stream = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String | StringDictionary[Any]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setBatchSize(value: Double | String): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFilterPatterns(value: js.Array[FilterPattern]): Self = StObject.set(x, "filterPatterns", value.asInstanceOf[js.Any])
    
    inline def setFilterPatternsUndefined: Self = StObject.set(x, "filterPatterns", js.undefined)
    
    inline def setFilterPatternsVarargs(value: FilterPattern*): Self = StObject.set(x, "filterPatterns", js.Array(value*))
    
    inline def setStartingPosition(value: Double | String): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionUndefined: Self = StObject.set(x, "startingPosition", js.undefined)
    
    inline def setType(value: dynamodb | kinesis): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
