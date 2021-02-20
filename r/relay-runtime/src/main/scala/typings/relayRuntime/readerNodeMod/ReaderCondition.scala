package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaderCondition extends ReaderSelection {
  
  val condition: String = js.native
  
  val kind: String = js.native
  
  // 'Condition';
  val passingValue: Boolean = js.native
  
  val selections: js.Array[ReaderSelection] = js.native
}
object ReaderCondition {
  
  @scala.inline
  def apply(condition: String, kind: String, passingValue: Boolean, selections: js.Array[ReaderSelection]): ReaderCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderCondition]
  }
  
  @scala.inline
  implicit class ReaderConditionMutableBuilder[Self <: ReaderCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassingValue(value: Boolean): Self = StObject.set(x, "passingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelections(value: js.Array[ReaderSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: ReaderSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
  }
}
