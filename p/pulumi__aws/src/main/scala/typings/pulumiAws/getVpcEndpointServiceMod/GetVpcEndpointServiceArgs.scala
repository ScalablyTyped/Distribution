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
    * A mapping of tags, each pair of which must exactly match a pair on the desired VPC Endpoint Service.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetVpcEndpointServiceArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetVpcEndpointServiceFilter] = null,
    service: String = null,
    serviceName: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetVpcEndpointServiceArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcEndpointServiceArgs]
  }
}

