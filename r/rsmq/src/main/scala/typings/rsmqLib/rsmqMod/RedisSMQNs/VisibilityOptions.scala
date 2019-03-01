package typings
package rsmqLib.rsmqMod.RedisSMQNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibilityOptions extends MessageIdentifier {
  var vt: scala.Double
}

object VisibilityOptions {
  @scala.inline
  def apply(id: java.lang.String, qname: java.lang.String, vt: scala.Double): VisibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("qname")(qname)
    __obj.updateDynamic("vt")(vt)
    __obj.asInstanceOf[VisibilityOptions]
  }
}

