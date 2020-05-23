package typings.storybookAddonBackgrounds.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var background: String
}

object Background {
  @scala.inline
  def apply(background: String): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
}

