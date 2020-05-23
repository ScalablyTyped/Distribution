package typings.reactNativeTabView.typesMod

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
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

