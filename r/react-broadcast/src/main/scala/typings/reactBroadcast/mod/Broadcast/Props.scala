package typings.reactBroadcast.mod.Broadcast

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-broadcast.react-broadcast.Broadcast.DefaultProps<T>> */
trait Props[T] extends js.Object {
  var channel: String
  var children: ReactNode
  var compareValues: js.UndefOr[js.Function2[/* prevValue */ T, /* nextValue */ T, Boolean]] = js.undefined
  var value: T
}

object Props {
  @scala.inline
  def apply[T](
    channel: String,
    value: T,
    children: ReactNode = null,
    compareValues: (/* prevValue */ T, /* nextValue */ T) => Boolean = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (compareValues != null) __obj.updateDynamic("compareValues")(js.Any.fromFunction2(compareValues))
    __obj.asInstanceOf[Props[T]]
  }
}

