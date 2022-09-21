package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectionobject extends StObject {
  
  var qBackCount: Double
  
  var qForwardCount: Double
  
  var qSelections: js.Array[NxCurrentSelectionItem]
}
object Selectionobject {
  
  inline def apply(qBackCount: Double, qForwardCount: Double, qSelections: js.Array[NxCurrentSelectionItem]): Selectionobject = {
    val __obj = js.Dynamic.literal(qBackCount = qBackCount.asInstanceOf[js.Any], qForwardCount = qForwardCount.asInstanceOf[js.Any], qSelections = qSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectionobject]
  }
  
  extension [Self <: Selectionobject](x: Self) {
    
    inline def setQBackCount(value: Double): Self = StObject.set(x, "qBackCount", value.asInstanceOf[js.Any])
    
    inline def setQForwardCount(value: Double): Self = StObject.set(x, "qForwardCount", value.asInstanceOf[js.Any])
    
    inline def setQSelections(value: js.Array[NxCurrentSelectionItem]): Self = StObject.set(x, "qSelections", value.asInstanceOf[js.Any])
    
    inline def setQSelectionsVarargs(value: NxCurrentSelectionItem*): Self = StObject.set(x, "qSelections", js.Array(value*))
  }
}
