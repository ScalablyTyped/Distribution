package typings.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingConfigurationLoggingConfiguration extends js.Object {
  
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
  implicit class LoggingConfigurationLoggingConfigurationOps[Self <: LoggingConfigurationLoggingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLogDestinationConfigsVarargs(value: LoggingConfigurationLoggingConfigurationLogDestinationConfig*): Self = this.set("logDestinationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setLogDestinationConfigs(value: js.Array[LoggingConfigurationLoggingConfigurationLogDestinationConfig]): Self = this.set("logDestinationConfigs", value.asInstanceOf[js.Any])
  }
}
