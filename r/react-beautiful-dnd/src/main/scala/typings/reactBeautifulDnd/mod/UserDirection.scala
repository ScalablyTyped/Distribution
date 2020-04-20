package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDirection extends js.Object {
  var horizontal: HorizontalUserDirection
  var vertical: VerticalUserDirection
}

object UserDirection {
  @scala.inline
  def apply(horizontal: HorizontalUserDirection, vertical: VerticalUserDirection): UserDirection = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDirection]
  }
}

