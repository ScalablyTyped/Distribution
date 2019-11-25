package typings.spectacle.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPlaygroundProps extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var previewBackgroundColor: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[js.Object] = js.undefined
  var theme: js.UndefOr[themeType] = js.undefined
  var transformCode: js.UndefOr[js.Function1[/* code */ String, String]] = js.undefined
}

object ComponentPlaygroundProps {
  @scala.inline
  def apply(
    code: String = null,
    previewBackgroundColor: String = null,
    scope: js.Object = null,
    theme: themeType = null,
    transformCode: /* code */ String => String = null
  ): ComponentPlaygroundProps = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (previewBackgroundColor != null) __obj.updateDynamic("previewBackgroundColor")(previewBackgroundColor.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (transformCode != null) __obj.updateDynamic("transformCode")(js.Any.fromFunction1(transformCode))
    __obj.asInstanceOf[ComponentPlaygroundProps]
  }
}

