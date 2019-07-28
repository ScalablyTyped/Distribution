package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  var events: js.UndefOr[String] = js.undefined
}

object Anon_Events {
  @scala.inline
  def apply(events: String = null): Anon_Events = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[Anon_Events]
  }
}

