package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
  */
trait NodeSelectorTerm extends StObject {
  
  /**
    * A list of node selector requirements by node's labels.
    */
  var matchExpressions: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirement]]]] = js.undefined
  
  /**
    * A list of node selector requirements by node's fields.
    */
  var matchFields: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirement]]]] = js.undefined
}
object NodeSelectorTerm {
  
  inline def apply(): NodeSelectorTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSelectorTerm]
  }
  
  extension [Self <: NodeSelectorTerm](x: Self) {
    
    inline def setMatchExpressions(value: Input[js.Array[Input[NodeSelectorRequirement]]]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
    
    inline def setMatchExpressionsUndefined: Self = StObject.set(x, "matchExpressions", js.undefined)
    
    inline def setMatchExpressionsVarargs(value: Input[NodeSelectorRequirement]*): Self = StObject.set(x, "matchExpressions", js.Array(value :_*))
    
    inline def setMatchFields(value: Input[js.Array[Input[NodeSelectorRequirement]]]): Self = StObject.set(x, "matchFields", value.asInstanceOf[js.Any])
    
    inline def setMatchFieldsUndefined: Self = StObject.set(x, "matchFields", js.undefined)
    
    inline def setMatchFieldsVarargs(value: Input[NodeSelectorRequirement]*): Self = StObject.set(x, "matchFields", js.Array(value :_*))
  }
}
