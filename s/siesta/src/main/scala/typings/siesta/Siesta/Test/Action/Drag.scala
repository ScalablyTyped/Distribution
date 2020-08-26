package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
@js.native
trait Drag extends IAction {
  var by: js.UndefOr[js.Any] = js.native
  var dragOnly: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[js.Any] = js.native
  var target: js.UndefOr[js.Any] = js.native
  var to: js.UndefOr[js.Any] = js.native
}

object Drag {
  @scala.inline
  def apply(): Drag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Drag]
  }
  @scala.inline
  implicit class DragOps[Self <: Drag] (val x: Self) extends AnyVal {
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
    def setBy(value: js.Any): Self = this.set("by", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBy: Self = this.set("by", js.undefined)
    @scala.inline
    def setDragOnly(value: Boolean): Self = this.set("dragOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragOnly: Self = this.set("dragOnly", js.undefined)
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTo(value: js.Any): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

