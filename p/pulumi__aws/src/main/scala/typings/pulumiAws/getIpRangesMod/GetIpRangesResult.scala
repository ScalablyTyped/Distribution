package typings.pulumiAws.getIpRangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIpRangesResult extends js.Object {
  
  /**
    * The lexically ordered list of CIDR blocks.
    */
  val cidrBlocks: js.Array[String] = js.native
  
  /**
    * The publication time of the IP ranges (e.g. `2016-08-03-23-46-05`).
    */
  val createDate: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The lexically ordered list of IPv6 CIDR blocks.
    */
  val ipv6CidrBlocks: js.Array[String] = js.native
  
  val regions: js.UndefOr[js.Array[String]] = js.native
  
  val services: js.Array[String] = js.native
  
  /**
    * The publication time of the IP ranges, in Unix epoch time format
    * (e.g. `1470267965`).
    */
  val syncToken: Double = js.native
  
  val url: js.UndefOr[String] = js.native
}
object GetIpRangesResult {
  
  @scala.inline
  def apply(
    cidrBlocks: js.Array[String],
    createDate: String,
    id: String,
    ipv6CidrBlocks: js.Array[String],
    services: js.Array[String],
    syncToken: Double
  ): GetIpRangesResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipv6CidrBlocks = ipv6CidrBlocks.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], syncToken = syncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIpRangesResult]
  }
  
  @scala.inline
  implicit class GetIpRangesResultOps[Self <: GetIpRangesResult] (val x: Self) extends AnyVal {
    
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
    def setCidrBlocksVarargs(value: String*): Self = this.set("cidrBlocks", js.Array(value :_*))
    
    @scala.inline
    def setCidrBlocks(value: js.Array[String]): Self = this.set("cidrBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDate(value: String): Self = this.set("createDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlocksVarargs(value: String*): Self = this.set("ipv6CidrBlocks", js.Array(value :_*))
    
    @scala.inline
    def setIpv6CidrBlocks(value: js.Array[String]): Self = this.set("ipv6CidrBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesVarargs(value: String*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[String]): Self = this.set("services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncToken(value: Double): Self = this.set("syncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
