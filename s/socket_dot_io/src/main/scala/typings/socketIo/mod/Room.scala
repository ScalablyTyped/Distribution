package typings.socketIo.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface describing a room
  */
@js.native
trait Room extends js.Object {
  
  var length: Double = js.native
  
  var sockets: StringDictionary[Boolean] = js.native
}
object Room {
  
  @scala.inline
  def apply(length: Double, sockets: StringDictionary[Boolean]): Room = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Room]
  }
  
  @scala.inline
  implicit class RoomOps[Self <: Room] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSockets(value: StringDictionary[Boolean]): Self = this.set("sockets", value.asInstanceOf[js.Any])
  }
}
