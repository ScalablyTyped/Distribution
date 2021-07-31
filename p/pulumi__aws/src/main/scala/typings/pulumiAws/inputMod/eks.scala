package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eks {
  
  trait ClusterCertificateAuthority extends StObject {
    
    /**
      * The base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
      */
    var data: js.UndefOr[Input[String]] = js.undefined
  }
  object ClusterCertificateAuthority {
    
    @scala.inline
    def apply(): ClusterCertificateAuthority = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterCertificateAuthority]
    }
    
    @scala.inline
    implicit class ClusterCertificateAuthorityMutableBuilder[Self <: ClusterCertificateAuthority] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Input[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  trait ClusterEncryptionConfig extends StObject {
    
    /**
      * Configuration block with provider for encryption. Detailed below.
      */
    var provider: Input[ClusterEncryptionConfigProvider]
    
    /**
      * List of strings with resources to be encrypted. Valid values: `secrets`
      */
    var resources: Input[js.Array[Input[String]]]
  }
  object ClusterEncryptionConfig {
    
    @scala.inline
    def apply(provider: Input[ClusterEncryptionConfigProvider], resources: Input[js.Array[Input[String]]]): ClusterEncryptionConfig = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterEncryptionConfig]
    }
    
    @scala.inline
    implicit class ClusterEncryptionConfigMutableBuilder[Self <: ClusterEncryptionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: Input[ClusterEncryptionConfigProvider]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: Input[String]*): Self = StObject.set(x, "resources", js.Array(value :_*))
    }
  }
  
  trait ClusterEncryptionConfigProvider extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the Key Management Service (KMS) customer master key (CMK). The CMK must be symmetric, created in the same region as the cluster, and if the CMK was created in a different account, the user must have access to the CMK. For more information, see [Allowing Users in Other Accounts to Use a CMK in the AWS Key Management Service Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html).
      */
    var keyArn: Input[String]
  }
  object ClusterEncryptionConfigProvider {
    
    @scala.inline
    def apply(keyArn: Input[String]): ClusterEncryptionConfigProvider = {
      val __obj = js.Dynamic.literal(keyArn = keyArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterEncryptionConfigProvider]
    }
    
    @scala.inline
    implicit class ClusterEncryptionConfigProviderMutableBuilder[Self <: ClusterEncryptionConfigProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyArn(value: Input[String]): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClusterIdentity extends StObject {
    
    /**
      * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
      */
    var oidcs: js.UndefOr[Input[js.Array[Input[ClusterIdentityOidc]]]] = js.undefined
  }
  object ClusterIdentity {
    
    @scala.inline
    def apply(): ClusterIdentity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterIdentity]
    }
    
    @scala.inline
    implicit class ClusterIdentityMutableBuilder[Self <: ClusterIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOidcs(value: Input[js.Array[Input[ClusterIdentityOidc]]]): Self = StObject.set(x, "oidcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOidcsUndefined: Self = StObject.set(x, "oidcs", js.undefined)
      
      @scala.inline
      def setOidcsVarargs(value: Input[ClusterIdentityOidc]*): Self = StObject.set(x, "oidcs", js.Array(value :_*))
    }
  }
  
  trait ClusterIdentityOidc extends StObject {
    
    /**
      * Issuer URL for the OpenID Connect identity provider.
      */
    var issuer: js.UndefOr[Input[String]] = js.undefined
  }
  object ClusterIdentityOidc {
    
    @scala.inline
    def apply(): ClusterIdentityOidc = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterIdentityOidc]
    }
    
    @scala.inline
    implicit class ClusterIdentityOidcMutableBuilder[Self <: ClusterIdentityOidc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIssuer(value: Input[String]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    }
  }
  
  trait ClusterVpcConfig extends StObject {
    
    /**
      * The cluster security group that was created by Amazon EKS for the cluster.
      */
    var clusterSecurityGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether or not the Amazon EKS private API server endpoint is enabled. Default is `false`.
      */
    var endpointPrivateAccess: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Indicates whether or not the Amazon EKS public API server endpoint is enabled. Default is `true`.
      */
    var endpointPublicAccess: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
      */
    var publicAccessCidrs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
      */
    var securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
      */
    var subnetIds: Input[js.Array[Input[String]]]
    
    /**
      * The VPC associated with your cluster.
      */
    var vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object ClusterVpcConfig {
    
    @scala.inline
    def apply(subnetIds: Input[js.Array[Input[String]]]): ClusterVpcConfig = {
      val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterVpcConfig]
    }
    
    @scala.inline
    implicit class ClusterVpcConfigMutableBuilder[Self <: ClusterVpcConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterSecurityGroupId(value: Input[String]): Self = StObject.set(x, "clusterSecurityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterSecurityGroupIdUndefined: Self = StObject.set(x, "clusterSecurityGroupId", js.undefined)
      
      @scala.inline
      def setEndpointPrivateAccess(value: Input[Boolean]): Self = StObject.set(x, "endpointPrivateAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointPrivateAccessUndefined: Self = StObject.set(x, "endpointPrivateAccess", js.undefined)
      
      @scala.inline
      def setEndpointPublicAccess(value: Input[Boolean]): Self = StObject.set(x, "endpointPublicAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointPublicAccessUndefined: Self = StObject.set(x, "endpointPublicAccess", js.undefined)
      
      @scala.inline
      def setPublicAccessCidrs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "publicAccessCidrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicAccessCidrsUndefined: Self = StObject.set(x, "publicAccessCidrs", js.undefined)
      
      @scala.inline
      def setPublicAccessCidrsVarargs(value: Input[String]*): Self = StObject.set(x, "publicAccessCidrs", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  trait FargateProfileSelector extends StObject {
    
    /**
      * Key-value map of Kubernetes labels for selection.
      */
    var labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Kubernetes namespace for selection.
      */
    var namespace: Input[String]
  }
  object FargateProfileSelector {
    
    @scala.inline
    def apply(namespace: Input[String]): FargateProfileSelector = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[FargateProfileSelector]
    }
    
    @scala.inline
    implicit class FargateProfileSelectorMutableBuilder[Self <: FargateProfileSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeGroupLaunchTemplate extends StObject {
    
    /**
      * Identifier of the EC2 Launch Template. Conflicts with `name`.
      */
    var id: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the EC2 Launch Template. Conflicts with `id`.
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    var version: Input[String]
  }
  object NodeGroupLaunchTemplate {
    
    @scala.inline
    def apply(version: Input[String]): NodeGroupLaunchTemplate = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeGroupLaunchTemplate]
    }
    
    @scala.inline
    implicit class NodeGroupLaunchTemplateMutableBuilder[Self <: NodeGroupLaunchTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeGroupRemoteAccess extends StObject {
    
    /**
      * EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group. If you specify this configuration, but do not specify `sourceSecurityGroupIds` when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
      */
    var ec2SshKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes. If you specify `ec2SshKey`, but do not specify this configuration when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
      */
    var sourceSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object NodeGroupRemoteAccess {
    
    @scala.inline
    def apply(): NodeGroupRemoteAccess = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeGroupRemoteAccess]
    }
    
    @scala.inline
    implicit class NodeGroupRemoteAccessMutableBuilder[Self <: NodeGroupRemoteAccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEc2SshKey(value: Input[String]): Self = StObject.set(x, "ec2SshKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEc2SshKeyUndefined: Self = StObject.set(x, "ec2SshKey", js.undefined)
      
      @scala.inline
      def setSourceSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "sourceSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSecurityGroupIdsUndefined: Self = StObject.set(x, "sourceSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setSourceSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "sourceSecurityGroupIds", js.Array(value :_*))
    }
  }
  
  trait NodeGroupResource extends StObject {
    
    /**
      * List of objects containing information about AutoScaling Groups.
      */
    var autoscalingGroups: js.UndefOr[Input[js.Array[Input[NodeGroupResourceAutoscalingGroup]]]] = js.undefined
    
    /**
      * Identifier of the remote access EC2 Security Group.
      */
    var remoteAccessSecurityGroupId: js.UndefOr[Input[String]] = js.undefined
  }
  object NodeGroupResource {
    
    @scala.inline
    def apply(): NodeGroupResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeGroupResource]
    }
    
    @scala.inline
    implicit class NodeGroupResourceMutableBuilder[Self <: NodeGroupResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoscalingGroups(value: Input[js.Array[Input[NodeGroupResourceAutoscalingGroup]]]): Self = StObject.set(x, "autoscalingGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoscalingGroupsUndefined: Self = StObject.set(x, "autoscalingGroups", js.undefined)
      
      @scala.inline
      def setAutoscalingGroupsVarargs(value: Input[NodeGroupResourceAutoscalingGroup]*): Self = StObject.set(x, "autoscalingGroups", js.Array(value :_*))
      
      @scala.inline
      def setRemoteAccessSecurityGroupId(value: Input[String]): Self = StObject.set(x, "remoteAccessSecurityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAccessSecurityGroupIdUndefined: Self = StObject.set(x, "remoteAccessSecurityGroupId", js.undefined)
    }
  }
  
  trait NodeGroupResourceAutoscalingGroup extends StObject {
    
    /**
      * Name of the EC2 Launch Template. Conflicts with `id`.
      */
    var name: js.UndefOr[Input[String]] = js.undefined
  }
  object NodeGroupResourceAutoscalingGroup {
    
    @scala.inline
    def apply(): NodeGroupResourceAutoscalingGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeGroupResourceAutoscalingGroup]
    }
    
    @scala.inline
    implicit class NodeGroupResourceAutoscalingGroupMutableBuilder[Self <: NodeGroupResourceAutoscalingGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait NodeGroupScalingConfig extends StObject {
    
    /**
      * Desired number of worker nodes.
      */
    var desiredSize: Input[Double]
    
    /**
      * Maximum number of worker nodes.
      */
    var maxSize: Input[Double]
    
    /**
      * Minimum number of worker nodes.
      */
    var minSize: Input[Double]
  }
  object NodeGroupScalingConfig {
    
    @scala.inline
    def apply(desiredSize: Input[Double], maxSize: Input[Double], minSize: Input[Double]): NodeGroupScalingConfig = {
      val __obj = js.Dynamic.literal(desiredSize = desiredSize.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeGroupScalingConfig]
    }
    
    @scala.inline
    implicit class NodeGroupScalingConfigMutableBuilder[Self <: NodeGroupScalingConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesiredSize(value: Input[Double]): Self = StObject.set(x, "desiredSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSize(value: Input[Double]): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSize(value: Input[Double]): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    }
  }
}
