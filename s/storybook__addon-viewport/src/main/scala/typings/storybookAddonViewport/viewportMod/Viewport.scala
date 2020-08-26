package typings.storybookAddonViewport.viewportMod

import typings.storybookAddonViewport.storybookAddonViewportStrings.desktop
import typings.storybookAddonViewport.storybookAddonViewportStrings.mobile
import typings.storybookAddonViewport.storybookAddonViewportStrings.other
import typings.storybookAddonViewport.storybookAddonViewportStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewport extends js.Object {
  var default: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var styles: Styles = js.native
  var `type`: desktop | mobile | tablet | other = js.native
}

object Viewport {
  @scala.inline
  def apply(name: String, `type`: desktop | mobile | tablet | other): Viewport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  @scala.inline
  implicit class ViewportOps[Self <: Viewport] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: desktop | mobile | tablet | other): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setStylesFunction1(value: /* s */ ViewportStyles => ViewportStyles): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: Styles): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesNull: Self = this.set("styles", null)
  }
  
}

