package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.eks.ClusterCertificateAuthority
import typings.pulumiAws.outputMod.eks.ClusterEncryptionConfig
import typings.pulumiAws.outputMod.eks.ClusterIdentity
import typings.pulumiAws.outputMod.eks.ClusterVpcConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eksClusterMod {
  
  @JSImport("@pulumi/aws/eks/cluster", "Cluster")
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
      * The Amazon Resource Name (ARN) of the cluster.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Nested attribute containing `certificate-authority-data` for your cluster.
      */
    val certificateAuthority: Output_[ClusterCertificateAuthority] = js.native
    
    val createdAt: Output_[String] = js.native
    
    /**
      * A list of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html)
      */
    val enabledClusterLogTypes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
      */
    val encryptionConfig: Output_[js.UndefOr[ClusterEncryptionConfig]] = js.native
    
    /**
      * The endpoint for your Kubernetes API server.
      */
    val endpoint: Output_[String] = js.native
    
    /**
      * Nested attribute containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019.
      */
    val identities: Output_[js.Array[ClusterIdentity]] = js.native
    
    /**
      * Name of the cluster.
      */
    val name: Output_[String] = js.native
    
    /**
      * The platform version for the cluster.
      */
    val platformVersion: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf. Ensure the resource configuration includes explicit dependencies on the IAM Role permissions by adding [`dependsOn`](https://www.pulumi.com/docs/intro/concepts/programming-model/#dependson) if using the `aws.iam.RolePolicy` resource) or `aws.iam.RolePolicyAttachment` resource, otherwise EKS cannot delete EKS managed EC2 infrastructure such as Security Groups on EKS Cluster deletion.
      */
    val roleArn: Output_[String] = js.native
    
    /**
      * The status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
      */
    val status: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
      */
    val version: Output_[String] = js.native
    
    /**
      * Nested argument for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Configuration detailed below.
      */
    val vpcConfig: Output_[ClusterVpcConfig] = js.native
  }
  /* static members */
  object Cluster {
    
    @JSImport("@pulumi/aws/eks/cluster", "Cluster")
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
    @scala.inline
    def get(name: String, id: Input[ID]): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Cluster]
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/eks/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/eks/cluster.Cluster */ Boolean]
  }
  
  trait ClusterArgs extends StObject {
    
    /**
      * A list of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html)
      */
    val enabledClusterLogTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
      */
    val encryptionConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.eks.ClusterEncryptionConfig]] = js.undefined
    
    /**
      * Name of the cluster.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf. Ensure the resource configuration includes explicit dependencies on the IAM Role permissions by adding [`dependsOn`](https://www.pulumi.com/docs/intro/concepts/programming-model/#dependson) if using the `aws.iam.RolePolicy` resource) or `aws.iam.RolePolicyAttachment` resource, otherwise EKS cannot delete EKS managed EC2 infrastructure such as Security Groups on EKS Cluster deletion.
      */
    val roleArn: Input[String]
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested argument for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Configuration detailed below.
      */
    val vpcConfig: Input[typings.pulumiAws.inputMod.eks.ClusterVpcConfig]
  }
  object ClusterArgs {
    
    @scala.inline
    def apply(roleArn: Input[String], vpcConfig: Input[typings.pulumiAws.inputMod.eks.ClusterVpcConfig]): ClusterArgs = {
      val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], vpcConfig = vpcConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterArgs]
    }
    
    @scala.inline
    implicit class ClusterArgsMutableBuilder[Self <: ClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabledClusterLogTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "enabledClusterLogTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledClusterLogTypesUndefined: Self = StObject.set(x, "enabledClusterLogTypes", js.undefined)
      
      @scala.inline
      def setEnabledClusterLogTypesVarargs(value: Input[String]*): Self = StObject.set(x, "enabledClusterLogTypes", js.Array(value :_*))
      
      @scala.inline
      def setEncryptionConfig(value: Input[typings.pulumiAws.inputMod.eks.ClusterEncryptionConfig]): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVpcConfig(value: Input[typings.pulumiAws.inputMod.eks.ClusterVpcConfig]): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClusterState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the cluster.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested attribute containing `certificate-authority-data` for your cluster.
      */
    val certificateAuthority: js.UndefOr[Input[typings.pulumiAws.inputMod.eks.ClusterCertificateAuthority]] = js.undefined
    
    val createdAt: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html)
      */
    val enabledClusterLogTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
      */
    val encryptionConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.eks.ClusterEncryptionConfig]] = js.undefined
    
    /**
      * The endpoint for your Kubernetes API server.
      */
    val endpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested attribute containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019.
      */
    val identities: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.eks.ClusterIdentity]]]] = js.undefined
    
    /**
      * Name of the cluster.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The platform version for the cluster.
      */
    val platformVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf. Ensure the resource configuration includes explicit dependencies on the IAM Role permissions by adding [`dependsOn`](https://www.pulumi.com/docs/intro/concepts/programming-model/#dependson) if using the `aws.iam.RolePolicy` resource) or `aws.iam.RolePolicyAttachment` resource, otherwise EKS cannot delete EKS managed EC2 infrastructure such as Security Groups on EKS Cluster deletion.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Nested argument for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Configuration detailed below.
      */
    val vpcConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.eks.ClusterVpcConfig]] = js.undefined
  }
  object ClusterState {
    
    @scala.inline
    def apply(): ClusterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterState]
    }
    
    @scala.inline
    implicit class ClusterStateMutableBuilder[Self <: ClusterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCertificateAuthority(value: Input[typings.pulumiAws.inputMod.eks.ClusterCertificateAuthority]): Self = StObject.set(x, "certificateAuthority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateAuthorityUndefined: Self = StObject.set(x, "certificateAuthority", js.undefined)
      
      @scala.inline
      def setCreatedAt(value: Input[String]): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      @scala.inline
      def setEnabledClusterLogTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "enabledClusterLogTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledClusterLogTypesUndefined: Self = StObject.set(x, "enabledClusterLogTypes", js.undefined)
      
      @scala.inline
      def setEnabledClusterLogTypesVarargs(value: Input[String]*): Self = StObject.set(x, "enabledClusterLogTypes", js.Array(value :_*))
      
      @scala.inline
      def setEncryptionConfig(value: Input[typings.pulumiAws.inputMod.eks.ClusterEncryptionConfig]): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setIdentities(value: Input[js.Array[Input[typings.pulumiAws.inputMod.eks.ClusterIdentity]]]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
      
      @scala.inline
      def setIdentitiesVarargs(value: Input[typings.pulumiAws.inputMod.eks.ClusterIdentity]*): Self = StObject.set(x, "identities", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlatformVersion(value: Input[String]): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVpcConfig(value: Input[typings.pulumiAws.inputMod.eks.ClusterVpcConfig]): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
    }
  }
}
