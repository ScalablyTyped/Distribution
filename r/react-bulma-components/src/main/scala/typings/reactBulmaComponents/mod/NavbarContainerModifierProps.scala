package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.end
import typings.reactBulmaComponents.reactBulmaComponentsStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/navbar/components/container.js
trait NavbarContainerModifierProps extends js.Object {
  var position: js.UndefOr[start | end] = js.undefined
}

object NavbarContainerModifierProps {
  @scala.inline
  def apply(position: start | end = null): NavbarContainerModifierProps = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarContainerModifierProps]
  }
}

