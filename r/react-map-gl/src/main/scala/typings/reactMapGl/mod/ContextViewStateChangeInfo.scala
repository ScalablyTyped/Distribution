package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextViewStateChangeInfo extends js.Object {
  var interactionState: ExtraState
  var newViewState: ViewportProps
  var viewState: ViewportProps
}

object ContextViewStateChangeInfo {
  @scala.inline
  def apply(interactionState: ExtraState, newViewState: ViewportProps, viewState: ViewportProps): ContextViewStateChangeInfo = {
    val __obj = js.Dynamic.literal(interactionState = interactionState.asInstanceOf[js.Any], newViewState = newViewState.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextViewStateChangeInfo]
  }
}

