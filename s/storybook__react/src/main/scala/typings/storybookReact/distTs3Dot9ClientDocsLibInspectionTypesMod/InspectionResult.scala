package typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectionResult extends StObject {
  
  var ast: js.UndefOr[Any] = js.undefined
  
  var inferredType: InspectionInferedType
}
object InspectionResult {
  
  inline def apply(inferredType: InspectionInferedType): InspectionResult = {
    val __obj = js.Dynamic.literal(inferredType = inferredType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectionResult]
  }
  
  extension [Self <: InspectionResult](x: Self) {
    
    inline def setAst(value: Any): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    inline def setInferredType(value: InspectionInferedType): Self = StObject.set(x, "inferredType", value.asInstanceOf[js.Any])
  }
}
