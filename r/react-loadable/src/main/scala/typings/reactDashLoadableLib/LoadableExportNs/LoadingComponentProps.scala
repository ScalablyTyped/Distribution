package typings
package reactDashLoadableLib.LoadableExportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingComponentProps extends js.Object {
  var error: js.Any
  var isLoading: scala.Boolean
  var pastDelay: scala.Boolean
  var timedOut: scala.Boolean
  def retry(): scala.Unit
}

object LoadingComponentProps {
  @scala.inline
  def apply(
    error: js.Any,
    isLoading: scala.Boolean,
    pastDelay: scala.Boolean,
    retry: js.Function0[scala.Unit],
    timedOut: scala.Boolean
  ): LoadingComponentProps = {
    val __obj = js.Dynamic.literal(error = error, isLoading = isLoading, pastDelay = pastDelay, retry = retry, timedOut = timedOut)
  
    __obj.asInstanceOf[LoadingComponentProps]
  }
}

