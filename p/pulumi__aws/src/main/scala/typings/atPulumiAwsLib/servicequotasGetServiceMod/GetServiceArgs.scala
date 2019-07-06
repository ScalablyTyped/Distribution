package typings
package atPulumiAwsLib.servicequotasGetServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceArgs extends js.Object {
  /**
    * Service name to lookup within Service Quotas. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceName: java.lang.String
}

object GetServiceArgs {
  @scala.inline
  def apply(serviceName: java.lang.String): GetServiceArgs = {
    val __obj = js.Dynamic.literal(serviceName = serviceName)
  
    __obj.asInstanceOf[GetServiceArgs]
  }
}

