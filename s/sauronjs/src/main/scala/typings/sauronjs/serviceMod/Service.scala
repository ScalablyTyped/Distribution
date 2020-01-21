package typings.sauronjs.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var broadcastSubject: js.Any
  def broadcast(event: String, data: js.Any): Unit
}

object Service {
  @scala.inline
  def apply(broadcast: (String, js.Any) => Unit, broadcastSubject: js.Any): Service = {
    val __obj = js.Dynamic.literal(broadcast = js.Any.fromFunction2(broadcast), broadcastSubject = broadcastSubject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Service]
  }
}

