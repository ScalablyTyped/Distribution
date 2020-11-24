package typings.pulumiAws.getSubnetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetSubnetFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSubnetResult extends js.Object {
  
  /**
    * The ARN of the subnet.
    */
  val arn: String = js.native
  
  val assignIpv6AddressOnCreation: Boolean = js.native
  
  val availabilityZone: String = js.native
  
  val availabilityZoneId: String = js.native
  
  val cidrBlock: String = js.native
  
  val defaultForAz: Boolean = js.native
  
  val filters: js.UndefOr[js.Array[GetSubnetFilter]] = js.native
  
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
  implicit class GetSubnetResultOps[Self <: GetSubnetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignIpv6AddressOnCreation(value: Boolean): Self = this.set("assignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = this.set("availabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultForAz(value: Boolean): Self = this.set("defaultForAz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = this.set("ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlockAssociationId(value: String): Self = this.set("ipv6CidrBlockAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapPublicIpOnLaunch(value: Boolean): Self = this.set("mapPublicIpOnLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("outpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetSubnetFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetSubnetFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
