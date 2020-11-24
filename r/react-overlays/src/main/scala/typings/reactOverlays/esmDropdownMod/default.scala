package typings.reactOverlays.esmDropdownMod

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.reactOverlays.anon.AlignEnd
import typings.reactOverlays.anon.Children
import typings.reactOverlays.anon.UsePopper
import typings.reactOverlays.esmDropdownMenuMod.DropdownMenuProps
import typings.reactOverlays.esmDropdownToggleMod.DropdownToggleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-overlays/esm/Dropdown", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * @displayName Dropdown
    */
  def apply(hasDropAlignEndDefaultShowShowOnToggleItemSelectorFocusFirstItemOnShowChildren: DropdownProps): Element = js.native
  
  var displayName: String = js.native
  
  @js.native
  object Menu extends js.Object {
    
    /**
      * Also exported as `<Dropdown.Menu>` from `Dropdown`.
      *
      * @displayName DropdownMenu
      * @memberOf Dropdown
      */
    def apply(hasChildrenOptions: DropdownMenuProps): Element = js.native
    
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
    def apply(hasChildren: DropdownToggleProps): Element = js.native
    
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
