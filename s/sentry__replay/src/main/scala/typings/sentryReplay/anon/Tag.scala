package typings.sentryReplay.anon

import typings.sentryReplay.sentryReplayStrings.options
import typings.sentryReplay.typesTypesReplayFrameMod.OptionFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  var payload: OptionFrame
  
  var tag: options
}
object Tag {
  
  inline def apply(payload: OptionFrame): Tag = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], tag = "options")
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: OptionFrame): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setTag(value: options): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
