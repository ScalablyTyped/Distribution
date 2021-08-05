package typings.pulumiAws

import typings.pulumiAws.outputMod.networkfirewall.LoggingConfigurationLoggingConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingConfigurationMod {
  
  @JSImport("@pulumi/aws/networkfirewall/loggingConfiguration", "LoggingConfiguration")
  @js.native
  class LoggingConfiguration protected () extends CustomResource {
    /**
      * Create a LoggingConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoggingConfigurationArgs) = this()
    def this(name: String, args: LoggingConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the Network Firewall firewall.
      */
    val firewallArn: Output_[String] = js.native
    
    /**
      * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
      */
    val loggingConfiguration: Output_[LoggingConfigurationLoggingConfiguration] = js.native
  }
  /* static members */
  object LoggingConfiguration {
    
    @JSImport("@pulumi/aws/networkfirewall/loggingConfiguration", "LoggingConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LoggingConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): LoggingConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LoggingConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LoggingConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LoggingConfiguration]
    inline def get(name: String, id: Input[ID], state: LoggingConfigurationState): LoggingConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LoggingConfiguration]
    inline def get(name: String, id: Input[ID], state: LoggingConfigurationState, opts: CustomResourceOptions): LoggingConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LoggingConfiguration]
    
    /**
      * Returns true if the given object is an instance of LoggingConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/loggingConfiguration.LoggingConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/networkfirewall/loggingConfiguration.LoggingConfiguration */ Boolean]
  }
  
  trait LoggingConfigurationArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the Network Firewall firewall.
      */
    val firewallArn: Input[String]
    
    /**
      * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
      */
    val loggingConfiguration: Input[
        typings.pulumiAws.inputMod.networkfirewall.LoggingConfigurationLoggingConfiguration
      ]
  }
  object LoggingConfigurationArgs {
    
    inline def apply(
      firewallArn: Input[String],
      loggingConfiguration: Input[
          typings.pulumiAws.inputMod.networkfirewall.LoggingConfigurationLoggingConfiguration
        ]
    ): LoggingConfigurationArgs = {
      val __obj = js.Dynamic.literal(firewallArn = firewallArn.asInstanceOf[js.Any], loggingConfiguration = loggingConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggingConfigurationArgs]
    }
    
    extension [Self <: LoggingConfigurationArgs](x: Self) {
      
      inline def setFirewallArn(value: Input[String]): Self = StObject.set(x, "firewallArn", value.asInstanceOf[js.Any])
      
      inline def setLoggingConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.networkfirewall.LoggingConfigurationLoggingConfiguration
            ]
      ): Self = StObject.set(x, "loggingConfiguration", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoggingConfigurationState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the Network Firewall firewall.
      */
    val firewallArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
      */
    val loggingConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.networkfirewall.LoggingConfigurationLoggingConfiguration
        ]
      ] = js.undefined
  }
  object LoggingConfigurationState {
    
    inline def apply(): LoggingConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggingConfigurationState]
    }
    
    extension [Self <: LoggingConfigurationState](x: Self) {
      
      inline def setFirewallArn(value: Input[String]): Self = StObject.set(x, "firewallArn", value.asInstanceOf[js.Any])
      
      inline def setFirewallArnUndefined: Self = StObject.set(x, "firewallArn", js.undefined)
      
      inline def setLoggingConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.networkfirewall.LoggingConfigurationLoggingConfiguration
            ]
      ): Self = StObject.set(x, "loggingConfiguration", value.asInstanceOf[js.Any])
      
      inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "loggingConfiguration", js.undefined)
    }
  }
}
