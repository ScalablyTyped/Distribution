package typings.reactNative.mod

import typings.reactNative.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowStyleIOS extends js.Object {
  var shadowColor: js.UndefOr[String] = js.undefined
  var shadowOffset: js.UndefOr[Height] = js.undefined
  var shadowOpacity: js.UndefOr[Double] = js.undefined
  var shadowRadius: js.UndefOr[Double] = js.undefined
}

object ShadowStyleIOS {
  @scala.inline
  def apply(
    shadowColor: String = null,
    shadowOffset: Height = null,
    shadowOpacity: js.UndefOr[Double] = js.undefined,
    shadowRadius: js.UndefOr[Double] = js.undefined
  ): ShadowStyleIOS = {
    val __obj = js.Dynamic.literal()
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOpacity)) __obj.updateDynamic("shadowOpacity")(shadowOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowRadius)) __obj.updateDynamic("shadowRadius")(shadowRadius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowStyleIOS]
  }
}

