package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.ABORTED
import typings.saucelabs.saucelabsStrings.CANCELED
import typings.saucelabs.saucelabsStrings.FAILURE
import typings.saucelabs.saucelabsStrings.LANDSCAPE
import typings.saucelabs.saucelabsStrings.PORTRAIT
import typings.saucelabs.saucelabsStrings.SKIPPED
import typings.saucelabs.saucelabsStrings.SUCCESS
import typings.saucelabs.saucelabsStrings.UNKNOWN
import typings.saucelabs.saucelabsStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var error: js.UndefOr[ScriptError] = js.undefined
  
  var hasReplayImage: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var line: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var orientation: js.UndefOr[PORTRAIT | LANDSCAPE] = js.undefined
  
  var recordedImage: js.UndefOr[Id] = js.undefined
  
  var resolvedPosition: js.UndefOr[Point] = js.undefined
  
  var status: js.UndefOr[UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED] = js.undefined
  
  var warning: js.UndefOr[ScriptWarning] = js.undefined
}
object Step {
  
  inline def apply(): Step = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
    
    inline def setError(value: ScriptError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHasReplayImage(value: Boolean): Self = StObject.set(x, "hasReplayImage", value.asInstanceOf[js.Any])
    
    inline def setHasReplayImageUndefined: Self = StObject.set(x, "hasReplayImage", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOrientation(value: PORTRAIT | LANDSCAPE): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRecordedImage(value: Id): Self = StObject.set(x, "recordedImage", value.asInstanceOf[js.Any])
    
    inline def setRecordedImageUndefined: Self = StObject.set(x, "recordedImage", js.undefined)
    
    inline def setResolvedPosition(value: Point): Self = StObject.set(x, "resolvedPosition", value.asInstanceOf[js.Any])
    
    inline def setResolvedPositionUndefined: Self = StObject.set(x, "resolvedPosition", js.undefined)
    
    inline def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setWarning(value: ScriptWarning): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
