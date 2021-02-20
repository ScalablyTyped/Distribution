package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devEndpointMod {
  
  @JSImport("@pulumi/aws/glue/devEndpoint", "DevEndpoint")
  @js.native
  class DevEndpoint protected () extends CustomResource {
    /**
      * Create a DevEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DevEndpointArgs) = this()
    def this(name: String, args: DevEndpointArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A map of arguments used to configure the endpoint.
      */
    val arguments: Output_[js.UndefOr[StringDictionary[_]]] = js.native
    
    /**
      * The ARN of the endpoint.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The AWS availability zone where this endpoint is located.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * Path to one or more Java Jars in an S3 bucket that should be loaded in this endpoint.
      */
    val extraJarsS3Path: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in this endpoint. Multiple values must be complete paths separated by a comma.
      */
    val extraPythonLibsS3Path: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The reason for a current failure in this endpoint.
      */
    val failureReason: Output_[String] = js.native
    
    /**
      * -  Specifies the versions of Python and Apache Spark to use. Defaults to AWS Glue version 0.9.
      */
    val glueVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of this endpoint. It must be unique in your account.
      */
    val name: Output_[String] = js.native
    
    /**
      * The number of AWS Glue Data Processing Units (DPUs) to allocate to this endpoint. Conflicts with `workerType`.
      */
    val numberOfNodes: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The number of workers of a defined worker type that are allocated to this endpoint. This field is available only when you choose worker type G.1X or G.2X.
      */
    val numberOfWorkers: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * A private IP address to access the endpoint within a VPC, if this endpoint is created within one.
      */
    val privateAddress: Output_[String] = js.native
    
    /**
      * The public IP address used by this endpoint. The PublicAddress field is present only when you create a non-VPC endpoint.
      */
    val publicAddress: Output_[String] = js.native
    
    /**
      * The public key to be used by this endpoint for authentication.
      */
    val publicKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of public keys to be used by this endpoint for authentication.
      */
    val publicKeys: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The IAM role for this endpoint.
      */
    val roleArn: Output_[String] = js.native
    
    /**
      * The name of the Security Configuration structure to be used with this endpoint.
      */
    val securityConfiguration: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Security group IDs for the security groups to be used by this endpoint.
      */
    val securityGroupIds: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The current status of this endpoint.
      */
    val status: Output_[String] = js.native
    
    /**
      * The subnet ID for the new endpoint to use.
      */
    val subnetId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * he ID of the VPC used by this endpoint.
      */
    val vpcId: Output_[String] = js.native
    
    /**
      * The type of predefined worker that is allocated to this endpoint. Accepts a value of Standard, G.1X, or G.2X.
      */
    val workerType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The YARN endpoint address used by this endpoint.
      */
    val yarnEndpointAddress: Output_[String] = js.native
    
    /**
      * The Apache Zeppelin port for the remote Apache Spark interpreter.
      */
    val zeppelinRemoteSparkInterpreterPort: Output_[Double] = js.native
  }
  /* static members */
  object DevEndpoint {
    
    /**
      * Get an existing DevEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue/devEndpoint", "DevEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): DevEndpoint = js.native
    @JSImport("@pulumi/aws/glue/devEndpoint", "DevEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DevEndpoint = js.native
    @JSImport("@pulumi/aws/glue/devEndpoint", "DevEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: DevEndpointState): DevEndpoint = js.native
    @JSImport("@pulumi/aws/glue/devEndpoint", "DevEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: DevEndpointState, opts: CustomResourceOptions): DevEndpoint = js.native
    
    /**
      * Returns true if the given object is an instance of DevEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue/devEndpoint", "DevEndpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/devEndpoint.DevEndpoint */ Boolean = js.native
  }
  
  @js.native
  trait DevEndpointArgs extends StObject {
    
    /**
      * A map of arguments used to configure the endpoint.
      */
    val arguments: js.UndefOr[Input[StringDictionary[_]]] = js.native
    
    /**
      * Path to one or more Java Jars in an S3 bucket that should be loaded in this endpoint.
      */
    val extraJarsS3Path: js.UndefOr[Input[String]] = js.native
    
    /**
      * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in this endpoint. Multiple values must be complete paths separated by a comma.
      */
    val extraPythonLibsS3Path: js.UndefOr[Input[String]] = js.native
    
    /**
      * -  Specifies the versions of Python and Apache Spark to use. Defaults to AWS Glue version 0.9.
      */
    val glueVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of this endpoint. It must be unique in your account.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of AWS Glue Data Processing Units (DPUs) to allocate to this endpoint. Conflicts with `workerType`.
      */
    val numberOfNodes: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The number of workers of a defined worker type that are allocated to this endpoint. This field is available only when you choose worker type G.1X or G.2X.
      */
    val numberOfWorkers: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The public key to be used by this endpoint for authentication.
      */
    val publicKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of public keys to be used by this endpoint for authentication.
      */
    val publicKeys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The IAM role for this endpoint.
      */
    val roleArn: Input[String] = js.native
    
    /**
      * The name of the Security Configuration structure to be used with this endpoint.
      */
    val securityConfiguration: js.UndefOr[Input[String]] = js.native
    
    /**
      * Security group IDs for the security groups to be used by this endpoint.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The subnet ID for the new endpoint to use.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of predefined worker that is allocated to this endpoint. Accepts a value of Standard, G.1X, or G.2X.
      */
    val workerType: js.UndefOr[Input[String]] = js.native
  }
  object DevEndpointArgs {
    
    @scala.inline
    def apply(roleArn: Input[String]): DevEndpointArgs = {
      val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DevEndpointArgs]
    }
    
    @scala.inline
    implicit class DevEndpointArgsMutableBuilder[Self <: DevEndpointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: Input[StringDictionary[_]]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setExtraJarsS3Path(value: Input[String]): Self = StObject.set(x, "extraJarsS3Path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraJarsS3PathUndefined: Self = StObject.set(x, "extraJarsS3Path", js.undefined)
      
      @scala.inline
      def setExtraPythonLibsS3Path(value: Input[String]): Self = StObject.set(x, "extraPythonLibsS3Path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraPythonLibsS3PathUndefined: Self = StObject.set(x, "extraPythonLibsS3Path", js.undefined)
      
      @scala.inline
      def setGlueVersion(value: Input[String]): Self = StObject.set(x, "glueVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlueVersionUndefined: Self = StObject.set(x, "glueVersion", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumberOfNodes(value: Input[Double]): Self = StObject.set(x, "numberOfNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfNodesUndefined: Self = StObject.set(x, "numberOfNodes", js.undefined)
      
      @scala.inline
      def setNumberOfWorkers(value: Input[Double]): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfWorkersUndefined: Self = StObject.set(x, "numberOfWorkers", js.undefined)
      
      @scala.inline
      def setPublicKey(value: Input[String]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      @scala.inline
      def setPublicKeys(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
      
      @scala.inline
      def setPublicKeysVarargs(value: Input[String]*): Self = StObject.set(x, "publicKeys", js.Array(value :_*))
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityConfiguration(value: Input[String]): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setWorkerType(value: Input[String]): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
    }
  }
  
  @js.native
  trait DevEndpointState extends StObject {
    
    /**
      * A map of arguments used to configure the endpoint.
      */
    val arguments: js.UndefOr[Input[StringDictionary[_]]] = js.native
    
    /**
      * The ARN of the endpoint.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AWS availability zone where this endpoint is located.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * Path to one or more Java Jars in an S3 bucket that should be loaded in this endpoint.
      */
    val extraJarsS3Path: js.UndefOr[Input[String]] = js.native
    
    /**
      * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in this endpoint. Multiple values must be complete paths separated by a comma.
      */
    val extraPythonLibsS3Path: js.UndefOr[Input[String]] = js.native
    
    /**
      * The reason for a current failure in this endpoint.
      */
    val failureReason: js.UndefOr[Input[String]] = js.native
    
    /**
      * -  Specifies the versions of Python and Apache Spark to use. Defaults to AWS Glue version 0.9.
      */
    val glueVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of this endpoint. It must be unique in your account.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of AWS Glue Data Processing Units (DPUs) to allocate to this endpoint. Conflicts with `workerType`.
      */
    val numberOfNodes: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The number of workers of a defined worker type that are allocated to this endpoint. This field is available only when you choose worker type G.1X or G.2X.
      */
    val numberOfWorkers: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A private IP address to access the endpoint within a VPC, if this endpoint is created within one.
      */
    val privateAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The public IP address used by this endpoint. The PublicAddress field is present only when you create a non-VPC endpoint.
      */
    val publicAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The public key to be used by this endpoint for authentication.
      */
    val publicKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of public keys to be used by this endpoint for authentication.
      */
    val publicKeys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The IAM role for this endpoint.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Security Configuration structure to be used with this endpoint.
      */
    val securityConfiguration: js.UndefOr[Input[String]] = js.native
    
    /**
      * Security group IDs for the security groups to be used by this endpoint.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The current status of this endpoint.
      */
    val status: js.UndefOr[Input[String]] = js.native
    
    /**
      * The subnet ID for the new endpoint to use.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * he ID of the VPC used by this endpoint.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of predefined worker that is allocated to this endpoint. Accepts a value of Standard, G.1X, or G.2X.
      */
    val workerType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The YARN endpoint address used by this endpoint.
      */
    val yarnEndpointAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Apache Zeppelin port for the remote Apache Spark interpreter.
      */
    val zeppelinRemoteSparkInterpreterPort: js.UndefOr[Input[Double]] = js.native
  }
  object DevEndpointState {
    
    @scala.inline
    def apply(): DevEndpointState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DevEndpointState]
    }
    
    @scala.inline
    implicit class DevEndpointStateMutableBuilder[Self <: DevEndpointState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: Input[StringDictionary[_]]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setExtraJarsS3Path(value: Input[String]): Self = StObject.set(x, "extraJarsS3Path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraJarsS3PathUndefined: Self = StObject.set(x, "extraJarsS3Path", js.undefined)
      
      @scala.inline
      def setExtraPythonLibsS3Path(value: Input[String]): Self = StObject.set(x, "extraPythonLibsS3Path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraPythonLibsS3PathUndefined: Self = StObject.set(x, "extraPythonLibsS3Path", js.undefined)
      
      @scala.inline
      def setFailureReason(value: Input[String]): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
      
      @scala.inline
      def setGlueVersion(value: Input[String]): Self = StObject.set(x, "glueVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlueVersionUndefined: Self = StObject.set(x, "glueVersion", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumberOfNodes(value: Input[Double]): Self = StObject.set(x, "numberOfNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfNodesUndefined: Self = StObject.set(x, "numberOfNodes", js.undefined)
      
      @scala.inline
      def setNumberOfWorkers(value: Input[Double]): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfWorkersUndefined: Self = StObject.set(x, "numberOfWorkers", js.undefined)
      
      @scala.inline
      def setPrivateAddress(value: Input[String]): Self = StObject.set(x, "privateAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateAddressUndefined: Self = StObject.set(x, "privateAddress", js.undefined)
      
      @scala.inline
      def setPublicAddress(value: Input[String]): Self = StObject.set(x, "publicAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicAddressUndefined: Self = StObject.set(x, "publicAddress", js.undefined)
      
      @scala.inline
      def setPublicKey(value: Input[String]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      @scala.inline
      def setPublicKeys(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
      
      @scala.inline
      def setPublicKeysVarargs(value: Input[String]*): Self = StObject.set(x, "publicKeys", js.Array(value :_*))
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setSecurityConfiguration(value: Input[String]): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      @scala.inline
      def setWorkerType(value: Input[String]): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
      
      @scala.inline
      def setYarnEndpointAddress(value: Input[String]): Self = StObject.set(x, "yarnEndpointAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYarnEndpointAddressUndefined: Self = StObject.set(x, "yarnEndpointAddress", js.undefined)
      
      @scala.inline
      def setZeppelinRemoteSparkInterpreterPort(value: Input[Double]): Self = StObject.set(x, "zeppelinRemoteSparkInterpreterPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeppelinRemoteSparkInterpreterPortUndefined: Self = StObject.set(x, "zeppelinRemoteSparkInterpreterPort", js.undefined)
    }
  }
}
