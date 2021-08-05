package typings.pulumiAws.mod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mq {
  
  @JSImport("@pulumi/aws", "mq")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "mq.Broker")
  @js.native
  class Broker protected ()
    extends typings.pulumiAws.mqMod.Broker {
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
  /* static members */
  object Broker {
    
    @JSImport("@pulumi/aws", "mq.Broker")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Broker resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.brokerMod.Broker = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.brokerMod.Broker]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.brokerMod.Broker = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.brokerMod.Broker]
    inline def get(name: String, id: Input[ID], state: BrokerState): typings.pulumiAws.brokerMod.Broker = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.brokerMod.Broker]
    inline def get(name: String, id: Input[ID], state: BrokerState, opts: CustomResourceOptions): typings.pulumiAws.brokerMod.Broker = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.brokerMod.Broker]
    
    /**
      * Returns true if the given object is an instance of Broker.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/broker.Broker */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/mq/broker.Broker */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "mq.Configuration")
  @js.native
  class Configuration protected ()
    extends typings.pulumiAws.mqMod.Configuration {
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
  /* static members */
  object Configuration {
    
    @JSImport("@pulumi/aws", "mq.Configuration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Configuration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.configurationMod.Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationMod.Configuration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.configurationMod.Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationMod.Configuration]
    inline def get(name: String, id: Input[ID], state: ConfigurationState): typings.pulumiAws.configurationMod.Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationMod.Configuration]
    inline def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.configurationMod.Configuration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationMod.Configuration]
    
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/configuration.Configuration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/mq/configuration.Configuration */ Boolean]
  }
  
  inline def getBroker(): js.Promise[GetBrokerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBroker")().asInstanceOf[js.Promise[GetBrokerResult]]
  inline def getBroker(args: Unit, opts: InvokeOptions): js.Promise[GetBrokerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBroker")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBrokerResult]]
  inline def getBroker(args: GetBrokerArgs): js.Promise[GetBrokerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBroker")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBrokerResult]]
  inline def getBroker(args: GetBrokerArgs, opts: InvokeOptions): js.Promise[GetBrokerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBroker")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBrokerResult]]
}
