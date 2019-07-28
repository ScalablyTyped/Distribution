package typings.primereact.componentsMessagesMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagesProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object MessagesProps {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    onClick: /* message */ Message => Unit = null,
    onRemove: /* message */ Message => Unit = null,
    style: js.Object = null
  ): MessagesProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MessagesProps]
  }
}

