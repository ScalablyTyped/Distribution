package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretId extends js.Object {
  var secretId: js.UndefOr[String] = js.native
}

object SecretId {
  @scala.inline
  def apply(): SecretId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretId]
  }
  @scala.inline
  implicit class SecretIdOps[Self <: SecretId] (val x: Self) extends AnyVal {
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
    def setSecretId(value: String): Self = this.set("secretId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretId: Self = this.set("secretId", js.undefined)
  }
  
}

