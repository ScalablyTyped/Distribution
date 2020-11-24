package typings.socketIoFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketIOFile extends js.Object {
  
  def on(event: String, cb: js.Function1[/* fileInfo */ FileInfo, Unit]): Unit = js.native
}
object SocketIOFile {
  
  @scala.inline
  def apply(on: (String, js.Function1[/* fileInfo */ FileInfo, Unit]) => Unit): SocketIOFile = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[SocketIOFile]
  }
  
  @scala.inline
  implicit class SocketIOFileOps[Self <: SocketIOFile] (val x: Self) extends AnyVal {
    
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
    def setOn(value: (String, js.Function1[/* fileInfo */ FileInfo, Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
