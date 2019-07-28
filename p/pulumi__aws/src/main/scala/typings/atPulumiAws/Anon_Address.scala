package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: String
  var availabilityZone: String
  var id: String
  var port: Double
}

object Anon_Address {
  @scala.inline
  def apply(address: String, availabilityZone: String, id: String, port: Double): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, availabilityZone = availabilityZone, id = id, port = port)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

