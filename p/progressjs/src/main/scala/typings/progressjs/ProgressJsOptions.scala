package typings.progressjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressJsOptions extends js.Object {
  /**
    * to consider CSS3 transitions in events
    */
  var considerTransition: js.UndefOr[Boolean] = js.native
  /**
    * overlay mode makes an overlay layer in the target element
    */
  var overlayMode: js.UndefOr[Boolean] = js.native
  /**
    * progress bar theme
    */
  var theme: js.UndefOr[String] = js.native
}

object ProgressJsOptions {
  @scala.inline
  def apply(): ProgressJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressJsOptions]
  }
  @scala.inline
  implicit class ProgressJsOptionsOps[Self <: ProgressJsOptions] (val x: Self) extends AnyVal {
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
    def setConsiderTransition(value: Boolean): Self = this.set("considerTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsiderTransition: Self = this.set("considerTransition", js.undefined)
    @scala.inline
    def setOverlayMode(value: Boolean): Self = this.set("overlayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayMode: Self = this.set("overlayMode", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

