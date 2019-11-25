package typings.reactDashOverlays.libDropdownMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends js.Object {
  /**
    * Align the menu to the 'end' side of the placement side of the Dropdown toggle. The default placement is `top-start` or `bottom-start`.
    */
  var alignEnd: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines the direction and location of the Menu in relation to it's Toggle.
    */
  var drop: js.UndefOr[Directions] = js.undefined
  /**
    * A css slector string that will return __focusable__ menu items.
    * Selectors should be relative to the menu component:
    * e.g. ` > li:not('.disabled')`
    */
  var itemSelector: js.UndefOr[String] = js.undefined
  /**
    * A callback fired when the Dropdown wishes to change visibility. Called with the requested
    * `show` value, the DOM event, and the source that fired it: `'click'`,`'keydown'`,`'rootClose'`, or `'select'`.
    */
  var onToggle: js.UndefOr[js.Function2[/* isOpen */ Boolean, /* event */ SyntheticEvent[_, Event], Unit]] = js.undefined
  /**
    * Whether or not the Dropdown is visible
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * A render prop that returns the root dropdown element. The `props`
    * argument should spread through to an element containing _both_ the
    * menu and toggle in order to handle keyboard events for focus management.
    */
  def children(renderProps: DropdownRenderProps): ReactElement
}

object DropdownProps {
  @scala.inline
  def apply(
    children: DropdownRenderProps => ReactElement,
    alignEnd: js.UndefOr[Boolean] = js.undefined,
    drop: Directions = null,
    itemSelector: String = null,
    onToggle: (/* isOpen */ Boolean, /* event */ SyntheticEvent[_, Event]) => Unit = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): DropdownProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(alignEnd)) __obj.updateDynamic("alignEnd")(alignEnd.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2(onToggle))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
}

