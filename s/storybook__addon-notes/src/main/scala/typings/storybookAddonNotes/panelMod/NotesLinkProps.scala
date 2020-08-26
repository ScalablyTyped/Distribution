package typings.storybookAddonNotes.panelMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotesLinkProps extends js.Object {
  var children: ReactElement = js.native
  var href: String = js.native
}

object NotesLinkProps {
  @scala.inline
  def apply(children: ReactElement, href: String): NotesLinkProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotesLinkProps]
  }
  @scala.inline
  implicit class NotesLinkPropsOps[Self <: NotesLinkProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
  }
  
}

