package typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.OBJECT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectionObject
  extends StObject
     with InspectionInferedType {
  
  var depth: Double
  
  @JSName("type")
  var type_InspectionObject: OBJECT
}
object InspectionObject {
  
  inline def apply(depth: Double, `type`: OBJECT): InspectionObject = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectionObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InspectionObject] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setType(value: OBJECT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
