package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProgress extends js.Object {
  var originalEvent: Event_
  var progress: js.Any
}

object AnonProgress {
  @scala.inline
  def apply(originalEvent: Event_, progress: js.Any): AnonProgress = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProgress]
  }
}

