package typings.reactNative

import typings.std.ArrayBuffer
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  def arrayBuffer(): js.Promise[ArrayBuffer]
  
  def blob(): js.Promise[Blob]
  
  val bodyUsed: Boolean
  
  def formData(): js.Promise[FormData]
  
  def json(): js.Promise[js.Any]
  
  def text(): js.Promise[String]
}
object Body {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    formData: () => js.Promise[FormData],
    json: () => js.Promise[js.Any],
    text: () => js.Promise[String]
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: () => js.Promise[ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: () => js.Promise[FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJson(value: () => js.Promise[js.Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
