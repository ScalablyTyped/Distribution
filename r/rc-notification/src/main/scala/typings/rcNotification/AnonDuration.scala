package typings.rcNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: Double
  var style: AnonRight
  def onClose(): Unit
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, onClose: () => Unit, style: AnonRight): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDuration]
  }
}

