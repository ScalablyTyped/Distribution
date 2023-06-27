package typings.sentryReplay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadTag extends StObject {
  
  var payload: Any
  
  var tag: String
}
object PayloadTag {
  
  inline def apply(payload: Any, tag: String): PayloadTag = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayloadTag] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
