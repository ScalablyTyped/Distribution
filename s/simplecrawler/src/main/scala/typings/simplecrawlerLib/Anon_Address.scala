package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String
  var family: java.lang.String
  var port: scala.Double
}

object Anon_Address {
  @scala.inline
  def apply(address: java.lang.String, family: java.lang.String, port: scala.Double): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, family = family, port = port)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

