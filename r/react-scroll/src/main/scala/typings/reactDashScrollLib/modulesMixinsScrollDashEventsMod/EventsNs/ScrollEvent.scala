package typings
package reactDashScrollLib.modulesMixinsScrollDashEventsMod.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollEvent extends js.Object {
  def register(
    eventName: java.lang.String,
    callback: js.Function2[/* to */ java.lang.String, /* element */ js.Any, scala.Unit]
  ): scala.Unit
  def remove(eventName: java.lang.String): scala.Unit
}

object ScrollEvent {
  @scala.inline
  def apply(
    register: js.Function2[
      java.lang.String, 
      js.Function2[/* to */ java.lang.String, /* element */ js.Any, scala.Unit], 
      scala.Unit
    ],
    remove: js.Function1[java.lang.String, scala.Unit]
  ): ScrollEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(register)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[ScrollEvent]
  }
}

