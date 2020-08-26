package typings.primereact.pickListItemMod

import typings.primereact.anon.Value
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickListItemProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object PickListItemProps {
  @scala.inline
  def apply(): PickListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickListItemProps]
  }
  @scala.inline
  implicit class PickListItemPropsOps[Self <: PickListItemProps] (val x: Self) extends AnyVal {
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
    def setOnClick(value: /* e */ Value => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = this.set("template", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

