package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessStrings.ReportBatchItemFailures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sqs extends StObject {
  
  var arn: String | StringDictionary[Any]
  
  /**
    * minimum: 1, maximum: 10000
    */
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var filterPatterns: js.UndefOr[js.Array[FilterPattern]] = js.undefined
  
  var functionResponseType: js.UndefOr[ReportBatchItemFailures] = js.undefined
  
  /**
    * minimum: 0, maximum: 300
    */
  var maximumBatchingWindow: js.UndefOr[Double] = js.undefined
}
object Sqs {
  
  inline def apply(arn: String | StringDictionary[Any]): Sqs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sqs]
  }
  
  extension [Self <: Sqs](x: Self) {
    
    inline def setArn(value: String | StringDictionary[Any]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFilterPatterns(value: js.Array[FilterPattern]): Self = StObject.set(x, "filterPatterns", value.asInstanceOf[js.Any])
    
    inline def setFilterPatternsUndefined: Self = StObject.set(x, "filterPatterns", js.undefined)
    
    inline def setFilterPatternsVarargs(value: FilterPattern*): Self = StObject.set(x, "filterPatterns", js.Array(value*))
    
    inline def setFunctionResponseType(value: ReportBatchItemFailures): Self = StObject.set(x, "functionResponseType", value.asInstanceOf[js.Any])
    
    inline def setFunctionResponseTypeUndefined: Self = StObject.set(x, "functionResponseType", js.undefined)
    
    inline def setMaximumBatchingWindow(value: Double): Self = StObject.set(x, "maximumBatchingWindow", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowUndefined: Self = StObject.set(x, "maximumBatchingWindow", js.undefined)
  }
}
