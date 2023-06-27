package typings.sentryReplay.typesTypesReplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendBufferedReplayOptions extends StObject {
  
  var continueRecording: js.UndefOr[Boolean] = js.undefined
}
object SendBufferedReplayOptions {
  
  inline def apply(): SendBufferedReplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendBufferedReplayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendBufferedReplayOptions] (val x: Self) extends AnyVal {
    
    inline def setContinueRecording(value: Boolean): Self = StObject.set(x, "continueRecording", value.asInstanceOf[js.Any])
    
    inline def setContinueRecordingUndefined: Self = StObject.set(x, "continueRecording", js.undefined)
  }
}
