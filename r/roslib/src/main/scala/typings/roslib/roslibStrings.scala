package typings.roslib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object roslibStrings {
  @js.native
  sealed trait socketDotio extends js.Object
  
  @js.native
  sealed trait websocket extends js.Object
  
  @scala.inline
  def socketDotio: socketDotio = "socket.io".asInstanceOf[socketDotio]
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
}

