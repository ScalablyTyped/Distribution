package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecretKeySelector selects a key of a Secret.
  */
@js.native
trait SecretKeySelector extends js.Object {
  /**
    * The key of the secret to select from.  Must be a valid secret key.
    */
  var key: String = js.native
  /**
    * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: String = js.native
  /**
    * Specify whether the Secret or its key must be defined
    */
  var optional: Boolean = js.native
}

object SecretKeySelector {
  @scala.inline
  def apply(key: String, name: String, optional: Boolean): SecretKeySelector = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretKeySelector]
  }
  @scala.inline
  implicit class SecretKeySelectorOps[Self <: SecretKeySelector] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
  }
  
}

