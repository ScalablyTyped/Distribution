package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPlaygroundProps extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var previewBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[js.Object] = js.undefined
  var theme: js.UndefOr[themeType] = js.undefined
  var transformCode: js.UndefOr[js.Function1[/* code */ java.lang.String, java.lang.String]] = js.undefined
}

object ComponentPlaygroundProps {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    previewBackgroundColor: java.lang.String = null,
    scope: js.Object = null,
    theme: themeType = null,
    transformCode: /* code */ java.lang.String => java.lang.String = null
  ): ComponentPlaygroundProps = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (previewBackgroundColor != null) __obj.updateDynamic("previewBackgroundColor")(previewBackgroundColor)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (transformCode != null) __obj.updateDynamic("transformCode")(js.Any.fromFunction1(transformCode))
    __obj.asInstanceOf[ComponentPlaygroundProps]
  }
}

