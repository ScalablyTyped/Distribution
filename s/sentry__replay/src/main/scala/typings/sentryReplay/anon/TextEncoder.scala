package typings.sentryReplay.anon

import typings.sentryTypes.typesTextencoderMod.TextEncoderInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEncoder extends StObject {
  
  var textEncoder: TextEncoderInternal
}
object TextEncoder {
  
  inline def apply(textEncoder: TextEncoderInternal): TextEncoder = {
    val __obj = js.Dynamic.literal(textEncoder = textEncoder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextEncoder] (val x: Self) extends AnyVal {
    
    inline def setTextEncoder(value: TextEncoderInternal): Self = StObject.set(x, "textEncoder", value.asInstanceOf[js.Any])
  }
}
