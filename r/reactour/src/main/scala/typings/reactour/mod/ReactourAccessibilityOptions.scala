package typings.reactour.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactourAccessibilityOptions extends js.Object {
  // attribute to associate the dialog with a title for screen readers
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  // aria-label attribute for the close button
  var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
  // Show/Hide Navigation Dots for screen reader software
  var showNavigationScreenReaders: js.UndefOr[Boolean] = js.undefined
}

object ReactourAccessibilityOptions {
  @scala.inline
  def apply(
    ariaLabelledBy: String = null,
    closeButtonAriaLabel: String = null,
    showNavigationScreenReaders: js.UndefOr[Boolean] = js.undefined
  ): ReactourAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigationScreenReaders)) __obj.updateDynamic("showNavigationScreenReaders")(showNavigationScreenReaders.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactourAccessibilityOptions]
  }
}

