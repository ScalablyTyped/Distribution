package typings
package requestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connect extends js.Object {
  var connect: scala.Double
  var end: scala.Double
  var lookup: scala.Double
  var response: scala.Double
  var socket: scala.Double
}

object Anon_Connect {
  @scala.inline
  def apply(
    connect: scala.Double,
    end: scala.Double,
    lookup: scala.Double,
    response: scala.Double,
    socket: scala.Double
  ): Anon_Connect = {
    val __obj = js.Dynamic.literal(connect = connect, end = end, lookup = lookup, response = response, socket = socket)
  
    __obj.asInstanceOf[Anon_Connect]
  }
}

