package typings.primereact.dropdownItemMod

import typings.primereact.anon.Option
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownItemProps extends js.Object {
  
  var onClick: js.UndefOr[js.Function1[/* e */ Option, Unit]] = js.native
  
  var option: js.UndefOr[js.Object] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[js.Function1[/* option */ js.Any, js.UndefOr[Element]]] = js.native
}
object DropdownItemProps {
  
  @scala.inline
  def apply(): DropdownItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownItemProps]
  }
  
  @scala.inline
  implicit class DropdownItemPropsOps[Self <: DropdownItemProps] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: /* e */ Option => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOption(value: js.Object): Self = this.set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setTemplate(value: /* option */ js.Any => js.UndefOr[Element]): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
