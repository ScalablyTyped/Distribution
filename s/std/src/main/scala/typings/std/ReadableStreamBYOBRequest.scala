package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamBYOBRequest extends js.Object {
  
  def respond(bytesWritten: Double): Unit = js.native
  
  def respondWithNewView(view: ArrayBufferView): Unit = js.native
  
  val view: ArrayBufferView = js.native
}
object ReadableStreamBYOBRequest {
  
  @scala.inline
  def apply(respond: Double => Unit, respondWithNewView: ArrayBufferView => Unit, view: ArrayBufferView): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(respond = js.Any.fromFunction1(respond), respondWithNewView = js.Any.fromFunction1(respondWithNewView), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
  
  @scala.inline
  implicit class ReadableStreamBYOBRequestOps[Self <: ReadableStreamBYOBRequest] (val x: Self) extends AnyVal {
    
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
    def setRespond(value: Double => Unit): Self = this.set("respond", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRespondWithNewView(value: ArrayBufferView => Unit): Self = this.set("respondWithNewView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setView(value: ArrayBufferView): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
