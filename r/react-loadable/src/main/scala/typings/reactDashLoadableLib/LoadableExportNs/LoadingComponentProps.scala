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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("isLoading")(isLoading)
    __obj.updateDynamic("pastDelay")(pastDelay)
    __obj.updateDynamic("retry")(retry)
    __obj.updateDynamic("timedOut")(timedOut)
    __obj.asInstanceOf[LoadingComponentProps]
  }
}

