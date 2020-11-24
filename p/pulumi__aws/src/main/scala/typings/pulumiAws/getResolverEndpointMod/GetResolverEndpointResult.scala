package typings.pulumiAws.getResolverEndpointMod

import typings.pulumiAws.outputMod.route53.GetResolverEndpointFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverEndpointResult extends js.Object {
  
  val arn: String = js.native
  
  val direction: String = js.native
  
  val filters: js.UndefOr[js.Array[GetResolverEndpointFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val ipAddresses: js.Array[String] = js.native
  
  val name: String = js.native
  
  val resolverEndpointId: js.UndefOr[String] = js.native
  
  val status: String = js.native
  
  val vpcId: String = js.native
}
object GetResolverEndpointResult {
  
  @scala.inline
  def apply(
    arn: String,
    direction: String,
    id: String,
    ipAddresses: js.Array[String],
    name: String,
    status: String,
    vpcId: String
  ): GetResolverEndpointResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipAddresses = ipAddresses.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverEndpointResult]
  }
  
  @scala.inline
  implicit class GetResolverEndpointResultOps[Self <: GetResolverEndpointResult] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressesVarargs(value: String*): Self = this.set("ipAddresses", js.Array(value :_*))
    
    @scala.inline
    def setIpAddresses(value: js.Array[String]): Self = this.set("ipAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetResolverEndpointFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetResolverEndpointFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setResolverEndpointId(value: String): Self = this.set("resolverEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverEndpointId: Self = this.set("resolverEndpointId", js.undefined)
  }
}
