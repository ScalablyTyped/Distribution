package typings.reactNotificationsComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNotificationProps extends js.Object {
  var breakpoint: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isMobile: js.UndefOr[Boolean] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
}

object ReactNotificationProps {
  @scala.inline
  def apply(
    breakpoint: js.UndefOr[Double] = js.undefined,
    className: String = null,
    id: String = null,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    types: js.Array[String] = null
  ): ReactNotificationProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breakpoint)) __obj.updateDynamic("breakpoint")(breakpoint.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.get.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactNotificationProps]
  }
}

