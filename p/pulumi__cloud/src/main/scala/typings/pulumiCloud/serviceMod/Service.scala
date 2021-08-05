package typings.pulumiCloud.serviceMod

import typings.pulumiCloud.serviceMod.^
import typings.pulumiPulumi.outputMod.Output_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends StObject {
  
  /**
    * The primary endpoint exposed by the service.  All endpoints (including this one)
    * can also be retrieved by using the 'Service.endpoints' property.  Note: this value
    * may not be present if the service does not actually expose any endpoints.
    */
  var defaultEndpoint: Output_[Endpoint] = js.native
  
  /**
    * The exposed hostname and port for connecting to the given containerName
    * on the given containerPort.
    */
  var endpoints: Output_[Endpoints] = js.native
  
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
  def getEndpoint(containerName: Unit, containerPort: Double): js.Promise[Endpoint] = js.native
  
  var name: String = js.native
}
object Service {
  
  inline def apply: ServiceConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Service").asInstanceOf[ServiceConstructor]
}
