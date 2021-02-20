package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetSubnetFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSubnetMod {
  
  @JSImport("@pulumi/aws/ec2/getSubnet", "getSubnet")
  @js.native
  def getSubnet(): js.Promise[GetSubnetResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSubnet", "getSubnet")
  @js.native
  def getSubnet(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSubnetResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSubnet", "getSubnet")
  @js.native
  def getSubnet(args: GetSubnetArgs): js.Promise[GetSubnetResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSubnet", "getSubnet")
  @js.native
  def getSubnet(args: GetSubnetArgs, opts: InvokeOptions): js.Promise[GetSubnetResult] = js.native
  
  @js.native
  trait GetSubnetArgs extends StObject {
    
    /**
      * The availability zone where the
      * subnet must reside.
      */
    val availabilityZone: js.UndefOr[String] = js.native
    
    /**
      * The ID of the Availability Zone for the subnet.
      */
    val availabilityZoneId: js.UndefOr[String] = js.native
    
    /**
      * The cidr block of the desired subnet.
      */
    val cidrBlock: js.UndefOr[String] = js.native
    
    /**
      * Boolean constraint for whether the desired
      * subnet must be the default subnet for its associated availability zone.
      */
    val defaultForAz: js.UndefOr[Boolean] = js.native
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetSubnetFilter]] = js.native
    
    /**
      * The id of the specific subnet to retrieve.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The Ipv6 cidr block of the desired subnet
      */
    val ipv6CidrBlock: js.UndefOr[String] = js.native
    
    /**
      * The state that the desired subnet must have.
      */
    val state: js.UndefOr[String] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired subnet.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The id of the VPC that the desired subnet belongs to.
      */
    val vpcId: js.UndefOr[String] = js.native
  }
  object GetSubnetArgs {
    
    @scala.inline
    def apply(): GetSubnetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSubnetArgs]
    }
    
    @scala.inline
    implicit class GetSubnetArgsMutableBuilder[Self <: GetSubnetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "availabilityZoneId", js.undefined)
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      @scala.inline
      def setDefaultForAz(value: Boolean): Self = StObject.set(x, "defaultForAz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultForAzUndefined: Self = StObject.set(x, "defaultForAz", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[GetSubnetFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetSubnetFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIpv6CidrBlock(value: String): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
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
  trait GetSubnetResult extends StObject {
    
    /**
      * The ARN of the subnet.
      */
    val arn: String = js.native
    
    val assignIpv6AddressOnCreation: Boolean = js.native
    
    val availabilityZone: String = js.native
    
    val availabilityZoneId: String = js.native
    
    val cidrBlock: String = js.native
    
    val defaultForAz: Boolean = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetSubnetFilter]] = js.native
    
    val id: String = js.native
    
    val ipv6CidrBlock: String = js.native
    
    val ipv6CidrBlockAssociationId: String = js.native
    
    val mapPublicIpOnLaunch: Boolean = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Outpost.
      */
    val outpostArn: String = js.native
    
    /**
      * The ID of the AWS account that owns the subnet.
      */
    val ownerId: String = js.native
    
    val state: String = js.native
    
    val tags: StringDictionary[String] = js.native
    
    val vpcId: String = js.native
  }
  object GetSubnetResult {
    
    @scala.inline
    def apply(
      arn: String,
      assignIpv6AddressOnCreation: Boolean,
      availabilityZone: String,
      availabilityZoneId: String,
      cidrBlock: String,
      defaultForAz: Boolean,
      id: String,
      ipv6CidrBlock: String,
      ipv6CidrBlockAssociationId: String,
      mapPublicIpOnLaunch: Boolean,
      outpostArn: String,
      ownerId: String,
      state: String,
      tags: StringDictionary[String],
      vpcId: String
    ): GetSubnetResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assignIpv6AddressOnCreation = assignIpv6AddressOnCreation.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], availabilityZoneId = availabilityZoneId.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], defaultForAz = defaultForAz.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipv6CidrBlock = ipv6CidrBlock.asInstanceOf[js.Any], ipv6CidrBlockAssociationId = ipv6CidrBlockAssociationId.asInstanceOf[js.Any], mapPublicIpOnLaunch = mapPublicIpOnLaunch.asInstanceOf[js.Any], outpostArn = outpostArn.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSubnetResult]
    }
    
    @scala.inline
    implicit class GetSubnetResultMutableBuilder[Self <: GetSubnetResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignIpv6AddressOnCreation(value: Boolean): Self = StObject.set(x, "assignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultForAz(value: Boolean): Self = StObject.set(x, "defaultForAz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetSubnetFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetSubnetFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlock(value: String): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlockAssociationId(value: String): Self = StObject.set(x, "ipv6CidrBlockAssociationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapPublicIpOnLaunch(value: Boolean): Self = StObject.set(x, "mapPublicIpOnLaunch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArn(value: String): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
