package typings.ssbKeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keys extends js.Object {
  var curve: String = js.native
  var id: String = js.native
  var `private`: String = js.native
  var public: String = js.native
}

object Keys {
  @scala.inline
  def apply(curve: String, id: String, `private`: String, public: String): Keys = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keys]
  }
  @scala.inline
  implicit class KeysOps[Self <: Keys] (val x: Self) extends AnyVal {
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
    def setCurve(value: String): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivate(value: String): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic(value: String): Self = this.set("public", value.asInstanceOf[js.Any])
  }
  
}

