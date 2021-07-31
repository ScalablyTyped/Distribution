package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackConstraints
  extends StObject
     with MediaTrackConstraintSet {
  
  var advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.undefined
}
object MediaTrackConstraints {
  
  @scala.inline
  def apply(): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraints]
  }
  
  @scala.inline
  implicit class MediaTrackConstraintsMutableBuilder[Self <: MediaTrackConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvanced(value: js.Array[MediaTrackConstraintSet]): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
    
    @scala.inline
    def setAdvancedVarargs(value: MediaTrackConstraintSet*): Self = StObject.set(x, "advanced", js.Array(value :_*))
  }
}
