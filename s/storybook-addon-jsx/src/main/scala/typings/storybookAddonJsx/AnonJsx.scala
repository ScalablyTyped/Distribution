package typings.storybookAddonJsx

import typings.storybookAddonJsx.mod.AddonParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJsx extends js.Object {
  var jsx: AddonParameters
}

object AnonJsx {
  @scala.inline
  def apply(jsx: AddonParameters): AnonJsx = {
    val __obj = js.Dynamic.literal(jsx = jsx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJsx]
  }
}

