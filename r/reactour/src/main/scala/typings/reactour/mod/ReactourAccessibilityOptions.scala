package typings.reactour.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactourAccessibilityOptions extends js.Object {
  // attribute to associate the dialog with a title for screen readers
  var ariaLabelledBy: js.UndefOr[String] = js.native
  // aria-label attribute for the close button
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  // Show/Hide Navigation Dots for screen reader software
  var showNavigationScreenReaders: js.UndefOr[Boolean] = js.native
}

object ReactourAccessibilityOptions {
  @scala.inline
  def apply(): ReactourAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactourAccessibilityOptions]
  }
  @scala.inline
  implicit class ReactourAccessibilityOptionsOps[Self <: ReactourAccessibilityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    @scala.inline
    def setCloseButtonAriaLabel(value: String): Self = this.set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButtonAriaLabel: Self = this.set("closeButtonAriaLabel", js.undefined)
    @scala.inline
    def setShowNavigationScreenReaders(value: Boolean): Self = this.set("showNavigationScreenReaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNavigationScreenReaders: Self = this.set("showNavigationScreenReaders", js.undefined)
  }
  
}

