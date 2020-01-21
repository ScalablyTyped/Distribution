package typings.reactRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRouterProps extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[StaticRouterContext] = js.undefined
  var location: js.UndefOr[String | js.Object] = js.undefined
}

object StaticRouterProps {
  @scala.inline
  def apply(basename: String = null, context: StaticRouterContext = null, location: String | js.Object = null): StaticRouterProps = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRouterProps]
  }
}

