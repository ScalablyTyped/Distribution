package typings.reactSelect.accessibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstructionsContext extends js.Object {
  var isMulti: js.UndefOr[Boolean] = js.native
  var isSearchable: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
}

object InstructionsContext {
  @scala.inline
  def apply(): InstructionsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstructionsContext]
  }
  @scala.inline
  implicit class InstructionsContextOps[Self <: InstructionsContext] (val x: Self) extends AnyVal {
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
    def setIsMulti(value: Boolean): Self = this.set("isMulti", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMulti: Self = this.set("isMulti", js.undefined)
    @scala.inline
    def setIsSearchable(value: Boolean): Self = this.set("isSearchable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSearchable: Self = this.set("isSearchable", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

