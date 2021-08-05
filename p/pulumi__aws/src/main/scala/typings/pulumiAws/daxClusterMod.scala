package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.dax.ClusterNode
import typings.pulumiAws.outputMod.dax.ClusterServerSideEncryption
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object daxClusterMod {
  
  @JSImport("@pulumi/aws/dax/cluster", "Cluster")
  @js.native
  class Cluster protected () extends CustomResource {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the DAX cluster
      */
    val arn: Output_[String] = js.native
    
    /**
      * List of Availability Zones in which the
      * nodes will be created
      */
    val availabilityZones: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The DNS name of the DAX cluster without the port appended
      */
    val clusterAddress: Output_[String] = js.native
    
    /**
      * Group identifier. DAX converts this name to
      * lowercase
      */
    val clusterName: Output_[String] = js.native
    
    /**
      * The configuration endpoint for this DAX cluster,
      * consisting of a DNS name and a port number
      */
    val configurationEndpoint: Output_[String] = js.native
    
    /**
      * Description for the cluster
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A valid Amazon Resource Name (ARN) that identifies
      * an IAM role. At runtime, DAX will assume this role and use the role's
      * permissions to access DynamoDB on your behalf
      */
    val iamRoleArn: Output_[String] = js.native
    
    /**
      * Specifies the weekly time range for when
      * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
      * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
      * `sun:05:00-sun:09:00`
      */
    val maintenanceWindow: Output_[String] = js.native
    
    /**
      * The compute and memory capacity of the nodes. See
      * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
      */
    val nodeType: Output_[String] = js.native
    
    /**
      * List of node objects including `id`, `address`, `port` and
      * `availabilityZone`. Referenceable e.g. as
      * `${aws_dax_cluster.test.nodes.0.address}`
      */
    val nodes: Output_[js.Array[ClusterNode]] = js.native
    
    /**
      * An Amazon Resource Name (ARN) of an
      * SNS topic to send DAX notifications to. Example:
      * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
      */
    val notificationTopicArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the parameter group to associate
      * with this DAX cluster
      */
    val parameterGroupName: Output_[String] = js.native
    
    /**
      * The port used by the configuration endpoint
      */
    val port: Output_[Double] = js.native
    
    /**
      * The number of nodes in the DAX cluster. A
      * replication factor of 1 will create a single-node cluster, without any read
      * replicas
      */
    val replicationFactor: Output_[Double] = js.native
    
    /**
      * One or more VPC security groups associated
      * with the cluster
      */
    val securityGroupIds: Output_[js.Array[String]] = js.native
    
    /**
      * Encrypt at rest options
      */
    val serverSideEncryption: Output_[js.UndefOr[ClusterServerSideEncryption]] = js.native
    
    /**
      * Name of the subnet group to be used for the
      * cluster
      */
    val subnetGroupName: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Cluster {
    
    @JSImport("@pulumi/aws/dax/cluster", "Cluster")
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
    inline def get(name: String, id: Input[ID]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    inline def get(name: String, id: Input[ID], state: ClusterState): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    inline def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dax/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dax/cluster.Cluster */ Boolean]
  }
  
  trait ClusterArgs extends StObject {
    
    /**
      * List of Availability Zones in which the
      * nodes will be created
      */
    val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Group identifier. DAX converts this name to
      * lowercase
      */
    val clusterName: Input[String]
    
    /**
      * Description for the cluster
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A valid Amazon Resource Name (ARN) that identifies
      * an IAM role. At runtime, DAX will assume this role and use the role's
      * permissions to access DynamoDB on your behalf
      */
    val iamRoleArn: Input[String]
    
    /**
      * Specifies the weekly time range for when
      * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
      * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
      * `sun:05:00-sun:09:00`
      */
    val maintenanceWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The compute and memory capacity of the nodes. See
      * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
      */
    val nodeType: Input[String]
    
    /**
      * An Amazon Resource Name (ARN) of an
      * SNS topic to send DAX notifications to. Example:
      * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
      */
    val notificationTopicArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the parameter group to associate
      * with this DAX cluster
      */
    val parameterGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of nodes in the DAX cluster. A
      * replication factor of 1 will create a single-node cluster, without any read
      * replicas
      */
    val replicationFactor: Input[Double]
    
    /**
      * One or more VPC security groups associated
      * with the cluster
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Encrypt at rest options
      */
    val serverSideEncryption: js.UndefOr[Input[typings.pulumiAws.inputMod.dax.ClusterServerSideEncryption]] = js.undefined
    
    /**
      * Name of the subnet group to be used for the
      * cluster
      */
    val subnetGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ClusterArgs {
    
    inline def apply(
      clusterName: Input[String],
      iamRoleArn: Input[String],
      nodeType: Input[String],
      replicationFactor: Input[Double]
    ): ClusterArgs = {
      val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], iamRoleArn = iamRoleArn.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], replicationFactor = replicationFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterArgs]
    }
    
    extension [Self <: ClusterArgs](x: Self) {
      
      inline def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      inline def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIamRoleArn(value: Input[String]): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      inline def setMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
      
      inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
      
      inline def setNodeType(value: Input[String]): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNotificationTopicArn(value: Input[String]): Self = StObject.set(x, "notificationTopicArn", value.asInstanceOf[js.Any])
      
      inline def setNotificationTopicArnUndefined: Self = StObject.set(x, "notificationTopicArn", js.undefined)
      
      inline def setParameterGroupName(value: Input[String]): Self = StObject.set(x, "parameterGroupName", value.asInstanceOf[js.Any])
      
      inline def setParameterGroupNameUndefined: Self = StObject.set(x, "parameterGroupName", js.undefined)
      
      inline def setReplicationFactor(value: Input[Double]): Self = StObject.set(x, "replicationFactor", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setServerSideEncryption(value: Input[typings.pulumiAws.inputMod.dax.ClusterServerSideEncryption]): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
      
      inline def setSubnetGroupName(value: Input[String]): Self = StObject.set(x, "subnetGroupName", value.asInstanceOf[js.Any])
      
      inline def setSubnetGroupNameUndefined: Self = StObject.set(x, "subnetGroupName", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ClusterState extends StObject {
    
    /**
      * The ARN of the DAX cluster
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of Availability Zones in which the
      * nodes will be created
      */
    val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The DNS name of the DAX cluster without the port appended
      */
    val clusterAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Group identifier. DAX converts this name to
      * lowercase
      */
    val clusterName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The configuration endpoint for this DAX cluster,
      * consisting of a DNS name and a port number
      */
    val configurationEndpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description for the cluster
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A valid Amazon Resource Name (ARN) that identifies
      * an IAM role. At runtime, DAX will assume this role and use the role's
      * permissions to access DynamoDB on your behalf
      */
    val iamRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the weekly time range for when
      * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
      * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
      * `sun:05:00-sun:09:00`
      */
    val maintenanceWindow: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The compute and memory capacity of the nodes. See
      * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
      */
    val nodeType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of node objects including `id`, `address`, `port` and
      * `availabilityZone`. Referenceable e.g. as
      * `${aws_dax_cluster.test.nodes.0.address}`
      */
    val nodes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.dax.ClusterNode]]]] = js.undefined
    
    /**
      * An Amazon Resource Name (ARN) of an
      * SNS topic to send DAX notifications to. Example:
      * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
      */
    val notificationTopicArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the parameter group to associate
      * with this DAX cluster
      */
    val parameterGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port used by the configuration endpoint
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The number of nodes in the DAX cluster. A
      * replication factor of 1 will create a single-node cluster, without any read
      * replicas
      */
    val replicationFactor: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * One or more VPC security groups associated
      * with the cluster
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Encrypt at rest options
      */
    val serverSideEncryption: js.UndefOr[Input[typings.pulumiAws.inputMod.dax.ClusterServerSideEncryption]] = js.undefined
    
    /**
      * Name of the subnet group to be used for the
      * cluster
      */
    val subnetGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ClusterState {
    
    inline def apply(): ClusterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterState]
    }
    
    extension [Self <: ClusterState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      inline def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setClusterAddress(value: Input[String]): Self = StObject.set(x, "clusterAddress", value.asInstanceOf[js.Any])
      
      inline def setClusterAddressUndefined: Self = StObject.set(x, "clusterAddress", js.undefined)
      
      inline def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
      
      inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
      
      inline def setConfigurationEndpoint(value: Input[String]): Self = StObject.set(x, "configurationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setConfigurationEndpointUndefined: Self = StObject.set(x, "configurationEndpoint", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIamRoleArn(value: Input[String]): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      inline def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
      
      inline def setMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
      
      inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
      
      inline def setNodeType(value: Input[String]): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      inline def setNodes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.dax.ClusterNode]]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: Input[typings.pulumiAws.inputMod.dax.ClusterNode]*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      inline def setNotificationTopicArn(value: Input[String]): Self = StObject.set(x, "notificationTopicArn", value.asInstanceOf[js.Any])
      
      inline def setNotificationTopicArnUndefined: Self = StObject.set(x, "notificationTopicArn", js.undefined)
      
      inline def setParameterGroupName(value: Input[String]): Self = StObject.set(x, "parameterGroupName", value.asInstanceOf[js.Any])
      
      inline def setParameterGroupNameUndefined: Self = StObject.set(x, "parameterGroupName", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReplicationFactor(value: Input[Double]): Self = StObject.set(x, "replicationFactor", value.asInstanceOf[js.Any])
      
      inline def setReplicationFactorUndefined: Self = StObject.set(x, "replicationFactor", js.undefined)
      
      inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setServerSideEncryption(value: Input[typings.pulumiAws.inputMod.dax.ClusterServerSideEncryption]): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
      
      inline def setSubnetGroupName(value: Input[String]): Self = StObject.set(x, "subnetGroupName", value.asInstanceOf[js.Any])
      
      inline def setSubnetGroupNameUndefined: Self = StObject.set(x, "subnetGroupName", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
