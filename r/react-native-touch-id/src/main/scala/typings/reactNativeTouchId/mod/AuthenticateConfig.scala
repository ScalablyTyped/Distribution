package typings.reactNativeTouchId.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateConfig extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fallbackTitle: String
  var title: js.UndefOr[String] = js.undefined
}

object AuthenticateConfig {
  @scala.inline
  def apply(fallbackTitle: String, color: String = null, title: String = null): AuthenticateConfig = {
    val __obj = js.Dynamic.literal(fallbackTitle = fallbackTitle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateConfig]
  }
}

