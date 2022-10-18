package typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.IDENTIFIER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectionIdentifier
  extends StObject
     with InspectionInferedType
     with InspectionIdentifiableInferedType {
  
  var identifier: String
  
  @JSName("type")
  var type_InspectionIdentifier: IDENTIFIER
}
object InspectionIdentifier {
  
  inline def apply(identifier: String, `type`: IDENTIFIER): InspectionIdentifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectionIdentifier]
  }
  
  extension [Self <: InspectionIdentifier](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: IDENTIFIER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
