package typings.atPulumiKubernetes.typesInputMod.flowcontrol.v1alpha1

import typings.atPulumiPulumi.outputMod.Input
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
  var name: Input[String]
  /**
    * `namespace` is the namespace of matching ServiceAccount objects. Required.
    */
  var namespace: Input[String]
}

object ServiceAccountSubject {
  @scala.inline
  def apply(name: Input[String], namespace: Input[String]): ServiceAccountSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceAccountSubject]
  }
}

