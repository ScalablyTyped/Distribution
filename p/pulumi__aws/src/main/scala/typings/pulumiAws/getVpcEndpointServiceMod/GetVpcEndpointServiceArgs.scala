package typings.pulumiAws.getVpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcEndpointServiceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcEndpointServiceArgs extends js.Object {
  /**
    * Configuration block(s) for filtering. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetVpcEndpointServiceFilter]] = js.native
  /**
    * The common name of an AWS service (e.g. `s3`).
    */
  val service: js.UndefOr[String] = js.native
  /**
    * The service name that is specified when creating a VPC endpoint. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
    */
  val serviceName: js.UndefOr[String] = js.native
  /**
    * A map of tags, each pair of which must exactly match a pair on the desired VPC Endpoint Service.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetVpcEndpointServiceArgs {
  @scala.inline
  def apply(): GetVpcEndpointServiceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcEndpointServiceArgs]
  }
  @scala.inline
  implicit class GetVpcEndpointServiceArgsOps[Self <: GetVpcEndpointServiceArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetVpcEndpointServiceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetVpcEndpointServiceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

