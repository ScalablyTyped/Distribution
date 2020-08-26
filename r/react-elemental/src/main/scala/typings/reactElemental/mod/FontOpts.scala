package typings.reactElemental.mod

import typings.reactElemental.anon.Regular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontOpts extends js.Object {
  var primary: js.UndefOr[Regular] = js.native
  var secondary: js.UndefOr[Regular] = js.native
}

object FontOpts {
  @scala.inline
  def apply(): FontOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontOpts]
  }
  @scala.inline
  implicit class FontOptsOps[Self <: FontOpts] (val x: Self) extends AnyVal {
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
    def setPrimary(value: Regular): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setSecondary(value: Regular): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
  }
  
}

