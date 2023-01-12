package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackConstraints
  extends StObject
     with MediaTrackConstraintSet {
  
  /* standard dom */
  var advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.undefined
}
object MediaTrackConstraints {
  
  inline def apply(): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaTrackConstraints] (val x: Self) extends AnyVal {
    
    inline def setAdvanced(value: js.Array[MediaTrackConstraintSet]): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
    
    inline def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
    
    inline def setAdvancedVarargs(value: MediaTrackConstraintSet*): Self = StObject.set(x, "advanced", js.Array(value*))
  }
}
