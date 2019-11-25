package typings.reactDashBroadcast.reactDashBroadcastMod.Broadcast

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-broadcast.react-broadcast.Broadcast.DefaultProps<T> ]:? react-broadcast.react-broadcast.Broadcast.DefaultProps<T>[P]} */ trait Props[T] extends js.Object {
  var channel: String
  var children: ReactNode
  var value: T
}

object Props {
  @scala.inline
  def apply[T](channel: String, value: T, children: ReactNode = null): Props[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

