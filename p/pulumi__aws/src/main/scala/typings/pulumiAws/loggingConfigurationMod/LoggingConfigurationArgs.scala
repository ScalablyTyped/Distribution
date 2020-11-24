package typings.pulumiAws.loggingConfigurationMod

import typings.pulumiAws.inputMod.networkfirewall.LoggingConfigurationLoggingConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingConfigurationArgs extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the Network Firewall firewall.
    */
  val firewallArn: Input[String] = js.native
  
  /**
    * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
    */
  val loggingConfiguration: Input[LoggingConfigurationLoggingConfiguration] = js.native
}
object LoggingConfigurationArgs {
  
  @scala.inline
  def apply(firewallArn: Input[String], loggingConfiguration: Input[LoggingConfigurationLoggingConfiguration]): LoggingConfigurationArgs = {
    val __obj = js.Dynamic.literal(firewallArn = firewallArn.asInstanceOf[js.Any], loggingConfiguration = loggingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfigurationArgs]
  }
  
  @scala.inline
  implicit class LoggingConfigurationArgsOps[Self <: LoggingConfigurationArgs] (val x: Self) extends AnyVal {
    
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
    def setFirewallArn(value: Input[String]): Self = this.set("firewallArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfiguration(value: Input[LoggingConfigurationLoggingConfiguration]): Self = this.set("loggingConfiguration", value.asInstanceOf[js.Any])
  }
}
