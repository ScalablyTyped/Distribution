package typings.stringStripHtml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DumpLinkHrefsNearby extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var putOnNewLine: js.UndefOr[Boolean] = js.native
  var wrapHeads: js.UndefOr[String] = js.native
  var wrapTails: js.UndefOr[String] = js.native
}

object DumpLinkHrefsNearby {
  @scala.inline
  def apply(): DumpLinkHrefsNearby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DumpLinkHrefsNearby]
  }
  @scala.inline
  implicit class DumpLinkHrefsNearbyOps[Self <: DumpLinkHrefsNearby] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setPutOnNewLine(value: Boolean): Self = this.set("putOnNewLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePutOnNewLine: Self = this.set("putOnNewLine", js.undefined)
    @scala.inline
    def setWrapHeads(value: String): Self = this.set("wrapHeads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapHeads: Self = this.set("wrapHeads", js.undefined)
    @scala.inline
    def setWrapTails(value: String): Self = this.set("wrapTails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapTails: Self = this.set("wrapTails", js.undefined)
  }
  
}

