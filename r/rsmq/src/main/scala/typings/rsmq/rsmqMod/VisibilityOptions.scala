package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibilityOptions extends MessageIdentifier {
  var vt: Double
}

object VisibilityOptions {
  @scala.inline
  def apply(id: String, qname: String, vt: Double): VisibilityOptions = {
    val __obj = js.Dynamic.literal(id = id, qname = qname, vt = vt)
  
    __obj.asInstanceOf[VisibilityOptions]
  }
}

