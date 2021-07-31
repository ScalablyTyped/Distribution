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
  
  @scala.inline
  def apply(arn: String | StringDictionary[js.Any]): Sqs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sqs]
  }
  
  @scala.inline
  implicit class SqsMutableBuilder[Self <: Sqs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSize(value: Double | String): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMaximumRetryAttempts(value: Double | String): Self = StObject.set(x, "maximumRetryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "maximumRetryAttempts", js.undefined)
  }
}
