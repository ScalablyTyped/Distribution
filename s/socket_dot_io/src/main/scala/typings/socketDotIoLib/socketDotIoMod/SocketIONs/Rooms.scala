package typings
package socketDotIoLib.socketDotIoMod.SocketIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface describing a dictionary of rooms
	 * Where room is the name of the room
	 */
trait Rooms
  extends /* room */ org.scalablytyped.runtime.StringDictionary[Room]

object Rooms {
  @scala.inline
  def apply(StringDictionary: /* room */ org.scalablytyped.runtime.StringDictionary[Room] = null): Rooms = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Rooms]
  }
}

