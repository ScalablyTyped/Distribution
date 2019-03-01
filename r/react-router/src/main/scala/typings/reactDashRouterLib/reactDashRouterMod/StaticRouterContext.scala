package typings
package reactDashRouterLib.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRouterContext extends StaticContext {
  var action: js.UndefOr[
    reactDashRouterLib.reactDashRouterLibStrings.PUSH | reactDashRouterLib.reactDashRouterLibStrings.REPLACE
  ] = js.undefined
  var location: js.UndefOr[js.Object] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object StaticRouterContext {
  @scala.inline
  def apply(
    action: reactDashRouterLib.reactDashRouterLibStrings.PUSH | reactDashRouterLib.reactDashRouterLibStrings.REPLACE = null,
    location: js.Object = null,
    statusCode: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): StaticRouterContext = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[StaticRouterContext]
  }
}

