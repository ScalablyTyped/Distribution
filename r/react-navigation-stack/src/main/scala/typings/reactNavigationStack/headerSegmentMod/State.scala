package typings.reactNavigationStack.headerSegmentMod

import typings.reactNavigationStack.vendorTypesMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  var leftLabelLayout: js.UndefOr[Layout] = js.native
  var titleLayout: js.UndefOr[Layout] = js.native
}

object State {
  @scala.inline
  def apply(): State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setLeftLabelLayout(value: Layout): Self = this.set("leftLabelLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftLabelLayout: Self = this.set("leftLabelLayout", js.undefined)
    @scala.inline
    def setTitleLayout(value: Layout): Self = this.set("titleLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleLayout: Self = this.set("titleLayout", js.undefined)
  }
  
}

