package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShareSheet {
  
  trait ShareSheetResult extends StObject {
    
    /** The app or extension it was shared to */
    var activity_type: String
    
    /**
      * If the share was completed by the user. This might still be `true`
      * when the user has actually canceled the action.
      */
    var completed: Boolean
  }
  object ShareSheetResult {
    
    inline def apply(activity_type: String, completed: Boolean): ShareSheetResult = {
      val __obj = js.Dynamic.literal(activity_type = activity_type.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareSheetResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShareSheetResult] (val x: Self) extends AnyVal {
      
      inline def setActivity_type(value: String): Self = StObject.set(x, "activity_type", value.asInstanceOf[js.Any])
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    }
  }
}
