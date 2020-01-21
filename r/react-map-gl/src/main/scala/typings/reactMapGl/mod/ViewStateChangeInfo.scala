package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewStateChangeInfo extends js.Object {
  var viewState: ViewportProps
}

object ViewStateChangeInfo {
  @scala.inline
  def apply(viewState: ViewportProps): ViewStateChangeInfo = {
    val __obj = js.Dynamic.literal(viewState = viewState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewStateChangeInfo]
  }
}

