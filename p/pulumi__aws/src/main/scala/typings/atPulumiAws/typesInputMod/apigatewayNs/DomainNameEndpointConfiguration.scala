package typings.atPulumiAws.typesInputMod.apigatewayNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainNameEndpointConfiguration extends js.Object {
  /**
    * A list of endpoint types. This resource currently only supports managing a single value. Valid values: `EDGE` or `REGIONAL`. If unspecified, defaults to `EDGE`. Must be declared as `REGIONAL` in non-Commercial partitions. Refer to the [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/create-regional-api.html) for more information on the difference between edge-optimized and regional APIs.
    */
  var types: Input[String]
}

object DomainNameEndpointConfiguration {
  @scala.inline
  def apply(types: Input[String]): DomainNameEndpointConfiguration = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainNameEndpointConfiguration]
  }
}

