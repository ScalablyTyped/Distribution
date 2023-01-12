package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.anon.Browser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseCreateManualJob200
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var job_id: js.UndefOr[Unit] = js.undefined
  
  var metadata: Browser
  
  var task_id: String
}
object ResponseCreateManualJob200 {
  
  inline def apply(metadata: Browser, task_id: String): ResponseCreateManualJob200 = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], task_id = task_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCreateManualJob200]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCreateManualJob200] (val x: Self) extends AnyVal {
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setJob_id(value: Unit): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    inline def setMetadata(value: Browser): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setTask_id(value: String): Self = StObject.set(x, "task_id", value.asInstanceOf[js.Any])
  }
}
