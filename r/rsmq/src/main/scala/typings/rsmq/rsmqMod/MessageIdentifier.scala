package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageIdentifier extends QueueIdentifier {
  var id: String
}

object MessageIdentifier {
  @scala.inline
  def apply(id: String, qname: String): MessageIdentifier = {
    val __obj = js.Dynamic.literal(id = id, qname = qname)
  
    __obj.asInstanceOf[MessageIdentifier]
  }
}

