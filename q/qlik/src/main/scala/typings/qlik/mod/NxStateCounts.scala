package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxStateCounts extends StObject {
  
  var qAlternative: Double
  
  var qDeselected: Double
  
  var qExcluded: Double
  
  var qLocked: Double
  
  var qLockedExcluded: Double
  
  var qOption: Double
  
  var qSelected: Double
  
  var qSelectedExcluded: Double
}
object NxStateCounts {
  
  inline def apply(
    qAlternative: Double,
    qDeselected: Double,
    qExcluded: Double,
    qLocked: Double,
    qLockedExcluded: Double,
    qOption: Double,
    qSelected: Double,
    qSelectedExcluded: Double
  ): NxStateCounts = {
    val __obj = js.Dynamic.literal(qAlternative = qAlternative.asInstanceOf[js.Any], qDeselected = qDeselected.asInstanceOf[js.Any], qExcluded = qExcluded.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qLockedExcluded = qLockedExcluded.asInstanceOf[js.Any], qOption = qOption.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedExcluded = qSelectedExcluded.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxStateCounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NxStateCounts] (val x: Self) extends AnyVal {
    
    inline def setQAlternative(value: Double): Self = StObject.set(x, "qAlternative", value.asInstanceOf[js.Any])
    
    inline def setQDeselected(value: Double): Self = StObject.set(x, "qDeselected", value.asInstanceOf[js.Any])
    
    inline def setQExcluded(value: Double): Self = StObject.set(x, "qExcluded", value.asInstanceOf[js.Any])
    
    inline def setQLocked(value: Double): Self = StObject.set(x, "qLocked", value.asInstanceOf[js.Any])
    
    inline def setQLockedExcluded(value: Double): Self = StObject.set(x, "qLockedExcluded", value.asInstanceOf[js.Any])
    
    inline def setQOption(value: Double): Self = StObject.set(x, "qOption", value.asInstanceOf[js.Any])
    
    inline def setQSelected(value: Double): Self = StObject.set(x, "qSelected", value.asInstanceOf[js.Any])
    
    inline def setQSelectedExcluded(value: Double): Self = StObject.set(x, "qSelectedExcluded", value.asInstanceOf[js.Any])
  }
}
