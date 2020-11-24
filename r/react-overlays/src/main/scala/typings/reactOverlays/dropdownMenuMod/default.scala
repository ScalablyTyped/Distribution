package typings.reactOverlays.dropdownMenuMod

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-overlays/cjs/DropdownMenu", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Also exported as `<Dropdown.Menu>` from `Dropdown`.
    *
    * @displayName DropdownMenu
    * @memberOf Dropdown
    */
  def apply(hasChildrenOptions: DropdownMenuProps): Element = js.native
  
  var displayName: String = js.native
  
  @js.native
  object defaultProps extends js.Object {
    
    var usePopper: Boolean = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    
    /**
      * Aligns the dropdown menu to the 'end' of it's placement position.
      * Generally this is provided by the parent `Dropdown` component,
      * but may also be specified as a prop directly.
      */
    var alignEnd: Requireable[Boolean] = js.native
    
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
    var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
    
    /**
      * Enables the Popper.js `flip` modifier, allowing the Dropdown to
      * automatically adjust it's placement in case of overlap with the viewport or toggle.
      * Refer to the [flip docs](https://popper.js.org/popper-documentation.html#modifiers..flip.enabled) for more info
      */
    var flip: Requireable[Boolean] = js.native
    
    /**
      * A set of popper options and props passed directly to react-popper's Popper component.
      */
    var popperConfig: Requireable[js.Object] = js.native
    
    /**
      * Override the default event used by RootCloseWrapper.
      */
    var rootCloseEvent: Requireable[String] = js.native
    
    /**
      * Controls the visible state of the menu, generally this is
      * provided by the parent `Dropdown` component,
      * but may also be specified as a prop directly.
      */
    var show: Requireable[Boolean] = js.native
    
    var usePopper: Requireable[Boolean] = js.native
  }
}
