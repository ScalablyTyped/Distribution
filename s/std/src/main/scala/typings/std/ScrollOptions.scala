package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollOptions extends js.Object {
  var behavior: js.UndefOr[ScrollBehavior] = js.undefined
}

object ScrollOptions {
  @scala.inline
  def apply(behavior: ScrollBehavior = null): ScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOptions]
  }
}

