package typings.pulumiAws

import typings.pulumiAws.brokerMod.BrokerArgs
import typings.pulumiAws.brokerMod.BrokerState
import typings.pulumiAws.configurationMod.ConfigurationArgs
import typings.pulumiAws.configurationMod.ConfigurationState
import typings.pulumiAws.getBrokerMod.GetBrokerArgs
import typings.pulumiAws.getBrokerMod.GetBrokerResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/mq", JSImport.Namespace)
@js.native
object mqMod extends js.Object {
  @js.native
  class Broker protected ()
    extends typings.pulumiAws.brokerMod.Broker {
    /**
      * Create a Broker resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BrokerArgs) = this()
    def this(name: String, args: BrokerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Configuration protected ()
    extends typings.pulumiAws.configurationMod.Configuration {
    /**
      * Create a Configuration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConfigurationArgs) = this()
    def this(name: String, args: ConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  def getBroker(): js.Promise[GetBrokerResult] = js.native
  def getBroker(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetBrokerResult] = js.native
  def getBroker(args: GetBrokerArgs): js.Promise[GetBrokerResult] = js.native
  def getBroker(args: GetBrokerArgs, opts: InvokeOptions): js.Promise[GetBrokerResult] = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.brokerMod.Broker = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.brokerMod.Broker = js.native
    def get(name: String, id: Input[ID], state: BrokerState): typings.pulumiAws.brokerMod.Broker = js.native
    def get(name: String, id: Input[ID], state: BrokerState, opts: CustomResourceOptions): typings.pulumiAws.brokerMod.Broker = js.native
    /**
      * Returns true if the given object is an instance of Broker.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/broker.Broker */ Boolean = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.configurationMod.Configuration = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.configurationMod.Configuration = js.native
    def get(name: String, id: Input[ID], state: ConfigurationState): typings.pulumiAws.configurationMod.Configuration = js.native
    def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.configurationMod.Configuration = js.native
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/configuration.Configuration */ Boolean = js.native
  }
  
}

