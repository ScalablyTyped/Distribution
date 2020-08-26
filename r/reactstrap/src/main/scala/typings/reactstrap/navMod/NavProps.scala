package typings.reactstrap.navMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavProps
  extends AllHTMLAttributes[HTMLUListElement]
     with ClassAttributes[HTMLUListElement]
     with /* key */ StringDictionary[js.Any] {
  var card: js.UndefOr[Boolean] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var horizontal: js.UndefOr[String] = js.native
  var justified: js.UndefOr[Boolean] = js.native
  var navbar: js.UndefOr[Boolean] = js.native
  var pills: js.UndefOr[Boolean] = js.native
  var tabs: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
  var vertical: js.UndefOr[Boolean | String] = js.native
}

object NavProps {
  @scala.inline
  def apply(): NavProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavProps]
  }
  @scala.inline
  implicit class NavPropsOps[Self <: NavProps] (val x: Self) extends AnyVal {
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
    def setCard(value: Boolean): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHorizontal(value: String): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setJustified(value: Boolean): Self = this.set("justified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustified: Self = this.set("justified", js.undefined)
    @scala.inline
    def setNavbar(value: Boolean): Self = this.set("navbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavbar: Self = this.set("navbar", js.undefined)
    @scala.inline
    def setPills(value: Boolean): Self = this.set("pills", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePills: Self = this.set("pills", js.undefined)
    @scala.inline
    def setTabs(value: Boolean): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    @scala.inline
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setVertical(value: Boolean | String): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

