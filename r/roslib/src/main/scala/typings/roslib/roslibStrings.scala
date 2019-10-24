package typings.roslib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object roslibStrings {
  @js.native
  sealed trait socketDOTio extends js.Object
  
  @js.native
  sealed trait websocket extends js.Object
  
  @scala.inline
  def socketDOTio: socketDOTio = "socket.io".asInstanceOf[socketDOTio]
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
}

