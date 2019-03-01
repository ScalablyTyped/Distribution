package typings
package reactDashHotDashLoaderLib.reactDashHotDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppContainerProps extends js.Object {
  var errorReporter: js.UndefOr[ReactComponent[ErrorReporterProps]] = js.undefined
  var warnings: js.UndefOr[scala.Boolean] = js.undefined
}

object AppContainerProps {
  @scala.inline
  def apply(
    errorReporter: ReactComponent[ErrorReporterProps] = null,
    warnings: js.UndefOr[scala.Boolean] = js.undefined
  ): AppContainerProps = {
    val __obj = js.Dynamic.literal()
    if (errorReporter != null) __obj.updateDynamic("errorReporter")(errorReporter.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[AppContainerProps]
  }
}

