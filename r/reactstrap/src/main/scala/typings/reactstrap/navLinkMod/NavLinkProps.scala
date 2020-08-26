package typings.reactstrap.navLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavLinkProps
  extends AllHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement]
     with /* key */ StringDictionary[js.Any] {
  var active: js.UndefOr[Boolean] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.native
  @JSName("onClick")
  var onClick_NavLinkProps: js.UndefOr[MouseEventHandler[_]] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
}

object NavLinkProps {
  @scala.inline
  def apply(): NavLinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavLinkProps]
  }
  @scala.inline
  implicit class NavLinkPropsOps[Self <: NavLinkProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[HTMLAnchorElement]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setOnClick(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

