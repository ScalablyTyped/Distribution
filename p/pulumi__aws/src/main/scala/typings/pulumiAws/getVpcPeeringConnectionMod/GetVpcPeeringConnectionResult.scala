package typings.pulumiAws.getVpcPeeringConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetVpcPeeringConnectionFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcPeeringConnectionResult extends js.Object {
  
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
    */
  val accepter: StringDictionary[Boolean] = js.native
  
  val cidrBlock: String = js.native
  
  val filters: js.UndefOr[js.Array[GetVpcPeeringConnectionFilter]] = js.native
  
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
  implicit class GetVpcPeeringConnectionResultOps[Self <: GetVpcPeeringConnectionResult] (val x: Self) extends AnyVal {
    
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
    def setAccepter(value: StringDictionary[Boolean]): Self = this.set("accepter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerCidrBlock(value: String): Self = this.set("peerCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerOwnerId(value: String): Self = this.set("peerOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerRegion(value: String): Self = this.set("peerRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerVpcId(value: String): Self = this.set("peerVpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequester(value: StringDictionary[Boolean]): Self = this.set("requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetVpcPeeringConnectionFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetVpcPeeringConnectionFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
