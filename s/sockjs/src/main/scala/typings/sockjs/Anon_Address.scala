package typings.sockjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: String
  var port: Double
}

object Anon_Address {
  @scala.inline
  def apply(address: String, port: Double): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, port = port)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

