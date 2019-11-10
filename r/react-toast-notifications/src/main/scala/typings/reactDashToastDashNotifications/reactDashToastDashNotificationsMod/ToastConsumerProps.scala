package typings.reactDashToastDashNotifications.reactDashToastDashNotificationsMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastConsumerProps extends js.Object {
  def children(context: ToastConsumerContext): ReactNode
}

object ToastConsumerProps {
  @scala.inline
  def apply(children: ToastConsumerContext => ReactNode): ToastConsumerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[ToastConsumerProps]
  }
}

