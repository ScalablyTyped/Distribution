package typings.relayRuntime.libUtilReaderNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderCondition
  extends StObject
     with ReaderNode
     with ReaderSelection {
  
  val condition: String
  
  val kind: String
  
  // 'Condition';
  val passingValue: Boolean
  
  val selections: js.Array[ReaderSelection]
}
object ReaderCondition {
  
  inline def apply(condition: String, kind: String, passingValue: Boolean, selections: js.Array[ReaderSelection]): ReaderCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderCondition]
  }
  
  extension [Self <: ReaderCondition](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPassingValue(value: Boolean): Self = StObject.set(x, "passingValue", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[ReaderSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: ReaderSelection*): Self = StObject.set(x, "selections", js.Array(value*))
  }
}
