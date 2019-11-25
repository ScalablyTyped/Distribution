package typings.reactDashBroadcast.reactDashBroadcastMod.Subscriber

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-broadcast.react-broadcast.Subscriber.DefaultProps ]:? react-broadcast.react-broadcast.Subscriber.DefaultProps[P]} */ trait Props[T] extends js.Object {
  var channel: String
  var children: js.UndefOr[js.Function1[/* state */ T, ReactNode]] = js.undefined
}

object Props {
  @scala.inline
  def apply[T](channel: String, children: /* state */ T => ReactNode = null): Props[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[Props[T]]
  }
}

