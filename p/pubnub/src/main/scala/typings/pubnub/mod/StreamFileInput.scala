package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamFileInput extends StObject {
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var stream: js.Any
}
object StreamFileInput {
  
  inline def apply(name: String, stream: js.Any): StreamFileInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamFileInput]
  }
  
  extension [Self <: StreamFileInput](x: Self) {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
