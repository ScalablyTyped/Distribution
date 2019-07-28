package typings.socketDotIo.socketDotIoMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface describing a room
	 */
trait Room extends js.Object {
  var length: Double
  var sockets: StringDictionary[Boolean]
}

object Room {
  @scala.inline
  def apply(length: Double, sockets: StringDictionary[Boolean]): Room = {
    val __obj = js.Dynamic.literal(length = length, sockets = sockets)
  
    __obj.asInstanceOf[Room]
  }
}

