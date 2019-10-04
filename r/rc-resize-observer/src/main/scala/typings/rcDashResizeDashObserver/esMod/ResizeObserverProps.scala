package typings.rcDashResizeDashObserver.esMod

import typings.rcDashResizeDashObserver.Anon_Height
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverProps extends js.Object {
  var children: ReactElement
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Trigger if element resized. Will always trigger when first time render. */
  var onResize: js.UndefOr[js.Function1[/* size */ Anon_Height, Unit]] = js.undefined
}

object ResizeObserverProps {
  @scala.inline
  def apply(
    children: ReactElement,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onResize: /* size */ Anon_Height => Unit = null
  ): ResizeObserverProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[ResizeObserverProps]
  }
}

