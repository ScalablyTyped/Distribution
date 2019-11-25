package typings.reactDashLoadable.LoadableExport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingComponentProps extends js.Object {
  var error: js.Any
  var isLoading: Boolean
  var pastDelay: Boolean
  var timedOut: Boolean
  def retry(): Unit
}

object LoadingComponentProps {
  @scala.inline
  def apply(error: js.Any, isLoading: Boolean, pastDelay: Boolean, retry: () => Unit, timedOut: Boolean): LoadingComponentProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], pastDelay = pastDelay.asInstanceOf[js.Any], retry = js.Any.fromFunction0(retry), timedOut = timedOut.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoadingComponentProps]
  }
}

