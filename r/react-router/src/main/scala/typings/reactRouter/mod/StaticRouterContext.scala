package typings.reactRouter.mod

import typings.reactRouter.reactRouterStrings.PUSH
import typings.reactRouter.reactRouterStrings.REPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRouterContext extends StaticContext {
  var action: js.UndefOr[PUSH | REPLACE] = js.undefined
  var location: js.UndefOr[js.Object] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object StaticRouterContext {
  @scala.inline
  def apply(
    action: PUSH | REPLACE = null,
    location: js.Object = null,
    statusCode: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): StaticRouterContext = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRouterContext]
  }
}

