package typings.pulumiKubernetes.outputMod.apiregistration.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceReference holds a reference to Service.legacy.k8s.io
  */
trait ServiceReference extends js.Object {
  /**
    * Name is the name of the service
    */
  val name: String
  /**
    * Namespace is the namespace of the service
    */
  val namespace: String
  /**
    * If specified, the port on the service that hosting webhook. Default to 443 for backward
    * compatibility. `port` should be a valid port number (1-65535, inclusive).
    */
  val port: Double
}

object ServiceReference {
  @scala.inline
  def apply(name: String, namespace: String, port: Double): ServiceReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceReference]
  }
}

