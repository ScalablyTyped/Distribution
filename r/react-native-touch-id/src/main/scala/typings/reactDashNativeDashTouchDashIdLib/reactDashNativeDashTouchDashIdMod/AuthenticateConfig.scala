package typings
package reactDashNativeDashTouchDashIdLib.reactDashNativeDashTouchDashIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateConfig extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fallbackTitle: java.lang.String
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object AuthenticateConfig {
  @scala.inline
  def apply(fallbackTitle: java.lang.String, color: java.lang.String = null, title: java.lang.String = null): AuthenticateConfig = {
    val __obj = js.Dynamic.literal(fallbackTitle = fallbackTitle)
    if (color != null) __obj.updateDynamic("color")(color)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AuthenticateConfig]
  }
}

