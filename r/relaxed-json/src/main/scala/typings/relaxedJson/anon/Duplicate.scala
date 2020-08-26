package typings.relaxedJson.anon

import typings.relaxedJson.mod.Reviver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duplicate extends js.Object {
  var duplicate: js.UndefOr[Boolean] = js.native
  var relaxed: js.UndefOr[Boolean] = js.native
  var reviver: js.UndefOr[Reviver] = js.native
  var tolerant: js.UndefOr[Boolean] = js.native
  var warnings: js.UndefOr[Boolean] = js.native
}

object Duplicate {
  @scala.inline
  def apply(): Duplicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duplicate]
  }
  @scala.inline
  implicit class DuplicateOps[Self <: Duplicate] (val x: Self) extends AnyVal {
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
    def setDuplicate(value: Boolean): Self = this.set("duplicate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicate: Self = this.set("duplicate", js.undefined)
    @scala.inline
    def setRelaxed(value: Boolean): Self = this.set("relaxed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelaxed: Self = this.set("relaxed", js.undefined)
    @scala.inline
    def setReviver(value: Reviver): Self = this.set("reviver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviver: Self = this.set("reviver", js.undefined)
    @scala.inline
    def setTolerant(value: Boolean): Self = this.set("tolerant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerant: Self = this.set("tolerant", js.undefined)
    @scala.inline
    def setWarnings(value: Boolean): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

