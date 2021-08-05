package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetSubnetFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSubnetMod {
  
  @JSImport("@pulumi/aws/ec2/getSubnet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSubnet(): js.Promise[GetSubnetResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubnet")().asInstanceOf[js.Promise[GetSubnetResult]]
  inline def getSubnet(args: Unit, opts: InvokeOptions): js.Promise[GetSubnetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubnet")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSubnetResult]]
  inline def getSubnet(args: GetSubnetArgs): js.Promise[GetSubnetResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubnet")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSubnetResult]]
  inline def getSubnet(args: GetSubnetArgs, opts: InvokeOptions): js.Promise[GetSubnetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubnet")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSubnetResult]]
  
  trait GetSubnetArgs extends StObject {
    
    /**
      * The availability zone where the
      * subnet must reside.
      */
    val availabilityZone: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the Availability Zone for the subnet.
      */
    val availabilityZoneId: js.UndefOr[String] = js.undefined
    
    /**
      * The cidr block of the desired subnet.
      */
    val cidrBlock: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean constraint for whether the desired
      * subnet must be the default subnet for its associated availability zone.
      */
    val defaultForAz: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetSubnetFilter]] = js.undefined
    
    /**
      * The id of the specific subnet to retrieve.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * The Ipv6 cidr block of the desired subnet
      */
    val ipv6CidrBlock: js.UndefOr[String] = js.undefined
    
    /**
      * The state that the desired subnet must have.
      */
    val state: js.UndefOr[String] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired subnet.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The id of the VPC that the desired subnet belongs to.
      */
    val vpcId: js.UndefOr[String] = js.undefined
  }
  object GetSubnetArgs {
    
    inline def apply(): GetSubnetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSubnetArgs]
    }
    
    extension [Self <: GetSubnetArgs](x: Self) {
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "availabilityZoneId", js.undefined)
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      inline def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      inline def setDefaultForAz(value: Boolean): Self = StObject.set(x, "defaultForAz", value.asInstanceOf[js.Any])
      
      inline def setDefaultForAzUndefined: Self = StObject.set(x, "defaultForAz", js.undefined)
      
      inline def setFilters(value: js.Array[GetSubnetFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetSubnetFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIpv6CidrBlock(value: String): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
      
      inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  trait GetSubnetResult extends StObject {
    
    /**
      * The ARN of the subnet.
      */
    val arn: String
    
    val assignIpv6AddressOnCreation: Boolean
    
    val availabilityZone: String
    
    val availabilityZoneId: String
    
    val cidrBlock: String
    
    val defaultForAz: Boolean
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetSubnetFilter]] = js.undefined
    
    val id: String
    
    val ipv6CidrBlock: String
    
    val ipv6CidrBlockAssociationId: String
    
    val mapPublicIpOnLaunch: Boolean
    
    /**
      * The Amazon Resource Name (ARN) of the Outpost.
      */
    val outpostArn: String
    
    /**
      * The ID of the AWS account that owns the subnet.
      */
    val ownerId: String
    
    val state: String
    
    val tags: StringDictionary[String]
    
    val vpcId: String
  }
  object GetSubnetResult {
    
    inline def apply(
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
    
    extension [Self <: GetSubnetResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setAssignIpv6AddressOnCreation(value: Boolean): Self = StObject.set(x, "assignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneId(value: String): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      inline def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      inline def setDefaultForAz(value: Boolean): Self = StObject.set(x, "defaultForAz", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetSubnetFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetSubnetFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIpv6CidrBlock(value: String): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
      
      inline def setIpv6CidrBlockAssociationId(value: String): Self = StObject.set(x, "ipv6CidrBlockAssociationId", value.asInstanceOf[js.Any])
      
      inline def setMapPublicIpOnLaunch(value: Boolean): Self = StObject.set(x, "mapPublicIpOnLaunch", value.asInstanceOf[js.Any])
      
      inline def setOutpostArn(value: String): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
