package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingConfigurationLoggingConfiguration extends StObject {
  
  /**
    * Set of configuration blocks describing the logging details for a firewall. See Log Destination Config below for details. At most, only two blocks can be specified; one for `FLOW` logs and one for `ALERT` logs.
    */
  var logDestinationConfigs: js.Array[LoggingConfigurationLoggingConfigurationLogDestinationConfig] = js.native
}
object LoggingConfigurationLoggingConfiguration {
  
  @scala.inline
  def apply(logDestinationConfigs: js.Array[LoggingConfigurationLoggingConfigurationLogDestinationConfig]): LoggingConfigurationLoggingConfiguration = {
    val __obj = js.Dynamic.literal(logDestinationConfigs = logDestinationConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfigurationLoggingConfiguration]
  }
  
  @scala.inline
  implicit class LoggingConfigurationLoggingConfigurationMutableBuilder[Self <: LoggingConfigurationLoggingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogDestinationConfigs(value: js.Array[LoggingConfigurationLoggingConfigurationLogDestinationConfig]): Self = StObject.set(x, "logDestinationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDestinationConfigsVarargs(value: LoggingConfigurationLoggingConfigurationLogDestinationConfig*): Self = StObject.set(x, "logDestinationConfigs", js.Array(value :_*))
  }
}
