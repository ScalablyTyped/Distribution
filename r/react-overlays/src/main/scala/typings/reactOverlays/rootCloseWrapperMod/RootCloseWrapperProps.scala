package typings.reactOverlays.rootCloseWrapperMod

import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactOverlays.reactOverlaysStrings.click
import typings.reactOverlays.reactOverlaysStrings.mousedown
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootCloseWrapperProps extends js.Object {
  /**
    * Children to render.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Disable the the RootCloseWrapper, preventing it from triggering
    * `onRootClose`.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Choose which document mouse event to bind to
    */
  var event: js.UndefOr[click | mousedown] = js.undefined
  /**
    * Callback fired after click or mousedown. Also triggers when user hits `esc`.
    */
  var onRootClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[_, Event], Unit]] = js.undefined
}

object RootCloseWrapperProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    event: click | mousedown = null,
    onRootClose: /* e */ SyntheticEvent[_, Event] => Unit = null
  ): RootCloseWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (onRootClose != null) __obj.updateDynamic("onRootClose")(js.Any.fromFunction1(onRootClose))
    __obj.asInstanceOf[RootCloseWrapperProps]
  }
}

