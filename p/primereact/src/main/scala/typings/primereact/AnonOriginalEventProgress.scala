package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalEventProgress extends js.Object {
  var originalEvent: Event_
  var progress: js.Any
}

object AnonOriginalEventProgress {
  @scala.inline
  def apply(originalEvent: Event_, progress: js.Any): AnonOriginalEventProgress = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOriginalEventProgress]
  }
}

