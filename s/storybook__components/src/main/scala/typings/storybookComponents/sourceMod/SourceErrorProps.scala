package typings.storybookComponents.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceErrorProps extends js.Object {
  var error: js.UndefOr[SourceError] = js.undefined
}

object SourceErrorProps {
  @scala.inline
  def apply(error: SourceError = null): SourceErrorProps = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceErrorProps]
  }
}

