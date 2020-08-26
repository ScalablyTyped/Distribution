package typings.rasha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RsaKeys extends js.Object {
  var `private`: String = js.native
  var public: String = js.native
}

object RsaKeys {
  @scala.inline
  def apply(`private`: String, public: String): RsaKeys = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaKeys]
  }
  @scala.inline
  implicit class RsaKeysOps[Self <: RsaKeys] (val x: Self) extends AnyVal {
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
    def setPrivate(value: String): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic(value: String): Self = this.set("public", value.asInstanceOf[js.Any])
  }
  
}

