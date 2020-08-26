package typings.reactMdDialog.dialogFooterMod

import typings.react.mod.HTMLAttributes
import typings.reactMdDialog.reactMdDialogStrings.`stacked-end`
import typings.reactMdDialog.reactMdDialogStrings.`stacked-start`
import typings.reactMdDialog.reactMdDialogStrings.between
import typings.reactMdDialog.reactMdDialogStrings.end
import typings.reactMdDialog.reactMdDialogStrings.none
import typings.reactMdDialog.reactMdDialogStrings.start
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogFooterProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * An optional alignment for the content within the footer. Since the majority
    * of dialog footers are used to contain action buttons, the default alignment
    * is near the end.
    */
  var align: js.UndefOr[none | start | end | between | `stacked-start` | `stacked-end`] = js.native
}

object DialogFooterProps {
  @scala.inline
  def apply(): DialogFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogFooterProps]
  }
  @scala.inline
  implicit class DialogFooterPropsOps[Self <: DialogFooterProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: none | start | end | between | `stacked-start` | `stacked-end`): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
  }
  
}

