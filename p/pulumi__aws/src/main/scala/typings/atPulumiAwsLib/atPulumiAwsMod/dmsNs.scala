package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "dms")
@js.native
object dmsNs extends js.Object {
  @js.native
  class Certificate protected ()
    extends atPulumiAwsLib.dmsMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.dmsCertificateMod.CertificateArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.dmsCertificateMod.CertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Endpoint protected ()
    extends atPulumiAwsLib.dmsMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.dmsEndpointMod.EndpointArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.dmsEndpointMod.EndpointArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ReplicationInstance protected ()
    extends atPulumiAwsLib.dmsMod.ReplicationInstance {
    /**
      * Create a ReplicationInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstanceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ReplicationSubnetGroup protected ()
    extends atPulumiAwsLib.dmsMod.ReplicationSubnetGroup {
    /**
      * Create a ReplicationSubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.dmsReplicationSubnetGroupMod.ReplicationSubnetGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.dmsReplicationSubnetGroupMod.ReplicationSubnetGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ReplicationTask protected ()
    extends atPulumiAwsLib.dmsMod.ReplicationTask {
    /**
      * Create a ReplicationTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.dmsReplicationTaskMod.ReplicationTaskArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.dmsReplicationTaskMod.ReplicationTaskArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dmsCertificateMod.Certificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dmsCertificateMod.CertificateState
    ): atPulumiAwsLib.dmsCertificateMod.Certificate = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dmsCertificateMod.CertificateState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.dmsCertificateMod.Certificate = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dmsEndpointMod.Endpoint = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dmsEndpointMod.EndpointState
    ): atPulumiAwsLib.dmsEndpointMod.Endpoint = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dmsEndpointMod.EndpointState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.dmsEndpointMod.Endpoint = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstanceState
    ): atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstanceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstance = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dmsReplicationSubnetGroupMod.ReplicationSubnetGroupState
    ): atPulumiAwsLib.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dmsReplicationSubnetGroupMod.ReplicationSubnetGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dmsReplicationTaskMod.ReplicationTask = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dmsReplicationTaskMod.ReplicationTaskState
    ): atPulumiAwsLib.dmsReplicationTaskMod.ReplicationTask = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.dmsReplicationTaskMod.ReplicationTaskState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.dmsReplicationTaskMod.ReplicationTask = js.native
  }
  
}

