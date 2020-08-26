package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  color :string | undefined,   background :string | undefined,   disabled :boolean | undefined,   modifier :string | undefined} */
@js.native
trait HTMLAttributesidclassNameBackground extends js.Object {
  var background: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var modifier: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object HTMLAttributesidclassNameBackground {
  @scala.inline
  def apply(): HTMLAttributesidclassNameBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameBackground]
  }
  @scala.inline
  implicit class HTMLAttributesidclassNameBackgroundOps[Self <: HTMLAttributesidclassNameBackground] (val x: Self) extends AnyVal {
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

