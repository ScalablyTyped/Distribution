package typings
package socketDotIoLib.socketDotIoMod.SocketIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface describing a room
	 */
trait Room extends js.Object {
  var length: scala.Double
  var sockets: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}

object Room {
  @scala.inline
  def apply(length: scala.Double, sockets: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): Room = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("sockets")(sockets)
    __obj.asInstanceOf[Room]
  }
}

