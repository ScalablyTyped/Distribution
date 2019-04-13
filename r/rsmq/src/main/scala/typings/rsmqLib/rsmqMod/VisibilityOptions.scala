package typings
package rsmqLib.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibilityOptions extends MessageIdentifier {
  var vt: scala.Double
}

object VisibilityOptions {
  @scala.inline
  def apply(id: java.lang.String, qname: java.lang.String, vt: scala.Double): VisibilityOptions = {
    val __obj = js.Dynamic.literal(id = id, qname = qname, vt = vt)
  
    __obj.asInstanceOf[VisibilityOptions]
  }
}

