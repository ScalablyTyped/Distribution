package typings.reactToolbox.navigationNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationTheme extends js.Object {
  /**
    * Used for buttons provided in the component.
    */
  var button: js.UndefOr[String] = js.native
  /**
    * Used for the root element if the layout is horizontal.
    */
  var horizontal: js.UndefOr[String] = js.native
  /**
    * Used for links provided in the component.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * Used for the root element if the layout is vertical.
    */
  var vertical: js.UndefOr[String] = js.native
}

object NavigationTheme {
  @scala.inline
  def apply(): NavigationTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationTheme]
  }
  @scala.inline
  implicit class NavigationThemeOps[Self <: NavigationTheme] (val x: Self) extends AnyVal {
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setHorizontal(value: String): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setVertical(value: String): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

