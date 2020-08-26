package typings.reactRnd.mod

import typings.reactRnd.anon.Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var bounds: Right = js.native
  var maxHeight: js.UndefOr[Double | String] = js.native
  var maxWidth: js.UndefOr[Double | String] = js.native
  var original: Position = js.native
}

object State {
  @scala.inline
  def apply(bounds: Right, original: Position): State = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
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
    def setBounds(value: Right): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal(value: Position): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxHeight(value: Double | String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
  }
  
}

