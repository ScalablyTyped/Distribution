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
    val __obj = js.Dynamic.literal(error = error, isLoading = isLoading, pastDelay = pastDelay, retry = js.Any.fromFunction0(retry), timedOut = timedOut)
  
    __obj.asInstanceOf[LoadingComponentProps]
  }
}

