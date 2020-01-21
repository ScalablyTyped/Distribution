package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecretReference represents a Secret Reference. It has enough information to retrieve secret
  * in any namespace
  */
trait SecretReference extends js.Object {
  /**
    * Name is unique within a namespace to reference a secret resource.
    */
  val name: String
  /**
    * Namespace defines the space within which the secret name must be unique.
    */
  val namespace: String
}

object SecretReference {
  @scala.inline
  def apply(name: String, namespace: String): SecretReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecretReference]
  }
}

