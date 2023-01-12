package typings.reactSelect.anon

import typings.reactSelect.distDeclarationsSrcComponentsContainersMod.ContainerProps
import typings.reactSelect.distDeclarationsSrcComponentsContainersMod.IndicatorsContainerProps
import typings.reactSelect.distDeclarationsSrcComponentsContainersMod.ValueContainerProps
import typings.reactSelect.distDeclarationsSrcComponentsControlMod.ControlProps
import typings.reactSelect.distDeclarationsSrcComponentsGroupMod.GroupHeadingProps
import typings.reactSelect.distDeclarationsSrcComponentsGroupMod.GroupProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.ClearIndicatorProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.DropdownIndicatorProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.IndicatorSeparatorProps
import typings.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.LoadingIndicatorProps
import typings.reactSelect.distDeclarationsSrcComponentsInputMod.InputProps
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.MenuListProps
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.MenuProps
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.NoticeProps
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.PortalStyleArgs
import typings.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueProps
import typings.reactSelect.distDeclarationsSrcComponentsOptionMod.OptionProps
import typings.reactSelect.distDeclarationsSrcComponentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.distDeclarationsSrcComponentsSingleValueMod.SingleValueProps
import typings.reactSelect.distDeclarationsSrcStylesMod.StylesConfigFunction
import typings.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
  
  var clearIndicator: js.UndefOr[StylesConfigFunction[ClearIndicatorProps[Option, IsMulti, Group]]] = js.undefined
  
  var container: js.UndefOr[StylesConfigFunction[ContainerProps[Option, IsMulti, Group]]] = js.undefined
  
  var control: js.UndefOr[StylesConfigFunction[ControlProps[Option, IsMulti, Group]]] = js.undefined
  
  var dropdownIndicator: js.UndefOr[StylesConfigFunction[DropdownIndicatorProps[Option, IsMulti, Group]]] = js.undefined
  
  var group: js.UndefOr[StylesConfigFunction[GroupProps[Option, IsMulti, Group]]] = js.undefined
  
  var groupHeading: js.UndefOr[StylesConfigFunction[GroupHeadingProps[Option, IsMulti, Group]]] = js.undefined
  
  var indicatorSeparator: js.UndefOr[StylesConfigFunction[IndicatorSeparatorProps[Option, IsMulti, Group]]] = js.undefined
  
  var indicatorsContainer: js.UndefOr[StylesConfigFunction[IndicatorsContainerProps[Option, IsMulti, Group]]] = js.undefined
  
  var input: js.UndefOr[StylesConfigFunction[InputProps[Option, IsMulti, Group]]] = js.undefined
  
  var loadingIndicator: js.UndefOr[StylesConfigFunction[LoadingIndicatorProps[Option, IsMulti, Group]]] = js.undefined
  
  var loadingMessage: js.UndefOr[StylesConfigFunction[NoticeProps[Option, IsMulti, Group]]] = js.undefined
  
  var menu: js.UndefOr[StylesConfigFunction[MenuProps[Option, IsMulti, Group]]] = js.undefined
  
  var menuList: js.UndefOr[StylesConfigFunction[MenuListProps[Option, IsMulti, Group]]] = js.undefined
  
  var menuPortal: js.UndefOr[StylesConfigFunction[PortalStyleArgs]] = js.undefined
  
  var multiValue: js.UndefOr[StylesConfigFunction[MultiValueProps[Option, IsMulti, Group]]] = js.undefined
  
  var multiValueLabel: js.UndefOr[StylesConfigFunction[MultiValueProps[Option, IsMulti, Group]]] = js.undefined
  
  var multiValueRemove: js.UndefOr[StylesConfigFunction[MultiValueProps[Option, IsMulti, Group]]] = js.undefined
  
  var noOptionsMessage: js.UndefOr[StylesConfigFunction[NoticeProps[Option, IsMulti, Group]]] = js.undefined
  
  var option: js.UndefOr[StylesConfigFunction[OptionProps[Option, IsMulti, Group]]] = js.undefined
  
  var placeholder: js.UndefOr[StylesConfigFunction[PlaceholderProps[Option, IsMulti, Group]]] = js.undefined
  
  var singleValue: js.UndefOr[StylesConfigFunction[SingleValueProps[Option, IsMulti, Group]]] = js.undefined
  
  var valueContainer: js.UndefOr[StylesConfigFunction[ValueContainerProps[Option, IsMulti, Group]]] = js.undefined
}
object Container {
  
  inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](): Container[Option, IsMulti, Group] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container[Option, IsMulti, Group]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Container[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] (val x: Self & (Container[Option, IsMulti, Group])) extends AnyVal {
    
    inline def setClearIndicator(
      value: (/* base */ CSSObjectWithLabel, ClearIndicatorProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "clearIndicator", js.Any.fromFunction2(value))
    
    inline def setClearIndicatorUndefined: Self = StObject.set(x, "clearIndicator", js.undefined)
    
    inline def setContainer(
      value: (/* base */ CSSObjectWithLabel, ContainerProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "container", js.Any.fromFunction2(value))
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setControl(value: (/* base */ CSSObjectWithLabel, ControlProps[Option, IsMulti, Group]) => CSSObjectWithLabel): Self = StObject.set(x, "control", js.Any.fromFunction2(value))
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setDropdownIndicator(
      value: (/* base */ CSSObjectWithLabel, DropdownIndicatorProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "dropdownIndicator", js.Any.fromFunction2(value))
    
    inline def setDropdownIndicatorUndefined: Self = StObject.set(x, "dropdownIndicator", js.undefined)
    
    inline def setGroup(value: (/* base */ CSSObjectWithLabel, GroupProps[Option, IsMulti, Group]) => CSSObjectWithLabel): Self = StObject.set(x, "group", js.Any.fromFunction2(value))
    
    inline def setGroupHeading(
      value: (/* base */ CSSObjectWithLabel, GroupHeadingProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "groupHeading", js.Any.fromFunction2(value))
    
    inline def setGroupHeadingUndefined: Self = StObject.set(x, "groupHeading", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setIndicatorSeparator(
      value: (/* base */ CSSObjectWithLabel, IndicatorSeparatorProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "indicatorSeparator", js.Any.fromFunction2(value))
    
    inline def setIndicatorSeparatorUndefined: Self = StObject.set(x, "indicatorSeparator", js.undefined)
    
    inline def setIndicatorsContainer(
      value: (/* base */ CSSObjectWithLabel, IndicatorsContainerProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "indicatorsContainer", js.Any.fromFunction2(value))
    
    inline def setIndicatorsContainerUndefined: Self = StObject.set(x, "indicatorsContainer", js.undefined)
    
    inline def setInput(value: (/* base */ CSSObjectWithLabel, InputProps[Option, IsMulti, Group]) => CSSObjectWithLabel): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLoadingIndicator(
      value: (/* base */ CSSObjectWithLabel, LoadingIndicatorProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "loadingIndicator", js.Any.fromFunction2(value))
    
    inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
    
    inline def setLoadingMessage(value: (/* base */ CSSObjectWithLabel, NoticeProps[Option, IsMulti, Group]) => CSSObjectWithLabel): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction2(value))
    
    inline def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
    
    inline def setMenu(value: (/* base */ CSSObjectWithLabel, MenuProps[Option, IsMulti, Group]) => CSSObjectWithLabel): Self = StObject.set(x, "menu", js.Any.fromFunction2(value))
    
    inline def setMenuList(
      value: (/* base */ CSSObjectWithLabel, MenuListProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "menuList", js.Any.fromFunction2(value))
    
    inline def setMenuListUndefined: Self = StObject.set(x, "menuList", js.undefined)
    
    inline def setMenuPortal(value: (/* base */ CSSObjectWithLabel, PortalStyleArgs) => CSSObjectWithLabel): Self = StObject.set(x, "menuPortal", js.Any.fromFunction2(value))
    
    inline def setMenuPortalUndefined: Self = StObject.set(x, "menuPortal", js.undefined)
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setMultiValue(
      value: (/* base */ CSSObjectWithLabel, MultiValueProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "multiValue", js.Any.fromFunction2(value))
    
    inline def setMultiValueLabel(
      value: (/* base */ CSSObjectWithLabel, MultiValueProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "multiValueLabel", js.Any.fromFunction2(value))
    
    inline def setMultiValueLabelUndefined: Self = StObject.set(x, "multiValueLabel", js.undefined)
    
    inline def setMultiValueRemove(
      value: (/* base */ CSSObjectWithLabel, MultiValueProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "multiValueRemove", js.Any.fromFunction2(value))
    
    inline def setMultiValueRemoveUndefined: Self = StObject.set(x, "multiValueRemove", js.undefined)
    
    inline def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
    
    inline def setNoOptionsMessage(value: (/* base */ CSSObjectWithLabel, NoticeProps[Option, IsMulti, Group]) => CSSObjectWithLabel): Self = StObject.set(x, "noOptionsMessage", js.Any.fromFunction2(value))
    
    inline def setNoOptionsMessageUndefined: Self = StObject.set(x, "noOptionsMessage", js.undefined)
    
    inline def setOption(value: (/* base */ CSSObjectWithLabel, OptionProps[Option, IsMulti, Group]) => CSSObjectWithLabel): Self = StObject.set(x, "option", js.Any.fromFunction2(value))
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setPlaceholder(
      value: (/* base */ CSSObjectWithLabel, PlaceholderProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "placeholder", js.Any.fromFunction2(value))
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSingleValue(
      value: (/* base */ CSSObjectWithLabel, SingleValueProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "singleValue", js.Any.fromFunction2(value))
    
    inline def setSingleValueUndefined: Self = StObject.set(x, "singleValue", js.undefined)
    
    inline def setValueContainer(
      value: (/* base */ CSSObjectWithLabel, ValueContainerProps[Option, IsMulti, Group]) => CSSObjectWithLabel
    ): Self = StObject.set(x, "valueContainer", js.Any.fromFunction2(value))
    
    inline def setValueContainerUndefined: Self = StObject.set(x, "valueContainer", js.undefined)
  }
}
