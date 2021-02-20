package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamFileInput extends StObject {
  
  var mimeType: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var stream: js.Any = js.native
}
object StreamFileInput {
  
  @scala.inline
  def apply(name: String, stream: js.Any): StreamFileInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamFileInput]
  }
  
  @scala.inline
  implicit class StreamFileInputMutableBuilder[Self <: StreamFileInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
