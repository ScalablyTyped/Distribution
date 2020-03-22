package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/modifiers/colors.js
trait ColorProps extends js.Object {
  var backgroundColor: js.UndefOr[Color | GreyColor] = js.undefined
  var textColor: js.UndefOr[Color | GreyColor] = js.undefined
}

object ColorProps {
  @scala.inline
  def apply(backgroundColor: Color | GreyColor = null, textColor: Color | GreyColor = null): ColorProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProps]
  }
}

