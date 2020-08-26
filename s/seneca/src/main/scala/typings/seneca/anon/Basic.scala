package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Basic extends js.Object {
  var basic: js.UndefOr[Boolean] = js.native
  var `mem-store`: js.UndefOr[Boolean] = js.native
  var transport: js.UndefOr[Boolean] = js.native
  var web: js.UndefOr[Boolean] = js.native
}

object Basic {
  @scala.inline
  def apply(): Basic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Basic]
  }
  @scala.inline
  implicit class BasicOps[Self <: Basic] (val x: Self) extends AnyVal {
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
    def setBasic(value: Boolean): Self = this.set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    @scala.inline
    def `setMem-store`(value: Boolean): Self = this.set("mem-store", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMem-store`: Self = this.set("mem-store", js.undefined)
    @scala.inline
    def setTransport(value: Boolean): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    @scala.inline
    def setWeb(value: Boolean): Self = this.set("web", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeb: Self = this.set("web", js.undefined)
  }
  
}

