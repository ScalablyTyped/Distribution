package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowsPropTypes extends js.Object {
  var shadowColor: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var shadowInner: js.UndefOr[scala.Boolean] = js.undefined
  var shadowOffset: js.UndefOr[reactDashSketchappLib.Anon_Height] = js.undefined
  var shadowOpacity: js.UndefOr[scala.Double] = js.undefined
  var shadowRadius: js.UndefOr[scala.Double] = js.undefined
  var shadowSpread: js.UndefOr[scala.Double] = js.undefined
}

object ShadowsPropTypes {
  @scala.inline
  def apply(
    shadowColor: java.lang.String | scala.Double = null,
    shadowInner: js.UndefOr[scala.Boolean] = js.undefined,
    shadowOffset: reactDashSketchappLib.Anon_Height = null,
    shadowOpacity: scala.Int | scala.Double = null,
    shadowRadius: scala.Int | scala.Double = null,
    shadowSpread: scala.Int | scala.Double = null
  ): ShadowsPropTypes = {
    val __obj = js.Dynamic.literal()
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowInner)) __obj.updateDynamic("shadowInner")(shadowInner)
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset)
    if (shadowOpacity != null) __obj.updateDynamic("shadowOpacity")(shadowOpacity.asInstanceOf[js.Any])
    if (shadowRadius != null) __obj.updateDynamic("shadowRadius")(shadowRadius.asInstanceOf[js.Any])
    if (shadowSpread != null) __obj.updateDynamic("shadowSpread")(shadowSpread.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowsPropTypes]
  }
}

