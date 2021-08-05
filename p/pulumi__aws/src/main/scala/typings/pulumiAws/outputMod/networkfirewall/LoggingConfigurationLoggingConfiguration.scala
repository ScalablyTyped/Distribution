package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfigurationLoggingConfiguration extends StObject {
  
  /**
    * Set of configuration blocks describing the logging details for a firewall. See Log Destination Config below for details. At most, only two blocks can be specified; one for `FLOW` logs and one for `ALERT` logs.
    */
  var logDestinationConfigs: js.Array[LoggingConfigurationLoggingConfigurationLogDestinationConfig]
}
object LoggingConfigurationLoggingConfiguration {
  
  inline def apply(logDestinationConfigs: js.Array[LoggingConfigurationLoggingConfigurationLogDestinationConfig]): LoggingConfigurationLoggingConfiguration = {
    val __obj = js.Dynamic.literal(logDestinationConfigs = logDestinationConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfigurationLoggingConfiguration]
  }
  
  extension [Self <: LoggingConfigurationLoggingConfiguration](x: Self) {
    
    inline def setLogDestinationConfigs(value: js.Array[LoggingConfigurationLoggingConfigurationLogDestinationConfig]): Self = StObject.set(x, "logDestinationConfigs", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationConfigsVarargs(value: LoggingConfigurationLoggingConfigurationLogDestinationConfig*): Self = StObject.set(x, "logDestinationConfigs", js.Array(value :_*))
  }
}
