package typings.serverless.serverlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var eventName: String
}

object Event {
  @scala.inline
  def apply(eventName: String): Event = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Event]
  }
}

