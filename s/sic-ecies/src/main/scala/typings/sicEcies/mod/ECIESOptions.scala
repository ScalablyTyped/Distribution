package typings.sicEcies.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECIESOptions extends js.Object {
  var noKey: js.UndefOr[Boolean] = js.native
  var shortTag: js.UndefOr[Boolean] = js.native
}

object ECIESOptions {
  @scala.inline
  def apply(): ECIESOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECIESOptions]
  }
  @scala.inline
  implicit class ECIESOptionsOps[Self <: ECIESOptions] (val x: Self) extends AnyVal {
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
    def setNoKey(value: Boolean): Self = this.set("noKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoKey: Self = this.set("noKey", js.undefined)
    @scala.inline
    def setShortTag(value: Boolean): Self = this.set("shortTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortTag: Self = this.set("shortTag", js.undefined)
  }
  
}

