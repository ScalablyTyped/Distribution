package typings.reactBulmaComponents.mod

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/form/components/input-file.js
trait InputFileModifierProps extends js.Object {
  var boxed: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var fileName: js.UndefOr[Boolean] = js.undefined
  var fullwidth: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ReactElement] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object InputFileModifierProps {
  @scala.inline
  def apply(
    boxed: js.UndefOr[Boolean] = js.undefined,
    color: Color = null,
    fileName: js.UndefOr[Boolean] = js.undefined,
    fullwidth: js.UndefOr[Boolean] = js.undefined,
    icon: ReactElement = null,
    label: String = null,
    right: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null
  ): InputFileModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boxed)) __obj.updateDynamic("boxed")(boxed.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fileName)) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(fullwidth)) __obj.updateDynamic("fullwidth")(fullwidth.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFileModifierProps]
  }
}

