package typings.sentryReplay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@sentry/replay.@sentry/replay/types/types.RecordingOptions, 'maskTextFn'> */
trait PickRecordingOptionsmaskT extends StObject {
  
  var maskTextFn: js.UndefOr[Any] = js.undefined
}
object PickRecordingOptionsmaskT {
  
  inline def apply(): PickRecordingOptionsmaskT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickRecordingOptionsmaskT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickRecordingOptionsmaskT] (val x: Self) extends AnyVal {
    
    inline def setMaskTextFn(value: Any): Self = StObject.set(x, "maskTextFn", value.asInstanceOf[js.Any])
    
    inline def setMaskTextFnUndefined: Self = StObject.set(x, "maskTextFn", js.undefined)
  }
}
