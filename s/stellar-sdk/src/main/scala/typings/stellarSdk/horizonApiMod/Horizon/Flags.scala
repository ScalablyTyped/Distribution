package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flags extends js.Object {
  var auth_immutable: Boolean = js.native
  var auth_required: Boolean = js.native
  var auth_revocable: Boolean = js.native
}

object Flags {
  @scala.inline
  def apply(auth_immutable: Boolean, auth_required: Boolean, auth_revocable: Boolean): Flags = {
    val __obj = js.Dynamic.literal(auth_immutable = auth_immutable.asInstanceOf[js.Any], auth_required = auth_required.asInstanceOf[js.Any], auth_revocable = auth_revocable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  @scala.inline
  implicit class FlagsOps[Self <: Flags] (val x: Self) extends AnyVal {
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
    def setAuth_immutable(value: Boolean): Self = this.set("auth_immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth_required(value: Boolean): Self = this.set("auth_required", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth_revocable(value: Boolean): Self = this.set("auth_revocable", value.asInstanceOf[js.Any])
  }
  
}

