package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Content ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/content/content.js
trait ContentModifierProps extends js.Object {
  var size: small | medium | large
}

object ContentModifierProps {
  @scala.inline
  def apply(size: small | medium | large): ContentModifierProps = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContentModifierProps]
  }
}

