package typings
package atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns

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
  val name: java.lang.String
  /**
    * Namespace is the namespace of the service
    */
  val namespace: java.lang.String
  /**
    * If specified, the port on the service that hosting webhook. Default to 443 for backward
    * compatibility. `port` should be a valid port number (1-65535, inclusive).
    */
  val port: scala.Double
}

object ServiceReference {
  @scala.inline
  def apply(name: java.lang.String, namespace: java.lang.String, port: scala.Double): ServiceReference = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, port = port)
  
    __obj.asInstanceOf[ServiceReference]
  }
}

