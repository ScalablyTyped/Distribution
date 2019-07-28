package typings.reactDashSketchapp.reactDashSketchappMod

import typings.reactDashSketchapp.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowsPropTypes extends js.Object {
  var shadowColor: js.UndefOr[String | Double] = js.undefined
  var shadowInner: js.UndefOr[Boolean] = js.undefined
  var shadowOffset: js.UndefOr[Anon_Height] = js.undefined
  var shadowOpacity: js.UndefOr[Double] = js.undefined
  var shadowRadius: js.UndefOr[Double] = js.undefined
  var shadowSpread: js.UndefOr[Double] = js.undefined
}

object ShadowsPropTypes {
  @scala.inline
  def apply(
    shadowColor: String | Double = null,
    shadowInner: js.UndefOr[Boolean] = js.undefined,
    shadowOffset: Anon_Height = null,
    shadowOpacity: Int | Double = null,
    shadowRadius: Int | Double = null,
    shadowSpread: Int | Double = null
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

