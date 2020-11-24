package typings.reactOverlays

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.reactOverlays.anon.AlignEnd
import typings.reactOverlays.anon.Children
import typings.reactOverlays.anon.Container
import typings.reactOverlays.anon.HandleContainerOverflow
import typings.reactOverlays.anon.PartialModalPropsRefAttriAutoFocus
import typings.reactOverlays.anon.UsePopper
import typings.reactOverlays.anon.WeakValidationMapModalProAutoFocus
import typings.reactOverlays.esmDropdownMenuMod.DropdownMenuProps
import typings.reactOverlays.esmDropdownMenuMod.UseDropdownMenuOptions
import typings.reactOverlays.esmDropdownMenuMod.UseDropdownMenuValue
import typings.reactOverlays.esmDropdownMod.DropdownProps
import typings.reactOverlays.esmDropdownToggleMod.DropdownToggleProps
import typings.reactOverlays.esmDropdownToggleMod.UseDropdownToggleHelpers
import typings.reactOverlays.esmDropdownToggleMod.UseDropdownToggleProps
import typings.reactOverlays.esmModalManagerMod.default
import typings.reactOverlays.esmModalMod.ModalHandle
import typings.reactOverlays.esmModalMod.ModalProps
import typings.reactOverlays.esmOverlayMod.OverlayProps
import typings.reactOverlays.esmPortalMod.PortalProps
import typings.reactOverlays.esmUseRootCloseMod.RootCloseOptions
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-overlays/esm", JSImport.Namespace)
@js.native
object esmMod extends js.Object {
  
  /**
    * Built on top of `Popper.js`, the overlay component is
    * great for custom tooltip overlays.
    */
  val Overlay: ForwardRefExoticComponent[OverlayProps with RefAttributes[HTMLElement]] = js.native
  
  def useDropdownMenu(): UseDropdownMenuValue = js.native
  def useDropdownMenu(options: UseDropdownMenuOptions): UseDropdownMenuValue = js.native
  
  def useDropdownToggle(): js.Tuple2[UseDropdownToggleProps, UseDropdownToggleHelpers] = js.native
  
  def useRootClose(ref: js.UndefOr[scala.Nothing], onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  def useRootClose(
    ref: js.UndefOr[scala.Nothing],
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  def useRootClose(ref: Null, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  def useRootClose(
    ref: Null,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  /**
    * The `useRootClose` hook registers your callback on the document
    * when rendered. Powers the `<Overlay/>` component. This is used achieve modal
    * style behavior where your callback is triggered when the user tries to
    * interact with the rest of the document or hits the `esc` key.
    *
    * @param {Ref<HTMLElement>| HTMLElement} ref  The element boundary
    * @param {function} onRootClose
    * @param {object=}  options
    * @param {boolean=} options.disabled
    * @param {string=}  options.clickTrigger The DOM event name (click, mousedown, etc) to attach listeners on
    */
  def useRootClose(ref: RefObject[Element], onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  def useRootClose(
    ref: RefObject[Element],
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  def useRootClose(ref: Element, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  def useRootClose(
    ref: Element,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  
  @js.native
  object Dropdown extends js.Object {
    
    /**
      * @displayName Dropdown
      */
    def apply(hasDropAlignEndDefaultShowShowOnToggleItemSelectorFocusFirstItemOnShowChildren: DropdownProps): typings.react.mod.global.JSX.Element = js.native
    
    var displayName: String = js.native
    
    @js.native
    object Menu extends js.Object {
      
      /**
        * Also exported as `<Dropdown.Menu>` from `Dropdown`.
        *
        * @displayName DropdownMenu
        * @memberOf Dropdown
        */
      def apply(hasChildrenOptions: DropdownMenuProps): typings.react.mod.global.JSX.Element = js.native
      
      var defaultProps: UsePopper = js.native
      
      var displayName: String = js.native
      
      var propTypes: AlignEnd = js.native
    }
    
    @js.native
    object Toggle extends js.Object {
      
      /**
        * Also exported as `<Dropdown.Toggle>` from `Dropdown`.
        *
        * @displayName DropdownToggle
        * @memberOf Dropdown
        */
      def apply(hasChildren: DropdownToggleProps): typings.react.mod.global.JSX.Element = js.native
      
      var displayName: String = js.native
      
      var propTypes: Children = js.native
    }
    
    @js.native
    object propTypes extends js.Object {
      
      /**
        * Align the menu to the 'end' side of the placement side of the Dropdown toggle. The default placement is `top-start` or `bottom-start`.
        */
      var alignEnd: Requireable[Boolean] = js.native
      
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
      var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
      
      /**
        * Sets the initial show position of the Dropdown.
        */
      var defaultShow: Requireable[Boolean] = js.native
      
      /**
        * Determines the direction and location of the Menu in relation to it's Toggle.
        */
      var drop: Requireable[String] = js.native
      
      /**
        * Controls the focus behavior for when the Dropdown is opened. Set to
        * `true` to always focus the first menu item, `keyboard` to focus only when
        * navigating via the keyboard, or `false` to disable completely
        *
        * The Default behavior is `false` **unless** the Menu has a `role="menu"`
        * where it will default to `keyboard` to match the recommended [ARIA Authoring practices](https://www.w3.org/TR/wai-aria-practices-1.1/#menubutton).
        */
      var focusFirstItemOnShow: Requireable[String | Boolean] = js.native
      
      /**
        * A css slector string that will return __focusable__ menu items.
        * Selectors should be relative to the menu component:
        * e.g. ` > li:not('.disabled')`
        */
      var itemSelector: Requireable[String] = js.native
      
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
      var onToggle: Requireable[js.Function1[/* repeated */ _, _]] = js.native
      
      /**
        * Whether or not the Dropdown is visible.
        *
        * @controllable onToggle
        */
      var show: Requireable[Boolean] = js.native
    }
  }
  
  @js.native
  object Modal extends js.Object {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    def apply(props: ModalProps with RefAttributes[ModalHandle]): ReactElement | Null = js.native
    
    @JSName("$$typeof")
    val DollarDollartypeof: js.Symbol = js.native
    
    var defaultProps: js.UndefOr[PartialModalPropsRefAttriAutoFocus] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMapModalProAutoFocus] = js.native
    
    @js.native
    class Manager () extends default {
      def this(hasHideSiblingNodesHandleContainerOverflow: HandleContainerOverflow) = this()
    }
    @js.native
    object Manager
      extends TopLevel[
              Instantiable1[
                /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
                default
              ]
            ]
  }
  
  /**
    * @public
    */
  @js.native
  object Portal extends js.Object {
    
    def apply(hasContainerChildrenOnRendered: PortalProps): typings.react.mod.global.JSX.Element | Null = js.native
    
    var displayName: String = js.native
    
    var propTypes: Container = js.native
  }
}
