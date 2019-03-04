package typings
package reactDashDotdotdotLib.reactDashDotdotdotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotDotDotProps extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var clamp: scala.Double | java.lang.String | scala.Boolean
  var splitOnChars: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tagName: js.UndefOr[java.lang.String] = js.undefined
  var truncationChar: js.UndefOr[java.lang.String] = js.undefined
  var truncationHTML: js.UndefOr[java.lang.String] = js.undefined
  var useNativeClamp: js.UndefOr[scala.Boolean] = js.undefined
}

object DotDotDotProps {
  @scala.inline
  def apply(
    clamp: scala.Double | java.lang.String | scala.Boolean,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    splitOnChars: js.Array[java.lang.String] = null,
    tagName: java.lang.String = null,
    truncationChar: java.lang.String = null,
    truncationHTML: java.lang.String = null,
    useNativeClamp: js.UndefOr[scala.Boolean] = js.undefined
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

