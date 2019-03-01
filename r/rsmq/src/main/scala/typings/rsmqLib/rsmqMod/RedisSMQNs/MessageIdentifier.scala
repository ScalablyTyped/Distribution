package typings
package rsmqLib.rsmqMod.RedisSMQNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageIdentifier extends QueueIdentifier {
  var id: java.lang.String
}

object MessageIdentifier {
  @scala.inline
  def apply(id: java.lang.String, qname: java.lang.String): MessageIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("qname")(qname)
    __obj.asInstanceOf[MessageIdentifier]
  }
}

