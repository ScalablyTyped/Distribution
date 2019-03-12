package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotDraggingStyle extends js.Object {
  var transform: js.UndefOr[java.lang.String] = js.undefined
  var transition: js.UndefOr[reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.none] = js.undefined
}

object NotDraggingStyle {
  @scala.inline
  def apply(
    transform: java.lang.String = null,
    transition: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.none = null
  ): NotDraggingStyle = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[NotDraggingStyle]
  }
}

