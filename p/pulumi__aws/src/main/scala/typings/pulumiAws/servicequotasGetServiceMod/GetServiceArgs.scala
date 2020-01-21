package typings.pulumiAws.servicequotasGetServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceArgs extends js.Object {
  /**
    * Service name to lookup within Service Quotas. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceName: String = js.native
}

object GetServiceArgs {
  @scala.inline
  def apply(serviceName: String): GetServiceArgs = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetServiceArgs]
  }
}

