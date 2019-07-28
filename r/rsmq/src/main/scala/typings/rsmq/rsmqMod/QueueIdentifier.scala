package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueIdentifier extends js.Object {
  var qname: String
}

object QueueIdentifier {
  @scala.inline
  def apply(qname: String): QueueIdentifier = {
    val __obj = js.Dynamic.literal(qname = qname)
  
    __obj.asInstanceOf[QueueIdentifier]
  }
}

