package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration extends StObject {
  
  /**
    * Enables or disables data processing.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of data processors. More details are given below
    */
  var processors: js.UndefOr[
    js.Array[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor]
  ] = js.undefined
}
object FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration {
  
  inline def apply(): FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration]
  }
  
  extension [Self <: FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setProcessors(value: js.Array[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsUndefined: Self = StObject.set(x, "processors", js.undefined)
    
    inline def setProcessorsVarargs(value: FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessor*): Self = StObject.set(x, "processors", js.Array(value :_*))
  }
}
