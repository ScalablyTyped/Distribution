package typings.servicenowLondon.snWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RESTAPIResponseStream extends js.Object {
  def writeStream(stream: js.Object): Unit = js.native
  def writeString(data: String): Unit = js.native
}

object RESTAPIResponseStream {
  @scala.inline
  def apply(writeStream: js.Object => Unit, writeString: String => Unit): RESTAPIResponseStream = {
    val __obj = js.Dynamic.literal(writeStream = js.Any.fromFunction1(writeStream), writeString = js.Any.fromFunction1(writeString))
    __obj.asInstanceOf[RESTAPIResponseStream]
  }
  @scala.inline
  implicit class RESTAPIResponseStreamOps[Self <: RESTAPIResponseStream] (val x: Self) extends AnyVal {
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
    def setWriteStream(value: js.Object => Unit): Self = this.set("writeStream", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteString(value: String => Unit): Self = this.set("writeString", js.Any.fromFunction1(value))
  }
  
}

