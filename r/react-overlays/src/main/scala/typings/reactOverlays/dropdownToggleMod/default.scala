package typings.reactOverlays.dropdownToggleMod

import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-overlays/cjs/DropdownToggle", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Also exported as `<Dropdown.Toggle>` from `Dropdown`.
    *
    * @displayName DropdownToggle
    * @memberOf Dropdown
    */
  def apply(hasChildren: DropdownToggleProps): Element = js.native
  
  var displayName: String = js.native
  
  @js.native
  object propTypes extends js.Object {
    
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
    var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
  }
}
