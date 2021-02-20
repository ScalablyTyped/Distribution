package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizationCondition extends NormalizationSelection {
  
  val condition: String = js.native
  
  val kind: String = js.native
  
  // 'Condition';
  val passingValue: Boolean = js.native
  
  val selections: js.Array[NormalizationSelection] = js.native
}
object NormalizationCondition {
  
  @scala.inline
  def apply(
    condition: String,
    kind: String,
    passingValue: Boolean,
    selections: js.Array[NormalizationSelection]
  ): NormalizationCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationCondition]
  }
  
  @scala.inline
  implicit class NormalizationConditionMutableBuilder[Self <: NormalizationCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassingValue(value: Boolean): Self = StObject.set(x, "passingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelections(value: js.Array[NormalizationSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: NormalizationSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
  }
}
