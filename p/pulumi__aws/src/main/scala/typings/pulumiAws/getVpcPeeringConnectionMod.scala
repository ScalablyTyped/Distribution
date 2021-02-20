package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcPeeringConnectionFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpcPeeringConnectionMod {
  
  @JSImport("@pulumi/aws/ec2/getVpcPeeringConnection", "getVpcPeeringConnection")
  @js.native
  def getVpcPeeringConnection(): js.Promise[GetVpcPeeringConnectionResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcPeeringConnection", "getVpcPeeringConnection")
  @js.native
  def getVpcPeeringConnection(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcPeeringConnectionResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcPeeringConnection", "getVpcPeeringConnection")
  @js.native
  def getVpcPeeringConnection(args: GetVpcPeeringConnectionArgs): js.Promise[GetVpcPeeringConnectionResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcPeeringConnection", "getVpcPeeringConnection")
  @js.native
  def getVpcPeeringConnection(args: GetVpcPeeringConnectionArgs, opts: InvokeOptions): js.Promise[GetVpcPeeringConnectionResult] = js.native
  
  @js.native
  trait GetVpcPeeringConnectionArgs extends StObject {
    
    /**
      * The CIDR block of the requester VPC of the specific VPC Peering Connection to retrieve.
      */
    val cidrBlock: js.UndefOr[String] = js.native
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetVpcPeeringConnectionFilter]] = js.native
    
    /**
      * The ID of the specific VPC Peering Connection to retrieve.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The AWS account ID of the owner of the requester VPC of the specific VPC Peering Connection to retrieve.
      */
    val ownerId: js.UndefOr[String] = js.native
    
    /**
      * The CIDR block of the accepter VPC of the specific VPC Peering Connection to retrieve.
      */
    val peerCidrBlock: js.UndefOr[String] = js.native
    
    /**
      * The AWS account ID of the owner of the accepter VPC of the specific VPC Peering Connection to retrieve.
      */
    val peerOwnerId: js.UndefOr[String] = js.native
    
    /**
      * The region of the accepter VPC of the specific VPC Peering Connection to retrieve.
      */
    val peerRegion: js.UndefOr[String] = js.native
    
    /**
      * The ID of the accepter VPC of the specific VPC Peering Connection to retrieve.
      */
    val peerVpcId: js.UndefOr[String] = js.native
    
    /**
      * The region of the requester VPC of the specific VPC Peering Connection to retrieve.
      */
    val region: js.UndefOr[String] = js.native
    
    /**
      * The status of the specific VPC Peering Connection to retrieve.
      */
    val status: js.UndefOr[String] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired VPC Peering Connection.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The ID of the requester VPC of the specific VPC Peering Connection to retrieve.
      */
    val vpcId: js.UndefOr[String] = js.native
  }
  object GetVpcPeeringConnectionArgs {
    
    @scala.inline
    def apply(): GetVpcPeeringConnectionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpcPeeringConnectionArgs]
    }
    
    @scala.inline
    implicit class GetVpcPeeringConnectionArgsMutableBuilder[Self <: GetVpcPeeringConnectionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[GetVpcPeeringConnectionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetVpcPeeringConnectionFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setPeerCidrBlock(value: String): Self = StObject.set(x, "peerCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerCidrBlockUndefined: Self = StObject.set(x, "peerCidrBlock", js.undefined)
      
      @scala.inline
      def setPeerOwnerId(value: String): Self = StObject.set(x, "peerOwnerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerOwnerIdUndefined: Self = StObject.set(x, "peerOwnerId", js.undefined)
      
      @scala.inline
      def setPeerRegion(value: String): Self = StObject.set(x, "peerRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerRegionUndefined: Self = StObject.set(x, "peerRegion", js.undefined)
      
      @scala.inline
      def setPeerVpcId(value: String): Self = StObject.set(x, "peerVpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerVpcIdUndefined: Self = StObject.set(x, "peerVpcId", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  @js.native
  trait GetVpcPeeringConnectionResult extends StObject {
    
    /**
      * A configuration block that describes [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
      */
    val accepter: StringDictionary[Boolean] = js.native
    
    val cidrBlock: String = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetVpcPeeringConnectionFilter]] = js.native
    
    val id: String = js.native
    
    val ownerId: String = js.native
    
    val peerCidrBlock: String = js.native
    
    val peerOwnerId: String = js.native
    
    val peerRegion: String = js.native
    
    val peerVpcId: String = js.native
    
    val region: String = js.native
    
    /**
      * A configuration block that describes [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
      */
    val requester: StringDictionary[Boolean] = js.native
    
    val status: String = js.native
    
    val tags: StringDictionary[String] = js.native
    
    val vpcId: String = js.native
  }
  object GetVpcPeeringConnectionResult {
    
    @scala.inline
    def apply(
      accepter: StringDictionary[Boolean],
      cidrBlock: String,
      id: String,
      ownerId: String,
      peerCidrBlock: String,
      peerOwnerId: String,
      peerRegion: String,
      peerVpcId: String,
      region: String,
      requester: StringDictionary[Boolean],
      status: String,
      tags: StringDictionary[String],
      vpcId: String
    ): GetVpcPeeringConnectionResult = {
      val __obj = js.Dynamic.literal(accepter = accepter.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], peerCidrBlock = peerCidrBlock.asInstanceOf[js.Any], peerOwnerId = peerOwnerId.asInstanceOf[js.Any], peerRegion = peerRegion.asInstanceOf[js.Any], peerVpcId = peerVpcId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], requester = requester.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcPeeringConnectionResult]
    }
    
    @scala.inline
    implicit class GetVpcPeeringConnectionResultMutableBuilder[Self <: GetVpcPeeringConnectionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepter(value: StringDictionary[Boolean]): Self = StObject.set(x, "accepter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetVpcPeeringConnectionFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetVpcPeeringConnectionFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerCidrBlock(value: String): Self = StObject.set(x, "peerCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerOwnerId(value: String): Self = StObject.set(x, "peerOwnerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerRegion(value: String): Self = StObject.set(x, "peerRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerVpcId(value: String): Self = StObject.set(x, "peerVpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequester(value: StringDictionary[Boolean]): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
