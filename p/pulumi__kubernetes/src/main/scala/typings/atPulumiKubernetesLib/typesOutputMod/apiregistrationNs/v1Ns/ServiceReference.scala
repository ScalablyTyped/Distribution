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
}

object ServiceReference {
  @scala.inline
  def apply(name: java.lang.String, namespace: java.lang.String): ServiceReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[ServiceReference]
  }
}

