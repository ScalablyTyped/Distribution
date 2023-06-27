package typings.sentryReplay.anon

import typings.sentryReplay.sentryReplayStrings.performanceSpan
import typings.sentryReplay.typesTypesReplayFrameMod.SpanFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload extends StObject {
  
  var payload: SpanFrame
  
  var tag: performanceSpan
}
object Payload {
  
  inline def apply(payload: SpanFrame): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], tag = "performanceSpan")
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: SpanFrame): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setTag(value: performanceSpan): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
