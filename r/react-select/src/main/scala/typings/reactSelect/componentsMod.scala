package typings.reactSelect

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactSelect.componentsInputMod.InputProps
import typings.reactSelect.componentsMultiValueMod.MultiValueProps
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.componentsSingleValueMod.SingleValueProps
import typings.reactSelect.containersMod.ContainerProps
import typings.reactSelect.containersMod.IndicatorContainerProps
import typings.reactSelect.containersMod.ValueContainerProps
import typings.reactSelect.controlMod.ControlProps
import typings.reactSelect.groupMod.GroupProps
import typings.reactSelect.indicatorsMod.IndicatorProps
import typings.reactSelect.indicatorsMod.LoadingIconProps
import typings.reactSelect.menuMod.MenuListComponentProps
import typings.reactSelect.menuMod.MenuPortalProps
import typings.reactSelect.menuMod.MenuProps
import typings.reactSelect.menuMod.NoticeProps
import typings.reactSelect.optionMod.OptionProps
import typings.reactSelect.typesMod.OptionTypeBase
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  /* Inlined std.Required<react-select.react-select/src/components.DeepNonNullable<react-select.react-select/src/components.SelectComponents<any>>> */
  object components {
    
    @JSImport("react-select/src/components", "components")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/components", "components.ClearIndicator")
    @js.native
    def ClearIndicator: NonNullable[IndicatorComponentType[js.Any] | Null] = js.native
    @scala.inline
    def ClearIndicator_=(x: NonNullable[IndicatorComponentType[js.Any] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.Control")
    @js.native
    def Control: NonNullable[ComponentType[ControlProps[js.Any]]] = js.native
    @scala.inline
    def Control_=(x: NonNullable[ComponentType[ControlProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Control")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.CrossIcon")
    @js.native
    def CrossIcon: NonNullable[ComponentType[js.Any]] = js.native
    @scala.inline
    def CrossIcon_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CrossIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.DownChevron")
    @js.native
    def DownChevron: NonNullable[ComponentType[js.Any]] = js.native
    @scala.inline
    def DownChevron_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DownChevron")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.DropdownIndicator")
    @js.native
    def DropdownIndicator: NonNullable[IndicatorComponentType[js.Any] | Null] = js.native
    @scala.inline
    def DropdownIndicator_=(x: NonNullable[IndicatorComponentType[js.Any] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DropdownIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.Group")
    @js.native
    def Group: NonNullable[ComponentType[GroupProps[js.Any]]] = js.native
    
    @JSImport("react-select/src/components", "components.GroupHeading")
    @js.native
    def GroupHeading: NonNullable[ComponentType[js.Any]] = js.native
    @scala.inline
    def GroupHeading_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupHeading")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Group_=(x: NonNullable[ComponentType[GroupProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.IndicatorSeparator")
    @js.native
    def IndicatorSeparator: NonNullable[IndicatorComponentType[js.Any] | Null] = js.native
    @scala.inline
    def IndicatorSeparator_=(x: NonNullable[IndicatorComponentType[js.Any] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndicatorSeparator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.IndicatorsContainer")
    @js.native
    def IndicatorsContainer: NonNullable[ComponentType[IndicatorContainerProps[js.Any]]] = js.native
    @scala.inline
    def IndicatorsContainer_=(x: NonNullable[ComponentType[IndicatorContainerProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndicatorsContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.Input")
    @js.native
    def Input: NonNullable[ComponentType[InputProps]] = js.native
    @scala.inline
    def Input_=(x: NonNullable[ComponentType[InputProps]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Input")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.LoadingIndicator")
    @js.native
    def LoadingIndicator: NonNullable[ComponentType[LoadingIconProps[js.Any]] | Null] = js.native
    @scala.inline
    def LoadingIndicator_=(x: NonNullable[ComponentType[LoadingIconProps[js.Any]] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.LoadingMessage")
    @js.native
    def LoadingMessage: NonNullable[ComponentType[NoticeProps[js.Any]]] = js.native
    @scala.inline
    def LoadingMessage_=(x: NonNullable[ComponentType[NoticeProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.Menu")
    @js.native
    def Menu: NonNullable[ComponentType[MenuProps[js.Any]]] = js.native
    
    @JSImport("react-select/src/components", "components.MenuList")
    @js.native
    def MenuList: NonNullable[ComponentType[MenuListComponentProps[js.Any]]] = js.native
    @scala.inline
    def MenuList_=(x: NonNullable[ComponentType[MenuListComponentProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MenuList")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.MenuPortal")
    @js.native
    def MenuPortal: NonNullable[ComponentType[MenuPortalProps[js.Any]]] = js.native
    @scala.inline
    def MenuPortal_=(x: NonNullable[ComponentType[MenuPortalProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MenuPortal")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Menu_=(x: NonNullable[ComponentType[MenuProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.MultiValue")
    @js.native
    def MultiValue: NonNullable[ComponentType[MultiValueProps[js.Any]]] = js.native
    
    @JSImport("react-select/src/components", "components.MultiValueContainer")
    @js.native
    def MultiValueContainer: NonNullable[ComponentType[js.Any]] = js.native
    @scala.inline
    def MultiValueContainer_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.MultiValueLabel")
    @js.native
    def MultiValueLabel: NonNullable[ComponentType[js.Any]] = js.native
    @scala.inline
    def MultiValueLabel_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.MultiValueRemove")
    @js.native
    def MultiValueRemove: NonNullable[ComponentType[js.Any]] = js.native
    @scala.inline
    def MultiValueRemove_=(x: NonNullable[ComponentType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueRemove")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def MultiValue_=(x: NonNullable[ComponentType[MultiValueProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.NoOptionsMessage")
    @js.native
    def NoOptionsMessage: NonNullable[ComponentType[NoticeProps[js.Any]]] = js.native
    @scala.inline
    def NoOptionsMessage_=(x: NonNullable[ComponentType[NoticeProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoOptionsMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.Option")
    @js.native
    def Option: NonNullable[ComponentType[OptionProps[js.Any]]] = js.native
    @scala.inline
    def Option_=(x: NonNullable[ComponentType[OptionProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.Placeholder")
    @js.native
    def Placeholder: NonNullable[ComponentType[PlaceholderProps[js.Any]]] = js.native
    @scala.inline
    def Placeholder_=(x: NonNullable[ComponentType[PlaceholderProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Placeholder")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.SelectContainer")
    @js.native
    def SelectContainer: NonNullable[ComponentType[ContainerProps[js.Any]]] = js.native
    @scala.inline
    def SelectContainer_=(x: NonNullable[ComponentType[ContainerProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.SingleValue")
    @js.native
    def SingleValue: NonNullable[ComponentType[SingleValueProps[js.Any]]] = js.native
    @scala.inline
    def SingleValue_=(x: NonNullable[ComponentType[SingleValueProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SingleValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/src/components", "components.ValueContainer")
    @js.native
    def ValueContainer: NonNullable[ComponentType[ValueContainerProps[js.Any]]] = js.native
    @scala.inline
    def ValueContainer_=(x: NonNullable[ComponentType[ValueContainerProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValueContainer")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/components", "defaultComponents")
  @js.native
  def defaultComponents[OptionType /* <: OptionTypeBase */](props: Props[OptionType]): SelectComponents[OptionType] = js.native
  
  type DeepNonNullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? std.NonNullable<T[P]>}
    */ typings.reactSelect.reactSelectStrings.DeepNonNullable with TopLevel[T]
  
  type IndicatorComponentType[OptionType /* <: OptionTypeBase */] = ComponentType[IndicatorProps[OptionType]]
  
  type PlaceholderOrValue[OptionType /* <: OptionTypeBase */] = ReactElement | js.Array[ReactElement]
  
  @js.native
  trait Props[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var components: SelectComponentsConfig[OptionType] = js.native
  }
  object Props {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](components: SelectComponentsConfig[OptionType]): Props[OptionType] = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[OptionType]]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[_], OptionType /* <: OptionTypeBase */] (val x: Self with Props[OptionType]) extends AnyVal {
      
      @scala.inline
      def setComponents(value: SelectComponentsConfig[OptionType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectComponents[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var ClearIndicator: IndicatorComponentType[OptionType] | Null = js.native
    
    var Control: ComponentType[ControlProps[OptionType]] = js.native
    
    var CrossIcon: ComponentType[_] = js.native
    
    var DownChevron: ComponentType[_] = js.native
    
    var DropdownIndicator: IndicatorComponentType[OptionType] | Null = js.native
    
    var Group: ComponentType[GroupProps[OptionType]] = js.native
    
    var GroupHeading: ComponentType[_] = js.native
    
    var IndicatorSeparator: IndicatorComponentType[OptionType] | Null = js.native
    
    var IndicatorsContainer: ComponentType[IndicatorContainerProps[OptionType]] = js.native
    
    var Input: ComponentType[InputProps] = js.native
    
    var LoadingIndicator: ComponentType[LoadingIconProps[OptionType]] | Null = js.native
    
    var LoadingMessage: ComponentType[NoticeProps[OptionType]] = js.native
    
    var Menu: ComponentType[MenuProps[OptionType]] = js.native
    
    var MenuList: ComponentType[MenuListComponentProps[OptionType]] = js.native
    
    var MenuPortal: ComponentType[MenuPortalProps[OptionType]] = js.native
    
    var MultiValue: ComponentType[MultiValueProps[OptionType]] = js.native
    
    var MultiValueContainer: ComponentType[_] = js.native
    
    var MultiValueLabel: ComponentType[_] = js.native
    
    var MultiValueRemove: ComponentType[_] = js.native
    
    var NoOptionsMessage: ComponentType[NoticeProps[OptionType]] = js.native
    
    var Option: ComponentType[OptionProps[OptionType]] = js.native
    
    var Placeholder: ComponentType[PlaceholderProps[OptionType]] = js.native
    
    var SelectContainer: ComponentType[ContainerProps[OptionType]] = js.native
    
    var SingleValue: ComponentType[SingleValueProps[OptionType]] = js.native
    
    var ValueContainer: ComponentType[ValueContainerProps[OptionType]] = js.native
  }
  object SelectComponents {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](
      Control: ComponentType[ControlProps[OptionType]],
      CrossIcon: ComponentType[_],
      DownChevron: ComponentType[_],
      Group: ComponentType[GroupProps[OptionType]],
      GroupHeading: ComponentType[_],
      IndicatorsContainer: ComponentType[IndicatorContainerProps[OptionType]],
      Input: ComponentType[InputProps],
      LoadingMessage: ComponentType[NoticeProps[OptionType]],
      Menu: ComponentType[MenuProps[OptionType]],
      MenuList: ComponentType[MenuListComponentProps[OptionType]],
      MenuPortal: ComponentType[MenuPortalProps[OptionType]],
      MultiValue: ComponentType[MultiValueProps[OptionType]],
      MultiValueContainer: ComponentType[_],
      MultiValueLabel: ComponentType[_],
      MultiValueRemove: ComponentType[_],
      NoOptionsMessage: ComponentType[NoticeProps[OptionType]],
      Option: ComponentType[OptionProps[OptionType]],
      Placeholder: ComponentType[PlaceholderProps[OptionType]],
      SelectContainer: ComponentType[ContainerProps[OptionType]],
      SingleValue: ComponentType[SingleValueProps[OptionType]],
      ValueContainer: ComponentType[ValueContainerProps[OptionType]]
    ): SelectComponents[OptionType] = {
      val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any], CrossIcon = CrossIcon.asInstanceOf[js.Any], DownChevron = DownChevron.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupHeading = GroupHeading.asInstanceOf[js.Any], IndicatorsContainer = IndicatorsContainer.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], LoadingMessage = LoadingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuList = MenuList.asInstanceOf[js.Any], MenuPortal = MenuPortal.asInstanceOf[js.Any], MultiValue = MultiValue.asInstanceOf[js.Any], MultiValueContainer = MultiValueContainer.asInstanceOf[js.Any], MultiValueLabel = MultiValueLabel.asInstanceOf[js.Any], MultiValueRemove = MultiValueRemove.asInstanceOf[js.Any], NoOptionsMessage = NoOptionsMessage.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], Placeholder = Placeholder.asInstanceOf[js.Any], SelectContainer = SelectContainer.asInstanceOf[js.Any], SingleValue = SingleValue.asInstanceOf[js.Any], ValueContainer = ValueContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectComponents[OptionType]]
    }
    
    @scala.inline
    implicit class SelectComponentsMutableBuilder[Self <: SelectComponents[_], OptionType /* <: OptionTypeBase */] (val x: Self with SelectComponents[OptionType]) extends AnyVal {
      
      @scala.inline
      def setClearIndicator(value: IndicatorComponentType[OptionType]): Self = StObject.set(x, "ClearIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIndicatorNull: Self = StObject.set(x, "ClearIndicator", null)
      
      @scala.inline
      def setControl(value: ComponentType[ControlProps[OptionType]]): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossIcon(value: ComponentType[_]): Self = StObject.set(x, "CrossIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownChevron(value: ComponentType[_]): Self = StObject.set(x, "DownChevron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownIndicator(value: IndicatorComponentType[OptionType]): Self = StObject.set(x, "DropdownIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownIndicatorNull: Self = StObject.set(x, "DropdownIndicator", null)
      
      @scala.inline
      def setGroup(value: ComponentType[GroupProps[OptionType]]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeading(value: ComponentType[_]): Self = StObject.set(x, "GroupHeading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorSeparator(value: IndicatorComponentType[OptionType]): Self = StObject.set(x, "IndicatorSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorSeparatorNull: Self = StObject.set(x, "IndicatorSeparator", null)
      
      @scala.inline
      def setIndicatorsContainer(value: ComponentType[IndicatorContainerProps[OptionType]]): Self = StObject.set(x, "IndicatorsContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: ComponentType[InputProps]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIndicator(value: ComponentType[LoadingIconProps[OptionType]]): Self = StObject.set(x, "LoadingIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIndicatorNull: Self = StObject.set(x, "LoadingIndicator", null)
      
      @scala.inline
      def setLoadingMessage(value: ComponentType[NoticeProps[OptionType]]): Self = StObject.set(x, "LoadingMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenu(value: ComponentType[MenuProps[OptionType]]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuList(value: ComponentType[MenuListComponentProps[OptionType]]): Self = StObject.set(x, "MenuList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPortal(value: ComponentType[MenuPortalProps[OptionType]]): Self = StObject.set(x, "MenuPortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValue(value: ComponentType[MultiValueProps[OptionType]]): Self = StObject.set(x, "MultiValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueContainer(value: ComponentType[_]): Self = StObject.set(x, "MultiValueContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueLabel(value: ComponentType[_]): Self = StObject.set(x, "MultiValueLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueRemove(value: ComponentType[_]): Self = StObject.set(x, "MultiValueRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoOptionsMessage(value: ComponentType[NoticeProps[OptionType]]): Self = StObject.set(x, "NoOptionsMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOption(value: ComponentType[OptionProps[OptionType]]): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholder(value: ComponentType[PlaceholderProps[OptionType]]): Self = StObject.set(x, "Placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectContainer(value: ComponentType[ContainerProps[OptionType]]): Self = StObject.set(x, "SelectContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleValue(value: ComponentType[SingleValueProps[OptionType]]): Self = StObject.set(x, "SingleValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueContainer(value: ComponentType[ValueContainerProps[OptionType]]): Self = StObject.set(x, "ValueContainer", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-select.react-select/src/components.SelectComponents<OptionType>> */
  @js.native
  trait SelectComponentsConfig[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var ClearIndicator: js.UndefOr[IndicatorComponentType[OptionType] | Null] = js.native
    
    var Control: js.UndefOr[ComponentType[ControlProps[OptionType]]] = js.native
    
    var CrossIcon: js.UndefOr[ComponentType[_]] = js.native
    
    var DownChevron: js.UndefOr[ComponentType[_]] = js.native
    
    var DropdownIndicator: js.UndefOr[IndicatorComponentType[OptionType] | Null] = js.native
    
    var Group: js.UndefOr[ComponentType[GroupProps[OptionType]]] = js.native
    
    var GroupHeading: js.UndefOr[ComponentType[_]] = js.native
    
    var IndicatorSeparator: js.UndefOr[IndicatorComponentType[OptionType] | Null] = js.native
    
    var IndicatorsContainer: js.UndefOr[ComponentType[IndicatorContainerProps[OptionType]]] = js.native
    
    var Input: js.UndefOr[ComponentType[InputProps]] = js.native
    
    var LoadingIndicator: js.UndefOr[ComponentType[LoadingIconProps[OptionType]] | Null] = js.native
    
    var LoadingMessage: js.UndefOr[ComponentType[NoticeProps[OptionType]]] = js.native
    
    var Menu: js.UndefOr[ComponentType[MenuProps[OptionType]]] = js.native
    
    var MenuList: js.UndefOr[ComponentType[MenuListComponentProps[OptionType]]] = js.native
    
    var MenuPortal: js.UndefOr[ComponentType[MenuPortalProps[OptionType]]] = js.native
    
    var MultiValue: js.UndefOr[ComponentType[MultiValueProps[OptionType]]] = js.native
    
    var MultiValueContainer: js.UndefOr[ComponentType[_]] = js.native
    
    var MultiValueLabel: js.UndefOr[ComponentType[_]] = js.native
    
    var MultiValueRemove: js.UndefOr[ComponentType[_]] = js.native
    
    var NoOptionsMessage: js.UndefOr[ComponentType[NoticeProps[OptionType]]] = js.native
    
    var Option: js.UndefOr[ComponentType[OptionProps[OptionType]]] = js.native
    
    var Placeholder: js.UndefOr[ComponentType[PlaceholderProps[OptionType]]] = js.native
    
    var SelectContainer: js.UndefOr[ComponentType[ContainerProps[OptionType]]] = js.native
    
    var SingleValue: js.UndefOr[ComponentType[SingleValueProps[OptionType]]] = js.native
    
    var ValueContainer: js.UndefOr[ComponentType[ValueContainerProps[OptionType]]] = js.native
  }
  object SelectComponentsConfig {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](): SelectComponentsConfig[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectComponentsConfig[OptionType]]
    }
    
    @scala.inline
    implicit class SelectComponentsConfigMutableBuilder[Self <: SelectComponentsConfig[_], OptionType /* <: OptionTypeBase */] (val x: Self with SelectComponentsConfig[OptionType]) extends AnyVal {
      
      @scala.inline
      def setClearIndicator(value: IndicatorComponentType[OptionType]): Self = StObject.set(x, "ClearIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIndicatorNull: Self = StObject.set(x, "ClearIndicator", null)
      
      @scala.inline
      def setClearIndicatorUndefined: Self = StObject.set(x, "ClearIndicator", js.undefined)
      
      @scala.inline
      def setControl(value: ComponentType[ControlProps[OptionType]]): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlUndefined: Self = StObject.set(x, "Control", js.undefined)
      
      @scala.inline
      def setCrossIcon(value: ComponentType[_]): Self = StObject.set(x, "CrossIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossIconUndefined: Self = StObject.set(x, "CrossIcon", js.undefined)
      
      @scala.inline
      def setDownChevron(value: ComponentType[_]): Self = StObject.set(x, "DownChevron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownChevronUndefined: Self = StObject.set(x, "DownChevron", js.undefined)
      
      @scala.inline
      def setDropdownIndicator(value: IndicatorComponentType[OptionType]): Self = StObject.set(x, "DropdownIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownIndicatorNull: Self = StObject.set(x, "DropdownIndicator", null)
      
      @scala.inline
      def setDropdownIndicatorUndefined: Self = StObject.set(x, "DropdownIndicator", js.undefined)
      
      @scala.inline
      def setGroup(value: ComponentType[GroupProps[OptionType]]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeading(value: ComponentType[_]): Self = StObject.set(x, "GroupHeading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeadingUndefined: Self = StObject.set(x, "GroupHeading", js.undefined)
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
      
      @scala.inline
      def setIndicatorSeparator(value: IndicatorComponentType[OptionType]): Self = StObject.set(x, "IndicatorSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorSeparatorNull: Self = StObject.set(x, "IndicatorSeparator", null)
      
      @scala.inline
      def setIndicatorSeparatorUndefined: Self = StObject.set(x, "IndicatorSeparator", js.undefined)
      
      @scala.inline
      def setIndicatorsContainer(value: ComponentType[IndicatorContainerProps[OptionType]]): Self = StObject.set(x, "IndicatorsContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorsContainerUndefined: Self = StObject.set(x, "IndicatorsContainer", js.undefined)
      
      @scala.inline
      def setInput(value: ComponentType[InputProps]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      @scala.inline
      def setLoadingIndicator(value: ComponentType[LoadingIconProps[OptionType]]): Self = StObject.set(x, "LoadingIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIndicatorNull: Self = StObject.set(x, "LoadingIndicator", null)
      
      @scala.inline
      def setLoadingIndicatorUndefined: Self = StObject.set(x, "LoadingIndicator", js.undefined)
      
      @scala.inline
      def setLoadingMessage(value: ComponentType[NoticeProps[OptionType]]): Self = StObject.set(x, "LoadingMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingMessageUndefined: Self = StObject.set(x, "LoadingMessage", js.undefined)
      
      @scala.inline
      def setMenu(value: ComponentType[MenuProps[OptionType]]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuList(value: ComponentType[MenuListComponentProps[OptionType]]): Self = StObject.set(x, "MenuList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuListUndefined: Self = StObject.set(x, "MenuList", js.undefined)
      
      @scala.inline
      def setMenuPortal(value: ComponentType[MenuPortalProps[OptionType]]): Self = StObject.set(x, "MenuPortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPortalUndefined: Self = StObject.set(x, "MenuPortal", js.undefined)
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "Menu", js.undefined)
      
      @scala.inline
      def setMultiValue(value: ComponentType[MultiValueProps[OptionType]]): Self = StObject.set(x, "MultiValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueContainer(value: ComponentType[_]): Self = StObject.set(x, "MultiValueContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueContainerUndefined: Self = StObject.set(x, "MultiValueContainer", js.undefined)
      
      @scala.inline
      def setMultiValueLabel(value: ComponentType[_]): Self = StObject.set(x, "MultiValueLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueLabelUndefined: Self = StObject.set(x, "MultiValueLabel", js.undefined)
      
      @scala.inline
      def setMultiValueRemove(value: ComponentType[_]): Self = StObject.set(x, "MultiValueRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueRemoveUndefined: Self = StObject.set(x, "MultiValueRemove", js.undefined)
      
      @scala.inline
      def setMultiValueUndefined: Self = StObject.set(x, "MultiValue", js.undefined)
      
      @scala.inline
      def setNoOptionsMessage(value: ComponentType[NoticeProps[OptionType]]): Self = StObject.set(x, "NoOptionsMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoOptionsMessageUndefined: Self = StObject.set(x, "NoOptionsMessage", js.undefined)
      
      @scala.inline
      def setOption(value: ComponentType[OptionProps[OptionType]]): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionUndefined: Self = StObject.set(x, "Option", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: ComponentType[PlaceholderProps[OptionType]]): Self = StObject.set(x, "Placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "Placeholder", js.undefined)
      
      @scala.inline
      def setSelectContainer(value: ComponentType[ContainerProps[OptionType]]): Self = StObject.set(x, "SelectContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectContainerUndefined: Self = StObject.set(x, "SelectContainer", js.undefined)
      
      @scala.inline
      def setSingleValue(value: ComponentType[SingleValueProps[OptionType]]): Self = StObject.set(x, "SingleValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleValueUndefined: Self = StObject.set(x, "SingleValue", js.undefined)
      
      @scala.inline
      def setValueContainer(value: ComponentType[ValueContainerProps[OptionType]]): Self = StObject.set(x, "ValueContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueContainerUndefined: Self = StObject.set(x, "ValueContainer", js.undefined)
    }
  }
}
