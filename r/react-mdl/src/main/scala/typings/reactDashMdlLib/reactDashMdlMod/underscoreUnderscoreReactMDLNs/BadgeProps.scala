package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var noBackground: js.UndefOr[scala.Boolean] = js.undefined
  var overlap: js.UndefOr[scala.Boolean] = js.undefined
  var text: java.lang.String | scala.Double
}

object BadgeProps {
  @scala.inline
  def apply(
    text: java.lang.String | scala.Double,
    className: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    noBackground: js.UndefOr[scala.Boolean] = js.undefined,
    overlap: js.UndefOr[scala.Boolean] = js.undefined,
    ref: reactLib.reactMod.ReactNs.LegacyRef[js.Any] = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(noBackground)) __obj.updateDynamic("noBackground")(noBackground)
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

