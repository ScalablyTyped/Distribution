package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecretEnvSource selects a Secret to populate the environment variables with.
  *
  * The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
  */
@js.native
trait SecretEnvSource extends js.Object {
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String = js.native
  /**
    * Specify whether the Secret must be defined
    */
  var optional: Boolean = js.native
}

object SecretEnvSource {
  @scala.inline
  def apply(name: String, optional: Boolean): SecretEnvSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretEnvSource]
  }
  @scala.inline
  implicit class SecretEnvSourceOps[Self <: SecretEnvSource] (val x: Self) extends AnyVal {
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
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
  }
  
}

