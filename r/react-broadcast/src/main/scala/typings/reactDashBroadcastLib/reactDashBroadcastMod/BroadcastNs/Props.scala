package typings
package reactDashBroadcastLib.reactDashBroadcastMod.BroadcastNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-broadcast.react-broadcast.Broadcast.DefaultProps<react-broadcast.react-broadcast.Broadcast.DefaultProps<T>> ]:? react-broadcast.react-broadcast.Broadcast.DefaultProps<react-broadcast.react-broadcast.Broadcast.DefaultProps<T>>[P]} */ trait Props[T] extends js.Object {
  var channel: java.lang.String
  var children: reactLib.reactMod.ReactNs.ReactNode
  var value: T
}

object Props {
  @scala.inline
  def apply[T](channel: java.lang.String, children: reactLib.reactMod.ReactNs.ReactNode, value: T): Props[T] = {
    val __obj = js.Dynamic.literal(channel = channel, children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props[T]]
  }
}

