package typings.relayRuntime.normalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizationOperation extends NormalizationSelectableNode {
  
  val argumentDefinitions: js.Array[NormalizationLocalArgumentDefinition] = js.native
  
  val kind: String = js.native
  
   // 'Operation';
  val name: String = js.native
  
  val selections: js.Array[NormalizationSelection] = js.native
}
object NormalizationOperation {
  
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[NormalizationLocalArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[NormalizationSelection]
  ): NormalizationOperation = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationOperation]
  }
  
  @scala.inline
  implicit class NormalizationOperationOps[Self <: NormalizationOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgumentDefinitionsVarargs(value: NormalizationLocalArgumentDefinition*): Self = this.set("argumentDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setArgumentDefinitions(value: js.Array[NormalizationLocalArgumentDefinition]): Self = this.set("argumentDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: NormalizationSelection*): Self = this.set("selections", js.Array(value :_*))
    
    @scala.inline
    def setSelections(value: js.Array[NormalizationSelection]): Self = this.set("selections", value.asInstanceOf[js.Any])
  }
}
