package typings
package serverlessLib.serverlessMod.ServerlessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var eventName: java.lang.String
}

object Event {
  @scala.inline
  def apply(eventName: java.lang.String): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventName")(eventName)
    __obj.asInstanceOf[Event]
  }
}

