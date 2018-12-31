package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * The primary endpoint exposed by the service.  All endpoints (including this one)
    * can also be retrieved by using the 'Service.endpoints' property.  Note: this value
    * may not be present if the service does not actually expose any endpoints.
    */
  var defaultEndpoint: atPulumiPulumiLib.pulumiMod.Output[Endpoint] = js.native
  /**
    * The exposed hostname and port for connecting to the given containerName
    * on the given containerPort.
    */
  var endpoints: atPulumiPulumiLib.pulumiMod.Output[Endpoints] = js.native
  var name: java.lang.String = js.native
  /**
    * The exposed hostname and port for connecting to the given containerName
    * on the given containerPort.  If containerName is not provided, the first
    * container in the service is used.  If containerPort is not provided, the
    * first exposed port is used.
    *
    * Only usable on the inside.
    */
  def getEndpoint(): js.Promise[Endpoint] = js.native
  def getEndpoint(containerName: java.lang.String): js.Promise[Endpoint] = js.native
  def getEndpoint(containerName: java.lang.String, containerPort: scala.Double): js.Promise[Endpoint] = js.native
}

