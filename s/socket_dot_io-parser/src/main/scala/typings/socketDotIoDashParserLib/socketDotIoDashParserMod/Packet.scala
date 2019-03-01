package typings
package socketDotIoDashParserLib.socketDotIoDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packet extends js.Object {
  var data: js.Any
  var id: scala.Double
  var `type`: scala.Double
}

object Packet {
  @scala.inline
  def apply(data: js.Any, id: scala.Double, `type`: scala.Double): Packet = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Packet]
  }
}

