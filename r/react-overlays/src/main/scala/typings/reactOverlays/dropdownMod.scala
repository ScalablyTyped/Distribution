package typings.reactOverlays

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactOverlays.anon.Props
import typings.reactOverlays.dropdownContextMod.DropDirection
import typings.reactOverlays.dropdownMenuMod.DropdownMenuProps
import typings.reactOverlays.dropdownToggleMod.DropdownToggleProps
import typings.reactOverlays.reactOverlaysBooleans.`false`
import typings.reactOverlays.reactOverlaysBooleans.`true`
import typings.reactOverlays.reactOverlaysStrings.keyboard
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  object default {
    
    /**
      * @displayName Dropdown
      */
    @JSImport("react-overlays/cjs/Dropdown", JSImport.Default)
    @js.native
    def apply(hasDropAlignEndDefaultShowShowOnToggleItemSelectorFocusFirstItemOnShowChildren: DropdownProps): Element = js.native
    @JSImport("react-overlays/cjs/Dropdown", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof DropdownMenu` */
    object Menu {
      
      /**
        * Also exported as `<Dropdown.Menu>` from `Dropdown`.
        *
        * @displayName DropdownMenu
        * @memberOf Dropdown
        */
      @JSImport("react-overlays/cjs/Dropdown", "default.Menu")
      @js.native
      def apply(hasChildrenOptions: DropdownMenuProps): Element = js.native
      @JSImport("react-overlays/cjs/Dropdown", "default.Menu")
      @js.native
      val ^ : js.Any = js.native
      
      object defaultProps {
        
        @JSImport("react-overlays/cjs/Dropdown", "default.Menu.defaultProps")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("react-overlays/cjs/Dropdown", "default.Menu.defaultProps.usePopper")
        @js.native
        def usePopper: Boolean = js.native
        @scala.inline
        def usePopper_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
      }
      
      @JSImport("react-overlays/cjs/Dropdown", "default.Menu.displayName")
      @js.native
      def displayName: String = js.native
      @scala.inline
      def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      object propTypes {
        
        @JSImport("react-overlays/cjs/Dropdown", "default.Menu.propTypes")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Aligns the dropdown menu to the 'end' of it's placement position.
          * Generally this is provided by the parent `Dropdown` component,
          * but may also be specified as a prop directly.
          */
        @JSImport("react-overlays/cjs/Dropdown", "default.Menu.propTypes.alignEnd")
        @js.native
        def alignEnd: Requireable[Boolean] = js.native
        @scala.inline
        def alignEnd_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(x.asInstanceOf[js.Any])
        
        /**
          * A render prop that returns a Menu element. The `props`
          * argument should spread through to **a component that can accept a ref**.
          *
          * @type {Function ({
          *   show: boolean,
          *   alignEnd: boolean,
          *   close: (?SyntheticEvent) => void,
          *   placement: Placement,
          *   update: () => void,
          *   forceUpdate: () => void,
          *   props: {
          *     ref: (?HTMLElement) => void,
          *     style: { [string]: string | number },
          *     aria-labelledby: ?string
          *   },
          *   arrowProps: {
          *     ref: (?HTMLElement) => void,
          *     style: { [string]: string | number },
          *   },
          * }) => React.Element}
          */
        @JSImport("react-overlays/cjs/Dropdown", "default.Menu.propTypes.children")
        @js.native
        def children: Validator[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
        @scala.inline
        def children_=(x: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
        
        /**
          * Enables the Popper.js `flip` modifier, allowing the Dropdown to
          * automatically adjust it's placement in case of overlap with the viewport or toggle.
          * Refer to the [flip docs](https://popper.js.org/popper-documentation.html#modifiers..flip.enabled) for more info
          */
        @JSImport("react-overlays/cjs/Dropdown", "default.Menu.propTypes.flip")
        @js.native
        def flip: Requireable[Boolean] = js.native
        @scala.inline
        def flip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
        
        /**
          * A set of popper options and props passed directly to react-popper's Popper component.
          */
        @JSImport("react-overlays/cjs/Dropdown", "default.Menu.propTypes.popperConfig")
        @js.native
        def popperConfig: Requireable[js.Object] = js.native
        @scala.inline
        def popperConfig_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
        
        /**
          * Override the default event used by RootCloseWrapper.
          */
        @JSImport("react-overlays/cjs/Dropdown", "default.Menu.propTypes.rootCloseEvent")
        @js.native
        def rootCloseEvent: Requireable[String] = js.native
        @scala.inline
        def rootCloseEvent_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootCloseEvent")(x.asInstanceOf[js.Any])
        
        /**
          * Controls the visible state of the menu, generally this is
          * provided by the parent `Dropdown` component,
          * but may also be specified as a prop directly.
          */
        @JSImport("react-overlays/cjs/Dropdown", "default.Menu.propTypes.show")
        @js.native
        def show: Requireable[Boolean] = js.native
        @scala.inline
        def show_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
        
        @JSImport("react-overlays/cjs/Dropdown", "default.Menu.propTypes.usePopper")
        @js.native
        def usePopper: Requireable[Boolean] = js.native
        @scala.inline
        def usePopper_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
      }
    }
    
    /* was `typeof DropdownToggle` */
    object Toggle {
      
      /**
        * Also exported as `<Dropdown.Toggle>` from `Dropdown`.
        *
        * @displayName DropdownToggle
        * @memberOf Dropdown
        */
      @JSImport("react-overlays/cjs/Dropdown", "default.Toggle")
      @js.native
      def apply(hasChildren: DropdownToggleProps): Element = js.native
      @JSImport("react-overlays/cjs/Dropdown", "default.Toggle")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-overlays/cjs/Dropdown", "default.Toggle.displayName")
      @js.native
      def displayName: String = js.native
      @scala.inline
      def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      object propTypes {
        
        @JSImport("react-overlays/cjs/Dropdown", "default.Toggle.propTypes")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * A render prop that returns a Toggle element. The `props`
          * argument should spread through to **a component that can accept a ref**. Use
          * the `onToggle` argument to toggle the menu open or closed
          *
          * @type {Function ({
          *   show: boolean,
          *   toggle: (show: boolean) => void,
          *   props: {
          *     ref: (?HTMLElement) => void,
          *     aria-haspopup: true
          *     aria-expanded: boolean
          *   },
          * }) => React.Element}
          */
        @JSImport("react-overlays/cjs/Dropdown", "default.Toggle.propTypes.children")
        @js.native
        def children: Validator[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
        @scala.inline
        def children_=(x: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      }
    }
    
    @JSImport("react-overlays/cjs/Dropdown", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("react-overlays/cjs/Dropdown", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Align the menu to the 'end' side of the placement side of the Dropdown toggle. The default placement is `top-start` or `bottom-start`.
        */
      @JSImport("react-overlays/cjs/Dropdown", "default.propTypes.alignEnd")
      @js.native
      def alignEnd: Requireable[Boolean] = js.native
      @scala.inline
      def alignEnd_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(x.asInstanceOf[js.Any])
      
      /**
        * A render prop that returns the root dropdown element. The `props`
        * argument should spread through to an element containing _both_ the
        * menu and toggle in order to handle keyboard events for focus management.
        *
        * @type {Function ({
        *   props: {
        *     onKeyDown: (SyntheticEvent) => void,
        *   },
        * }) => React.Element}
        */
      @JSImport("react-overlays/cjs/Dropdown", "default.propTypes.children")
      @js.native
      def children: Validator[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      @scala.inline
      def children_=(x: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /**
        * Sets the initial show position of the Dropdown.
        */
      @JSImport("react-overlays/cjs/Dropdown", "default.propTypes.defaultShow")
      @js.native
      def defaultShow: Requireable[Boolean] = js.native
      @scala.inline
      def defaultShow_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultShow")(x.asInstanceOf[js.Any])
      
      /**
        * Determines the direction and location of the Menu in relation to it's Toggle.
        */
      @JSImport("react-overlays/cjs/Dropdown", "default.propTypes.drop")
      @js.native
      def drop: Requireable[String] = js.native
      @scala.inline
      def drop_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drop")(x.asInstanceOf[js.Any])
      
      /**
        * Controls the focus behavior for when the Dropdown is opened. Set to
        * `true` to always focus the first menu item, `keyboard` to focus only when
        * navigating via the keyboard, or `false` to disable completely
        *
        * The Default behavior is `false` **unless** the Menu has a `role="menu"`
        * where it will default to `keyboard` to match the recommended [ARIA Authoring practices](https://www.w3.org/TR/wai-aria-practices-1.1/#menubutton).
        */
      @JSImport("react-overlays/cjs/Dropdown", "default.propTypes.focusFirstItemOnShow")
      @js.native
      def focusFirstItemOnShow: Requireable[String | Boolean] = js.native
      @scala.inline
      def focusFirstItemOnShow_=(x: Requireable[String | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusFirstItemOnShow")(x.asInstanceOf[js.Any])
      
      /**
        * A css slector string that will return __focusable__ menu items.
        * Selectors should be relative to the menu component:
        * e.g. ` > li:not('.disabled')`
        */
      @JSImport("react-overlays/cjs/Dropdown", "default.propTypes.itemSelector")
      @js.native
      def itemSelector: Requireable[String] = js.native
      @scala.inline
      def itemSelector_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(x.asInstanceOf[js.Any])
      
      /**
        * A callback fired when the Dropdown wishes to change visibility. Called with the requested
        * `show` value, the DOM event, and the source that fired it: `'click'`,`'keydown'`,`'rootClose'`, or `'select'`.
        *
        * ```ts static
        * function(
        *   isOpen: boolean,
        *   event: SyntheticEvent,
        * ): void
        * ```
        *
        * @controllable show
        */
      @JSImport("react-overlays/cjs/Dropdown", "default.propTypes.onToggle")
      @js.native
      def onToggle: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      @scala.inline
      def onToggle_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(x.asInstanceOf[js.Any])
      
      /**
        * Whether or not the Dropdown is visible.
        *
        * @controllable onToggle
        */
      @JSImport("react-overlays/cjs/Dropdown", "default.propTypes.show")
      @js.native
      def show: Requireable[Boolean] = js.native
      @scala.inline
      def show_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
    }
  }
  
  object Dropdown {
    
    /* was `typeof DropdownMenu` */
    object Menu
    
    /* was `typeof DropdownToggle` */
    object Toggle
  }
  
  @js.native
  trait DropdownInjectedProps extends StObject {
    
    var onKeyDown: KeyboardEventHandler[typings.std.Element] = js.native
  }
  object DropdownInjectedProps {
    
    @scala.inline
    def apply(onKeyDown: KeyboardEvent[typings.std.Element] => Unit): DropdownInjectedProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
      __obj.asInstanceOf[DropdownInjectedProps]
    }
    
    @scala.inline
    implicit class DropdownInjectedPropsMutableBuilder[Self <: DropdownInjectedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[typings.std.Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DropdownProps extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.native
    
    def children(arg: Props): ReactNode = js.native
    
    var defaultShow: js.UndefOr[Boolean] = js.native
    
    var drop: js.UndefOr[DropDirection] = js.native
    
    var focusFirstItemOnShow: js.UndefOr[`false` | `true` | keyboard] = js.native
    
    var itemSelector: js.UndefOr[String] = js.native
    
    def onToggle(nextShow: Boolean): Unit = js.native
    def onToggle(nextShow: Boolean, event: SyntheticEvent[typings.std.Element, Event]): Unit = js.native
    
    var show: js.UndefOr[Boolean] = js.native
  }
}
