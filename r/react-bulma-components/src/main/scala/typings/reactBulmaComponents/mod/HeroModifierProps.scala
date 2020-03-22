package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.fullheight
import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Hero ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/hero/hero.js
trait HeroModifierProps extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var gradient: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | fullheight] = js.undefined
}

object HeroModifierProps {
  @scala.inline
  def apply(
    color: Color = null,
    gradient: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | fullheight = null
  ): HeroModifierProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(gradient)) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroModifierProps]
  }
}

