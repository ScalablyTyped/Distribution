package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
  */
trait TopologySelectorTerm extends StObject {
  
  /**
    * A list of topology selector requirements by labels.
    */
  var matchLabelExpressions: js.UndefOr[Input[js.Array[Input[TopologySelectorLabelRequirement]]]] = js.undefined
}
object TopologySelectorTerm {
  
  inline def apply(): TopologySelectorTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopologySelectorTerm]
  }
  
  extension [Self <: TopologySelectorTerm](x: Self) {
    
    inline def setMatchLabelExpressions(value: Input[js.Array[Input[TopologySelectorLabelRequirement]]]): Self = StObject.set(x, "matchLabelExpressions", value.asInstanceOf[js.Any])
    
    inline def setMatchLabelExpressionsUndefined: Self = StObject.set(x, "matchLabelExpressions", js.undefined)
    
    inline def setMatchLabelExpressionsVarargs(value: Input[TopologySelectorLabelRequirement]*): Self = StObject.set(x, "matchLabelExpressions", js.Array(value :_*))
  }
}
