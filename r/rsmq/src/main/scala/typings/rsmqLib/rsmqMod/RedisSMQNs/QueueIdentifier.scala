package typings
package rsmqLib.rsmqMod.RedisSMQNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueIdentifier extends js.Object {
  var qname: java.lang.String
}

object QueueIdentifier {
  @scala.inline
  def apply(qname: java.lang.String): QueueIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qname")(qname)
    __obj.asInstanceOf[QueueIdentifier]
  }
}

