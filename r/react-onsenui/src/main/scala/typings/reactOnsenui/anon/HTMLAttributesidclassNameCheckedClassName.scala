package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import typings.reactOnsenui.mod.SwitchChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier :string | undefined,   onChange :(e : react-onsenui.react-onsenui.SwitchChangeEvent): void | undefined,   checked :boolean | undefined,   disabled :boolean | undefined,   inputId :string | undefined,   name :string | undefined} */
@js.native
trait HTMLAttributesidclassNameCheckedClassName extends js.Object {
  var checked: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inputId: js.UndefOr[String] = js.native
  var modifier: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ SwitchChangeEvent, Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object HTMLAttributesidclassNameCheckedClassName {
  @scala.inline
  def apply(): HTMLAttributesidclassNameCheckedClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameCheckedClassName]
  }
  @scala.inline
  implicit class HTMLAttributesidclassNameCheckedClassNameOps[Self <: HTMLAttributesidclassNameCheckedClassName] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnChange(value: /* e */ SwitchChangeEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

