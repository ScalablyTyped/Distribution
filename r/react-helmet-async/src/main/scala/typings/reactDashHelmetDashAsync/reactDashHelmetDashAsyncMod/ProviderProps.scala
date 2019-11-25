package typings.reactDashHelmetDashAsync.reactDashHelmetDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply(context: js.Object = null): ProviderProps = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps]
  }
}

