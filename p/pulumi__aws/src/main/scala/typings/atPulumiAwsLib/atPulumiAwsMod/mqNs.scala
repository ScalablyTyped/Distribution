package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "mq")
@js.native
object mqNs extends js.Object {
  @js.native
  class Broker protected ()
    extends atPulumiAwsLib.mqMod.Broker {
    /**
      * Create a Broker resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.mqBrokerMod.BrokerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.mqBrokerMod.BrokerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Configuration protected ()
    extends atPulumiAwsLib.mqMod.Configuration {
    /**
      * Create a Configuration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.mqConfigurationMod.ConfigurationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.mqConfigurationMod.ConfigurationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getBroker(): js.Promise[atPulumiAwsLib.mqGetBrokerMod.GetBrokerResult] = js.native
  def getBroker(args: atPulumiAwsLib.mqGetBrokerMod.GetBrokerArgs): js.Promise[atPulumiAwsLib.mqGetBrokerMod.GetBrokerResult] = js.native
  def getBroker(args: atPulumiAwsLib.mqGetBrokerMod.GetBrokerArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.mqGetBrokerMod.GetBrokerResult] = js.native
  /* static members */
  @js.native
  object Broker extends js.Object {
    /**
      * Get an existing Broker resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.mqBrokerMod.Broker = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.mqBrokerMod.BrokerState
    ): atPulumiAwsLib.mqBrokerMod.Broker = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.mqBrokerMod.BrokerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.mqBrokerMod.Broker = js.native
    /**
      * Returns true if the given object is an instance of Broker.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/broker.Broker */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Configuration extends js.Object {
    /**
      * Get an existing Configuration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.mqConfigurationMod.Configuration = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.mqConfigurationMod.ConfigurationState
    ): atPulumiAwsLib.mqConfigurationMod.Configuration = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.mqConfigurationMod.ConfigurationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.mqConfigurationMod.Configuration = js.native
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/configuration.Configuration */ scala.Boolean = js.native
  }
  
}

