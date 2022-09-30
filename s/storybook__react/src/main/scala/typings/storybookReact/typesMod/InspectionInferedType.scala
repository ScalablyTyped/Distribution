package typings.storybookReact.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectionInferedType extends StObject {
  
  var `type`: InspectionType
}
object InspectionInferedType {
  
  inline def apply(`type`: InspectionType): InspectionInferedType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectionInferedType]
  }
  
  extension [Self <: InspectionInferedType](x: Self) {
    
    inline def setType(value: InspectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
