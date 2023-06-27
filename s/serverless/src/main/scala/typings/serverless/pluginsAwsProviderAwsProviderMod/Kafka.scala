package typings.serverless.pluginsAwsProviderAwsProviderMod

import typings.serverless.serverlessStrings.LATEST
import typings.serverless.serverlessStrings.TRIM_HORIZON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kafka extends StObject {
  
  var accessConfigurations: KafkaAccessConfiguration
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var bootstrapServers: js.Array[String]
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var maximumBatchingWindow: js.UndefOr[Double] = js.undefined
  
  var startingPosition: js.UndefOr[LATEST | TRIM_HORIZON] = js.undefined
  
  var topic: String
}
object Kafka {
  
  inline def apply(accessConfigurations: KafkaAccessConfiguration, bootstrapServers: js.Array[String], topic: String): Kafka = {
    val __obj = js.Dynamic.literal(accessConfigurations = accessConfigurations.asInstanceOf[js.Any], bootstrapServers = bootstrapServers.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kafka]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Kafka] (val x: Self) extends AnyVal {
    
    inline def setAccessConfigurations(value: KafkaAccessConfiguration): Self = StObject.set(x, "accessConfigurations", value.asInstanceOf[js.Any])
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setBootstrapServers(value: js.Array[String]): Self = StObject.set(x, "bootstrapServers", value.asInstanceOf[js.Any])
    
    inline def setBootstrapServersVarargs(value: String*): Self = StObject.set(x, "bootstrapServers", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMaximumBatchingWindow(value: Double): Self = StObject.set(x, "maximumBatchingWindow", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowUndefined: Self = StObject.set(x, "maximumBatchingWindow", js.undefined)
    
    inline def setStartingPosition(value: LATEST | TRIM_HORIZON): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionUndefined: Self = StObject.set(x, "startingPosition", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
