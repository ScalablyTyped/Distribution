package typings.reactSelect

import org.scalablytyped.runtime.Instantiable0
import typings.emotionReact.emotionReactMod.jsx.JSX.Element
import typings.react.mod.ComponentType
import typings.reactSelect.anon.CallProps
import typings.reactSelect.anon.DefaultProps
import typings.reactSelect.anon.DefaultPropsChildren
import typings.reactSelect.anon.FnCall
import typings.reactSelect.componentsInputMod.InputProps
import typings.reactSelect.componentsMultiValueMod.MultiValueGenericProps
import typings.reactSelect.componentsMultiValueMod.MultiValueProps
import typings.reactSelect.componentsMultiValueMod.MultiValueRemoveProps
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.componentsSingleValueMod.SingleValueProps
import typings.reactSelect.containersMod.ContainerProps
import typings.reactSelect.containersMod.IndicatorsContainerProps
import typings.reactSelect.containersMod.ValueContainerProps
import typings.reactSelect.controlMod.ControlProps
import typings.reactSelect.groupMod.GroupHeadingProps
import typings.reactSelect.groupMod.GroupProps
import typings.reactSelect.indicatorsMod.ClearIndicatorProps
import typings.reactSelect.indicatorsMod.CrossIconProps
import typings.reactSelect.indicatorsMod.DownChevronProps
import typings.reactSelect.indicatorsMod.DropdownIndicatorProps
import typings.reactSelect.indicatorsMod.IndicatorSeparatorProps
import typings.reactSelect.indicatorsMod.LoadingIndicatorProps
import typings.reactSelect.menuMod.MenuListProps
import typings.reactSelect.menuMod.MenuPortalProps
import typings.reactSelect.menuMod.MenuProps
import typings.reactSelect.menuMod.NoticeProps
import typings.reactSelect.optionMod.OptionProps
import typings.reactSelect.typesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("react-select/dist/declarations/src/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object components {
    
    @JSImport("react-select/dist/declarations/src/components", "components")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ClearIndicator[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: ClearIndicatorProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearIndicator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Control[Option_1, IsMulti_1 /* <: Boolean */, Group_1 /* <: GroupBase[Option_1] */](props: ControlProps[Option_1, IsMulti_1, Group_1]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Control")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def CrossIcon(props: CrossIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CrossIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def DownChevron(props: DownChevronProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DownChevron")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def DropdownIndicator[Option_2, IsMulti_2 /* <: Boolean */, Group_2 /* <: GroupBase[Option_2] */](props: DropdownIndicatorProps[Option_2, IsMulti_2, Group_2]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DropdownIndicator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Group[Option_3, IsMulti_3 /* <: Boolean */, Group_3 /* <: GroupBase[Option_3] */](props: GroupProps[Option_3, IsMulti_3, Group_3]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Group")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def GroupHeading[Option_4, IsMulti_4 /* <: Boolean */, Group_4 /* <: GroupBase[Option_4] */](props: GroupHeadingProps[Option_4, IsMulti_4, Group_4]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GroupHeading")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def IndicatorSeparator[Option_6, IsMulti_6 /* <: Boolean */, Group_6 /* <: GroupBase[Option_6] */](props: IndicatorSeparatorProps[Option_6, IsMulti_6, Group_6]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IndicatorSeparator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def IndicatorsContainer[Option_5, IsMulti_5 /* <: Boolean */, Group_5 /* <: GroupBase[Option_5] */](props: IndicatorsContainerProps[Option_5, IsMulti_5, Group_5]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IndicatorsContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Input[Option_7, IsMulti_7 /* <: Boolean */, Group_7 /* <: GroupBase[Option_7] */](props: InputProps[Option_7, IsMulti_7, Group_7]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Input")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-select/dist/declarations/src/components", "components.LoadingIndicator")
    @js.native
    def LoadingIndicator: CallProps = js.native
    inline def LoadingIndicator_=(x: CallProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/components", "components.LoadingMessage")
    @js.native
    def LoadingMessage: DefaultPropsChildren = js.native
    inline def LoadingMessage_=(x: DefaultPropsChildren): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingMessage")(x.asInstanceOf[js.Any])
    
    inline def Menu[Option_9, IsMulti_9 /* <: Boolean */, Group_9 /* <: GroupBase[Option_9] */](props: MenuProps[Option_9, IsMulti_9, Group_9]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Menu")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def MenuList[Option_10, IsMulti_10 /* <: Boolean */, Group_10 /* <: GroupBase[Option_10] */](props: MenuListProps[Option_10, IsMulti_10, Group_10]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuList")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-select/dist/declarations/src/components", "components.MenuPortal")
    @js.native
    open class MenuPortal[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[/* import warning: RewrittenClass.unapply cls was tparam Option */ Any] */] ()
      extends typings.reactSelect.menuMod.MenuPortal[Option, IsMulti, Group]
    @JSImport("react-select/dist/declarations/src/components", "components.MenuPortal")
    @js.native
    def MenuPortal: Instantiable0[
        typings.reactSelect.menuMod.MenuPortal[
          js.Object, 
          Boolean, 
          GroupBase[/* import warning: RewrittenClass.unapply cls was tparam Option */ Any]
        ]
      ] = js.native
    inline def MenuPortal_=(
      x: Instantiable0[
          typings.reactSelect.menuMod.MenuPortal[
            js.Object, 
            Boolean, 
            GroupBase[/* import warning: RewrittenClass.unapply cls was tparam Option */ Any]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MenuPortal")(x.asInstanceOf[js.Any])
    
    inline def MultiValue[Option_13, IsMulti_13 /* <: Boolean */, Group_13 /* <: GroupBase[Option_13] */](props: MultiValueProps[Option_13, IsMulti_13, Group_13]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValue")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def MultiValueContainer[Option_14, IsMulti_14 /* <: Boolean */, Group_14 /* <: GroupBase[Option_14] */](hasChildrenInnerProps: MultiValueGenericProps[Option_14, IsMulti_14, Group_14]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValueContainer")(hasChildrenInnerProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def MultiValueLabel[Option_14, IsMulti_14 /* <: Boolean */, Group_14 /* <: GroupBase[Option_14] */](hasChildrenInnerProps: MultiValueGenericProps[Option_14, IsMulti_14, Group_14]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValueLabel")(hasChildrenInnerProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-select/dist/declarations/src/components", "components.MultiValueRemove")
    @js.native
    def MultiValueRemove: FnCall = js.native
    inline def MultiValueRemove_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueRemove")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/components", "components.NoOptionsMessage")
    @js.native
    def NoOptionsMessage: DefaultProps = js.native
    inline def NoOptionsMessage_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoOptionsMessage")(x.asInstanceOf[js.Any])
    
    inline def Option[Option_15, IsMulti_15 /* <: Boolean */, Group_15 /* <: GroupBase[Option_15] */](props: OptionProps[Option_15, IsMulti_15, Group_15]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Option")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Placeholder[Option_16, IsMulti_16 /* <: Boolean */, Group_16 /* <: GroupBase[Option_16] */](props: PlaceholderProps[Option_16, IsMulti_16, Group_16]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Placeholder")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def SelectContainer[Option_17, IsMulti_17 /* <: Boolean */, Group_17 /* <: GroupBase[Option_17] */](props: ContainerProps[Option_17, IsMulti_17, Group_17]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def SingleValue[Option_18, IsMulti_18 /* <: Boolean */, Group_18 /* <: GroupBase[Option_18] */](props: SingleValueProps[Option_18, IsMulti_18, Group_18]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SingleValue")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def ValueContainer[Option_19, IsMulti_19 /* <: Boolean */, Group_19 /* <: GroupBase[Option_19] */](props: ValueContainerProps[Option_19, IsMulti_19, Group_19]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ValueContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  inline def defaultComponents[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: Props[Option, IsMulti, Group]): SelectComponentsGeneric = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultComponents")(props.asInstanceOf[js.Any]).asInstanceOf[SelectComponentsGeneric]
  
  trait Props[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
    var components: SelectComponentsConfig[Option, IsMulti, Group]
  }
  object Props {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](components: SelectComponentsConfig[Option, IsMulti, Group]): Props[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[Option, IsMulti, Group]]
    }
    
    extension [Self <: Props[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](x: Self & (Props[Option, IsMulti, Group])) {
      
      inline def setComponents(value: SelectComponentsConfig[Option, IsMulti, Group]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectComponents[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
    var ClearIndicator: ComponentType[ClearIndicatorProps[Option, IsMulti, Group]]
    
    var Control: ComponentType[ControlProps[Option, IsMulti, Group]]
    
    var CrossIcon: ComponentType[CrossIconProps]
    
    var DownChevron: ComponentType[DownChevronProps]
    
    var DropdownIndicator: (ComponentType[DropdownIndicatorProps[Option, IsMulti, Group]]) | Null
    
    var Group: ComponentType[GroupProps[Option, IsMulti, Group]]
    
    var GroupHeading: ComponentType[GroupHeadingProps[Option, IsMulti, Group]]
    
    var IndicatorSeparator: (ComponentType[IndicatorSeparatorProps[Option, IsMulti, Group]]) | Null
    
    var IndicatorsContainer: ComponentType[IndicatorsContainerProps[Option, IsMulti, Group]]
    
    var Input: ComponentType[InputProps[Option, IsMulti, Group]]
    
    var LoadingIndicator: ComponentType[LoadingIndicatorProps[Option, IsMulti, Group]]
    
    var LoadingMessage: ComponentType[NoticeProps[Option, IsMulti, Group]]
    
    var Menu: ComponentType[MenuProps[Option, IsMulti, Group]]
    
    var MenuList: ComponentType[MenuListProps[Option, IsMulti, Group]]
    
    var MenuPortal: ComponentType[MenuPortalProps[Option, IsMulti, Group]]
    
    var MultiValue: ComponentType[MultiValueProps[Option, IsMulti, Group]]
    
    var MultiValueContainer: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]
    
    var MultiValueLabel: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]
    
    var MultiValueRemove: ComponentType[MultiValueRemoveProps[Option, IsMulti, Group]]
    
    var NoOptionsMessage: ComponentType[NoticeProps[Option, IsMulti, Group]]
    
    var Option: ComponentType[OptionProps[Option, IsMulti, Group]]
    
    var Placeholder: ComponentType[PlaceholderProps[Option, IsMulti, Group]]
    
    var SelectContainer: ComponentType[ContainerProps[Option, IsMulti, Group]]
    
    var SingleValue: ComponentType[SingleValueProps[Option, IsMulti, Group]]
    
    var ValueContainer: ComponentType[ValueContainerProps[Option, IsMulti, Group]]
  }
  object SelectComponents {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
      ClearIndicator: ComponentType[ClearIndicatorProps[Option, IsMulti, Group]],
      Control: ComponentType[ControlProps[Option, IsMulti, Group]],
      CrossIcon: ComponentType[CrossIconProps],
      DownChevron: ComponentType[DownChevronProps],
      Group: ComponentType[GroupProps[Option, IsMulti, Group]],
      GroupHeading: ComponentType[GroupHeadingProps[Option, IsMulti, Group]],
      IndicatorsContainer: ComponentType[IndicatorsContainerProps[Option, IsMulti, Group]],
      Input: ComponentType[InputProps[Option, IsMulti, Group]],
      LoadingIndicator: ComponentType[LoadingIndicatorProps[Option, IsMulti, Group]],
      LoadingMessage: ComponentType[NoticeProps[Option, IsMulti, Group]],
      Menu: ComponentType[MenuProps[Option, IsMulti, Group]],
      MenuList: ComponentType[MenuListProps[Option, IsMulti, Group]],
      MenuPortal: ComponentType[MenuPortalProps[Option, IsMulti, Group]],
      MultiValue: ComponentType[MultiValueProps[Option, IsMulti, Group]],
      MultiValueContainer: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]],
      MultiValueLabel: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]],
      MultiValueRemove: ComponentType[MultiValueRemoveProps[Option, IsMulti, Group]],
      NoOptionsMessage: ComponentType[NoticeProps[Option, IsMulti, Group]],
      Option: ComponentType[OptionProps[Option, IsMulti, Group]],
      Placeholder: ComponentType[PlaceholderProps[Option, IsMulti, Group]],
      SelectContainer: ComponentType[ContainerProps[Option, IsMulti, Group]],
      SingleValue: ComponentType[SingleValueProps[Option, IsMulti, Group]],
      ValueContainer: ComponentType[ValueContainerProps[Option, IsMulti, Group]]
    ): SelectComponents[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal(ClearIndicator = ClearIndicator.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], CrossIcon = CrossIcon.asInstanceOf[js.Any], DownChevron = DownChevron.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupHeading = GroupHeading.asInstanceOf[js.Any], IndicatorsContainer = IndicatorsContainer.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], LoadingIndicator = LoadingIndicator.asInstanceOf[js.Any], LoadingMessage = LoadingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuList = MenuList.asInstanceOf[js.Any], MenuPortal = MenuPortal.asInstanceOf[js.Any], MultiValue = MultiValue.asInstanceOf[js.Any], MultiValueContainer = MultiValueContainer.asInstanceOf[js.Any], MultiValueLabel = MultiValueLabel.asInstanceOf[js.Any], MultiValueRemove = MultiValueRemove.asInstanceOf[js.Any], NoOptionsMessage = NoOptionsMessage.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], Placeholder = Placeholder.asInstanceOf[js.Any], SelectContainer = SelectContainer.asInstanceOf[js.Any], SingleValue = SingleValue.asInstanceOf[js.Any], ValueContainer = ValueContainer.asInstanceOf[js.Any], DropdownIndicator = null, IndicatorSeparator = null)
      __obj.asInstanceOf[SelectComponents[Option, IsMulti, Group]]
    }
    
    extension [Self <: SelectComponents[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](x: Self & (SelectComponents[Option, IsMulti, Group])) {
      
      inline def setClearIndicator(value: ComponentType[ClearIndicatorProps[Option, IsMulti, Group]]): Self = StObject.set(x, "ClearIndicator", value.asInstanceOf[js.Any])
      
      inline def setControl(value: ComponentType[ControlProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      inline def setCrossIcon(value: ComponentType[CrossIconProps]): Self = StObject.set(x, "CrossIcon", value.asInstanceOf[js.Any])
      
      inline def setDownChevron(value: ComponentType[DownChevronProps]): Self = StObject.set(x, "DownChevron", value.asInstanceOf[js.Any])
      
      inline def setDropdownIndicator(value: ComponentType[DropdownIndicatorProps[Option, IsMulti, Group]]): Self = StObject.set(x, "DropdownIndicator", value.asInstanceOf[js.Any])
      
      inline def setDropdownIndicatorNull: Self = StObject.set(x, "DropdownIndicator", null)
      
      inline def setGroup(value: ComponentType[GroupProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setGroupHeading(value: ComponentType[GroupHeadingProps[Option, IsMulti, Group]]): Self = StObject.set(x, "GroupHeading", value.asInstanceOf[js.Any])
      
      inline def setIndicatorSeparator(value: ComponentType[IndicatorSeparatorProps[Option, IsMulti, Group]]): Self = StObject.set(x, "IndicatorSeparator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorSeparatorNull: Self = StObject.set(x, "IndicatorSeparator", null)
      
      inline def setIndicatorsContainer(value: ComponentType[IndicatorsContainerProps[Option, IsMulti, Group]]): Self = StObject.set(x, "IndicatorsContainer", value.asInstanceOf[js.Any])
      
      inline def setInput(value: ComponentType[InputProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setLoadingIndicator(value: ComponentType[LoadingIndicatorProps[Option, IsMulti, Group]]): Self = StObject.set(x, "LoadingIndicator", value.asInstanceOf[js.Any])
      
      inline def setLoadingMessage(value: ComponentType[NoticeProps[Option, IsMulti, Group]]): Self = StObject.set(x, "LoadingMessage", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: ComponentType[MenuProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      inline def setMenuList(value: ComponentType[MenuListProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MenuList", value.asInstanceOf[js.Any])
      
      inline def setMenuPortal(value: ComponentType[MenuPortalProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MenuPortal", value.asInstanceOf[js.Any])
      
      inline def setMultiValue(value: ComponentType[MultiValueProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MultiValue", value.asInstanceOf[js.Any])
      
      inline def setMultiValueContainer(value: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MultiValueContainer", value.asInstanceOf[js.Any])
      
      inline def setMultiValueLabel(value: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MultiValueLabel", value.asInstanceOf[js.Any])
      
      inline def setMultiValueRemove(value: ComponentType[MultiValueRemoveProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MultiValueRemove", value.asInstanceOf[js.Any])
      
      inline def setNoOptionsMessage(value: ComponentType[NoticeProps[Option, IsMulti, Group]]): Self = StObject.set(x, "NoOptionsMessage", value.asInstanceOf[js.Any])
      
      inline def setOption(value: ComponentType[OptionProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: ComponentType[PlaceholderProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Placeholder", value.asInstanceOf[js.Any])
      
      inline def setSelectContainer(value: ComponentType[ContainerProps[Option, IsMulti, Group]]): Self = StObject.set(x, "SelectContainer", value.asInstanceOf[js.Any])
      
      inline def setSingleValue(value: ComponentType[SingleValueProps[Option, IsMulti, Group]]): Self = StObject.set(x, "SingleValue", value.asInstanceOf[js.Any])
      
      inline def setValueContainer(value: ComponentType[ValueContainerProps[Option, IsMulti, Group]]): Self = StObject.set(x, "ValueContainer", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-select.react-select/dist/declarations/src/components.SelectComponents<Option, IsMulti, Group>> */
  trait SelectComponentsConfig[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
    var ClearIndicator: js.UndefOr[ComponentType[ClearIndicatorProps[Option, IsMulti, Group]]] = js.undefined
    
    var Control: js.UndefOr[ComponentType[ControlProps[Option, IsMulti, Group]]] = js.undefined
    
    var CrossIcon: js.UndefOr[ComponentType[CrossIconProps]] = js.undefined
    
    var DownChevron: js.UndefOr[ComponentType[DownChevronProps]] = js.undefined
    
    var DropdownIndicator: js.UndefOr[(ComponentType[DropdownIndicatorProps[Option, IsMulti, Group]]) | Null] = js.undefined
    
    var Group: js.UndefOr[ComponentType[GroupProps[Option, IsMulti, Group]]] = js.undefined
    
    var GroupHeading: js.UndefOr[ComponentType[GroupHeadingProps[Option, IsMulti, Group]]] = js.undefined
    
    var IndicatorSeparator: js.UndefOr[(ComponentType[IndicatorSeparatorProps[Option, IsMulti, Group]]) | Null] = js.undefined
    
    var IndicatorsContainer: js.UndefOr[ComponentType[IndicatorsContainerProps[Option, IsMulti, Group]]] = js.undefined
    
    var Input: js.UndefOr[ComponentType[InputProps[Option, IsMulti, Group]]] = js.undefined
    
    var LoadingIndicator: js.UndefOr[ComponentType[LoadingIndicatorProps[Option, IsMulti, Group]]] = js.undefined
    
    var LoadingMessage: js.UndefOr[ComponentType[NoticeProps[Option, IsMulti, Group]]] = js.undefined
    
    var Menu: js.UndefOr[ComponentType[MenuProps[Option, IsMulti, Group]]] = js.undefined
    
    var MenuList: js.UndefOr[ComponentType[MenuListProps[Option, IsMulti, Group]]] = js.undefined
    
    var MenuPortal: js.UndefOr[ComponentType[MenuPortalProps[Option, IsMulti, Group]]] = js.undefined
    
    var MultiValue: js.UndefOr[ComponentType[MultiValueProps[Option, IsMulti, Group]]] = js.undefined
    
    var MultiValueContainer: js.UndefOr[ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]] = js.undefined
    
    var MultiValueLabel: js.UndefOr[ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]] = js.undefined
    
    var MultiValueRemove: js.UndefOr[ComponentType[MultiValueRemoveProps[Option, IsMulti, Group]]] = js.undefined
    
    var NoOptionsMessage: js.UndefOr[ComponentType[NoticeProps[Option, IsMulti, Group]]] = js.undefined
    
    var Option: js.UndefOr[ComponentType[OptionProps[Option, IsMulti, Group]]] = js.undefined
    
    var Placeholder: js.UndefOr[ComponentType[PlaceholderProps[Option, IsMulti, Group]]] = js.undefined
    
    var SelectContainer: js.UndefOr[ComponentType[ContainerProps[Option, IsMulti, Group]]] = js.undefined
    
    var SingleValue: js.UndefOr[ComponentType[SingleValueProps[Option, IsMulti, Group]]] = js.undefined
    
    var ValueContainer: js.UndefOr[ComponentType[ValueContainerProps[Option, IsMulti, Group]]] = js.undefined
  }
  object SelectComponentsConfig {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](): SelectComponentsConfig[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectComponentsConfig[Option, IsMulti, Group]]
    }
    
    extension [Self <: SelectComponentsConfig[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](x: Self & (SelectComponentsConfig[Option, IsMulti, Group])) {
      
      inline def setClearIndicator(value: ComponentType[ClearIndicatorProps[Option, IsMulti, Group]]): Self = StObject.set(x, "ClearIndicator", value.asInstanceOf[js.Any])
      
      inline def setClearIndicatorUndefined: Self = StObject.set(x, "ClearIndicator", js.undefined)
      
      inline def setControl(value: ComponentType[ControlProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      inline def setControlUndefined: Self = StObject.set(x, "Control", js.undefined)
      
      inline def setCrossIcon(value: ComponentType[CrossIconProps]): Self = StObject.set(x, "CrossIcon", value.asInstanceOf[js.Any])
      
      inline def setCrossIconUndefined: Self = StObject.set(x, "CrossIcon", js.undefined)
      
      inline def setDownChevron(value: ComponentType[DownChevronProps]): Self = StObject.set(x, "DownChevron", value.asInstanceOf[js.Any])
      
      inline def setDownChevronUndefined: Self = StObject.set(x, "DownChevron", js.undefined)
      
      inline def setDropdownIndicator(value: ComponentType[DropdownIndicatorProps[Option, IsMulti, Group]]): Self = StObject.set(x, "DropdownIndicator", value.asInstanceOf[js.Any])
      
      inline def setDropdownIndicatorNull: Self = StObject.set(x, "DropdownIndicator", null)
      
      inline def setDropdownIndicatorUndefined: Self = StObject.set(x, "DropdownIndicator", js.undefined)
      
      inline def setGroup(value: ComponentType[GroupProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setGroupHeading(value: ComponentType[GroupHeadingProps[Option, IsMulti, Group]]): Self = StObject.set(x, "GroupHeading", value.asInstanceOf[js.Any])
      
      inline def setGroupHeadingUndefined: Self = StObject.set(x, "GroupHeading", js.undefined)
      
      inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
      
      inline def setIndicatorSeparator(value: ComponentType[IndicatorSeparatorProps[Option, IsMulti, Group]]): Self = StObject.set(x, "IndicatorSeparator", value.asInstanceOf[js.Any])
      
      inline def setIndicatorSeparatorNull: Self = StObject.set(x, "IndicatorSeparator", null)
      
      inline def setIndicatorSeparatorUndefined: Self = StObject.set(x, "IndicatorSeparator", js.undefined)
      
      inline def setIndicatorsContainer(value: ComponentType[IndicatorsContainerProps[Option, IsMulti, Group]]): Self = StObject.set(x, "IndicatorsContainer", value.asInstanceOf[js.Any])
      
      inline def setIndicatorsContainerUndefined: Self = StObject.set(x, "IndicatorsContainer", js.undefined)
      
      inline def setInput(value: ComponentType[InputProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      inline def setLoadingIndicator(value: ComponentType[LoadingIndicatorProps[Option, IsMulti, Group]]): Self = StObject.set(x, "LoadingIndicator", value.asInstanceOf[js.Any])
      
      inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "LoadingIndicator", js.undefined)
      
      inline def setLoadingMessage(value: ComponentType[NoticeProps[Option, IsMulti, Group]]): Self = StObject.set(x, "LoadingMessage", value.asInstanceOf[js.Any])
      
      inline def setLoadingMessageUndefined: Self = StObject.set(x, "LoadingMessage", js.undefined)
      
      inline def setMenu(value: ComponentType[MenuProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      inline def setMenuList(value: ComponentType[MenuListProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MenuList", value.asInstanceOf[js.Any])
      
      inline def setMenuListUndefined: Self = StObject.set(x, "MenuList", js.undefined)
      
      inline def setMenuPortal(value: ComponentType[MenuPortalProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MenuPortal", value.asInstanceOf[js.Any])
      
      inline def setMenuPortalUndefined: Self = StObject.set(x, "MenuPortal", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "Menu", js.undefined)
      
      inline def setMultiValue(value: ComponentType[MultiValueProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MultiValue", value.asInstanceOf[js.Any])
      
      inline def setMultiValueContainer(value: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MultiValueContainer", value.asInstanceOf[js.Any])
      
      inline def setMultiValueContainerUndefined: Self = StObject.set(x, "MultiValueContainer", js.undefined)
      
      inline def setMultiValueLabel(value: ComponentType[MultiValueGenericProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MultiValueLabel", value.asInstanceOf[js.Any])
      
      inline def setMultiValueLabelUndefined: Self = StObject.set(x, "MultiValueLabel", js.undefined)
      
      inline def setMultiValueRemove(value: ComponentType[MultiValueRemoveProps[Option, IsMulti, Group]]): Self = StObject.set(x, "MultiValueRemove", value.asInstanceOf[js.Any])
      
      inline def setMultiValueRemoveUndefined: Self = StObject.set(x, "MultiValueRemove", js.undefined)
      
      inline def setMultiValueUndefined: Self = StObject.set(x, "MultiValue", js.undefined)
      
      inline def setNoOptionsMessage(value: ComponentType[NoticeProps[Option, IsMulti, Group]]): Self = StObject.set(x, "NoOptionsMessage", value.asInstanceOf[js.Any])
      
      inline def setNoOptionsMessageUndefined: Self = StObject.set(x, "NoOptionsMessage", js.undefined)
      
      inline def setOption(value: ComponentType[OptionProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "Option", js.undefined)
      
      inline def setPlaceholder(value: ComponentType[PlaceholderProps[Option, IsMulti, Group]]): Self = StObject.set(x, "Placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "Placeholder", js.undefined)
      
      inline def setSelectContainer(value: ComponentType[ContainerProps[Option, IsMulti, Group]]): Self = StObject.set(x, "SelectContainer", value.asInstanceOf[js.Any])
      
      inline def setSelectContainerUndefined: Self = StObject.set(x, "SelectContainer", js.undefined)
      
      inline def setSingleValue(value: ComponentType[SingleValueProps[Option, IsMulti, Group]]): Self = StObject.set(x, "SingleValue", value.asInstanceOf[js.Any])
      
      inline def setSingleValueUndefined: Self = StObject.set(x, "SingleValue", js.undefined)
      
      inline def setValueContainer(value: ComponentType[ValueContainerProps[Option, IsMulti, Group]]): Self = StObject.set(x, "ValueContainer", value.asInstanceOf[js.Any])
      
      inline def setValueContainerUndefined: Self = StObject.set(x, "ValueContainer", js.undefined)
    }
  }
  
  trait SelectComponentsGeneric extends StObject {
    
    def ClearIndicator[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: ClearIndicatorProps[Option, IsMulti, Group]): Element
    
    def Control[Option_1, IsMulti_1 /* <: Boolean */, Group_1 /* <: GroupBase[Option_1] */](props: ControlProps[Option_1, IsMulti_1, Group_1]): Element
    
    def CrossIcon(props: CrossIconProps): Element
    
    def DownChevron(props: DownChevronProps): Element
    
    def DropdownIndicator[Option_2, IsMulti_2 /* <: Boolean */, Group_2 /* <: GroupBase[Option_2] */](props: DropdownIndicatorProps[Option_2, IsMulti_2, Group_2]): Element
    
    def Group[Option_3, IsMulti_3 /* <: Boolean */, Group_3 /* <: GroupBase[Option_3] */](props: GroupProps[Option_3, IsMulti_3, Group_3]): Element
    
    def GroupHeading[Option_4, IsMulti_4 /* <: Boolean */, Group_4 /* <: GroupBase[Option_4] */](props: GroupHeadingProps[Option_4, IsMulti_4, Group_4]): Element
    
    def IndicatorSeparator[Option_6, IsMulti_6 /* <: Boolean */, Group_6 /* <: GroupBase[Option_6] */](props: IndicatorSeparatorProps[Option_6, IsMulti_6, Group_6]): Element
    
    def IndicatorsContainer[Option_5, IsMulti_5 /* <: Boolean */, Group_5 /* <: GroupBase[Option_5] */](props: IndicatorsContainerProps[Option_5, IsMulti_5, Group_5]): Element
    
    def Input[Option_7, IsMulti_7 /* <: Boolean */, Group_7 /* <: GroupBase[Option_7] */](props: InputProps[Option_7, IsMulti_7, Group_7]): Element
    
    var LoadingIndicator: CallProps
    
    var LoadingMessage: DefaultPropsChildren
    
    def Menu[Option_9, IsMulti_9 /* <: Boolean */, Group_9 /* <: GroupBase[Option_9] */](props: MenuProps[Option_9, IsMulti_9, Group_9]): Element
    
    def MenuList[Option_10, IsMulti_10 /* <: Boolean */, Group_10 /* <: GroupBase[Option_10] */](props: MenuListProps[Option_10, IsMulti_10, Group_10]): Element
    
    def MultiValue[Option_13, IsMulti_13 /* <: Boolean */, Group_13 /* <: GroupBase[Option_13] */](props: MultiValueProps[Option_13, IsMulti_13, Group_13]): Element
    
    def MultiValueContainer[Option_14, IsMulti_14 /* <: Boolean */, Group_14 /* <: GroupBase[Option_14] */](hasChildrenInnerProps: MultiValueGenericProps[Option_14, IsMulti_14, Group_14]): Element
    
    def MultiValueLabel[Option_14, IsMulti_14 /* <: Boolean */, Group_14 /* <: GroupBase[Option_14] */](hasChildrenInnerProps: MultiValueGenericProps[Option_14, IsMulti_14, Group_14]): Element
    
    var NoOptionsMessage: DefaultProps
    
    def Option[Option_15, IsMulti_15 /* <: Boolean */, Group_15 /* <: GroupBase[Option_15] */](props: OptionProps[Option_15, IsMulti_15, Group_15]): Element
    
    def Placeholder[Option_16, IsMulti_16 /* <: Boolean */, Group_16 /* <: GroupBase[Option_16] */](props: PlaceholderProps[Option_16, IsMulti_16, Group_16]): Element
    
    def SelectContainer[Option_17, IsMulti_17 /* <: Boolean */, Group_17 /* <: GroupBase[Option_17] */](props: ContainerProps[Option_17, IsMulti_17, Group_17]): Element
    
    def SingleValue[Option_18, IsMulti_18 /* <: Boolean */, Group_18 /* <: GroupBase[Option_18] */](props: SingleValueProps[Option_18, IsMulti_18, Group_18]): Element
    
    def ValueContainer[Option_19, IsMulti_19 /* <: Boolean */, Group_19 /* <: GroupBase[Option_19] */](props: ValueContainerProps[Option_19, IsMulti_19, Group_19]): Element
  }
  object SelectComponentsGeneric {
    
    inline def apply(
      ClearIndicator: ClearIndicatorProps[Any, Any, Any] => Element,
      Control: ControlProps[Any, Any, Any] => Element,
      CrossIcon: CrossIconProps => Element,
      DownChevron: DownChevronProps => Element,
      DropdownIndicator: DropdownIndicatorProps[Any, Any, Any] => Element,
      Group: GroupProps[Any, Any, Any] => Element,
      GroupHeading: GroupHeadingProps[Any, Any, Any] => Element,
      IndicatorSeparator: IndicatorSeparatorProps[Any, Any, Any] => Element,
      IndicatorsContainer: IndicatorsContainerProps[Any, Any, Any] => Element,
      Input: InputProps[Any, Any, Any] => Element,
      LoadingIndicator: CallProps,
      LoadingMessage: DefaultPropsChildren,
      Menu: MenuProps[Any, Any, Any] => Element,
      MenuList: MenuListProps[Any, Any, Any] => Element,
      MultiValue: MultiValueProps[Any, Any, Any] => Element,
      MultiValueContainer: MultiValueGenericProps[Any, Any, Any] => Element,
      MultiValueLabel: MultiValueGenericProps[Any, Any, Any] => Element,
      NoOptionsMessage: DefaultProps,
      Option: OptionProps[Any, Any, Any] => Element,
      Placeholder: PlaceholderProps[Any, Any, Any] => Element,
      SelectContainer: ContainerProps[Any, Any, Any] => Element,
      SingleValue: SingleValueProps[Any, Any, Any] => Element,
      ValueContainer: ValueContainerProps[Any, Any, Any] => Element
    ): SelectComponentsGeneric = {
      val __obj = js.Dynamic.literal(ClearIndicator = js.Any.fromFunction1(ClearIndicator), Control = js.Any.fromFunction1(Control), CrossIcon = js.Any.fromFunction1(CrossIcon), DownChevron = js.Any.fromFunction1(DownChevron), DropdownIndicator = js.Any.fromFunction1(DropdownIndicator), Group = js.Any.fromFunction1(Group), GroupHeading = js.Any.fromFunction1(GroupHeading), IndicatorSeparator = js.Any.fromFunction1(IndicatorSeparator), IndicatorsContainer = js.Any.fromFunction1(IndicatorsContainer), Input = js.Any.fromFunction1(Input), LoadingIndicator = LoadingIndicator.asInstanceOf[js.Any], LoadingMessage = LoadingMessage.asInstanceOf[js.Any], Menu = js.Any.fromFunction1(Menu), MenuList = js.Any.fromFunction1(MenuList), MultiValue = js.Any.fromFunction1(MultiValue), MultiValueContainer = js.Any.fromFunction1(MultiValueContainer), MultiValueLabel = js.Any.fromFunction1(MultiValueLabel), NoOptionsMessage = NoOptionsMessage.asInstanceOf[js.Any], Option = js.Any.fromFunction1(Option), Placeholder = js.Any.fromFunction1(Placeholder), SelectContainer = js.Any.fromFunction1(SelectContainer), SingleValue = js.Any.fromFunction1(SingleValue), ValueContainer = js.Any.fromFunction1(ValueContainer))
      __obj.asInstanceOf[SelectComponentsGeneric]
    }
    
    extension [Self <: SelectComponentsGeneric](x: Self) {
      
      inline def setClearIndicator(value: ClearIndicatorProps[Any, Any, Any] => Element): Self = StObject.set(x, "ClearIndicator", js.Any.fromFunction1(value))
      
      inline def setControl(value: ControlProps[Any, Any, Any] => Element): Self = StObject.set(x, "Control", js.Any.fromFunction1(value))
      
      inline def setCrossIcon(value: CrossIconProps => Element): Self = StObject.set(x, "CrossIcon", js.Any.fromFunction1(value))
      
      inline def setDownChevron(value: DownChevronProps => Element): Self = StObject.set(x, "DownChevron", js.Any.fromFunction1(value))
      
      inline def setDropdownIndicator(value: DropdownIndicatorProps[Any, Any, Any] => Element): Self = StObject.set(x, "DropdownIndicator", js.Any.fromFunction1(value))
      
      inline def setGroup(value: GroupProps[Any, Any, Any] => Element): Self = StObject.set(x, "Group", js.Any.fromFunction1(value))
      
      inline def setGroupHeading(value: GroupHeadingProps[Any, Any, Any] => Element): Self = StObject.set(x, "GroupHeading", js.Any.fromFunction1(value))
      
      inline def setIndicatorSeparator(value: IndicatorSeparatorProps[Any, Any, Any] => Element): Self = StObject.set(x, "IndicatorSeparator", js.Any.fromFunction1(value))
      
      inline def setIndicatorsContainer(value: IndicatorsContainerProps[Any, Any, Any] => Element): Self = StObject.set(x, "IndicatorsContainer", js.Any.fromFunction1(value))
      
      inline def setInput(value: InputProps[Any, Any, Any] => Element): Self = StObject.set(x, "Input", js.Any.fromFunction1(value))
      
      inline def setLoadingIndicator(value: CallProps): Self = StObject.set(x, "LoadingIndicator", value.asInstanceOf[js.Any])
      
      inline def setLoadingMessage(value: DefaultPropsChildren): Self = StObject.set(x, "LoadingMessage", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: MenuProps[Any, Any, Any] => Element): Self = StObject.set(x, "Menu", js.Any.fromFunction1(value))
      
      inline def setMenuList(value: MenuListProps[Any, Any, Any] => Element): Self = StObject.set(x, "MenuList", js.Any.fromFunction1(value))
      
      inline def setMultiValue(value: MultiValueProps[Any, Any, Any] => Element): Self = StObject.set(x, "MultiValue", js.Any.fromFunction1(value))
      
      inline def setMultiValueContainer(value: MultiValueGenericProps[Any, Any, Any] => Element): Self = StObject.set(x, "MultiValueContainer", js.Any.fromFunction1(value))
      
      inline def setMultiValueLabel(value: MultiValueGenericProps[Any, Any, Any] => Element): Self = StObject.set(x, "MultiValueLabel", js.Any.fromFunction1(value))
      
      inline def setNoOptionsMessage(value: DefaultProps): Self = StObject.set(x, "NoOptionsMessage", value.asInstanceOf[js.Any])
      
      inline def setOption(value: OptionProps[Any, Any, Any] => Element): Self = StObject.set(x, "Option", js.Any.fromFunction1(value))
      
      inline def setPlaceholder(value: PlaceholderProps[Any, Any, Any] => Element): Self = StObject.set(x, "Placeholder", js.Any.fromFunction1(value))
      
      inline def setSelectContainer(value: ContainerProps[Any, Any, Any] => Element): Self = StObject.set(x, "SelectContainer", js.Any.fromFunction1(value))
      
      inline def setSingleValue(value: SingleValueProps[Any, Any, Any] => Element): Self = StObject.set(x, "SingleValue", js.Any.fromFunction1(value))
      
      inline def setValueContainer(value: ValueContainerProps[Any, Any, Any] => Element): Self = StObject.set(x, "ValueContainer", js.Any.fromFunction1(value))
    }
  }
}
