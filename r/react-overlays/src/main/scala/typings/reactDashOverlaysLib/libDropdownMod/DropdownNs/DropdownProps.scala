package typings
package reactDashOverlaysLib.libDropdownMod.DropdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends js.Object {
  /**
    * Align the menu to the 'end' side of the placement side of the Dropdown toggle. The default placement is `top-start` or `bottom-start`.
    */
  var alignEnd: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines the direction and location of the Menu in relation to it's Toggle.
    */
  var drop: js.UndefOr[Directions] = js.undefined
  /**
    * A css slector string that will return __focusable__ menu items.
    * Selectors should be relative to the menu component:
    * e.g. ` > li:not('.disabled')`
    */
  var itemSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback fired when the Dropdown wishes to change visibility. Called with the requested
    * `show` value, the DOM event, and the source that fired it: `'click'`,`'keydown'`,`'rootClose'`, or `'select'`.
    */
  var onToggle: js.UndefOr[
    js.Function2[
      /* isOpen */ scala.Boolean, 
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Whether or not the Dropdown is visible
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A render prop that returns the root dropdown element. The `props`
    * argument should spread through to an element containing _both_ the
    * menu and toggle in order to handle keyboard events for focus management.
    */
  def children(renderProps: DropdownRenderProps): reactLib.reactMod.ReactNs.ReactElement[_]
}

