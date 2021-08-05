package typings.pulumiAws

import typings.pulumiAws.outputMod.cloudhsmv2.GetClusterClusterCertificates
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getClusterMod {
  
  @JSImport("@pulumi/aws/cloudhsmv2/getCluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetClusterResult]]
  inline def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetClusterResult]]
  
  trait GetClusterArgs extends StObject {
    
    /**
      * The id of Cloud HSM v2 cluster.
      */
    val clusterId: String
    
    /**
      * The state of the cluster to be found.
      */
    val clusterState: js.UndefOr[String] = js.undefined
  }
  object GetClusterArgs {
    
    inline def apply(clusterId: String): GetClusterArgs = {
      val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterArgs]
    }
    
    extension [Self <: GetClusterArgs](x: Self) {
      
      inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      inline def setClusterState(value: String): Self = StObject.set(x, "clusterState", value.asInstanceOf[js.Any])
      
      inline def setClusterStateUndefined: Self = StObject.set(x, "clusterState", js.undefined)
    }
  }
  
  trait GetClusterResult extends StObject {
    
    /**
      * The list of cluster certificates.
      * * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
      * * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in UNINITIALIZED state.
      * * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
      * * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
      * * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
      * The number of available cluster certificates may vary depending on state of the cluster.
      */
    val clusterCertificates: GetClusterClusterCertificates
    
    val clusterId: String
    
    val clusterState: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The ID of the security group associated with the CloudHSM cluster.
      */
    val securityGroupId: String
    
    /**
      * The IDs of subnets in which cluster operates.
      */
    val subnetIds: js.Array[String]
    
    /**
      * The id of the VPC that the CloudHSM cluster resides in.
      */
    val vpcId: String
  }
  object GetClusterResult {
    
    inline def apply(
      clusterCertificates: GetClusterClusterCertificates,
      clusterId: String,
      clusterState: String,
      id: String,
      securityGroupId: String,
      subnetIds: js.Array[String],
      vpcId: String
    ): GetClusterResult = {
      val __obj = js.Dynamic.literal(clusterCertificates = clusterCertificates.asInstanceOf[js.Any], clusterId = clusterId.asInstanceOf[js.Any], clusterState = clusterState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterResult]
    }
    
    extension [Self <: GetClusterResult](x: Self) {
      
      inline def setClusterCertificates(value: GetClusterClusterCertificates): Self = StObject.set(x, "clusterCertificates", value.asInstanceOf[js.Any])
      
      inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      inline def setClusterState(value: String): Self = StObject.set(x, "clusterState", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupId(value: String): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
