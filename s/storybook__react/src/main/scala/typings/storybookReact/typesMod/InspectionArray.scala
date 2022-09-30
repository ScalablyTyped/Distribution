package typings.storybookReact.typesMod

import typings.storybookReact.typesMod.InspectionType.ARRAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectionArray
  extends StObject
     with InspectionInferedType {
  
  var depth: Double
  
  @JSName("type")
  var type_InspectionArray: ARRAY
}
object InspectionArray {
  
  inline def apply(depth: Double, `type`: ARRAY): InspectionArray = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectionArray]
  }
  
  extension [Self <: InspectionArray](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setType(value: ARRAY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
