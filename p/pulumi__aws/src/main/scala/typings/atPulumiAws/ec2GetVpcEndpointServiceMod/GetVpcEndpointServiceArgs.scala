package typings.atPulumiAws.ec2GetVpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcEndpointServiceArgs extends js.Object {
  /**
    * The common name of an AWS service (e.g. `s3`).
    */
  val service: js.UndefOr[String] = js.undefined
  /**
    * The service name that can be specified when creating a VPC endpoint.
    */
  val serviceName: js.UndefOr[String] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetVpcEndpointServiceArgs {
  @scala.inline
  def apply(service: String = null, serviceName: String = null, tags: StringDictionary[js.Any] = null): GetVpcEndpointServiceArgs = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetVpcEndpointServiceArgs]
  }
}

