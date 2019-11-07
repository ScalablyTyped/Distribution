package typings.socketDotIoDashFile.socketDotIoDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketIOFile extends js.Object {
  def on(event: String, cb: js.Function1[/* fileInfo */ FileInfo, Unit]): Unit
}

object SocketIOFile {
  @scala.inline
  def apply(on: (String, js.Function1[/* fileInfo */ FileInfo, Unit]) => Unit): SocketIOFile = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[SocketIOFile]
  }
}

