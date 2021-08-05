package typings.pulumiKubernetes.outputMod.core.v1

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
  var matchExpressions: js.Array[NodeSelectorRequirement]
  
  /**
    * A list of node selector requirements by node's fields.
    */
  var matchFields: js.Array[NodeSelectorRequirement]
}
object NodeSelectorTerm {
  
  inline def apply(
    matchExpressions: js.Array[NodeSelectorRequirement],
    matchFields: js.Array[NodeSelectorRequirement]
  ): NodeSelectorTerm = {
    val __obj = js.Dynamic.literal(matchExpressions = matchExpressions.asInstanceOf[js.Any], matchFields = matchFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSelectorTerm]
  }
  
  extension [Self <: NodeSelectorTerm](x: Self) {
    
    inline def setMatchExpressions(value: js.Array[NodeSelectorRequirement]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
    
    inline def setMatchExpressionsVarargs(value: NodeSelectorRequirement*): Self = StObject.set(x, "matchExpressions", js.Array(value :_*))
    
    inline def setMatchFields(value: js.Array[NodeSelectorRequirement]): Self = StObject.set(x, "matchFields", value.asInstanceOf[js.Any])
    
    inline def setMatchFieldsVarargs(value: NodeSelectorRequirement*): Self = StObject.set(x, "matchFields", js.Array(value :_*))
  }
}
