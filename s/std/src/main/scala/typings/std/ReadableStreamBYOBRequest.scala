package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamBYOBRequest extends StObject {
  
  /* standard dom */
  def respond(bytesWritten: Double): Unit
  
  /* standard dom */
  def respondWithNewView(view: js.typedarray.ArrayBufferView): Unit
  
  /* standard dom */
  val view: js.typedarray.ArrayBufferView | Null
}
object ReadableStreamBYOBRequest {
  
  inline def apply(respond: Double => Unit, respondWithNewView: js.typedarray.ArrayBufferView => Unit): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(respond = js.Any.fromFunction1(respond), respondWithNewView = js.Any.fromFunction1(respondWithNewView), view = null)
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadableStreamBYOBRequest] (val x: Self) extends AnyVal {
    
    inline def setRespond(value: Double => Unit): Self = StObject.set(x, "respond", js.Any.fromFunction1(value))
    
    inline def setRespondWithNewView(value: js.typedarray.ArrayBufferView => Unit): Self = StObject.set(x, "respondWithNewView", js.Any.fromFunction1(value))
    
    inline def setView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
  }
}
