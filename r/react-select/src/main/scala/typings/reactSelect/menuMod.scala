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
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.InnerRef
import typings.reactSelect.typesMod.MenuPlacement
import typings.reactSelect.typesMod.MenuPosition
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.utilsMod.RectType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("react-select/src/components/Menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    inline def contextTypes_=(x: GetPortalPlacement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
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
    
    def getPlacement(ref: Ref[js.Any]): Unit = js.native
    
    def getState(): MenuProps[OptionType] & MenuState = js.native
  }
  /* static members */
  object Menu {
    
    @JSImport("react-select/src/components/Menu", "Menu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/components/Menu", "Menu.contextTypes")
    @js.native
    def contextTypes: GetPortalPlacement = js.native
    inline def contextTypes_=(x: GetPortalPlacement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
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
    inline def childContextTypes_=(x: GetPortalPlacement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/components/Menu", "NoOptionsMessage")
  @js.native
  val NoOptionsMessage: ComponentType[NoticeProps[js.Any]] = js.native
  
  inline def getMenuPlacement(args: PlacementArgs): MenuState = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuPlacement")(args.asInstanceOf[js.Any]).asInstanceOf[MenuState]
  
  inline def loadingMessageCSS(): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("loadingMessageCSS")().asInstanceOf[CSSProperties]
  
  inline def menuCSS(state: MenuState): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("menuCSS")(state.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  inline def menuListCSS(state: MenuState): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("menuListCSS")(state.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  inline def menuPortalCSS(args: PortalStyleArgs): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("menuPortalCSS")(args.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  inline def noOptionsMessageCSS(): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("noOptionsMessageCSS")().asInstanceOf[CSSProperties]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactSelect.menuMod.MenuListState because var conflicts: isMulti. Inlined maxHeight */ @js.native
  trait MenuListComponentProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType]
       with MenuListProps {
    
    /* Set the max height of the Menu component  */
    var maxHeight: Double = js.native
  }
  
  trait MenuListProps extends StObject {
    
    /** The children to be rendered. */
    var children: ReactNode
    
    /** Inner ref to DOM Node */
    var innerRef: InnerRef
  }
  object MenuListProps {
    
    inline def apply(): MenuListProps = {
      val __obj = js.Dynamic.literal(innerRef = null)
      __obj.asInstanceOf[MenuListProps]
    }
    
    extension [Self <: MenuListProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInnerRef(value: InnerRef): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    }
  }
  
  // ==============================
  // Menu List
  // ==============================
  trait MenuListState extends StObject {
    
    /** Set classname for isMulti */
    var isMulti: Boolean
    
    /* Set the max height of the Menu component  */
    var maxHeight: Double
  }
  object MenuListState {
    
    inline def apply(isMulti: Boolean, maxHeight: Double): MenuListState = {
      val __obj = js.Dynamic.literal(isMulti = isMulti.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuListState]
    }
    
    extension [Self <: MenuListState](x: Self) {
      
      inline def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MenuPortalProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType] {
    
    var appendTo: HTMLElement = js.native
    
    var children: ReactNode = js.native
    
    // ideally Menu<MenuProps>
    var controlElement: HTMLElement = js.native
    
    var menuPlacement: MenuPlacement = js.native
    
    var menuPosition: MenuPosition = js.native
  }
  
  trait MenuPortalState extends StObject {
    
    var placement: bottom | top | Null
  }
  object MenuPortalState {
    
    inline def apply(): MenuPortalState = {
      val __obj = js.Dynamic.literal(placement = null)
      __obj.asInstanceOf[MenuPortalState]
    }
    
    extension [Self <: MenuPortalState](x: Self) {
      
      inline def setPlacement(value: bottom | top): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementNull: Self = StObject.set(x, "placement", null)
    }
  }
  
  @js.native
  trait MenuProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType] {
    
    /** The children to be rendered. */
    var children: ReactElement = js.native
    
    /** Callback to update the portal after possible flip. */
    def getPortalPlacement(state: MenuState): Unit = js.native
    
    /** Props to be passed to the menu wrapper. */
    var innerProps: js.Object = js.native
    
    /** Reference to the internal element, consumed by the MenuPlacer component */
    var innerRef: InnerRef = js.native
    
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
  }
  
  trait MenuState extends StObject {
    
    var maxHeight: Double
    
    var placement: bottom | top | Null
  }
  object MenuState {
    
    inline def apply(maxHeight: Double): MenuState = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], placement = null)
      __obj.asInstanceOf[MenuState]
    }
    
    extension [Self <: MenuState](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: bottom | top): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementNull: Self = StObject.set(x, "placement", null)
    }
  }
  
  @js.native
  trait NoticeProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType] {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    /** Props to be passed on to the wrapper. */
    var innerProps: StringDictionary[js.Any] = js.native
  }
  
  trait PlacementArgs extends StObject {
    
    var isFixedPosition: Boolean
    
    var maxHeight: Double
    
    var menuEl: Ref[js.Any]
    
    var minHeight: Double
    
    var placement: bottom | top | auto
    
    var shouldScroll: Boolean
  }
  object PlacementArgs {
    
    inline def apply(
      isFixedPosition: Boolean,
      maxHeight: Double,
      minHeight: Double,
      placement: bottom | top | auto,
      shouldScroll: Boolean
    ): PlacementArgs = {
      val __obj = js.Dynamic.literal(isFixedPosition = isFixedPosition.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldScroll = shouldScroll.asInstanceOf[js.Any], menuEl = null)
      __obj.asInstanceOf[PlacementArgs]
    }
    
    extension [Self <: PlacementArgs](x: Self) {
      
      inline def setIsFixedPosition(value: Boolean): Self = StObject.set(x, "isFixedPosition", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMenuEl(value: Ref[js.Any]): Self = StObject.set(x, "menuEl", value.asInstanceOf[js.Any])
      
      inline def setMenuElFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "menuEl", js.Any.fromFunction1(value))
      
      inline def setMenuElNull: Self = StObject.set(x, "menuEl", null)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: bottom | top | auto): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setShouldScroll(value: Boolean): Self = StObject.set(x, "shouldScroll", value.asInstanceOf[js.Any])
    }
  }
  
  trait PortalStyleArgs extends StObject {
    
    var offset: Double
    
    var position: MenuPosition
    
    var rect: RectType
  }
  object PortalStyleArgs {
    
    inline def apply(offset: Double, position: MenuPosition, rect: RectType): PortalStyleArgs = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalStyleArgs]
    }
    
    extension [Self <: PortalStyleArgs](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: MenuPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRect(value: RectType): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    }
  }
}
