package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.dmsCertificateMod.CertificateArgs
import typings.atPulumiAws.dmsCertificateMod.CertificateState
import typings.atPulumiAws.dmsEndpointMod.EndpointArgs
import typings.atPulumiAws.dmsEndpointMod.EndpointState
import typings.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstanceArgs
import typings.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstanceState
import typings.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroupArgs
import typings.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroupState
import typings.atPulumiAws.dmsReplicationTaskMod.ReplicationTaskArgs
import typings.atPulumiAws.dmsReplicationTaskMod.ReplicationTaskState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "dms")
@js.native
object dms extends js.Object {
  @js.native
  class Certificate protected ()
    extends typings.atPulumiAws.dmsMod.Certificate {
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
  
  @js.native
  class Endpoint protected ()
    extends typings.atPulumiAws.dmsMod.Endpoint {
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
  
  @js.native
  class ReplicationInstance protected ()
    extends typings.atPulumiAws.dmsMod.ReplicationInstance {
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
  
  @js.native
  class ReplicationSubnetGroup protected ()
    extends typings.atPulumiAws.dmsMod.ReplicationSubnetGroup {
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
  
  @js.native
  class ReplicationTask protected ()
    extends typings.atPulumiAws.dmsMod.ReplicationTask {
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
  @js.native
  object Certificate extends js.Object {
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.dmsCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState): typings.atPulumiAws.dmsCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typings.atPulumiAws.dmsCertificateMod.Certificate = js.native
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/certificate.Certificate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Endpoint extends js.Object {
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.dmsEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState): typings.atPulumiAws.dmsEndpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.atPulumiAws.dmsEndpointMod.Endpoint = js.native
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/endpoint.Endpoint */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationInstance extends js.Object {
    /**
      * Get an existing ReplicationInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstance = js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState): typings.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstance = js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState, opts: CustomResourceOptions): typings.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstance = js.native
    /**
      * Returns true if the given object is an instance of ReplicationInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationInstance.ReplicationInstance */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationSubnetGroup extends js.Object {
    /**
      * Get an existing ReplicationSubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState): typings.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState, opts: CustomResourceOptions): typings.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of ReplicationSubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationSubnetGroup.ReplicationSubnetGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationTask extends js.Object {
    /**
      * Get an existing ReplicationTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.dmsReplicationTaskMod.ReplicationTask = js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState): typings.atPulumiAws.dmsReplicationTaskMod.ReplicationTask = js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState, opts: CustomResourceOptions): typings.atPulumiAws.dmsReplicationTaskMod.ReplicationTask = js.native
    /**
      * Returns true if the given object is an instance of ReplicationTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationTask.ReplicationTask */ Boolean = js.native
  }
  
}

