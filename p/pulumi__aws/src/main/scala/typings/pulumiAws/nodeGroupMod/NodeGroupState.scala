package typings.pulumiAws.nodeGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.eks.NodeGroupLaunchTemplate
import typings.pulumiAws.inputMod.eks.NodeGroupRemoteAccess
import typings.pulumiAws.inputMod.eks.NodeGroupResource
import typings.pulumiAws.inputMod.eks.NodeGroupScalingConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupState extends js.Object {
  
  /**
    * Type of Amazon Machine Image (AMI) associated with the EKS Node Group. Defaults to `AL2_x86_64`. Valid values: `AL2_x86_64`, `AL2_x86_64_GPU`, `AL2_ARM_64`. This provider will only perform drift detection if a configuration value is provided.
    */
  val amiType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the EKS Node Group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the EKS Cluster.
    */
  val clusterName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
    */
  val diskSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
    */
  val forceUpdateVersion: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Set of instance types associated with the EKS Node Group. Defaults to `["t3.medium"]`. This provider will only perform drift detection if a configuration value is provided. Currently, the EKS API only accepts a single value in the set.
    */
  val instanceTypes: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
    */
  val labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Configuration block with Launch Template settings. Detailed below.
    */
  val launchTemplate: js.UndefOr[Input[NodeGroupLaunchTemplate]] = js.native
  
  /**
    * Name of the EKS Node Group.
    */
  val nodeGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
    */
  val nodeRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
    */
  val releaseVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block with remote access settings. Detailed below.
    */
  val remoteAccess: js.UndefOr[Input[NodeGroupRemoteAccess]] = js.native
  
  /**
    * List of objects containing information about underlying resources.
    */
  val resources: js.UndefOr[Input[js.Array[Input[NodeGroupResource]]]] = js.native
  
  /**
    * Configuration block with scaling settings. Detailed below.
    */
  val scalingConfig: js.UndefOr[Input[NodeGroupScalingConfig]] = js.native
  
  /**
    * Status of the EKS Node Group.
    */
  val status: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  val version: js.UndefOr[Input[String]] = js.native
}
object NodeGroupState {
  
  @scala.inline
  def apply(): NodeGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupState]
  }
  
  @scala.inline
  implicit class NodeGroupStateOps[Self <: NodeGroupState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmiType(value: Input[String]): Self = this.set("amiType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmiType: Self = this.set("amiType", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setClusterName(value: Input[String]): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    
    @scala.inline
    def setDiskSize(value: Input[Double]): Self = this.set("diskSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSize: Self = this.set("diskSize", js.undefined)
    
    @scala.inline
    def setForceUpdateVersion(value: Input[Boolean]): Self = this.set("forceUpdateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceUpdateVersion: Self = this.set("forceUpdateVersion", js.undefined)
    
    @scala.inline
    def setInstanceTypes(value: Input[String]): Self = this.set("instanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTypes: Self = this.set("instanceTypes", js.undefined)
    
    @scala.inline
    def setLabels(value: Input[StringDictionary[Input[String]]]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLaunchTemplate(value: Input[NodeGroupLaunchTemplate]): Self = this.set("launchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplate: Self = this.set("launchTemplate", js.undefined)
    
    @scala.inline
    def setNodeGroupName(value: Input[String]): Self = this.set("nodeGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeGroupName: Self = this.set("nodeGroupName", js.undefined)
    
    @scala.inline
    def setNodeRoleArn(value: Input[String]): Self = this.set("nodeRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeRoleArn: Self = this.set("nodeRoleArn", js.undefined)
    
    @scala.inline
    def setReleaseVersion(value: Input[String]): Self = this.set("releaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseVersion: Self = this.set("releaseVersion", js.undefined)
    
    @scala.inline
    def setRemoteAccess(value: Input[NodeGroupRemoteAccess]): Self = this.set("remoteAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAccess: Self = this.set("remoteAccess", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Input[NodeGroupResource]*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: Input[js.Array[Input[NodeGroupResource]]]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setScalingConfig(value: Input[NodeGroupScalingConfig]): Self = this.set("scalingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingConfig: Self = this.set("scalingConfig", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
