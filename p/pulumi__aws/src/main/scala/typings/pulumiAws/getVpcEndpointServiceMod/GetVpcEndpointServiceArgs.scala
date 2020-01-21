package typings.pulumiAws.getVpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcEndpointServiceArgs extends js.Object {
  /**
    * The common name of an AWS service (e.g. `s3`).
    */
  val service: js.UndefOr[String] = js.native
  /**
    * The service name that can be specified when creating a VPC endpoint.
    */
  val serviceName: js.UndefOr[String] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetVpcEndpointServiceArgs {
  @scala.inline
  def apply(service: String = null, serviceName: String = null, tags: StringDictionary[js.Any] = null): GetVpcEndpointServiceArgs = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcEndpointServiceArgs]
  }
}

