package typings.rcTreeSelect.anon

import typings.rcSelect.generatorMod.FilterFunc
import typings.rcTreeSelect.interfaceMod.LegacyDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOption extends js.Object {
  
  var filterOption: Boolean | FilterFunc[LegacyDataNode] = js.native
  
  var optionFilterProp: String = js.native
}
object FilterOption {
  
  @scala.inline
  def apply(filterOption: Boolean | FilterFunc[LegacyDataNode], optionFilterProp: String): FilterOption = {
    val __obj = js.Dynamic.literal(filterOption = filterOption.asInstanceOf[js.Any], optionFilterProp = optionFilterProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOption]
  }
  
  @scala.inline
  implicit class FilterOptionOps[Self <: FilterOption] (val x: Self) extends AnyVal {
    
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
    def setFilterOptionFunction2(value: (/* inputValue */ String, /* option */ js.UndefOr[LegacyDataNode]) => Boolean): Self = this.set("filterOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterOption(value: Boolean | FilterFunc[LegacyDataNode]): Self = this.set("filterOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionFilterProp(value: String): Self = this.set("optionFilterProp", value.asInstanceOf[js.Any])
  }
}
