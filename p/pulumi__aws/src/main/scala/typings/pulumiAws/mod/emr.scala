package typings.pulumiAws.mod

import typings.pulumiAws.emrClusterMod.ClusterArgs
import typings.pulumiAws.emrClusterMod.ClusterState
import typings.pulumiAws.instanceFleetMod.InstanceFleetArgs
import typings.pulumiAws.instanceFleetMod.InstanceFleetState
import typings.pulumiAws.instanceGroupMod.InstanceGroupArgs
import typings.pulumiAws.instanceGroupMod.InstanceGroupState
import typings.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicyArgs
import typings.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicyState
import typings.pulumiAws.securityConfigurationMod.SecurityConfigurationArgs
import typings.pulumiAws.securityConfigurationMod.SecurityConfigurationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emr {
  
  @JSImport("@pulumi/aws", "emr.Cluster")
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
  /* static members */
  object Cluster {
    
    @JSImport("@pulumi/aws", "emr.Cluster")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.emrClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emrClusterMod.Cluster]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.emrClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emrClusterMod.Cluster]
    inline def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.emrClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emrClusterMod.Cluster]
    inline def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.emrClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.emrClusterMod.Cluster]
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/emr/cluster.Cluster */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "emr.InstanceFleet")
  @js.native
  class InstanceFleet protected ()
    extends typings.pulumiAws.emrMod.InstanceFleet {
    /**
      * Create a InstanceFleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceFleetArgs) = this()
    def this(name: String, args: InstanceFleetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object InstanceFleet {
    
    @JSImport("@pulumi/aws", "emr.InstanceFleet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing InstanceFleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.instanceFleetMod.InstanceFleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.instanceFleetMod.InstanceFleet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.instanceFleetMod.InstanceFleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.instanceFleetMod.InstanceFleet]
    inline def get(name: String, id: Input[ID], state: InstanceFleetState): typings.pulumiAws.instanceFleetMod.InstanceFleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.instanceFleetMod.InstanceFleet]
    inline def get(name: String, id: Input[ID], state: InstanceFleetState, opts: CustomResourceOptions): typings.pulumiAws.instanceFleetMod.InstanceFleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.instanceFleetMod.InstanceFleet]
    
    /**
      * Returns true if the given object is an instance of InstanceFleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceFleet.InstanceFleet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/emr/instanceFleet.InstanceFleet */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "emr.InstanceGroup")
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
  /* static members */
  object InstanceGroup {
    
    @JSImport("@pulumi/aws", "emr.InstanceGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing InstanceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.instanceGroupMod.InstanceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.instanceGroupMod.InstanceGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.instanceGroupMod.InstanceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.instanceGroupMod.InstanceGroup]
    inline def get(name: String, id: Input[ID], state: InstanceGroupState): typings.pulumiAws.instanceGroupMod.InstanceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.instanceGroupMod.InstanceGroup]
    inline def get(name: String, id: Input[ID], state: InstanceGroupState, opts: CustomResourceOptions): typings.pulumiAws.instanceGroupMod.InstanceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.instanceGroupMod.InstanceGroup]
    
    /**
      * Returns true if the given object is an instance of InstanceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceGroup.InstanceGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/emr/instanceGroup.InstanceGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "emr.ManagedScalingPolicy")
  @js.native
  class ManagedScalingPolicy protected ()
    extends typings.pulumiAws.emrMod.ManagedScalingPolicy {
    /**
      * Create a ManagedScalingPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ManagedScalingPolicyArgs) = this()
    def this(name: String, args: ManagedScalingPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ManagedScalingPolicy {
    
    @JSImport("@pulumi/aws", "emr.ManagedScalingPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ManagedScalingPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy]
    inline def get(name: String, id: Input[ID], state: ManagedScalingPolicyState): typings.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy]
    inline def get(name: String, id: Input[ID], state: ManagedScalingPolicyState, opts: CustomResourceOptions): typings.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.managedScalingPolicyMod.ManagedScalingPolicy]
    
    /**
      * Returns true if the given object is an instance of ManagedScalingPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/managedScalingPolicy.ManagedScalingPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/emr/managedScalingPolicy.ManagedScalingPolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "emr.SecurityConfiguration")
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
  object SecurityConfiguration {
    
    @JSImport("@pulumi/aws", "emr.SecurityConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.securityConfigurationMod.SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.securityConfigurationMod.SecurityConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.securityConfigurationMod.SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.securityConfigurationMod.SecurityConfiguration]
    inline def get(name: String, id: Input[ID], state: SecurityConfigurationState): typings.pulumiAws.securityConfigurationMod.SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.securityConfigurationMod.SecurityConfiguration]
    inline def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.securityConfigurationMod.SecurityConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.securityConfigurationMod.SecurityConfiguration]
    
    /**
      * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/securityConfiguration.SecurityConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/emr/securityConfiguration.SecurityConfiguration */ Boolean]
  }
}
