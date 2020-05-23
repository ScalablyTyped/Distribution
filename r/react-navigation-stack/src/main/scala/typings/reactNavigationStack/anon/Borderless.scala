package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Borderless extends js.Object {
  var borderless: Boolean
  var pressColor: String
}

object Borderless {
  @scala.inline
  def apply(borderless: Boolean, pressColor: String): Borderless = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any], pressColor = pressColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borderless]
  }
}

