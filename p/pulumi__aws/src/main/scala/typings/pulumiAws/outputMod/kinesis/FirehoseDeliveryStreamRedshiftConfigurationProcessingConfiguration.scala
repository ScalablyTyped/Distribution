package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration extends StObject {
  
  /**
    * Enables or disables data processing.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of data processors. More details are given below
    */
  var processors: js.UndefOr[
    js.Array[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor]
  ] = js.undefined
}
object FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration {
  
  @scala.inline
  def apply(): FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationMutableBuilder[Self <: FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setProcessors(value: js.Array[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorsUndefined: Self = StObject.set(x, "processors", js.undefined)
    
    @scala.inline
    def setProcessorsVarargs(value: FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor*): Self = StObject.set(x, "processors", js.Array(value :_*))
  }
}
