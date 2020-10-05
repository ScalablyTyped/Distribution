package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSStream extends js.Object {
  val `type`: java.lang.String = js.native
  def msClose(): Unit = js.native
  def msDetachStream(): js.Any = js.native
}

object MSStream {
  @scala.inline
  def apply(msClose: () => Unit, msDetachStream: () => js.Any, `type`: java.lang.String): MSStream = {
    val __obj = js.Dynamic.literal(msClose = js.Any.fromFunction0(msClose), msDetachStream = js.Any.fromFunction0(msDetachStream))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSStream]
  }
  @scala.inline
  implicit class MSStreamOps[Self <: MSStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMsClose(value: () => Unit): Self = this.set("msClose", js.Any.fromFunction0(value))
    @scala.inline
    def setMsDetachStream(value: () => js.Any): Self = this.set("msDetachStream", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

