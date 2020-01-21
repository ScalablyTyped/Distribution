package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecServiceDiscoveryAwsCloudMap extends js.Object {
  /**
    * A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The name of the AWS Cloud Map namespace to use.
    * Use the [`aws.servicediscovery.HttpNamespace`](https://www.terraform.io/docs/providers/aws/r/service_discovery_http_namespace.html) resource to configure a Cloud Map namespace.
    */
  var namespaceName: String = js.native
  /**
    * The name of the AWS Cloud Map service to use. Use the [`aws.servicediscovery.Service`](https://www.terraform.io/docs/providers/aws/r/service_discovery_service.html) resource to configure a Cloud Map service.
    */
  var serviceName: String = js.native
}

object VirtualNodeSpecServiceDiscoveryAwsCloudMap {
  @scala.inline
  def apply(namespaceName: String, serviceName: String, attributes: StringDictionary[String] = null): VirtualNodeSpecServiceDiscoveryAwsCloudMap = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecServiceDiscoveryAwsCloudMap]
  }
}

