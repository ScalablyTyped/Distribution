package typings.reactSelect

import typings.reactSelect.anon.Container
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
import typings.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcStylesMod {
  
  @JSImport("react-select/dist/declarations/src/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/dist/declarations/src/styles", "defaultStyles")
  @js.native
  val defaultStyles: StylesFunctions[Any, Boolean, GroupBase[Any]] = js.native
  
  inline def mergeStyles[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](source: StylesConfig[Option, IsMulti, Group]): Container[Option, IsMulti, Group] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyles")(source.asInstanceOf[js.Any]).asInstanceOf[Container[Option, IsMulti, Group]]
  inline def mergeStyles[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](source: StylesConfig[Option, IsMulti, Group], target: StylesConfig[Option, IsMulti, Group]): Container[Option, IsMulti, Group] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyles")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Container[Option, IsMulti, Group]]
  
  /* Inlined {[ K in keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group> ]:? react-select.react-select/dist/declarations/src/styles.StylesConfigFunction<react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>[K]>} */
  trait StylesConfig[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
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
  object StylesConfig {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](): StylesConfig[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylesConfig[Option, IsMulti, Group]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StylesConfig[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] (val x: Self & (StylesConfig[Option, IsMulti, Group])) extends AnyVal {
      
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
  
  type StylesConfigFunction[Props] = js.Function2[/* base */ CSSObjectWithLabel, /* props */ Props, CSSObjectWithLabel]
  
  type StylesFunction[Props] = js.Function1[/* props */ Props, CSSObjectWithLabel]
  
  /* Inlined {[ K in keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group> ]: react-select.react-select/dist/declarations/src/styles.StylesFunction<react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>[K]>} */
  trait StylesFunctions[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
    var clearIndicator: StylesFunction[ClearIndicatorProps[Option, IsMulti, Group]]
    
    var container: StylesFunction[ContainerProps[Option, IsMulti, Group]]
    
    var control: StylesFunction[ControlProps[Option, IsMulti, Group]]
    
    var dropdownIndicator: StylesFunction[DropdownIndicatorProps[Option, IsMulti, Group]]
    
    var group: StylesFunction[GroupProps[Option, IsMulti, Group]]
    
    var groupHeading: StylesFunction[GroupHeadingProps[Option, IsMulti, Group]]
    
    var indicatorSeparator: StylesFunction[IndicatorSeparatorProps[Option, IsMulti, Group]]
    
    var indicatorsContainer: StylesFunction[IndicatorsContainerProps[Option, IsMulti, Group]]
    
    var input: StylesFunction[InputProps[Option, IsMulti, Group]]
    
    var loadingIndicator: StylesFunction[LoadingIndicatorProps[Option, IsMulti, Group]]
    
    var loadingMessage: StylesFunction[NoticeProps[Option, IsMulti, Group]]
    
    var menu: StylesFunction[MenuProps[Option, IsMulti, Group]]
    
    var menuList: StylesFunction[MenuListProps[Option, IsMulti, Group]]
    
    var menuPortal: StylesFunction[PortalStyleArgs]
    
    var multiValue: StylesFunction[MultiValueProps[Option, IsMulti, Group]]
    
    var multiValueLabel: StylesFunction[MultiValueProps[Option, IsMulti, Group]]
    
    var multiValueRemove: StylesFunction[MultiValueProps[Option, IsMulti, Group]]
    
    var noOptionsMessage: StylesFunction[NoticeProps[Option, IsMulti, Group]]
    
    var option: StylesFunction[OptionProps[Option, IsMulti, Group]]
    
    var placeholder: StylesFunction[PlaceholderProps[Option, IsMulti, Group]]
    
    var singleValue: StylesFunction[SingleValueProps[Option, IsMulti, Group]]
    
    var valueContainer: StylesFunction[ValueContainerProps[Option, IsMulti, Group]]
  }
  object StylesFunctions {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
      clearIndicator: ClearIndicatorProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      container: ContainerProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      control: ControlProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      dropdownIndicator: DropdownIndicatorProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      group: GroupProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      groupHeading: GroupHeadingProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      indicatorSeparator: IndicatorSeparatorProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      indicatorsContainer: IndicatorsContainerProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      input: InputProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      loadingIndicator: LoadingIndicatorProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      loadingMessage: NoticeProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      menu: MenuProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      menuList: MenuListProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      menuPortal: PortalStyleArgs => CSSObjectWithLabel,
      multiValue: MultiValueProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      multiValueLabel: MultiValueProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      multiValueRemove: MultiValueProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      noOptionsMessage: NoticeProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      option: OptionProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      placeholder: PlaceholderProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      singleValue: SingleValueProps[Option, IsMulti, Group] => CSSObjectWithLabel,
      valueContainer: ValueContainerProps[Option, IsMulti, Group] => CSSObjectWithLabel
    ): StylesFunctions[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal(clearIndicator = js.Any.fromFunction1(clearIndicator), container = js.Any.fromFunction1(container), control = js.Any.fromFunction1(control), dropdownIndicator = js.Any.fromFunction1(dropdownIndicator), group = js.Any.fromFunction1(group), groupHeading = js.Any.fromFunction1(groupHeading), indicatorSeparator = js.Any.fromFunction1(indicatorSeparator), indicatorsContainer = js.Any.fromFunction1(indicatorsContainer), input = js.Any.fromFunction1(input), loadingIndicator = js.Any.fromFunction1(loadingIndicator), loadingMessage = js.Any.fromFunction1(loadingMessage), menu = js.Any.fromFunction1(menu), menuList = js.Any.fromFunction1(menuList), menuPortal = js.Any.fromFunction1(menuPortal), multiValue = js.Any.fromFunction1(multiValue), multiValueLabel = js.Any.fromFunction1(multiValueLabel), multiValueRemove = js.Any.fromFunction1(multiValueRemove), noOptionsMessage = js.Any.fromFunction1(noOptionsMessage), option = js.Any.fromFunction1(option), placeholder = js.Any.fromFunction1(placeholder), singleValue = js.Any.fromFunction1(singleValue), valueContainer = js.Any.fromFunction1(valueContainer))
      __obj.asInstanceOf[StylesFunctions[Option, IsMulti, Group]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StylesFunctions[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] (val x: Self & (StylesFunctions[Option, IsMulti, Group])) extends AnyVal {
      
      inline def setClearIndicator(value: ClearIndicatorProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "clearIndicator", js.Any.fromFunction1(value))
      
      inline def setContainer(value: ContainerProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "container", js.Any.fromFunction1(value))
      
      inline def setControl(value: ControlProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "control", js.Any.fromFunction1(value))
      
      inline def setDropdownIndicator(value: DropdownIndicatorProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "dropdownIndicator", js.Any.fromFunction1(value))
      
      inline def setGroup(value: GroupProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
      
      inline def setGroupHeading(value: GroupHeadingProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "groupHeading", js.Any.fromFunction1(value))
      
      inline def setIndicatorSeparator(value: IndicatorSeparatorProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "indicatorSeparator", js.Any.fromFunction1(value))
      
      inline def setIndicatorsContainer(value: IndicatorsContainerProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "indicatorsContainer", js.Any.fromFunction1(value))
      
      inline def setInput(value: InputProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
      
      inline def setLoadingIndicator(value: LoadingIndicatorProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "loadingIndicator", js.Any.fromFunction1(value))
      
      inline def setLoadingMessage(value: NoticeProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction1(value))
      
      inline def setMenu(value: MenuProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "menu", js.Any.fromFunction1(value))
      
      inline def setMenuList(value: MenuListProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "menuList", js.Any.fromFunction1(value))
      
      inline def setMenuPortal(value: PortalStyleArgs => CSSObjectWithLabel): Self = StObject.set(x, "menuPortal", js.Any.fromFunction1(value))
      
      inline def setMultiValue(value: MultiValueProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "multiValue", js.Any.fromFunction1(value))
      
      inline def setMultiValueLabel(value: MultiValueProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "multiValueLabel", js.Any.fromFunction1(value))
      
      inline def setMultiValueRemove(value: MultiValueProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "multiValueRemove", js.Any.fromFunction1(value))
      
      inline def setNoOptionsMessage(value: NoticeProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "noOptionsMessage", js.Any.fromFunction1(value))
      
      inline def setOption(value: OptionProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "option", js.Any.fromFunction1(value))
      
      inline def setPlaceholder(value: PlaceholderProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "placeholder", js.Any.fromFunction1(value))
      
      inline def setSingleValue(value: SingleValueProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "singleValue", js.Any.fromFunction1(value))
      
      inline def setValueContainer(value: ValueContainerProps[Option, IsMulti, Group] => CSSObjectWithLabel): Self = StObject.set(x, "valueContainer", js.Any.fromFunction1(value))
    }
  }
  
  trait StylesProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
    var clearIndicator: ClearIndicatorProps[Option, IsMulti, Group]
    
    var container: ContainerProps[Option, IsMulti, Group]
    
    var control: ControlProps[Option, IsMulti, Group]
    
    var dropdownIndicator: DropdownIndicatorProps[Option, IsMulti, Group]
    
    var group: GroupProps[Option, IsMulti, Group]
    
    var groupHeading: GroupHeadingProps[Option, IsMulti, Group]
    
    var indicatorSeparator: IndicatorSeparatorProps[Option, IsMulti, Group]
    
    var indicatorsContainer: IndicatorsContainerProps[Option, IsMulti, Group]
    
    var input: InputProps[Option, IsMulti, Group]
    
    var loadingIndicator: LoadingIndicatorProps[Option, IsMulti, Group]
    
    var loadingMessage: NoticeProps[Option, IsMulti, Group]
    
    var menu: MenuProps[Option, IsMulti, Group]
    
    var menuList: MenuListProps[Option, IsMulti, Group]
    
    var menuPortal: PortalStyleArgs
    
    var multiValue: MultiValueProps[Option, IsMulti, Group]
    
    var multiValueLabel: MultiValueProps[Option, IsMulti, Group]
    
    var multiValueRemove: MultiValueProps[Option, IsMulti, Group]
    
    var noOptionsMessage: NoticeProps[Option, IsMulti, Group]
    
    var option: OptionProps[Option, IsMulti, Group]
    
    var placeholder: PlaceholderProps[Option, IsMulti, Group]
    
    var singleValue: SingleValueProps[Option, IsMulti, Group]
    
    var valueContainer: ValueContainerProps[Option, IsMulti, Group]
  }
  object StylesProps {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
      clearIndicator: ClearIndicatorProps[Option, IsMulti, Group],
      container: ContainerProps[Option, IsMulti, Group],
      control: ControlProps[Option, IsMulti, Group],
      dropdownIndicator: DropdownIndicatorProps[Option, IsMulti, Group],
      group: GroupProps[Option, IsMulti, Group],
      groupHeading: GroupHeadingProps[Option, IsMulti, Group],
      indicatorSeparator: IndicatorSeparatorProps[Option, IsMulti, Group],
      indicatorsContainer: IndicatorsContainerProps[Option, IsMulti, Group],
      input: InputProps[Option, IsMulti, Group],
      loadingIndicator: LoadingIndicatorProps[Option, IsMulti, Group],
      loadingMessage: NoticeProps[Option, IsMulti, Group],
      menu: MenuProps[Option, IsMulti, Group],
      menuList: MenuListProps[Option, IsMulti, Group],
      menuPortal: PortalStyleArgs,
      multiValue: MultiValueProps[Option, IsMulti, Group],
      multiValueLabel: MultiValueProps[Option, IsMulti, Group],
      multiValueRemove: MultiValueProps[Option, IsMulti, Group],
      noOptionsMessage: NoticeProps[Option, IsMulti, Group],
      option: OptionProps[Option, IsMulti, Group],
      placeholder: PlaceholderProps[Option, IsMulti, Group],
      singleValue: SingleValueProps[Option, IsMulti, Group],
      valueContainer: ValueContainerProps[Option, IsMulti, Group]
    ): StylesProps[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal(clearIndicator = clearIndicator.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], dropdownIndicator = dropdownIndicator.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupHeading = groupHeading.asInstanceOf[js.Any], indicatorSeparator = indicatorSeparator.asInstanceOf[js.Any], indicatorsContainer = indicatorsContainer.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], loadingIndicator = loadingIndicator.asInstanceOf[js.Any], loadingMessage = loadingMessage.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuList = menuList.asInstanceOf[js.Any], menuPortal = menuPortal.asInstanceOf[js.Any], multiValue = multiValue.asInstanceOf[js.Any], multiValueLabel = multiValueLabel.asInstanceOf[js.Any], multiValueRemove = multiValueRemove.asInstanceOf[js.Any], noOptionsMessage = noOptionsMessage.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], singleValue = singleValue.asInstanceOf[js.Any], valueContainer = valueContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylesProps[Option, IsMulti, Group]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StylesProps[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] (val x: Self & (StylesProps[Option, IsMulti, Group])) extends AnyVal {
      
      inline def setClearIndicator(value: ClearIndicatorProps[Option, IsMulti, Group]): Self = StObject.set(x, "clearIndicator", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ContainerProps[Option, IsMulti, Group]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setControl(value: ControlProps[Option, IsMulti, Group]): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setDropdownIndicator(value: DropdownIndicatorProps[Option, IsMulti, Group]): Self = StObject.set(x, "dropdownIndicator", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: GroupProps[Option, IsMulti, Group]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupHeading(value: GroupHeadingProps[Option, IsMulti, Group]): Self = StObject.set(x, "groupHeading", value.asInstanceOf[js.Any])
      
      inline def setIndicatorSeparator(value: IndicatorSeparatorProps[Option, IsMulti, Group]): Self = StObject.set(x, "indicatorSeparator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorsContainer(value: IndicatorsContainerProps[Option, IsMulti, Group]): Self = StObject.set(x, "indicatorsContainer", value.asInstanceOf[js.Any])
      
      inline def setInput(value: InputProps[Option, IsMulti, Group]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLoadingIndicator(value: LoadingIndicatorProps[Option, IsMulti, Group]): Self = StObject.set(x, "loadingIndicator", value.asInstanceOf[js.Any])
      
      inline def setLoadingMessage(value: NoticeProps[Option, IsMulti, Group]): Self = StObject.set(x, "loadingMessage", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: MenuProps[Option, IsMulti, Group]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuList(value: MenuListProps[Option, IsMulti, Group]): Self = StObject.set(x, "menuList", value.asInstanceOf[js.Any])
      
      inline def setMenuPortal(value: PortalStyleArgs): Self = StObject.set(x, "menuPortal", value.asInstanceOf[js.Any])
      
      inline def setMultiValue(value: MultiValueProps[Option, IsMulti, Group]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
      
      inline def setMultiValueLabel(value: MultiValueProps[Option, IsMulti, Group]): Self = StObject.set(x, "multiValueLabel", value.asInstanceOf[js.Any])
      
      inline def setMultiValueRemove(value: MultiValueProps[Option, IsMulti, Group]): Self = StObject.set(x, "multiValueRemove", value.asInstanceOf[js.Any])
      
      inline def setNoOptionsMessage(value: NoticeProps[Option, IsMulti, Group]): Self = StObject.set(x, "noOptionsMessage", value.asInstanceOf[js.Any])
      
      inline def setOption(value: OptionProps[Option, IsMulti, Group]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: PlaceholderProps[Option, IsMulti, Group]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setSingleValue(value: SingleValueProps[Option, IsMulti, Group]): Self = StObject.set(x, "singleValue", value.asInstanceOf[js.Any])
      
      inline def setValueContainer(value: ValueContainerProps[Option, IsMulti, Group]): Self = StObject.set(x, "valueContainer", value.asInstanceOf[js.Any])
    }
  }
}
