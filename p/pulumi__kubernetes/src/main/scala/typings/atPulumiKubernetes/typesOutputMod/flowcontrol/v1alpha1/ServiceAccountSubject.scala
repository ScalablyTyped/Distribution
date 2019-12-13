package typings.atPulumiKubernetes.typesOutputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceAccountSubject holds detailed information for service-account-kind subject.
  */
trait ServiceAccountSubject extends js.Object {
  /**
    * `name` is the name of matching ServiceAccount objects, or "*" to match regardless of name.
    * Required.
    */
  val name: String
  /**
    * `namespace` is the namespace of matching ServiceAccount objects. Required.
    */
  val namespace: String
}

object ServiceAccountSubject {
  @scala.inline
  def apply(name: String, namespace: String): ServiceAccountSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceAccountSubject]
  }
}

