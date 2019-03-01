package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  var events: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Events {
  @scala.inline
  def apply(events: java.lang.String = null): Anon_Events = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[Anon_Events]
  }
}

