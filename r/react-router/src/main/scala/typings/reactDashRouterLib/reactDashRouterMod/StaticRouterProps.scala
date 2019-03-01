package typings
package reactDashRouterLib.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRouterProps extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[StaticRouterContext] = js.undefined
  var location: js.UndefOr[java.lang.String | js.Object] = js.undefined
}

object StaticRouterProps {
  @scala.inline
  def apply(
    basename: java.lang.String = null,
    context: StaticRouterContext = null,
    location: java.lang.String | js.Object = null
  ): StaticRouterProps = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (context != null) __obj.updateDynamic("context")(context)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRouterProps]
  }
}

