package typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.ARRAY
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InspectionArray] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setType(value: ARRAY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
