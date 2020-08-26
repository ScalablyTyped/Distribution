package typings.pulumiAws.mod

import typings.pulumiAws.emrClusterMod.ClusterArgs
import typings.pulumiAws.emrClusterMod.ClusterState
import typings.pulumiAws.instanceGroupMod.InstanceGroupArgs
import typings.pulumiAws.instanceGroupMod.InstanceGroupState
import typings.pulumiAws.securityConfigurationMod.SecurityConfigurationArgs
import typings.pulumiAws.securityConfigurationMod.SecurityConfigurationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "emr")
@js.native
object emr extends js.Object {
  @js.native
  class Cluster protected ()
    extends typings.pulumiAws.emrMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class InstanceGroup protected ()
    extends typings.pulumiAws.emrMod.InstanceGroup {
    /**
      * Create a InstanceGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceGroupArgs) = this()
    def this(name: String, args: InstanceGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SecurityConfiguration protected ()
    extends typings.pulumiAws.emrMod.SecurityConfiguration {
    /**
      * Create a SecurityConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityConfigurationArgs) = this()
    def this(name: String, args: SecurityConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Cluster extends js.Object {
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.emrClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.emrClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.emrClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.emrClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object InstanceGroup extends js.Object {
    /**
      * Get an existing InstanceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    def get(name: String, id: Input[ID], state: InstanceGroupState): typings.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    def get(name: String, id: Input[ID], state: InstanceGroupState, opts: CustomResourceOptions): typings.pulumiAws.instanceGroupMod.InstanceGroup = js.native
    /**
      * Returns true if the given object is an instance of InstanceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceGroup.InstanceGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SecurityConfiguration extends js.Object {
    /**
      * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState): typings.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.securityConfigurationMod.SecurityConfiguration = js.native
    /**
      * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/securityConfiguration.SecurityConfiguration */ Boolean = js.native
  }
  
}

