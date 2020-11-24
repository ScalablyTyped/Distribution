package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
  */
@js.native
trait NodeSelectorTerm extends js.Object {
  
  /**
    * A list of node selector requirements by node's labels.
    */
  var matchExpressions: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirement]]]] = js.native
  
  /**
    * A list of node selector requirements by node's fields.
    */
  var matchFields: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirement]]]] = js.native
}
object NodeSelectorTerm {
  
  @scala.inline
  def apply(): NodeSelectorTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSelectorTerm]
  }
  
  @scala.inline
  implicit class NodeSelectorTermOps[Self <: NodeSelectorTerm] (val x: Self) extends AnyVal {
    
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
    def setMatchExpressionsVarargs(value: Input[NodeSelectorRequirement]*): Self = this.set("matchExpressions", js.Array(value :_*))
    
    @scala.inline
    def setMatchExpressions(value: Input[js.Array[Input[NodeSelectorRequirement]]]): Self = this.set("matchExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchExpressions: Self = this.set("matchExpressions", js.undefined)
    
    @scala.inline
    def setMatchFieldsVarargs(value: Input[NodeSelectorRequirement]*): Self = this.set("matchFields", js.Array(value :_*))
    
    @scala.inline
    def setMatchFields(value: Input[js.Array[Input[NodeSelectorRequirement]]]): Self = this.set("matchFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchFields: Self = this.set("matchFields", js.undefined)
  }
}
