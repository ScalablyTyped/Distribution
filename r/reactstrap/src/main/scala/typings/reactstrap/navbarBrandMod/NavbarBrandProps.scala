package typings.reactstrap.navbarBrandMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarBrandProps
  extends AllHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
}

object NavbarBrandProps {
  @scala.inline
  def apply(): NavbarBrandProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarBrandProps]
  }
  @scala.inline
  implicit class NavbarBrandPropsOps[Self <: NavbarBrandProps] (val x: Self) extends AnyVal {
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
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

