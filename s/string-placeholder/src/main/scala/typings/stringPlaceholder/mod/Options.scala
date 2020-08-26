package typings.stringPlaceholder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var after: js.UndefOr[String] = js.native
  var before: js.UndefOr[String] = js.native
  var clean: js.UndefOr[Boolean] = js.native
  var escape: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClean: Self = this.set("clean", js.undefined)
    @scala.inline
    def setEscape(value: String): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
  }
  
}

