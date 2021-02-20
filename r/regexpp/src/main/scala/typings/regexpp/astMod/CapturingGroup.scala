package typings.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapturingGroup
  extends BranchNode
     with NodeBase
     with QuantifiableElement {
  
  var alternatives: js.Array[Alternative] = js.native
  
  var name: String | Null = js.native
  
  @JSName("parent")
  var parent_CapturingGroup: Alternative | Quantifier = js.native
  
  var references: js.Array[Backreference] = js.native
  
  @JSName("type")
  var type_CapturingGroup: typings.regexpp.regexppStrings.CapturingGroup = js.native
}
object CapturingGroup {
  
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    references: js.Array[Backreference],
    start: Double,
    `type`: typings.regexpp.regexppStrings.CapturingGroup
  ): CapturingGroup = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturingGroup]
  }
  
  @scala.inline
  implicit class CapturingGroupMutableBuilder[Self <: CapturingGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternatives(value: js.Array[Alternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesVarargs(value: Alternative*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferences(value: js.Array[Backreference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesVarargs(value: Backreference*): Self = StObject.set(x, "references", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.regexpp.regexppStrings.CapturingGroup): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
