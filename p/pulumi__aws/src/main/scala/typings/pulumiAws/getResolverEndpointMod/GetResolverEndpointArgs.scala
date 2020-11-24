package typings.pulumiAws.getResolverEndpointMod

import typings.pulumiAws.inputMod.route53.GetResolverEndpointFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverEndpointArgs extends js.Object {
  
  /**
    * One or more name/value pairs to use as filters. There are
    * several valid keys, for a full reference, check out
    * [Route53resolver Filter value in the AWS API reference][1].
    */
  val filters: js.UndefOr[js.Array[GetResolverEndpointFilter]] = js.native
  
  /**
    * The ID of the Route53 Resolver Endpoint.
    */
  val resolverEndpointId: js.UndefOr[String] = js.native
}
object GetResolverEndpointArgs {
  
  @scala.inline
  def apply(): GetResolverEndpointArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverEndpointArgs]
  }
  
  @scala.inline
  implicit class GetResolverEndpointArgsOps[Self <: GetResolverEndpointArgs] (val x: Self) extends AnyVal {
    
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
