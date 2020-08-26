package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextViewStateChangeInfo extends js.Object {
  var interactionState: ExtraState = js.native
  var newViewState: ViewportProps = js.native
  var viewState: ViewportProps = js.native
}

object ContextViewStateChangeInfo {
  @scala.inline
  def apply(interactionState: ExtraState, newViewState: ViewportProps, viewState: ViewportProps): ContextViewStateChangeInfo = {
    val __obj = js.Dynamic.literal(interactionState = interactionState.asInstanceOf[js.Any], newViewState = newViewState.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextViewStateChangeInfo]
  }
  @scala.inline
  implicit class ContextViewStateChangeInfoOps[Self <: ContextViewStateChangeInfo] (val x: Self) extends AnyVal {
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
    def setInteractionState(value: ExtraState): Self = this.set("interactionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewViewState(value: ViewportProps): Self = this.set("newViewState", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewState(value: ViewportProps): Self = this.set("viewState", value.asInstanceOf[js.Any])
  }
  
}

