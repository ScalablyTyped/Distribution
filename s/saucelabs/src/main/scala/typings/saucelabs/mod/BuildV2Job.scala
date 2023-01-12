package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildV2Job
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var creation_time: js.UndefOr[String] = js.undefined
  
  var deletion_time: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var modification_time: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[JobsState] = js.undefined
}
object BuildV2Job {
  
  inline def apply(): BuildV2Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildV2Job]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildV2Job] (val x: Self) extends AnyVal {
    
    inline def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    inline def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
    
    inline def setDeletion_time(value: String): Self = StObject.set(x, "deletion_time", value.asInstanceOf[js.Any])
    
    inline def setDeletion_timeUndefined: Self = StObject.set(x, "deletion_time", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setModification_time(value: String): Self = StObject.set(x, "modification_time", value.asInstanceOf[js.Any])
    
    inline def setModification_timeUndefined: Self = StObject.set(x, "modification_time", js.undefined)
    
    inline def setState(value: JobsState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
