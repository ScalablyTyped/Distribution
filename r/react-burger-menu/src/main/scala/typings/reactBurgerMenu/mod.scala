package typings.reactBurgerMenu

import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.global.JSX.Element
import typings.reactBurgerMenu.anon.PartialCSSStyleDeclaratio
import typings.reactBurgerMenu.anon.PartialStyles
import typings.reactBurgerMenu.reactBurgerMenuBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-burger-menu", "ReactBurgerMenu")
  @js.native
  class ReactBurgerMenu protected ()
    extends Component[Props, js.Object, js.Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @JSImport("react-burger-menu", "bubble")
  @js.native
  class bubble protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @JSImport("react-burger-menu", "elastic")
  @js.native
  class elastic protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @JSImport("react-burger-menu", "fallDown")
  @js.native
  class fallDown protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @JSImport("react-burger-menu", "push")
  @js.native
  class push protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @JSImport("react-burger-menu", "pushRotate")
  @js.native
  class pushRotate protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @JSImport("react-burger-menu", "reveal")
  @js.native
  class reveal protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @JSImport("react-burger-menu", "scaleDown")
  @js.native
  class scaleDown protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @JSImport("react-burger-menu", "scaleRotate")
  @js.native
  class scaleRotate protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @JSImport("react-burger-menu", "slide")
  @js.native
  class slide protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @JSImport("react-burger-menu", "stack")
  @js.native
  class stack protected () extends ReactBurgerMenu {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
  }
  
  @js.native
  trait HoverState extends StObject {
    
    var isMouseIn: Boolean = js.native
  }
  object HoverState {
    
    @scala.inline
    def apply(isMouseIn: Boolean): HoverState = {
      val __obj = js.Dynamic.literal(isMouseIn = isMouseIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoverState]
    }
    
    @scala.inline
    implicit class HoverStateMutableBuilder[Self <: HoverState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMouseIn(value: Boolean): Self = StObject.set(x, "isMouseIn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Props extends StObject {
    
    var bodyClassName: js.UndefOr[String] = js.native
    
    var burgerBarClassName: js.UndefOr[String] = js.native
    
    var burgerButtonClassName: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var crossButtonClassName: js.UndefOr[String] = js.native
    
    var crossClassName: js.UndefOr[String] = js.native
    
    var customBurgerIcon: js.UndefOr[Element | `false`] = js.native
    
    var customCrossIcon: js.UndefOr[Element | `false`] = js.native
    
    var customOnKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[typings.std.Element], Unit]] = js.native
    
    var disableAutoFocus: js.UndefOr[Boolean] = js.native
    
    var disableCloseOnEsc: js.UndefOr[Boolean] = js.native
    
    var disableOverlayClick: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
    
    var htmlClassName: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var itemClassName: js.UndefOr[String] = js.native
    
    var itemListClassName: js.UndefOr[String] = js.native
    
    var menuClassName: js.UndefOr[String] = js.native
    
    var morphShapeClassName: js.UndefOr[String] = js.native
    
    var noOverlay: js.UndefOr[Boolean] = js.native
    
    var noTransition: js.UndefOr[Boolean] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onIconHoverChange: js.UndefOr[js.Function1[/* state */ HoverState, Unit]] = js.native
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.native
    
    // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
    // styles && styles.outerContainer ? PropTypes.string.isRequired : PropTypes.string
    var outerContainerId: js.UndefOr[String] = js.native
    
    var overlayClassName: js.UndefOr[String] = js.native
    
    // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
    // styles && styles.pageWrap ? PropTypes.string.isRequired : PropTypes.string,
    var pageWrapId: js.UndefOr[String] = js.native
    
    var right: js.UndefOr[Boolean] = js.native
    
    var styles: js.UndefOr[PartialStyles] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyClassName(value: String): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
      
      @scala.inline
      def setBurgerBarClassName(value: String): Self = StObject.set(x, "burgerBarClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBurgerBarClassNameUndefined: Self = StObject.set(x, "burgerBarClassName", js.undefined)
      
      @scala.inline
      def setBurgerButtonClassName(value: String): Self = StObject.set(x, "burgerButtonClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBurgerButtonClassNameUndefined: Self = StObject.set(x, "burgerButtonClassName", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCrossButtonClassName(value: String): Self = StObject.set(x, "crossButtonClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossButtonClassNameUndefined: Self = StObject.set(x, "crossButtonClassName", js.undefined)
      
      @scala.inline
      def setCrossClassName(value: String): Self = StObject.set(x, "crossClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossClassNameUndefined: Self = StObject.set(x, "crossClassName", js.undefined)
      
      @scala.inline
      def setCustomBurgerIcon(value: Element | `false`): Self = StObject.set(x, "customBurgerIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomBurgerIconUndefined: Self = StObject.set(x, "customBurgerIcon", js.undefined)
      
      @scala.inline
      def setCustomCrossIcon(value: Element | `false`): Self = StObject.set(x, "customCrossIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCrossIconUndefined: Self = StObject.set(x, "customCrossIcon", js.undefined)
      
      @scala.inline
      def setCustomOnKeyDown(value: /* event */ KeyboardEvent[typings.std.Element] => Unit): Self = StObject.set(x, "customOnKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomOnKeyDownUndefined: Self = StObject.set(x, "customOnKeyDown", js.undefined)
      
      @scala.inline
      def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      @scala.inline
      def setDisableCloseOnEsc(value: Boolean): Self = StObject.set(x, "disableCloseOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCloseOnEscUndefined: Self = StObject.set(x, "disableCloseOnEsc", js.undefined)
      
      @scala.inline
      def setDisableOverlayClick(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "disableOverlayClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableOverlayClickFunction0(value: () => Boolean): Self = StObject.set(x, "disableOverlayClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableOverlayClickUndefined: Self = StObject.set(x, "disableOverlayClick", js.undefined)
      
      @scala.inline
      def setHtmlClassName(value: String): Self = StObject.set(x, "htmlClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlClassNameUndefined: Self = StObject.set(x, "htmlClassName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setItemClassName(value: String): Self = StObject.set(x, "itemClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemClassNameUndefined: Self = StObject.set(x, "itemClassName", js.undefined)
      
      @scala.inline
      def setItemListClassName(value: String): Self = StObject.set(x, "itemListClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemListClassNameUndefined: Self = StObject.set(x, "itemListClassName", js.undefined)
      
      @scala.inline
      def setMenuClassName(value: String): Self = StObject.set(x, "menuClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuClassNameUndefined: Self = StObject.set(x, "menuClassName", js.undefined)
      
      @scala.inline
      def setMorphShapeClassName(value: String): Self = StObject.set(x, "morphShapeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMorphShapeClassNameUndefined: Self = StObject.set(x, "morphShapeClassName", js.undefined)
      
      @scala.inline
      def setNoOverlay(value: Boolean): Self = StObject.set(x, "noOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoOverlayUndefined: Self = StObject.set(x, "noOverlay", js.undefined)
      
      @scala.inline
      def setNoTransition(value: Boolean): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoTransitionUndefined: Self = StObject.set(x, "noTransition", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnIconHoverChange(value: /* state */ HoverState => Unit): Self = StObject.set(x, "onIconHoverChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIconHoverChangeUndefined: Self = StObject.set(x, "onIconHoverChange", js.undefined)
      
      @scala.inline
      def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnStateChange(value: /* state */ State => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      @scala.inline
      def setOuterContainerId(value: String): Self = StObject.set(x, "outerContainerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterContainerIdUndefined: Self = StObject.set(x, "outerContainerId", js.undefined)
      
      @scala.inline
      def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setPageWrapId(value: String): Self = StObject.set(x, "pageWrapId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageWrapIdUndefined: Self = StObject.set(x, "pageWrapId", js.undefined)
      
      @scala.inline
      def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var isOpen: Boolean = js.native
  }
  object State {
    
    @scala.inline
    def apply(isOpen: Boolean): State = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Styles extends StObject {
    
    var bmBurgerBars: PartialCSSStyleDeclaratio = js.native
    
    var bmBurgerButton: PartialCSSStyleDeclaratio = js.native
    
    var bmCross: PartialCSSStyleDeclaratio = js.native
    
    var bmCrossButton: PartialCSSStyleDeclaratio = js.native
    
    var bmItemList: PartialCSSStyleDeclaratio = js.native
    
    var bmMenu: PartialCSSStyleDeclaratio = js.native
    
    var bmMenuWrap: PartialCSSStyleDeclaratio = js.native
    
    var bmMorphShape: PartialCSSStyleDeclaratio = js.native
    
    var bmOverlay: PartialCSSStyleDeclaratio = js.native
  }
  object Styles {
    
    @scala.inline
    def apply(
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
    implicit class StylesMutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBmBurgerBars(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmBurgerBars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBmBurgerButton(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmBurgerButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBmCross(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmCross", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBmCrossButton(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmCrossButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBmItemList(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmItemList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBmMenu(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBmMenuWrap(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmMenuWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBmMorphShape(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmMorphShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBmOverlay(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "bmOverlay", value.asInstanceOf[js.Any])
    }
  }
}
