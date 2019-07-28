package typings.simpleDashPeer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: String
  var family: String
  var port: String
}

object Anon_Address {
  @scala.inline
  def apply(address: String, family: String, port: String): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, family = family, port = port)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

