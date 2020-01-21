package typings.reactBreadcrumbs.mod

import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.reactBreadcrumbs.AnonTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var data: LocationDescriptor[LocationState] with AnonTitle
  var hidden: js.UndefOr[Boolean] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(data: LocationDescriptor[LocationState] with AnonTitle, hidden: js.UndefOr[Boolean] = js.undefined): BreadcrumbProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

