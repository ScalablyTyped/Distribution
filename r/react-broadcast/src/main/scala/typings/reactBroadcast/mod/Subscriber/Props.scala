package typings.reactBroadcast.mod.Subscriber

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-broadcast.react-broadcast.Subscriber.DefaultProps> */
trait Props[T] extends js.Object {
  var channel: String
  var children: js.UndefOr[js.Function1[/* state */ T, ReactNode]] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply[T](
    channel: String,
    children: /* state */ T => ReactNode = null,
    quiet: js.UndefOr[Boolean] = js.undefined
  ): Props[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

