package typings.reactDashJoyride.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloaterProps extends js.Object {
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[GenericObject] = js.undefined
  var styles: js.UndefOr[GenericObject] = js.undefined
  var wrapperOptions: js.UndefOr[GenericObject] = js.undefined
}

object FloaterProps {
  @scala.inline
  def apply(
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    options: GenericObject = null,
    styles: GenericObject = null,
    wrapperOptions: GenericObject = null
  ): FloaterProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (wrapperOptions != null) __obj.updateDynamic("wrapperOptions")(wrapperOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloaterProps]
  }
}

