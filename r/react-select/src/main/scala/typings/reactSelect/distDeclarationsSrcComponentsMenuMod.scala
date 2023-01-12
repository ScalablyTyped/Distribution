package typings.reactSelect

import typings.emotionReact.mod.jsx.JSX.Element
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactSelect.anon.Children
import typings.reactSelect.anon.Left
import typings.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typings.reactSelect.distDeclarationsSrcTypesMod.CoercedMenuPlacement
import typings.reactSelect.distDeclarationsSrcTypesMod.CommonProps
import typings.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcTypesMod.MenuPlacement
import typings.reactSelect.distDeclarationsSrcTypesMod.MenuPosition
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsMenuMod {
  
  @JSImport("react-select/dist/declarations/src/components/Menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: MenuProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object LoadingMessage {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: NoticeProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-select/dist/declarations/src/components/Menu", "LoadingMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/dist/declarations/src/components/Menu", "LoadingMessage.defaultProps")
    @js.native
    def defaultProps: Children = js.native
    inline def defaultProps_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def MenuList[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: MenuListProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuList")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MenuPlacer[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: MenuPlacerProps[Option, IsMulti, Group]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuPlacer")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def MenuPortal[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: MenuPortalProps[Option, IsMulti, Group]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuPortal")(param0.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  object NoOptionsMessage {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: NoticeProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-select/dist/declarations/src/components/Menu", "NoOptionsMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/dist/declarations/src/components/Menu", "NoOptionsMessage.defaultProps")
    @js.native
    def defaultProps: Children = js.native
    inline def defaultProps_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def getMenuPlacement(param0: PlacementArgs): CalculatedMenuPlacementAndHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuPlacement")(param0.asInstanceOf[js.Any]).asInstanceOf[CalculatedMenuPlacementAndHeight]
  
  inline def loadingMessageCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: NoticeProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("loadingMessageCSS")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def menuCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: MenuProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("menuCSS")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def menuListCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: MenuListProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("menuListCSS")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def menuPortalCSS(param0: PortalStyleArgs): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("menuPortalCSS")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def noOptionsMessageCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](param0: NoticeProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("noOptionsMessageCSS")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  trait CalculatedMenuPlacementAndHeight extends StObject {
    
    var maxHeight: Double
    
    var placement: CoercedMenuPlacement
  }
  object CalculatedMenuPlacementAndHeight {
    
    inline def apply(maxHeight: Double, placement: CoercedMenuPlacement): CalculatedMenuPlacementAndHeight = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalculatedMenuPlacementAndHeight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalculatedMenuPlacementAndHeight] (val x: Self) extends AnyVal {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: CoercedMenuPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChildrenProps extends StObject {
    
    var placerProps: PlacerProps
    
    var ref: Ref[HTMLDivElement]
  }
  object ChildrenProps {
    
    inline def apply(placerProps: PlacerProps): ChildrenProps = {
      val __obj = js.Dynamic.literal(placerProps = placerProps.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[ChildrenProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChildrenProps] (val x: Self) extends AnyVal {
      
      inline def setPlacerProps(value: PlacerProps): Self = StObject.set(x, "placerProps", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  @js.native
  trait MenuListProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    /** The currently focused option */
    var focusedOption: Option = js.native
    
    /** Props to be passed to the menu-list wrapper. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    /** Inner ref to DOM ReactNode */
    var innerRef: Ref[HTMLDivElement] = js.native
    
    /** Set the max height of the Menu component  */
    var maxHeight: Double = js.native
  }
  
  trait MenuPlacementProps extends StObject {
    
    /** Set the maximum height of the menu. */
    var maxMenuHeight: Double
    
    /** Set whether the menu should be at the top, at the bottom. The auto options sets it to bottom. */
    var menuPlacement: MenuPlacement
    
    /** The CSS position value of the menu, when "fixed" extra layout management is required */
    var menuPosition: MenuPosition
    
    /** Set whether the page should scroll to show the menu. */
    var menuShouldScrollIntoView: Boolean
    
    /** Set the minimum height of the menu. */
    var minMenuHeight: Double
  }
  object MenuPlacementProps {
    
    inline def apply(
      maxMenuHeight: Double,
      menuPlacement: MenuPlacement,
      menuPosition: MenuPosition,
      menuShouldScrollIntoView: Boolean,
      minMenuHeight: Double
    ): MenuPlacementProps = {
      val __obj = js.Dynamic.literal(maxMenuHeight = maxMenuHeight.asInstanceOf[js.Any], menuPlacement = menuPlacement.asInstanceOf[js.Any], menuPosition = menuPosition.asInstanceOf[js.Any], menuShouldScrollIntoView = menuShouldScrollIntoView.asInstanceOf[js.Any], minMenuHeight = minMenuHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuPlacementProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuPlacementProps] (val x: Self) extends AnyVal {
      
      inline def setMaxMenuHeight(value: Double): Self = StObject.set(x, "maxMenuHeight", value.asInstanceOf[js.Any])
      
      inline def setMenuPlacement(value: MenuPlacement): Self = StObject.set(x, "menuPlacement", value.asInstanceOf[js.Any])
      
      inline def setMenuPosition(value: MenuPosition): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      inline def setMenuShouldScrollIntoView(value: Boolean): Self = StObject.set(x, "menuShouldScrollIntoView", value.asInstanceOf[js.Any])
      
      inline def setMinMenuHeight(value: Double): Self = StObject.set(x, "minMenuHeight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MenuPlacerProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonProps[Option, IsMulti, Group]
       with MenuPlacementProps {
    
    /** The children to be rendered. */
    def children(childrenProps: ChildrenProps): ReactElement = js.native
  }
  
  @js.native
  trait MenuPortalProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    var appendTo: js.UndefOr[HTMLElement] = js.native
    
    var children: ReactNode = js.native
    
    var controlElement: HTMLDivElement | Null = js.native
    
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    var menuPlacement: MenuPlacement = js.native
    
    var menuPosition: MenuPosition = js.native
  }
  
  @js.native
  trait MenuProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group]
       with MenuPlacementProps {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    /** Reference to the internal element, consumed by the MenuPlacer component */
    var innerRef: Ref[HTMLDivElement] = js.native
    
    var isLoading: Boolean = js.native
    
    var placement: CoercedMenuPlacement = js.native
  }
  
  @js.native
  trait NoticeProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered. */
    var children: ReactNode = js.native
    
    /** Props to be passed on to the wrapper. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
  }
  
  trait PlacementArgs extends StObject {
    
    var controlHeight: Double
    
    var isFixedPosition: Boolean
    
    var maxHeight: Double
    
    var menuEl: HTMLDivElement | Null
    
    var minHeight: Double
    
    var placement: MenuPlacement
    
    var shouldScroll: Boolean
  }
  object PlacementArgs {
    
    inline def apply(
      controlHeight: Double,
      isFixedPosition: Boolean,
      maxHeight: Double,
      minHeight: Double,
      placement: MenuPlacement,
      shouldScroll: Boolean
    ): PlacementArgs = {
      val __obj = js.Dynamic.literal(controlHeight = controlHeight.asInstanceOf[js.Any], isFixedPosition = isFixedPosition.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldScroll = shouldScroll.asInstanceOf[js.Any], menuEl = null)
      __obj.asInstanceOf[PlacementArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlacementArgs] (val x: Self) extends AnyVal {
      
      inline def setControlHeight(value: Double): Self = StObject.set(x, "controlHeight", value.asInstanceOf[js.Any])
      
      inline def setIsFixedPosition(value: Boolean): Self = StObject.set(x, "isFixedPosition", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMenuEl(value: HTMLDivElement): Self = StObject.set(x, "menuEl", value.asInstanceOf[js.Any])
      
      inline def setMenuElNull: Self = StObject.set(x, "menuEl", null)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: MenuPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setShouldScroll(value: Boolean): Self = StObject.set(x, "shouldScroll", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlacerProps extends StObject {
    
    var maxHeight: Double
    
    var placement: CoercedMenuPlacement
  }
  object PlacerProps {
    
    inline def apply(maxHeight: Double, placement: CoercedMenuPlacement): PlacerProps = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlacerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlacerProps] (val x: Self) extends AnyVal {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: CoercedMenuPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  trait PortalStyleArgs extends StObject {
    
    var offset: Double
    
    var position: MenuPosition
    
    var rect: Left
  }
  object PortalStyleArgs {
    
    inline def apply(offset: Double, position: MenuPosition, rect: Left): PortalStyleArgs = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalStyleArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortalStyleArgs] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: MenuPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRect(value: Left): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    }
  }
}
