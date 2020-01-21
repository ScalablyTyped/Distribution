package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LocalObjectReference contains enough information to let you locate the referenced object
  * inside the same namespace.
  */
trait LocalObjectReference extends js.Object {
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: String
}

object LocalObjectReference {
  @scala.inline
  def apply(name: String): LocalObjectReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocalObjectReference]
  }
}

