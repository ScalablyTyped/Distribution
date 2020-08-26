package typings.reactToolbox.overlayOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayTheme extends js.Object {
  /**
    * Active class name.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Backdrop class name.
    */
  var backdrop: js.UndefOr[String] = js.native
  /**
    * Invisible class name.
    */
  var invisible: js.UndefOr[String] = js.native
  /**
    * Overlay class name.
    */
  var overlay: js.UndefOr[String] = js.native
}

object OverlayTheme {
  @scala.inline
  def apply(): OverlayTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayTheme]
  }
  @scala.inline
  implicit class OverlayThemeOps[Self <: OverlayTheme] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setBackdrop(value: String): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    @scala.inline
    def setInvisible(value: String): Self = this.set("invisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    @scala.inline
    def setOverlay(value: String): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
  }
  
}

