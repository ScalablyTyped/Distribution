package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashChangeEventInit extends EventInit {
  var newURL: js.UndefOr[java.lang.String] = js.native
  var oldURL: js.UndefOr[java.lang.String] = js.native
}

object HashChangeEventInit {
  @scala.inline
  def apply(): HashChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashChangeEventInit]
  }
  @scala.inline
  implicit class HashChangeEventInitOps[Self <: HashChangeEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewURL(value: java.lang.String): Self = this.set("newURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewURL: Self = this.set("newURL", js.undefined)
    @scala.inline
    def setOldURL(value: java.lang.String): Self = this.set("oldURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldURL: Self = this.set("oldURL", js.undefined)
  }
  
}

