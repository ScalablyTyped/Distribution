package typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.FUNCTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectionFunction
  extends StObject
     with InspectionInferedType
     with InspectionIdentifiableInferedType {
  
  var hasParams: Boolean
  
  var identifier: js.UndefOr[String] = js.undefined
  
  var params: js.Array[Any]
  
  @JSName("type")
  var type_InspectionFunction: FUNCTION
}
object InspectionFunction {
  
  inline def apply(hasParams: Boolean, params: js.Array[Any], `type`: FUNCTION): InspectionFunction = {
    val __obj = js.Dynamic.literal(hasParams = hasParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectionFunction]
  }
  
  extension [Self <: InspectionFunction](x: Self) {
    
    inline def setHasParams(value: Boolean): Self = StObject.set(x, "hasParams", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: FUNCTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
