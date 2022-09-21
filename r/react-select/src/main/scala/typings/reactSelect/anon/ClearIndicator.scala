package typings.reactSelect.anon

import org.scalablytyped.runtime.Instantiable0
import typings.emotionReact.emotionReactMod.jsx.JSX.Element
import typings.reactSelect.componentsInputMod.InputProps
import typings.reactSelect.componentsMultiValueMod.MultiValueGenericProps
import typings.reactSelect.componentsMultiValueMod.MultiValueProps
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
import typings.reactSelect.menuMod.MenuListProps
import typings.reactSelect.menuMod.MenuPortal
import typings.reactSelect.menuMod.MenuProps
import typings.reactSelect.optionMod.OptionProps
import typings.reactSelect.typesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearIndicator extends StObject {
  
  def ClearIndicator[Option_1, IsMulti_1 /* <: Boolean */, Group_1 /* <: GroupBase[Option_1] */](props: ClearIndicatorProps[Option_1, IsMulti_1, Group_1]): Element
  
  /**
    * If `true`, close the select menu when the user scrolls the document/body.
    *
    * If a function, takes a standard javascript `ScrollEvent` you return a boolean:
    *
    * `true` => The menu closes
    *
    * `false` => The menu stays open
    *
    * This is useful when you have a scrollable modal and want to portal the menu out,
    * but want to avoid graphical issues.
    */
  def Control[Option_2, IsMulti_2 /* <: Boolean */, Group_2 /* <: GroupBase[Option_2] */](props: ControlProps[Option_2, IsMulti_2, Group_2]): Element
  
  def CrossIcon(props: CrossIconProps): Element
  
  def DownChevron(props: DownChevronProps): Element
  
  def DropdownIndicator[Option_3, IsMulti_3 /* <: Boolean */, Group_3 /* <: GroupBase[Option_3] */](props: DropdownIndicatorProps[Option_3, IsMulti_3, Group_3]): Element
  
  def Group[Option_4, IsMulti_4 /* <: Boolean */, Group_4 /* <: GroupBase[Option_4] */](props: GroupProps[Option_4, IsMulti_4, Group_4]): Element
  
  def GroupHeading[Option_5, IsMulti_5 /* <: Boolean */, Group_5 /* <: GroupBase[Option_5] */](props: GroupHeadingProps[Option_5, IsMulti_5, Group_5]): Element
  
  def IndicatorSeparator[Option_7, IsMulti_7 /* <: Boolean */, Group_7 /* <: GroupBase[Option_7] */](props: IndicatorSeparatorProps[Option_7, IsMulti_7, Group_7]): Element
  
  def IndicatorsContainer[Option_6, IsMulti_6 /* <: Boolean */, Group_6 /* <: GroupBase[Option_6] */](props: IndicatorsContainerProps[Option_6, IsMulti_6, Group_6]): Element
  
  def Input[Option_8, IsMulti_8 /* <: Boolean */, Group_8 /* <: GroupBase[Option_8] */](props: InputProps[Option_8, IsMulti_8, Group_8]): Element
  
  var LoadingIndicator: Call
  
  var LoadingMessage: DefaultProps
  
  def Menu[Option_10, IsMulti_10 /* <: Boolean */, Group_10 /* <: GroupBase[Option_10] */](props: MenuProps[Option_10, IsMulti_10, Group_10]): Element
  
  def MenuList[Option_11, IsMulti_11 /* <: Boolean */, Group_11 /* <: GroupBase[Option_11] */](props: MenuListProps[Option_11, IsMulti_11, Group_11]): Element
  
  var MenuPortal: Instantiable0[
    typings.reactSelect.menuMod.MenuPortal[
      js.Object, 
      Boolean, 
      GroupBase[/* import warning: RewrittenClass.unapply cls was tparam Option */ Any]
    ]
  ]
  
  def MultiValue[Option_14, IsMulti_14 /* <: Boolean */, Group_14 /* <: GroupBase[Option_14] */](props: MultiValueProps[Option_14, IsMulti_14, Group_14]): Element
  
  def MultiValueContainer[Option_15, IsMulti_15 /* <: Boolean */, Group_15 /* <: GroupBase[Option_15] */](hasChildrenInnerProps: MultiValueGenericProps[Option_15, IsMulti_15, Group_15]): Element
  
  def MultiValueLabel[Option_15, IsMulti_15 /* <: Boolean */, Group_15 /* <: GroupBase[Option_15] */](hasChildrenInnerProps: MultiValueGenericProps[Option_15, IsMulti_15, Group_15]): Element
  
  var MultiValueRemove: FnCall
  
  var NoOptionsMessage: CallDefaultProps
  
  def Option[Option_16, IsMulti_16 /* <: Boolean */, Group_16 /* <: GroupBase[Option_16] */](props: OptionProps[Option_16, IsMulti_16, Group_16]): Element
  
  def Placeholder[Option_17, IsMulti_17 /* <: Boolean */, Group_17 /* <: GroupBase[Option_17] */](props: PlaceholderProps[Option_17, IsMulti_17, Group_17]): Element
  
  def SelectContainer[Option_18, IsMulti_18 /* <: Boolean */, Group_18 /* <: GroupBase[Option_18] */](props: ContainerProps[Option_18, IsMulti_18, Group_18]): Element
  
  def SingleValue[Option_19, IsMulti_19 /* <: Boolean */, Group_19 /* <: GroupBase[Option_19] */](props: SingleValueProps[Option_19, IsMulti_19, Group_19]): Element
  
  def ValueContainer[Option_20, IsMulti_20 /* <: Boolean */, Group_20 /* <: GroupBase[Option_20] */](props: ValueContainerProps[Option_20, IsMulti_20, Group_20]): Element
}
object ClearIndicator {
  
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
    LoadingIndicator: Call,
    LoadingMessage: DefaultProps,
    Menu: MenuProps[Any, Any, Any] => Element,
    MenuList: MenuListProps[Any, Any, Any] => Element,
    MenuPortal: Instantiable0[
      MenuPortal[
        js.Object, 
        Boolean, 
        GroupBase[/* import warning: RewrittenClass.unapply cls was tparam Option */ Any]
      ]
    ],
    MultiValue: MultiValueProps[Any, Any, Any] => Element,
    MultiValueContainer: MultiValueGenericProps[Any, Any, Any] => Element,
    MultiValueLabel: MultiValueGenericProps[Any, Any, Any] => Element,
    MultiValueRemove: FnCall,
    NoOptionsMessage: CallDefaultProps,
    Option: OptionProps[Any, Any, Any] => Element,
    Placeholder: PlaceholderProps[Any, Any, Any] => Element,
    SelectContainer: ContainerProps[Any, Any, Any] => Element,
    SingleValue: SingleValueProps[Any, Any, Any] => Element,
    ValueContainer: ValueContainerProps[Any, Any, Any] => Element
  ): ClearIndicator = {
    val __obj = js.Dynamic.literal(ClearIndicator = js.Any.fromFunction1(ClearIndicator), Control = js.Any.fromFunction1(Control), CrossIcon = js.Any.fromFunction1(CrossIcon), DownChevron = js.Any.fromFunction1(DownChevron), DropdownIndicator = js.Any.fromFunction1(DropdownIndicator), Group = js.Any.fromFunction1(Group), GroupHeading = js.Any.fromFunction1(GroupHeading), IndicatorSeparator = js.Any.fromFunction1(IndicatorSeparator), IndicatorsContainer = js.Any.fromFunction1(IndicatorsContainer), Input = js.Any.fromFunction1(Input), LoadingIndicator = LoadingIndicator.asInstanceOf[js.Any], LoadingMessage = LoadingMessage.asInstanceOf[js.Any], Menu = js.Any.fromFunction1(Menu), MenuList = js.Any.fromFunction1(MenuList), MenuPortal = MenuPortal.asInstanceOf[js.Any], MultiValue = js.Any.fromFunction1(MultiValue), MultiValueContainer = js.Any.fromFunction1(MultiValueContainer), MultiValueLabel = js.Any.fromFunction1(MultiValueLabel), MultiValueRemove = MultiValueRemove.asInstanceOf[js.Any], NoOptionsMessage = NoOptionsMessage.asInstanceOf[js.Any], Option = js.Any.fromFunction1(Option), Placeholder = js.Any.fromFunction1(Placeholder), SelectContainer = js.Any.fromFunction1(SelectContainer), SingleValue = js.Any.fromFunction1(SingleValue), ValueContainer = js.Any.fromFunction1(ValueContainer))
    __obj.asInstanceOf[ClearIndicator]
  }
  
  extension [Self <: ClearIndicator](x: Self) {
    
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
    
    inline def setLoadingIndicator(value: Call): Self = StObject.set(x, "LoadingIndicator", value.asInstanceOf[js.Any])
    
    inline def setLoadingMessage(value: DefaultProps): Self = StObject.set(x, "LoadingMessage", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: MenuProps[Any, Any, Any] => Element): Self = StObject.set(x, "Menu", js.Any.fromFunction1(value))
    
    inline def setMenuList(value: MenuListProps[Any, Any, Any] => Element): Self = StObject.set(x, "MenuList", js.Any.fromFunction1(value))
    
    inline def setMenuPortal(
      value: Instantiable0[
          MenuPortal[
            js.Object, 
            Boolean, 
            GroupBase[/* import warning: RewrittenClass.unapply cls was tparam Option */ Any]
          ]
        ]
    ): Self = StObject.set(x, "MenuPortal", value.asInstanceOf[js.Any])
    
    inline def setMultiValue(value: MultiValueProps[Any, Any, Any] => Element): Self = StObject.set(x, "MultiValue", js.Any.fromFunction1(value))
    
    inline def setMultiValueContainer(value: MultiValueGenericProps[Any, Any, Any] => Element): Self = StObject.set(x, "MultiValueContainer", js.Any.fromFunction1(value))
    
    inline def setMultiValueLabel(value: MultiValueGenericProps[Any, Any, Any] => Element): Self = StObject.set(x, "MultiValueLabel", js.Any.fromFunction1(value))
    
    inline def setMultiValueRemove(value: FnCall): Self = StObject.set(x, "MultiValueRemove", value.asInstanceOf[js.Any])
    
    inline def setNoOptionsMessage(value: CallDefaultProps): Self = StObject.set(x, "NoOptionsMessage", value.asInstanceOf[js.Any])
    
    inline def setOption(value: OptionProps[Any, Any, Any] => Element): Self = StObject.set(x, "Option", js.Any.fromFunction1(value))
    
    inline def setPlaceholder(value: PlaceholderProps[Any, Any, Any] => Element): Self = StObject.set(x, "Placeholder", js.Any.fromFunction1(value))
    
    inline def setSelectContainer(value: ContainerProps[Any, Any, Any] => Element): Self = StObject.set(x, "SelectContainer", js.Any.fromFunction1(value))
    
    inline def setSingleValue(value: SingleValueProps[Any, Any, Any] => Element): Self = StObject.set(x, "SingleValue", js.Any.fromFunction1(value))
    
    inline def setValueContainer(value: ValueContainerProps[Any, Any, Any] => Element): Self = StObject.set(x, "ValueContainer", js.Any.fromFunction1(value))
  }
}
