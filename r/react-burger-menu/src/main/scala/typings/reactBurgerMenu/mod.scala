package typings.reactBurgerMenu

import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactBurgerMenu.anon.PartialCSSStyleDeclaratio
import typings.reactBurgerMenu.anon.PartialStyles
import typings.reactBurgerMenu.reactBurgerMenuBooleans.`false`
import typings.reactBurgerMenu.reactBurgerMenuStrings.div
import typings.reactBurgerMenu.reactBurgerMenuStrings.nav
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-burger-menu", "ReactBurgerMenu")
  @js.native
  open class ReactBurgerMenu protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  @JSImport("react-burger-menu", "bubble")
  @js.native
  open class bubble protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  @JSImport("react-burger-menu", "elastic")
  @js.native
  open class elastic protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  @JSImport("react-burger-menu", "fallDown")
  @js.native
  open class fallDown protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  @JSImport("react-burger-menu", "push")
  @js.native
  open class push protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  @JSImport("react-burger-menu", "pushRotate")
  @js.native
  open class pushRotate protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  @JSImport("react-burger-menu", "reveal")
  @js.native
  open class reveal protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  @JSImport("react-burger-menu", "scaleDown")
  @js.native
  open class scaleDown protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  @JSImport("react-burger-menu", "scaleRotate")
  @js.native
  open class scaleRotate protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  @JSImport("react-burger-menu", "slide")
  @js.native
  open class slide protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  @JSImport("react-burger-menu", "stack")
  @js.native
  open class stack protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  trait HoverState extends StObject {
    
    var isMouseIn: Boolean
  }
  object HoverState {
    
    inline def apply(isMouseIn: Boolean): HoverState = {
      val __obj = js.Dynamic.literal(isMouseIn = isMouseIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoverState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HoverState] (val x: Self) extends AnyVal {
      
      inline def setIsMouseIn(value: Boolean): Self = StObject.set(x, "isMouseIn", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var bodyClassName: js.UndefOr[String] = js.undefined
    
    var burgerBarClassName: js.UndefOr[String] = js.undefined
    
    var burgerButtonClassName: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var crossButtonClassName: js.UndefOr[String] = js.undefined
    
    var crossClassName: js.UndefOr[String] = js.undefined
    
    var customBurgerIcon: js.UndefOr[Element | `false`] = js.undefined
    
    var customCrossIcon: js.UndefOr[Element | `false`] = js.undefined
    
    var customOnKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[typings.std.Element], Unit]] = js.undefined
    
    var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
    
    var disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var disableOverlayClick: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
    
    var htmlClassName: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var itemClassName: js.UndefOr[String] = js.undefined
    
    var itemListClassName: js.UndefOr[String] = js.undefined
    
    var itemListElement: js.UndefOr[div | nav] = js.undefined
    
    var menuClassName: js.UndefOr[String] = js.undefined
    
    var morphShapeClassName: js.UndefOr[String] = js.undefined
    
    var noOverlay: js.UndefOr[Boolean] = js.undefined
    
    var noTransition: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onIconHoverChange: js.UndefOr[js.Function1[/* state */ HoverState, Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
    
    // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
    // styles && styles.outerContainer ? PropTypes.string.isRequired : PropTypes.string
    var outerContainerId: js.UndefOr[String] = js.undefined
    
    var overlayClassName: js.UndefOr[String] = js.undefined
    
    // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
    // styles && styles.pageWrap ? PropTypes.string.isRequired : PropTypes.string,
    var pageWrapId: js.UndefOr[String] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
    
    var styles: js.UndefOr[PartialStyles] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setBodyClassName(value: String): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
      
      inline def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
      
      inline def setBurgerBarClassName(value: String): Self = StObject.set(x, "burgerBarClassName", value.asInstanceOf[js.Any])
      
      inline def setBurgerBarClassNameUndefined: Self = StObject.set(x, "burgerBarClassName", js.undefined)
      
      inline def setBurgerButtonClassName(value: String): Self = StObject.set(x, "burgerButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setBurgerButtonClassNameUndefined: Self = StObject.set(x, "burgerButtonClassName", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCrossButtonClassName(value: String): Self = StObject.set(x, "crossButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setCrossButtonClassNameUndefined: Self = StObject.set(x, "crossButtonClassName", js.undefined)
      
      inline def setCrossClassName(value: String): Self = StObject.set(x, "crossClassName", value.asInstanceOf[js.Any])
      
      inline def setCrossClassNameUndefined: Self = StObject.set(x, "crossClassName", js.undefined)
      
      inline def setCustomBurgerIcon(value: Element | `false`): Self = StObject.set(x, "customBurgerIcon", value.asInstanceOf[js.Any])
      
      inline def setCustomBurgerIconUndefined: Self = StObject.set(x, "customBurgerIcon", js.undefined)
      
      inline def setCustomCrossIcon(value: Element | `false`): Self = StObject.set(x, "customCrossIcon", value.asInstanceOf[js.Any])
      
      inline def setCustomCrossIconUndefined: Self = StObject.set(x, "customCrossIcon", js.undefined)
      
      inline def setCustomOnKeyDown(value: /* event */ KeyboardEvent[typings.std.Element] => Unit): Self = StObject.set(x, "customOnKeyDown", js.Any.fromFunction1(value))
      
      inline def setCustomOnKeyDownUndefined: Self = StObject.set(x, "customOnKeyDown", js.undefined)
      
      inline def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      inline def setDisableCloseOnEsc(value: Boolean): Self = StObject.set(x, "disableCloseOnEsc", value.asInstanceOf[js.Any])
      
      inline def setDisableCloseOnEscUndefined: Self = StObject.set(x, "disableCloseOnEsc", js.undefined)
      
      inline def setDisableOverlayClick(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "disableOverlayClick", value.asInstanceOf[js.Any])
      
      inline def setDisableOverlayClickFunction0(value: () => Boolean): Self = StObject.set(x, "disableOverlayClick", js.Any.fromFunction0(value))
      
      inline def setDisableOverlayClickUndefined: Self = StObject.set(x, "disableOverlayClick", js.undefined)
      
      inline def setHtmlClassName(value: String): Self = StObject.set(x, "htmlClassName", value.asInstanceOf[js.Any])
      
      inline def setHtmlClassNameUndefined: Self = StObject.set(x, "htmlClassName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setItemClassName(value: String): Self = StObject.set(x, "itemClassName", value.asInstanceOf[js.Any])
      
      inline def setItemClassNameUndefined: Self = StObject.set(x, "itemClassName", js.undefined)
      
      inline def setItemListClassName(value: String): Self = StObject.set(x, "itemListClassName", value.asInstanceOf[js.Any])
      
      inline def setItemListClassNameUndefined: Self = StObject.set(x, "itemListClassName", js.undefined)
      
      inline def setItemListElement(value: div | nav): Self = StObject.set(x, "itemListElement", value.asInstanceOf[js.Any])
      
      inline def setItemListElementUndefined: Self = StObject.set(x, "itemListElement", js.undefined)
      
      inline def setMenuClassName(value: String): Self = StObject.set(x, "menuClassName", value.asInstanceOf[js.Any])
      
      inline def setMenuClassNameUndefined: Self = StObject.set(x, "menuClassName", js.undefined)
      
      inline def setMorphShapeClassName(value: String): Self = StObject.set(x, "morphShapeClassName", value.asInstanceOf[js.Any])
      
      inline def setMorphShapeClassNameUndefined: Self = StObject.set(x, "morphShapeClassName", js.undefined)
      
      inline def setNoOverlay(value: Boolean): Self = StObject.set(x, "noOverlay", value.asInstanceOf[js.Any])
      
      inline def setNoOverlayUndefined: Self = StObject.set(x, "noOverlay", js.undefined)
      
      inline def setNoTransition(value: Boolean): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
      
      inline def setNoTransitionUndefined: Self = StObject.set(x, "noTransition", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnIconHoverChange(value: /* state */ HoverState => Unit): Self = StObject.set(x, "onIconHoverChange", js.Any.fromFunction1(value))
      
      inline def setOnIconHoverChangeUndefined: Self = StObject.set(x, "onIconHoverChange", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnStateChange(value: /* state */ State => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      inline def setOuterContainerId(value: String): Self = StObject.set(x, "outerContainerId", value.asInstanceOf[js.Any])
      
      inline def setOuterContainerIdUndefined: Self = StObject.set(x, "outerContainerId", js.undefined)
      
      inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      inline def setPageWrapId(value: String): Self = StObject.set(x, "pageWrapId", value.asInstanceOf[js.Any])
      
      inline def setPageWrapIdUndefined: Self = StObject.set(x, "pageWrapId", js.undefined)
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setStyles(value: PartialStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var isOpen: Boolean
  }
  object State {
    
    inline def apply(isOpen: Boolean): State = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
  
  trait Styles extends StObject {
    
    var bmBurgerBars: PartialCSSStyleDeclaratio
    
    var bmBurgerButton: PartialCSSStyleDeclaratio
    
    var bmCross: PartialCSSStyleDeclaratio
    
    var bmCrossButton: PartialCSSStyleDeclaratio
    
    var bmItemList: PartialCSSStyleDeclaratio
    
    var bmMenu: PartialCSSStyleDeclaratio
    
    var bmMenuWrap: PartialCSSStyleDeclaratio
    
    var bmMorphShape: PartialCSSStyleDeclaratio
    
    var bmOverlay: PartialCSSStyleDeclaratio
  }
  object Styles {
    
    inline def apply(
      bmBurgerBars: PartialCSSStyleDeclaratio,
      bmBurgerButton: PartialCSSStyleDeclaratio,
      bmCross: PartialCSSStyleDeclaratio,
      bmCrossButton: PartialCSSStyleDeclaratio,
      bmItemList: PartialCSSStyleDeclaratio,
      bmMenu: PartialCSSStyleDeclaratio,
      bmMenuWrap: PartialCSSStyleDeclaratio,
      bmMorphShape: PartialCSSStyleDeclaratio,
      bmOverlay: PartialCSSStyleDeclaratio
    ): Styles = {
      val __obj = js.Dynamic.literal(bmBurgerBars = bmBurgerBars.asInstanceOf[js.Any], bmBurgerButton = bmBurgerButton.asInstanceOf[js.Any], bmCross = bmCross.asInstanceOf[js.Any], bmCrossButton = bmCrossButton.asInstanceOf[js.Any], bmItemList = bmItemList.asInstanceOf[js.Any], bmMenu = bmMenu.asInstanceOf[js.Any], bmMenuWrap = bmMenuWrap.asInstanceOf[js.Any], bmMorphShape = bmMorphShape.asInstanceOf[js.Any], bmOverlay = bmOverlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Styles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
      
      inline def setBmBurgerBars(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmBurgerBars", value.asInstanceOf[js.Any])
      
      inline def setBmBurgerButton(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmBurgerButton", value.asInstanceOf[js.Any])
      
      inline def setBmCross(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmCross", value.asInstanceOf[js.Any])
      
      inline def setBmCrossButton(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmCrossButton", value.asInstanceOf[js.Any])
      
      inline def setBmItemList(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmItemList", value.asInstanceOf[js.Any])
      
      inline def setBmMenu(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmMenu", value.asInstanceOf[js.Any])
      
      inline def setBmMenuWrap(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmMenuWrap", value.asInstanceOf[js.Any])
      
      inline def setBmMorphShape(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmMorphShape", value.asInstanceOf[js.Any])
      
      inline def setBmOverlay(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmOverlay", value.asInstanceOf[js.Any])
    }
  }
}
