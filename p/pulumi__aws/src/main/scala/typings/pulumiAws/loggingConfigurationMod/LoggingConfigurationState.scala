package typings.pulumiAws.loggingConfigurationMod

import typings.pulumiAws.inputMod.networkfirewall.LoggingConfigurationLoggingConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingConfigurationState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the Network Firewall firewall.
    */
  val firewallArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
    */
  val loggingConfiguration: js.UndefOr[Input[LoggingConfigurationLoggingConfiguration]] = js.native
}
object LoggingConfigurationState {
  
  @scala.inline
  def apply(): LoggingConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfigurationState]
  }
  
  @scala.inline
  implicit class LoggingConfigurationStateOps[Self <: LoggingConfigurationState] (val x: Self) extends AnyVal {
    
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
    def deleteFirewallArn: Self = this.set("firewallArn", js.undefined)
    
    @scala.inline
    def setLoggingConfiguration(value: Input[LoggingConfigurationLoggingConfiguration]): Self = this.set("loggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingConfiguration: Self = this.set("loggingConfiguration", js.undefined)
  }
}
