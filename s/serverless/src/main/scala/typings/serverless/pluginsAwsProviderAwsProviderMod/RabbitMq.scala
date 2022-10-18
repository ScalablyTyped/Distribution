package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RabbitMq extends StObject {
  
  var arn: String
  
  var basicAuthArn: String
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var queue: String
}
object RabbitMq {
  
  inline def apply(arn: String, basicAuthArn: String, queue: String): RabbitMq = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], basicAuthArn = basicAuthArn.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RabbitMq]
  }
  
  extension [Self <: RabbitMq](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthArn(value: String): Self = StObject.set(x, "basicAuthArn", value.asInstanceOf[js.Any])
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
  }
}
