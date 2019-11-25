package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowStyleIOS extends js.Object {
  var shadowColor: js.UndefOr[String] = js.undefined
  var shadowOffset: js.UndefOr[Anon_Height] = js.undefined
  var shadowOpacity: js.UndefOr[Double] = js.undefined
  var shadowRadius: js.UndefOr[Double] = js.undefined
}

object ShadowStyleIOS {
  @scala.inline
  def apply(
    shadowColor: String = null,
    shadowOffset: Anon_Height = null,
    shadowOpacity: Int | Double = null,
    shadowRadius: Int | Double = null
  ): ShadowStyleIOS = {
    val __obj = js.Dynamic.literal()
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (shadowOpacity != null) __obj.updateDynamic("shadowOpacity")(shadowOpacity.asInstanceOf[js.Any])
    if (shadowRadius != null) __obj.updateDynamic("shadowRadius")(shadowRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowStyleIOS]
  }
}

