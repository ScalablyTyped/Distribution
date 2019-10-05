package typings.atPulumiCloud.serviceMod

import org.scalablytyped.runtime.TopLevel
import typings.atPulumiPulumi.outputMod.Output
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
  var defaultEndpoint: Output[Endpoint] = js.native
  /**
    * The exposed hostname and port for connecting to the given containerName
    * on the given containerPort.
    */
  var endpoints: Output[Endpoints] = js.native
  var name: String = js.native
  /**
    * The exposed hostname and port for connecting to the given containerName
    * on the given containerPort.  If containerName is not provided, the first
    * container in the service is used.  If containerPort is not provided, the
    * first exposed port is used.
    *
    * Only usable on the inside.
    */
  def getEndpoint(): js.Promise[Endpoint] = js.native
  def getEndpoint(containerName: String): js.Promise[Endpoint] = js.native
  def getEndpoint(containerName: String, containerPort: Double): js.Promise[Endpoint] = js.native
}

@JSImport("@pulumi/cloud/service", "Service")
@js.native
object Service extends TopLevel[ServiceConstructor]

