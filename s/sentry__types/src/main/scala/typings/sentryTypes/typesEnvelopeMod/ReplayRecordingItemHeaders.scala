package typings.sentryTypes.typesEnvelopeMod

import typings.sentryTypes.sentryTypesStrings.replay_recording
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayRecordingItemHeaders extends StObject {
  
  var length: Double
  
  var `type`: replay_recording
}
object ReplayRecordingItemHeaders {
  
  inline def apply(length: Double): ReplayRecordingItemHeaders = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("replay_recording")
    __obj.asInstanceOf[ReplayRecordingItemHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayRecordingItemHeaders] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setType(value: replay_recording): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
