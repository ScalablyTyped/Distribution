package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var originalEvent: typings.std.Event
  var progress: js.Any
}

object Progress {
  @scala.inline
  def apply(originalEvent: typings.std.Event, progress: js.Any): Progress = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

