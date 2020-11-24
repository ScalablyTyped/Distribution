package typings.pulumiAws.daxClusterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.dax.ClusterNode
import typings.pulumiAws.inputMod.dax.ClusterServerSideEncryption
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterState extends js.Object {
  
  /**
    * The ARN of the DAX cluster
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of Availability Zones in which the
    * nodes will be created
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The DNS name of the DAX cluster without the port appended
    */
  val clusterAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * Group identifier. DAX converts this name to
    * lowercase
    */
  val clusterName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The configuration endpoint for this DAX cluster,
    * consisting of a DNS name and a port number
    */
  val configurationEndpoint: js.UndefOr[Input[String]] = js.native
  
  /**
    * Description for the cluster
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A valid Amazon Resource Name (ARN) that identifies
    * an IAM role. At runtime, DAX will assume this role and use the role's
    * permissions to access DynamoDB on your behalf
    */
  val iamRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the weekly time range for when
    * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
    * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
    * `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: js.UndefOr[Input[String]] = js.native
  
  /**
    * The compute and memory capacity of the nodes. See
    * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
    */
  val nodeType: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of node objects including `id`, `address`, `port` and
    * `availabilityZone`. Referenceable e.g. as
    * `${aws_dax_cluster.test.nodes.0.address}`
    */
  val nodes: js.UndefOr[Input[js.Array[Input[ClusterNode]]]] = js.native
  
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send DAX notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the parameter group to associate
    * with this DAX cluster
    */
  val parameterGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The port used by the configuration endpoint
    */
  val port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of nodes in the DAX cluster. A
    * replication factor of 1 will create a single-node cluster, without any read
    * replicas
    */
  val replicationFactor: js.UndefOr[Input[Double]] = js.native
  
  /**
    * One or more VPC security groups associated
    * with the cluster
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Encrypt at rest options
    */
  val serverSideEncryption: js.UndefOr[Input[ClusterServerSideEncryption]] = js.native
  
  /**
    * Name of the subnet group to be used for the
    * cluster
    */
  val subnetGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ClusterState {
  
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  
  @scala.inline
  implicit class ClusterStateOps[Self <: ClusterState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: Input[String]*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("availabilityZones", js.undefined)
    
    @scala.inline
    def setClusterAddress(value: Input[String]): Self = this.set("clusterAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterAddress: Self = this.set("clusterAddress", js.undefined)
    
    @scala.inline
    def setClusterName(value: Input[String]): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    
    @scala.inline
    def setConfigurationEndpoint(value: Input[String]): Self = this.set("configurationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationEndpoint: Self = this.set("configurationEndpoint", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: Input[String]): Self = this.set("iamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoleArn: Self = this.set("iamRoleArn", js.undefined)
    
    @scala.inline
    def setMaintenanceWindow(value: Input[String]): Self = this.set("maintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceWindow: Self = this.set("maintenanceWindow", js.undefined)
    
    @scala.inline
    def setNodeType(value: Input[String]): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: Input[ClusterNode]*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: Input[js.Array[Input[ClusterNode]]]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    
    @scala.inline
    def setNotificationTopicArn(value: Input[String]): Self = this.set("notificationTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTopicArn: Self = this.set("notificationTopicArn", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: Input[String]): Self = this.set("parameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroupName: Self = this.set("parameterGroupName", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setReplicationFactor(value: Input[Double]): Self = this.set("replicationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationFactor: Self = this.set("replicationFactor", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    
    @scala.inline
    def setServerSideEncryption(value: Input[ClusterServerSideEncryption]): Self = this.set("serverSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("serverSideEncryption", js.undefined)
    
    @scala.inline
    def setSubnetGroupName(value: Input[String]): Self = this.set("subnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetGroupName: Self = this.set("subnetGroupName", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
