package typings.pulumiAws

import typings.pulumiAws.dmsCertificateMod.CertificateArgs
import typings.pulumiAws.dmsCertificateMod.CertificateState
import typings.pulumiAws.endpointMod.EndpointArgs
import typings.pulumiAws.endpointMod.EndpointState
import typings.pulumiAws.eventSubscriptionMod.EventSubscriptionArgs
import typings.pulumiAws.eventSubscriptionMod.EventSubscriptionState
import typings.pulumiAws.replicationInstanceMod.ReplicationInstanceArgs
import typings.pulumiAws.replicationInstanceMod.ReplicationInstanceState
import typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroupArgs
import typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroupState
import typings.pulumiAws.replicationTaskMod.ReplicationTaskArgs
import typings.pulumiAws.replicationTaskMod.ReplicationTaskState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dmsMod {
  
  @JSImport("@pulumi/aws/dms", "Certificate")
  @js.native
  class Certificate protected ()
    extends typings.pulumiAws.dmsCertificateMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Certificate {
    
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.dmsCertificateMod.Certificate = js.native
    @JSImport("@pulumi/aws/dms", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.dmsCertificateMod.Certificate = js.native
    @JSImport("@pulumi/aws/dms", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState): typings.pulumiAws.dmsCertificateMod.Certificate = js.native
    @JSImport("@pulumi/aws/dms", "Certificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typings.pulumiAws.dmsCertificateMod.Certificate = js.native
    
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "Certificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/certificate.Certificate */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/dms", "Endpoint")
  @js.native
  class Endpoint protected ()
    extends typings.pulumiAws.endpointMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Endpoint {
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.endpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/dms", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.endpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/dms", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState): typings.pulumiAws.endpointMod.Endpoint = js.native
    @JSImport("@pulumi/aws/dms", "Endpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.pulumiAws.endpointMod.Endpoint = js.native
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "Endpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/endpoint.Endpoint */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/dms", "EventSubscription")
  @js.native
  class EventSubscription protected ()
    extends typings.pulumiAws.eventSubscriptionMod.EventSubscription {
    /**
      * Create a EventSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventSubscriptionArgs) = this()
    def this(name: String, args: EventSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventSubscription {
    
    /**
      * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.eventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/dms", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.eventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/dms", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState): typings.pulumiAws.eventSubscriptionMod.EventSubscription = js.native
    @JSImport("@pulumi/aws/dms", "EventSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): typings.pulumiAws.eventSubscriptionMod.EventSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "EventSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/eventSubscription.EventSubscription */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/dms", "ReplicationInstance")
  @js.native
  class ReplicationInstance protected ()
    extends typings.pulumiAws.replicationInstanceMod.ReplicationInstance {
    /**
      * Create a ReplicationInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationInstanceArgs) = this()
    def this(name: String, args: ReplicationInstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReplicationInstance {
    
    /**
      * Get an existing ReplicationInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState): typings.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState, opts: CustomResourceOptions): typings.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicationInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationInstance.ReplicationInstance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup")
  @js.native
  class ReplicationSubnetGroup protected ()
    extends typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup {
    /**
      * Create a ReplicationSubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationSubnetGroupArgs) = this()
    def this(name: String, args: ReplicationSubnetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReplicationSubnetGroup {
    
    /**
      * Get an existing ReplicationSubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState): typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState, opts: CustomResourceOptions): typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicationSubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationSubnetGroup.ReplicationSubnetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/dms", "ReplicationTask")
  @js.native
  class ReplicationTask protected ()
    extends typings.pulumiAws.replicationTaskMod.ReplicationTask {
    /**
      * Create a ReplicationTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationTaskArgs) = this()
    def this(name: String, args: ReplicationTaskArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReplicationTask {
    
    /**
      * Get an existing ReplicationTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationTask.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState): typings.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    @JSImport("@pulumi/aws/dms", "ReplicationTask.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState, opts: CustomResourceOptions): typings.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicationTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dms", "ReplicationTask.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationTask.ReplicationTask */ Boolean = js.native
  }
}
