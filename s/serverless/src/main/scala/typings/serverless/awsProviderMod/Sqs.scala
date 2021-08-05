package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sqs extends StObject {
  
  var arn: String | StringDictionary[js.Any]
  
  var batchSize: js.UndefOr[Double | String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var maximumRetryAttempts: js.UndefOr[Double | String] = js.undefined
}
object Sqs {
  
  inline def apply(arn: String | StringDictionary[js.Any]): Sqs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sqs]
  }
  
  extension [Self <: Sqs](x: Self) {
    
    inline def setArn(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setBatchSize(value: Double | String): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMaximumRetryAttempts(value: Double | String): Self = StObject.set(x, "maximumRetryAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "maximumRetryAttempts", js.undefined)
  }
}
