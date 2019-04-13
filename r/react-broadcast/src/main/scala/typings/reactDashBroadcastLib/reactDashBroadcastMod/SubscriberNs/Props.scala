package typings
package reactDashBroadcastLib.reactDashBroadcastMod.SubscriberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-broadcast.react-broadcast.Subscriber.DefaultProps ]:? react-broadcast.react-broadcast.Subscriber.DefaultProps[P]} */ trait Props[T] extends js.Object {
  var channel: java.lang.String
  var children: js.UndefOr[js.Function1[/* state */ T, reactLib.reactMod.ReactNode]] = js.undefined
}

object Props {
  @scala.inline
  def apply[T](channel: java.lang.String, children: /* state */ T => reactLib.reactMod.ReactNode = null): Props[T] = {
    val __obj = js.Dynamic.literal(channel = channel)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[Props[T]]
  }
}

