package typings.reduxFirstRouterLink.mod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkProps extends HTMLAttributes[HTMLElement] {
  var down: js.UndefOr[Boolean] = js.native
  var redirect: js.UndefOr[Boolean] = js.native
  var replace: js.UndefOr[Boolean] = js.native
  var shouldDispatch: js.UndefOr[Boolean] = js.native
  var tagName: js.UndefOr[String] = js.native
  var target: js.UndefOr[String] = js.native
  var to: To = js.native
}

object LinkProps {
  @scala.inline
  def apply(to: To): LinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
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
    def setToVarargs(value: String*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: To): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setDown(value: Boolean): Self = this.set("down", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setRedirect(value: Boolean): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setShouldDispatch(value: Boolean): Self = this.set("shouldDispatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldDispatch: Self = this.set("shouldDispatch", js.undefined)
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

