package typings.reactDashDotdotdot.reactDashDotdotdotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotDotDotProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var clamp: Double | String | Boolean
  var splitOnChars: js.UndefOr[js.Array[String]] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var truncationChar: js.UndefOr[String] = js.undefined
  var truncationHTML: js.UndefOr[String] = js.undefined
  var useNativeClamp: js.UndefOr[Boolean] = js.undefined
}

object DotDotDotProps {
  @scala.inline
  def apply(
    clamp: Double | String | Boolean,
    animate: js.UndefOr[Boolean] = js.undefined,
    splitOnChars: js.Array[String] = null,
    tagName: String = null,
    truncationChar: String = null,
    truncationHTML: String = null,
    useNativeClamp: js.UndefOr[Boolean] = js.undefined
  ): DotDotDotProps = {
    val __obj = js.Dynamic.literal(clamp = clamp.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (splitOnChars != null) __obj.updateDynamic("splitOnChars")(splitOnChars)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (truncationChar != null) __obj.updateDynamic("truncationChar")(truncationChar)
    if (truncationHTML != null) __obj.updateDynamic("truncationHTML")(truncationHTML)
    if (!js.isUndefined(useNativeClamp)) __obj.updateDynamic("useNativeClamp")(useNativeClamp)
    __obj.asInstanceOf[DotDotDotProps]
  }
}

