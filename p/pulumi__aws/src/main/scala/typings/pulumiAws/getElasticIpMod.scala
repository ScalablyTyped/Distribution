package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.GetElasticIpFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getElasticIpMod {
  
  @JSImport("@pulumi/aws/getElasticIp", "getElasticIp")
  @js.native
  def getElasticIp(): js.Promise[GetElasticIpResult] = js.native
  @JSImport("@pulumi/aws/getElasticIp", "getElasticIp")
  @js.native
  def getElasticIp(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetElasticIpResult] = js.native
  @JSImport("@pulumi/aws/getElasticIp", "getElasticIp")
  @js.native
  def getElasticIp(args: GetElasticIpArgs): js.Promise[GetElasticIpResult] = js.native
  @JSImport("@pulumi/aws/getElasticIp", "getElasticIp")
  @js.native
  def getElasticIp(args: GetElasticIpArgs, opts: InvokeOptions): js.Promise[GetElasticIpResult] = js.native
  
  @js.native
  trait GetElasticIpArgs extends StObject {
    
    /**
      * One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html).
      */
    val filters: js.UndefOr[js.Array[GetElasticIpFilter]] = js.native
    
    /**
      * The allocation id of the specific VPC EIP to retrieve. If a classic EIP is required, do NOT set `id`, only set `publicIp`
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The public IP of the specific EIP to retrieve.
      */
    val publicIp: js.UndefOr[String] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match a pair on the desired Elastic IP
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetElasticIpArgs {
    
    @scala.inline
    def apply(): GetElasticIpArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetElasticIpArgs]
    }
    
    @scala.inline
    implicit class GetElasticIpArgsMutableBuilder[Self <: GetElasticIpArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetElasticIpFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetElasticIpFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setPublicIp(value: String): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetElasticIpResult extends StObject {
    
    /**
      * The ID representing the association of the address with an instance in a VPC.
      */
    val associationId: String = js.native
    
    /**
      * Customer Owned IP.
      */
    val customerOwnedIp: String = js.native
    
    /**
      * The ID of a Customer Owned IP Pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
      */
    val customerOwnedIpv4Pool: String = js.native
    
    /**
      * Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).
      */
    val domain: String = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.GetElasticIpFilter]] = js.native
    
    /**
      * If VPC Elastic IP, the allocation identifier. If EC2-Classic Elastic IP, the public IP address.
      */
    val id: String = js.native
    
    /**
      * The ID of the instance that the address is associated with (if any).
      */
    val instanceId: String = js.native
    
    /**
      * The ID of the network interface.
      */
    val networkInterfaceId: String = js.native
    
    /**
      * The ID of the AWS account that owns the network interface.
      */
    val networkInterfaceOwnerId: String = js.native
    
    /**
      * The Private DNS associated with the Elastic IP address.
      */
    val privateDns: String = js.native
    
    /**
      * The private IP address associated with the Elastic IP address.
      */
    val privateIp: String = js.native
    
    /**
      * Public DNS associated with the Elastic IP address.
      */
    val publicDns: String = js.native
    
    /**
      * Public IP address of Elastic IP.
      */
    val publicIp: String = js.native
    
    /**
      * The ID of an address pool.
      */
    val publicIpv4Pool: String = js.native
    
    /**
      * Key-value map of tags associated with Elastic IP.
      */
    val tags: StringDictionary[String] = js.native
  }
  object GetElasticIpResult {
    
    @scala.inline
    def apply(
      associationId: String,
      customerOwnedIp: String,
      customerOwnedIpv4Pool: String,
      domain: String,
      id: String,
      instanceId: String,
      networkInterfaceId: String,
      networkInterfaceOwnerId: String,
      privateDns: String,
      privateIp: String,
      publicDns: String,
      publicIp: String,
      publicIpv4Pool: String,
      tags: StringDictionary[String]
    ): GetElasticIpResult = {
      val __obj = js.Dynamic.literal(associationId = associationId.asInstanceOf[js.Any], customerOwnedIp = customerOwnedIp.asInstanceOf[js.Any], customerOwnedIpv4Pool = customerOwnedIpv4Pool.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], networkInterfaceOwnerId = networkInterfaceOwnerId.asInstanceOf[js.Any], privateDns = privateDns.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicDns = publicDns.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], publicIpv4Pool = publicIpv4Pool.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetElasticIpResult]
    }
    
    @scala.inline
    implicit class GetElasticIpResultMutableBuilder[Self <: GetElasticIpResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssociationId(value: String): Self = StObject.set(x, "associationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerOwnedIp(value: String): Self = StObject.set(x, "customerOwnedIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerOwnedIpv4Pool(value: String): Self = StObject.set(x, "customerOwnedIpv4Pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.GetElasticIpFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.GetElasticIpFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceOwnerId(value: String): Self = StObject.set(x, "networkInterfaceOwnerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateDns(value: String): Self = StObject.set(x, "privateDns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIp(value: String): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicDns(value: String): Self = StObject.set(x, "publicDns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIp(value: String): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIpv4Pool(value: String): Self = StObject.set(x, "publicIpv4Pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
