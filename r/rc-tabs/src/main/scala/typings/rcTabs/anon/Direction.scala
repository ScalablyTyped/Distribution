package typings.rcTabs.anon

import typings.rcTabs.rcTabsStrings.bottom
import typings.rcTabs.rcTabsStrings.left
import typings.rcTabs.rcTabsStrings.right
import typings.rcTabs.rcTabsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var direction: left | right | top | bottom
}

object Direction {
  @scala.inline
  def apply(direction: left | right | top | bottom): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

