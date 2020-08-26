package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import typings.reactOnsenui.reactOnsenuiStrings.bottom
import typings.reactOnsenui.reactOnsenuiStrings.center
import typings.reactOnsenui.reactOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  verticalAlign :'top' | 'bottom' | 'center' | undefined,   width :string | undefined} */
@js.native
trait HTMLAttributesidclassNameId extends js.Object {
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var verticalAlign: js.UndefOr[top | bottom | center] = js.native
  var width: js.UndefOr[String] = js.native
}

object HTMLAttributesidclassNameId {
  @scala.inline
  def apply(): HTMLAttributesidclassNameId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameId]
  }
  @scala.inline
  implicit class HTMLAttributesidclassNameIdOps[Self <: HTMLAttributesidclassNameId] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setVerticalAlign(value: top | bottom | center): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

