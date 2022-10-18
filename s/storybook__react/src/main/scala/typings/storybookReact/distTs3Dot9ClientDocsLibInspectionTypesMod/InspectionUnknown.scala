package typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectionUnknown
  extends StObject
     with InspectionInferedType {
  
  @JSName("type")
  var type_InspectionUnknown: UNKNOWN
}
object InspectionUnknown {
  
  inline def apply(`type`: UNKNOWN): InspectionUnknown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectionUnknown]
  }
  
  extension [Self <: InspectionUnknown](x: Self) {
    
    inline def setType(value: UNKNOWN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
