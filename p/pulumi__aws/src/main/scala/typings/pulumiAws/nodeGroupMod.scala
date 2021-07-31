package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.eks.NodeGroupLaunchTemplate
import typings.pulumiAws.outputMod.eks.NodeGroupRemoteAccess
import typings.pulumiAws.outputMod.eks.NodeGroupResource
import typings.pulumiAws.outputMod.eks.NodeGroupScalingConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeGroupMod {
  
  @JSImport("@pulumi/aws/eks/nodeGroup", "NodeGroup")
  @js.native
  class NodeGroup protected () extends CustomResource {
    /**
      * Create a NodeGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NodeGroupArgs) = this()
    def this(name: String, args: NodeGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Type of Amazon Machine Image (AMI) associated with the EKS Node Group. Defaults to `AL2_x86_64`. Valid values: `AL2_x86_64`, `AL2_x86_64_GPU`, `AL2_ARM_64`. This provider will only perform drift detection if a configuration value is provided.
      */
    val amiType: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the EKS Node Group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Name of the EKS Cluster.
      */
    val clusterName: Output_[String] = js.native
    
    /**
      * Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
      */
    val diskSize: Output_[Double] = js.native
    
    /**
      * Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
      */
    val forceUpdateVersion: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Set of instance types associated with the EKS Node Group. Defaults to `["t3.medium"]`. This provider will only perform drift detection if a configuration value is provided. Currently, the EKS API only accepts a single value in the set.
      */
    val instanceTypes: Output_[String] = js.native
    
    /**
      * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
      */
    val labels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Configuration block with Launch Template settings. Detailed below.
      */
    val launchTemplate: Output_[js.UndefOr[NodeGroupLaunchTemplate]] = js.native
    
    /**
      * Name of the EKS Node Group.
      */
    val nodeGroupName: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
      */
    val nodeRoleArn: Output_[String] = js.native
    
    /**
      * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
      */
    val releaseVersion: Output_[String] = js.native
    
    /**
      * Configuration block with remote access settings. Detailed below.
      */
    val remoteAccess: Output_[js.UndefOr[NodeGroupRemoteAccess]] = js.native
    
    /**
      * List of objects containing information about underlying resources.
      */
    val resources: Output_[js.Array[NodeGroupResource]] = js.native
    
    /**
      * Configuration block with scaling settings. Detailed below.
      */
    val scalingConfig: Output_[NodeGroupScalingConfig] = js.native
    
    /**
      * Status of the EKS Node Group.
      */
    val status: Output_[String] = js.native
    
    /**
      * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    val version: Output_[String] = js.native
  }
  /* static members */
  object NodeGroup {
    
    @JSImport("@pulumi/aws/eks/nodeGroup", "NodeGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NodeGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): NodeGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[NodeGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): NodeGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NodeGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: NodeGroupState): NodeGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[NodeGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: NodeGroupState, opts: CustomResourceOptions): NodeGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NodeGroup]
    
    /**
      * Returns true if the given object is an instance of NodeGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/nodeGroup.NodeGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/eks/nodeGroup.NodeGroup */ Boolean]
  }
  
  trait NodeGroupArgs extends StObject {
    
    /**
      * Type of Amazon Machine Image (AMI) associated with the EKS Node Group. Defaults to `AL2_x86_64`. Valid values: `AL2_x86_64`, `AL2_x86_64_GPU`, `AL2_ARM_64`. This provider will only perform drift detection if a configuration value is provided.
      */
    val amiType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the EKS Cluster.
      */
    val clusterName: Input[String]
    
    /**
      * Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
      */
    val diskSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
      */
    val forceUpdateVersion: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Set of instance types associated with the EKS Node Group. Defaults to `["t3.medium"]`. This provider will only perform drift detection if a configuration value is provided. Currently, the EKS API only accepts a single value in the set.
      */
    val instanceTypes: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
      */
    val labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Configuration block with Launch Template settings. Detailed below.
      */
    val launchTemplate: js.UndefOr[Input[typings.pulumiAws.inputMod.eks.NodeGroupLaunchTemplate]] = js.undefined
    
    /**
      * Name of the EKS Node Group.
      */
    val nodeGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
      */
    val nodeRoleArn: Input[String]
    
    /**
      * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
      */
    val releaseVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with remote access settings. Detailed below.
      */
    val remoteAccess: js.UndefOr[Input[typings.pulumiAws.inputMod.eks.NodeGroupRemoteAccess]] = js.undefined
    
    /**
      * Configuration block with scaling settings. Detailed below.
      */
    val scalingConfig: Input[typings.pulumiAws.inputMod.eks.NodeGroupScalingConfig]
    
    /**
      * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
      */
    val subnetIds: Input[js.Array[Input[String]]]
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object NodeGroupArgs {
    
    @scala.inline
    def apply(
      clusterName: Input[String],
      nodeRoleArn: Input[String],
      scalingConfig: Input[typings.pulumiAws.inputMod.eks.NodeGroupScalingConfig],
      subnetIds: Input[js.Array[Input[String]]]
    ): NodeGroupArgs = {
      val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodeRoleArn = nodeRoleArn.asInstanceOf[js.Any], scalingConfig = scalingConfig.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeGroupArgs]
    }
    
    @scala.inline
    implicit class NodeGroupArgsMutableBuilder[Self <: NodeGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmiType(value: Input[String]): Self = StObject.set(x, "amiType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmiTypeUndefined: Self = StObject.set(x, "amiType", js.undefined)
      
      @scala.inline
      def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskSize(value: Input[Double]): Self = StObject.set(x, "diskSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskSizeUndefined: Self = StObject.set(x, "diskSize", js.undefined)
      
      @scala.inline
      def setForceUpdateVersion(value: Input[Boolean]): Self = StObject.set(x, "forceUpdateVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUpdateVersionUndefined: Self = StObject.set(x, "forceUpdateVersion", js.undefined)
      
      @scala.inline
      def setInstanceTypes(value: Input[String]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
      
      @scala.inline
      def setLabels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLaunchTemplate(value: Input[typings.pulumiAws.inputMod.eks.NodeGroupLaunchTemplate]): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
      
      @scala.inline
      def setNodeGroupName(value: Input[String]): Self = StObject.set(x, "nodeGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeGroupNameUndefined: Self = StObject.set(x, "nodeGroupName", js.undefined)
      
      @scala.inline
      def setNodeRoleArn(value: Input[String]): Self = StObject.set(x, "nodeRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseVersion(value: Input[String]): Self = StObject.set(x, "releaseVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseVersionUndefined: Self = StObject.set(x, "releaseVersion", js.undefined)
      
      @scala.inline
      def setRemoteAccess(value: Input[typings.pulumiAws.inputMod.eks.NodeGroupRemoteAccess]): Self = StObject.set(x, "remoteAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAccessUndefined: Self = StObject.set(x, "remoteAccess", js.undefined)
      
      @scala.inline
      def setScalingConfig(value: Input[typings.pulumiAws.inputMod.eks.NodeGroupScalingConfig]): Self = StObject.set(x, "scalingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait NodeGroupState extends StObject {
    
    /**
      * Type of Amazon Machine Image (AMI) associated with the EKS Node Group. Defaults to `AL2_x86_64`. Valid values: `AL2_x86_64`, `AL2_x86_64_GPU`, `AL2_ARM_64`. This provider will only perform drift detection if a configuration value is provided.
      */
    val amiType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the EKS Node Group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the EKS Cluster.
      */
    val clusterName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
      */
    val diskSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
      */
    val forceUpdateVersion: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Set of instance types associated with the EKS Node Group. Defaults to `["t3.medium"]`. This provider will only perform drift detection if a configuration value is provided. Currently, the EKS API only accepts a single value in the set.
      */
    val instanceTypes: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
      */
    val labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Configuration block with Launch Template settings. Detailed below.
      */
    val launchTemplate: js.UndefOr[Input[typings.pulumiAws.inputMod.eks.NodeGroupLaunchTemplate]] = js.undefined
    
    /**
      * Name of the EKS Node Group.
      */
    val nodeGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
      */
    val nodeRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
      */
    val releaseVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with remote access settings. Detailed below.
      */
    val remoteAccess: js.UndefOr[Input[typings.pulumiAws.inputMod.eks.NodeGroupRemoteAccess]] = js.undefined
    
    /**
      * List of objects containing information about underlying resources.
      */
    val resources: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.eks.NodeGroupResource]]]] = js.undefined
    
    /**
      * Configuration block with scaling settings. Detailed below.
      */
    val scalingConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.eks.NodeGroupScalingConfig]] = js.undefined
    
    /**
      * Status of the EKS Node Group.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object NodeGroupState {
    
    @scala.inline
    def apply(): NodeGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeGroupState]
    }
    
    @scala.inline
    implicit class NodeGroupStateMutableBuilder[Self <: NodeGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmiType(value: Input[String]): Self = StObject.set(x, "amiType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmiTypeUndefined: Self = StObject.set(x, "amiType", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
      
      @scala.inline
      def setDiskSize(value: Input[Double]): Self = StObject.set(x, "diskSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskSizeUndefined: Self = StObject.set(x, "diskSize", js.undefined)
      
      @scala.inline
      def setForceUpdateVersion(value: Input[Boolean]): Self = StObject.set(x, "forceUpdateVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUpdateVersionUndefined: Self = StObject.set(x, "forceUpdateVersion", js.undefined)
      
      @scala.inline
      def setInstanceTypes(value: Input[String]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
      
      @scala.inline
      def setLabels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLaunchTemplate(value: Input[typings.pulumiAws.inputMod.eks.NodeGroupLaunchTemplate]): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
      
      @scala.inline
      def setNodeGroupName(value: Input[String]): Self = StObject.set(x, "nodeGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeGroupNameUndefined: Self = StObject.set(x, "nodeGroupName", js.undefined)
      
      @scala.inline
      def setNodeRoleArn(value: Input[String]): Self = StObject.set(x, "nodeRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeRoleArnUndefined: Self = StObject.set(x, "nodeRoleArn", js.undefined)
      
      @scala.inline
      def setReleaseVersion(value: Input[String]): Self = StObject.set(x, "releaseVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseVersionUndefined: Self = StObject.set(x, "releaseVersion", js.undefined)
      
      @scala.inline
      def setRemoteAccess(value: Input[typings.pulumiAws.inputMod.eks.NodeGroupRemoteAccess]): Self = StObject.set(x, "remoteAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAccessUndefined: Self = StObject.set(x, "remoteAccess", js.undefined)
      
      @scala.inline
      def setResources(value: Input[js.Array[Input[typings.pulumiAws.inputMod.eks.NodeGroupResource]]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      @scala.inline
      def setResourcesVarargs(value: Input[typings.pulumiAws.inputMod.eks.NodeGroupResource]*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setScalingConfig(value: Input[typings.pulumiAws.inputMod.eks.NodeGroupScalingConfig]): Self = StObject.set(x, "scalingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingConfigUndefined: Self = StObject.set(x, "scalingConfig", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
