package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.cloudhsmv2.ClusterClusterCertificate
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterMod {
  
  @JSImport("@pulumi/aws/cloudhsmv2/cluster", "Cluster")
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
      * The list of cluster certificates.
      * * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
      * * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in `UNINITIALIZED` state after an HSM instance is added to the cluster.
      * * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
      * * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
      * * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
      */
    val clusterCertificates: Output_[js.Array[ClusterClusterCertificate]] = js.native
    
    /**
      * The id of the CloudHSM cluster.
      */
    val clusterId: Output_[String] = js.native
    
    /**
      * The state of the CloudHSM cluster.
      */
    val clusterState: Output_[String] = js.native
    
    /**
      * The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
      */
    val hsmType: Output_[String] = js.native
    
    /**
      * The ID of the security group associated with the CloudHSM cluster.
      */
    val securityGroupId: Output_[String] = js.native
    
    /**
      * The id of Cloud HSM v2 cluster backup to be restored.
      */
    val sourceBackupIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The IDs of subnets in which cluster will operate.
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The id of the VPC that the CloudHSM cluster resides in.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object Cluster {
    
    @JSImport("@pulumi/aws/cloudhsmv2/cluster", "Cluster")
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
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudhsmv2/cluster.Cluster */ Boolean]
  }
  
  trait ClusterArgs extends StObject {
    
    /**
      * The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
      */
    val hsmType: Input[String]
    
    /**
      * The id of Cloud HSM v2 cluster backup to be restored.
      */
    val sourceBackupIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IDs of subnets in which cluster will operate.
      */
    val subnetIds: Input[js.Array[Input[String]]]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ClusterArgs {
    
    @scala.inline
    def apply(hsmType: Input[String], subnetIds: Input[js.Array[Input[String]]]): ClusterArgs = {
      val __obj = js.Dynamic.literal(hsmType = hsmType.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterArgs]
    }
    
    @scala.inline
    implicit class ClusterArgsMutableBuilder[Self <: ClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHsmType(value: Input[String]): Self = StObject.set(x, "hsmType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceBackupIdentifier(value: Input[String]): Self = StObject.set(x, "sourceBackupIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceBackupIdentifierUndefined: Self = StObject.set(x, "sourceBackupIdentifier", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ClusterState extends StObject {
    
    /**
      * The list of cluster certificates.
      * * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
      * * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in `UNINITIALIZED` state after an HSM instance is added to the cluster.
      * * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
      * * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
      * * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
      */
    val clusterCertificates: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.cloudhsmv2.ClusterClusterCertificate]]]
      ] = js.undefined
    
    /**
      * The id of the CloudHSM cluster.
      */
    val clusterId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The state of the CloudHSM cluster.
      */
    val clusterState: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
      */
    val hsmType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the security group associated with the CloudHSM cluster.
      */
    val securityGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The id of Cloud HSM v2 cluster backup to be restored.
      */
    val sourceBackupIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IDs of subnets in which cluster will operate.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The id of the VPC that the CloudHSM cluster resides in.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
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
      def setClusterCertificates(value: Input[js.Array[Input[typings.pulumiAws.inputMod.cloudhsmv2.ClusterClusterCertificate]]]): Self = StObject.set(x, "clusterCertificates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterCertificatesUndefined: Self = StObject.set(x, "clusterCertificates", js.undefined)
      
      @scala.inline
      def setClusterCertificatesVarargs(value: Input[typings.pulumiAws.inputMod.cloudhsmv2.ClusterClusterCertificate]*): Self = StObject.set(x, "clusterCertificates", js.Array(value :_*))
      
      @scala.inline
      def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
      
      @scala.inline
      def setClusterState(value: Input[String]): Self = StObject.set(x, "clusterState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterStateUndefined: Self = StObject.set(x, "clusterState", js.undefined)
      
      @scala.inline
      def setHsmType(value: Input[String]): Self = StObject.set(x, "hsmType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsmTypeUndefined: Self = StObject.set(x, "hsmType", js.undefined)
      
      @scala.inline
      def setSecurityGroupId(value: Input[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdUndefined: Self = StObject.set(x, "securityGroupId", js.undefined)
      
      @scala.inline
      def setSourceBackupIdentifier(value: Input[String]): Self = StObject.set(x, "sourceBackupIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceBackupIdentifierUndefined: Self = StObject.set(x, "sourceBackupIdentifier", js.undefined)
      
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
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
