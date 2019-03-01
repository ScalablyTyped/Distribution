package typings
package simpleDashPeerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String
  var family: java.lang.String
  var port: java.lang.String
}

object Anon_Address {
  @scala.inline
  def apply(address: java.lang.String, family: java.lang.String, port: java.lang.String): Anon_Address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("family")(family)
    __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[Anon_Address]
  }
}

