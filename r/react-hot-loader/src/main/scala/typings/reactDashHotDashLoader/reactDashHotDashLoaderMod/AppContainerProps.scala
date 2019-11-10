package typings.reactDashHotDashLoader.reactDashHotDashLoaderMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppContainerProps extends js.Object {
  var errorBoundary: js.UndefOr[Boolean] = js.undefined
  var errorReporter: js.UndefOr[ComponentType[ErrorReporterProps]] = js.undefined
}

object AppContainerProps {
  @scala.inline
  def apply(
    errorBoundary: js.UndefOr[Boolean] = js.undefined,
    errorReporter: ComponentType[ErrorReporterProps] = null
  ): AppContainerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errorBoundary)) __obj.updateDynamic("errorBoundary")(errorBoundary)
    if (errorReporter != null) __obj.updateDynamic("errorReporter")(errorReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppContainerProps]
  }
}

