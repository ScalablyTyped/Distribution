package typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var accessible: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var key: String
  var testID: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Route {
  @scala.inline
  def apply(
    key: String,
    accessibilityLabel: String = null,
    accessible: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    testID: String = null,
    title: String = null
  ): Route = {
    val __obj = js.Dynamic.literal(key = key)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Route]
  }
}

