package typings.restIo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofauthorizedResource extends js.Object {
  val ROLES: ADMIN = js.native
  var default: Typeofdefault = js.native
}

object TypeofauthorizedResource {
  @scala.inline
  def apply(ROLES: ADMIN, default: Typeofdefault): TypeofauthorizedResource = {
    val __obj = js.Dynamic.literal(ROLES = ROLES.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofauthorizedResource]
  }
  @scala.inline
  implicit class TypeofauthorizedResourceOps[Self <: TypeofauthorizedResource] (val x: Self) extends AnyVal {
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
    def setROLES(value: ADMIN): Self = this.set("ROLES", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: Typeofdefault): Self = this.set("default", value.asInstanceOf[js.Any])
  }
  
}

