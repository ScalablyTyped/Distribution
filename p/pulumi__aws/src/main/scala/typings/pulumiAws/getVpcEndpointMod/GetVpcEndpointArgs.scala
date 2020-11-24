package typings.pulumiAws.getVpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcEndpointFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcEndpointArgs extends js.Object {
  
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcEndpointFilter]] = js.native
  
  /**
    * The ID of the specific VPC Endpoint to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The service name of the specific VPC Endpoint to retrieve. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
    */
  val serviceName: js.UndefOr[String] = js.native
  
  /**
    * The state of the specific VPC Endpoint to retrieve.
    */
  val state: js.UndefOr[String] = js.native
  
  /**
    * A map of tags, each pair of which must exactly match
    * a pair on the specific VPC Endpoint to retrieve.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The ID of the VPC in which the specific VPC Endpoint is used.
    */
  val vpcId: js.UndefOr[String] = js.native
}
object GetVpcEndpointArgs {
  
  @scala.inline
  def apply(): GetVpcEndpointArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcEndpointArgs]
  }
  
  @scala.inline
  implicit class GetVpcEndpointArgsOps[Self <: GetVpcEndpointArgs] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: GetVpcEndpointFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetVpcEndpointFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
