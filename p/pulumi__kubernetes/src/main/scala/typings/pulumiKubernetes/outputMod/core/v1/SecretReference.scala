package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
  */
@js.native
trait SecretReference extends js.Object {
  /**
    * Name is unique within a namespace to reference a secret resource.
    */
  var name: String = js.native
  /**
    * Namespace defines the space within which the secret name must be unique.
    */
  var namespace: String = js.native
}

object SecretReference {
  @scala.inline
  def apply(name: String, namespace: String): SecretReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretReference]
  }
  @scala.inline
  implicit class SecretReferenceOps[Self <: SecretReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
  }
  
}

