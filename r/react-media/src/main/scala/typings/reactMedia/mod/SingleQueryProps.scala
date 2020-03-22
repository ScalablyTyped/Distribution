package typings.reactMedia.mod

import typings.react.mod.ReactNode
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-media.react-media.BaseProps & {  query  :react-media.react-media.MediaQueryValue,   defaultMatches ? :boolean,   children ? :(matches : boolean): react.react.ReactNode | react.react.ReactNode, onChange ? (matches : boolean): void} */
trait SingleQueryProps extends js.Object {
  var children: js.UndefOr[(js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode] = js.undefined
  var defaultMatches: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.undefined
  var query: MediaQueryValue
  var render: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var targetWindow: js.UndefOr[Window_] = js.undefined
}

object SingleQueryProps {
  @scala.inline
  def apply(
    query: MediaQueryValue,
    children: (js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode = null,
    defaultMatches: js.UndefOr[Boolean] = js.undefined,
    onChange: /* matches */ Boolean => Unit = null,
    render: () => ReactNode = null,
    targetWindow: Window_ = null
  ): SingleQueryProps = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMatches)) __obj.updateDynamic("defaultMatches")(defaultMatches.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleQueryProps]
  }
}

