package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.Anon0
import typings.reactBulmaComponents.AnonOnly
import typings.reactBulmaComponents.AnonOnlyValue
import typings.reactBulmaComponents.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/modifiers/responsives.js
trait ResponsiveSizeProps extends js.Object {
  var display: js.UndefOr[AnonOnly] = js.undefined
  var hide: js.UndefOr[AnonValue] = js.undefined
  var textAlignment: js.UndefOr[AnonOnlyValue] = js.undefined
  var textSize: js.UndefOr[Anon0] = js.undefined
}

object ResponsiveSizeProps {
  @scala.inline
  def apply(
    display: AnonOnly = null,
    hide: AnonValue = null,
    textAlignment: AnonOnlyValue = null,
    textSize: Anon0 = null
  ): ResponsiveSizeProps = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveSizeProps]
  }
}

