package typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotDraggingStyle extends js.Object {
  var transform: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[none] = js.undefined
}

object NotDraggingStyle {
  @scala.inline
  def apply(transform: String = null, transition: none = null): NotDraggingStyle = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotDraggingStyle]
  }
}

