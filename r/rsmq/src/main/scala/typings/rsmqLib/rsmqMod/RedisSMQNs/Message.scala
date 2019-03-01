package typings
package rsmqLib.rsmqMod.RedisSMQNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends MessageIdentifier {
  var fr: scala.Double
  var message: java.lang.String
  var rc: scala.Double
  var sent: scala.Double
}

object Message {
  @scala.inline
  def apply(
    fr: scala.Double,
    id: java.lang.String,
    message: java.lang.String,
    qname: java.lang.String,
    rc: scala.Double,
    sent: scala.Double
  ): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fr")(fr)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("qname")(qname)
    __obj.updateDynamic("rc")(rc)
    __obj.updateDynamic("sent")(sent)
    __obj.asInstanceOf[Message]
  }
}

