package typings
package atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceReference holds a reference to Service.legacy.k8s.io
  */
trait ServiceReference extends js.Object {
  /**
    * `name` is the name of the service. Required
    */
  val name: java.lang.String
  /**
    * `namespace` is the namespace of the service. Required
    */
  val namespace: java.lang.String
  /**
    * `path` is an optional URL path which will be sent in any request to this service.
    */
  val path: java.lang.String
  /**
    * If specified, the port on the service that hosting webhook. Default to 443 for backward
    * compatibility. `port` should be a valid port number (1-65535, inclusive).
    */
  val port: scala.Double
}

object ServiceReference {
  @scala.inline
  def apply(name: java.lang.String, namespace: java.lang.String, path: java.lang.String, port: scala.Double): ServiceReference = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, path = path, port = port)
  
    __obj.asInstanceOf[ServiceReference]
  }
}

