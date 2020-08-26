package typings.reactToolbox.linkLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkTheme extends js.Object {
  /**
    * Added to the root element if the Link is active.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Used for the icon element if it's present.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Used for the root element.
    */
  var link: js.UndefOr[String] = js.native
}

object LinkTheme {
  @scala.inline
  def apply(): LinkTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkTheme]
  }
  @scala.inline
  implicit class LinkThemeOps[Self <: LinkTheme] (val x: Self) extends AnyVal {
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
  
}

