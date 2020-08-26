package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotDraggingStyle extends js.Object {
  var transform: js.UndefOr[String] = js.native
  var transition: js.UndefOr[none] = js.native
}

object NotDraggingStyle {
  @scala.inline
  def apply(): NotDraggingStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotDraggingStyle]
  }
  @scala.inline
  implicit class NotDraggingStyleOps[Self <: NotDraggingStyle] (val x: Self) extends AnyVal {
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
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTransition(value: none): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

