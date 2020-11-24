package typings.reactSelect.stylesMod

import typings.react.mod.CSSProperties
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.controlMod.ControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styles extends js.Object {
  
  var clearIndicator: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var container: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var control: js.UndefOr[StylesConfigFunction[ControlProps[js.Object]]] = js.native
  
  var dropdownIndicator: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var group: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var groupHeading: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var indicatorSeparator: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var indicatorsContainer: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var input: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var loadingIndicator: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  // TODO loadingMessageCSS?: StylesConfigFunction;
  var loadingMessage: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var menu: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var menuList: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var menuPortal: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var multiValue: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var multiValueLabel: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var multiValueRemove: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  // TODO noOptionsMessageCSS?: StylesConfigFunction;
  var noOptionsMessage: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var option: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var placeholder: js.UndefOr[StylesConfigFunction[PlaceholderProps[js.Object]]] = js.native
  
  var singleValue: js.UndefOr[StylesConfigFunction[_]] = js.native
  
  var valueContainer: js.UndefOr[StylesConfigFunction[_]] = js.native
}
object Styles {
  
  @scala.inline
  def apply(): Styles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Styles]
  }
  
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
    
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
    def setClearIndicator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("clearIndicator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteClearIndicator: Self = this.set("clearIndicator", js.undefined)
    
    @scala.inline
    def setContainer(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("container", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setControl(value: (/* base */ CSSProperties, ControlProps[js.Object]) => CSSProperties): Self = this.set("control", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    
    @scala.inline
    def setDropdownIndicator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("dropdownIndicator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDropdownIndicator: Self = this.set("dropdownIndicator", js.undefined)
    
    @scala.inline
    def setGroup(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("group", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupHeading(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("groupHeading", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupHeading: Self = this.set("groupHeading", js.undefined)
    
    @scala.inline
    def setIndicatorSeparator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("indicatorSeparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIndicatorSeparator: Self = this.set("indicatorSeparator", js.undefined)
    
    @scala.inline
    def setIndicatorsContainer(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("indicatorsContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIndicatorsContainer: Self = this.set("indicatorsContainer", js.undefined)
    
    @scala.inline
    def setInput(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("input", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLoadingIndicator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("loadingIndicator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadingIndicator: Self = this.set("loadingIndicator", js.undefined)
    
    @scala.inline
    def setLoadingMessage(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("loadingMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadingMessage: Self = this.set("loadingMessage", js.undefined)
    
    @scala.inline
    def setMenu(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("menu", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setMenuList(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("menuList", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMenuList: Self = this.set("menuList", js.undefined)
    
    @scala.inline
    def setMenuPortal(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("menuPortal", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMenuPortal: Self = this.set("menuPortal", js.undefined)
    
    @scala.inline
    def setMultiValue(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("multiValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMultiValue: Self = this.set("multiValue", js.undefined)
    
    @scala.inline
    def setMultiValueLabel(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("multiValueLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMultiValueLabel: Self = this.set("multiValueLabel", js.undefined)
    
    @scala.inline
    def setMultiValueRemove(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("multiValueRemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMultiValueRemove: Self = this.set("multiValueRemove", js.undefined)
    
    @scala.inline
    def setNoOptionsMessage(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("noOptionsMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteNoOptionsMessage: Self = this.set("noOptionsMessage", js.undefined)
    
    @scala.inline
    def setOption(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("option", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: (/* base */ CSSProperties, PlaceholderProps[js.Object]) => CSSProperties): Self = this.set("placeholder", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setSingleValue(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("singleValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSingleValue: Self = this.set("singleValue", js.undefined)
    
    @scala.inline
    def setValueContainer(value: (/* base */ CSSProperties, _) => CSSProperties): Self = this.set("valueContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteValueContainer: Self = this.set("valueContainer", js.undefined)
  }
}
