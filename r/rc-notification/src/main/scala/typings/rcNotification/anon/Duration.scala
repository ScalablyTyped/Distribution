package typings.rcNotification.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: Double
  var style: Right
  def onClose(): Unit
}

object Duration {
  @scala.inline
  def apply(duration: Double, onClose: () => Unit, style: Right): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

