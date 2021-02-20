package typings.reactSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactSelect.anon.GetPortalPlacement
import typings.reactSelect.reactSelectStrings.auto
import typings.reactSelect.reactSelectStrings.bottom
import typings.reactSelect.reactSelectStrings.top
import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.InnerRef
import typings.reactSelect.typesMod.MenuPlacement
import typings.reactSelect.typesMod.MenuPosition
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import typings.reactSelect.utilsMod.RectType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("react-select/src/components/Menu", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] protected () extends Menu[OptionType] {
    def this(props: MenuProps[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuProps[OptionType], context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/src/components/Menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/components/Menu", "default.contextTypes")
    @js.native
    def contextTypes: GetPortalPlacement = js.native
    @scala.inline
    def contextTypes_=(x: GetPortalPlacement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/components/Menu", "LoadingMessage")
  @js.native
  val LoadingMessage: ComponentType[NoticeProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Menu", "Menu")
  @js.native
  class Menu[OptionType /* <: OptionTypeBase */] protected ()
    extends Component[MenuProps[OptionType], MenuState, js.Any] {
    def this(props: MenuProps[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuProps[OptionType], context: js.Any) = this()
    
    def getPlacement(ref: Ref[_]): Unit = js.native
    
    def getState(): MenuProps[OptionType] with MenuState = js.native
  }
  /* static members */
  object Menu {
    
    @JSImport("react-select/src/components/Menu", "Menu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/components/Menu", "Menu.contextTypes")
    @js.native
    def contextTypes: GetPortalPlacement = js.native
    @scala.inline
    def contextTypes_=(x: GetPortalPlacement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/components/Menu", "MenuList")
  @js.native
  val MenuList: ComponentType[MenuListComponentProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Menu", "MenuPortal")
  @js.native
  class MenuPortal[OptionType /* <: OptionTypeBase */] protected ()
    extends Component[MenuPortalProps[OptionType], MenuPortalState, js.Any] {
    def this(props: MenuPortalProps[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuPortalProps[OptionType], context: js.Any) = this()
    
    def getChildContext(): GetPortalPlacement = js.native
    
    // callback for occassions where the menu must "flip"
    def getPortalPlacement(state: MenuState): Unit = js.native
  }
  /* static members */
  object MenuPortal {
    
    @JSImport("react-select/src/components/Menu", "MenuPortal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/components/Menu", "MenuPortal.childContextTypes")
    @js.native
    def childContextTypes: GetPortalPlacement = js.native
    @scala.inline
    def childContextTypes_=(x: GetPortalPlacement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/components/Menu", "NoOptionsMessage")
  @js.native
  val NoOptionsMessage: ComponentType[NoticeProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Menu", "getMenuPlacement")
  @js.native
  def getMenuPlacement(args: PlacementArgs): MenuState = js.native
  
  @JSImport("react-select/src/components/Menu", "loadingMessageCSS")
  @js.native
  def loadingMessageCSS(): CSSProperties = js.native
  
  @JSImport("react-select/src/components/Menu", "menuCSS")
  @js.native
  def menuCSS(state: MenuState): CSSProperties = js.native
  
  @JSImport("react-select/src/components/Menu", "menuListCSS")
  @js.native
  def menuListCSS(state: MenuState): CSSProperties = js.native
  
  @JSImport("react-select/src/components/Menu", "menuPortalCSS")
  @js.native
  def menuPortalCSS(args: PortalStyleArgs): CSSProperties = js.native
  
  @JSImport("react-select/src/components/Menu", "noOptionsMessageCSS")
  @js.native
  def noOptionsMessageCSS(): CSSProperties = js.native
  
  type MenuListComponentProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with MenuListProps with MenuListState
  
  @js.native
  trait MenuListProps extends StObject {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    /** Inner ref to DOM Node */
    var innerRef: InnerRef = js.native
  }
  object MenuListProps {
    
    @scala.inline
    def apply(): MenuListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuListProps]
    }
    
    @scala.inline
    implicit class MenuListPropsMutableBuilder[Self <: MenuListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInnerRef(value: InnerRef): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    }
  }
  
  // ==============================
  // Menu List
  // ==============================
  @js.native
  trait MenuListState extends StObject {
    
    /** Set classname for isMulti */
    var isMulti: Boolean = js.native
    
    /* Set the max height of the Menu component  */
    var maxHeight: Double = js.native
  }
  object MenuListState {
    
    @scala.inline
    def apply(isMulti: Boolean, maxHeight: Double): MenuListState = {
      val __obj = js.Dynamic.literal(isMulti = isMulti.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuListState]
    }
    
    @scala.inline
    implicit class MenuListStateMutableBuilder[Self <: MenuListState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  appendTo :std.HTMLElement,   children :react.react.ReactNode,   controlElement :std.HTMLElement,   menuPlacement :react-select.react-select/src/types.MenuPlacement,   menuPosition :react-select.react-select/src/types.MenuPosition} */
  @js.native
  trait MenuPortalProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var appendTo: HTMLElement = js.native
    
    var children: ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    def clearValue(): Unit = js.native
    
    // ideally Menu<MenuProps>
    var controlElement: HTMLElement = js.native
    
    def cx(): String = js.native
    def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
    def cx(state: ClassNamesState): String = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    def getValue(): ValueType[OptionType] = js.native
    
    var hasValue: Boolean = js.native
    
    var isMulti: Boolean = js.native
    
    var menuPlacement: MenuPlacement = js.native
    
    var menuPosition: MenuPosition = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  @js.native
  trait MenuPortalState extends StObject {
    
    var placement: bottom | top | Null = js.native
  }
  object MenuPortalState {
    
    @scala.inline
    def apply(): MenuPortalState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuPortalState]
    }
    
    @scala.inline
    implicit class MenuPortalStateMutableBuilder[Self <: MenuPortalState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlacement(value: bottom | top): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementNull: Self = StObject.set(x, "placement", null)
    }
  }
  
  /* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  children :react.react.ReactElement, getPortalPlacement (state : react-select.react-select/src/components/Menu.MenuState): void,   innerProps :object,   innerRef :react-select.react-select/src/types.InnerRef,   maxMenuHeight :number,   menuPlacement :react-select.react-select/src/types.MenuPlacement,   menuPosition :react-select.react-select/src/types.MenuPosition,   minMenuHeight :number,   menuShouldScrollIntoView :boolean} */
  @js.native
  trait MenuProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /** The children to be rendered. */
    var children: ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
    
    def clearValue(): Unit = js.native
    
    def cx(): String = js.native
    def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
    def cx(state: ClassNamesState): String = js.native
    
    /** Callback to update the portal after possible flip. */
    def getPortalPlacement(state: MenuState): Unit = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    def getValue(): ValueType[OptionType] = js.native
    
    var hasValue: Boolean = js.native
    
    /** Props to be passed to the menu wrapper. */
    var innerProps: js.Object = js.native
    
    /** Reference to the internal element, consumed by the MenuPlacer component */
    var innerRef: InnerRef = js.native
    
    var isMulti: Boolean = js.native
    
    /** Set the maximum height of the menu. */
    var maxMenuHeight: Double = js.native
    
    /** Set whether the menu should be at the top, at the bottom. The auto options sets it to bottom. */
    var menuPlacement: MenuPlacement = js.native
    
    /* The CSS position value of the menu, when "fixed" extra layout management is required */
    var menuPosition: MenuPosition = js.native
    
    /** Set whether the page should scroll to show the menu. */
    var menuShouldScrollIntoView: Boolean = js.native
    
    /** Set the minimum height of the menu. */
    var minMenuHeight: Double = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  @js.native
  trait MenuState extends StObject {
    
    var maxHeight: Double = js.native
    
    var placement: bottom | top | Null = js.native
  }
  object MenuState {
    
    @scala.inline
    def apply(maxHeight: Double): MenuState = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuState]
    }
    
    @scala.inline
    implicit class MenuStateMutableBuilder[Self <: MenuState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: bottom | top): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementNull: Self = StObject.set(x, "placement", null)
    }
  }
  
  /* Inlined react-select.react-select/src/types.CommonProps<OptionType> & {  children :react.react.ReactNode,   innerProps :{[key: string] : any}} */
  @js.native
  trait NoticeProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    def clearValue(): Unit = js.native
    
    def cx(): String = js.native
    def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
    def cx(state: ClassNamesState): String = js.native
    
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    
    def getValue(): ValueType[OptionType] = js.native
    
    var hasValue: Boolean = js.native
    
    /** Props to be passed on to the wrapper. */
    var innerProps: StringDictionary[js.Any] = js.native
    
    var isMulti: Boolean = js.native
    
    var options: OptionsType[OptionType] = js.native
    
    def selectOption(option: OptionType): Unit = js.native
    
    var selectProps: Props[OptionType] = js.native
    
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  @js.native
  trait PlacementArgs extends StObject {
    
    var isFixedPosition: Boolean = js.native
    
    var maxHeight: Double = js.native
    
    var menuEl: Ref[_] = js.native
    
    var minHeight: Double = js.native
    
    var placement: bottom | top | auto = js.native
    
    var shouldScroll: Boolean = js.native
  }
  object PlacementArgs {
    
    @scala.inline
    def apply(
      isFixedPosition: Boolean,
      maxHeight: Double,
      minHeight: Double,
      placement: bottom | top | auto,
      shouldScroll: Boolean
    ): PlacementArgs = {
      val __obj = js.Dynamic.literal(isFixedPosition = isFixedPosition.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldScroll = shouldScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlacementArgs]
    }
    
    @scala.inline
    implicit class PlacementArgsMutableBuilder[Self <: PlacementArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsFixedPosition(value: Boolean): Self = StObject.set(x, "isFixedPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuEl(value: Ref[_]): Self = StObject.set(x, "menuEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuElFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "menuEl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuElNull: Self = StObject.set(x, "menuEl", null)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: bottom | top | auto): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldScroll(value: Boolean): Self = StObject.set(x, "shouldScroll", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PortalStyleArgs extends StObject {
    
    var offset: Double = js.native
    
    var position: MenuPosition = js.native
    
    var rect: RectType = js.native
  }
  object PortalStyleArgs {
    
    @scala.inline
    def apply(offset: Double, position: MenuPosition, rect: RectType): PortalStyleArgs = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalStyleArgs]
    }
    
    @scala.inline
    implicit class PortalStyleArgsMutableBuilder[Self <: PortalStyleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: MenuPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRect(value: RectType): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    }
  }
}
