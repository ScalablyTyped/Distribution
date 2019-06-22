package typings
package atPulumiAwsLib.ec2GetVpcEndpointServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcEndpointServiceArgs extends js.Object {
  /**
    * The common name of an AWS service (e.g. `s3`).
    */
  val service: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The service name that can be specified when creating a VPC endpoint.
    */
  val serviceName: js.UndefOr[java.lang.String] = js.undefined
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetVpcEndpointServiceArgs {
  @scala.inline
  def apply(
    service: java.lang.String = null,
    serviceName: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetVpcEndpointServiceArgs = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetVpcEndpointServiceArgs]
  }
}

