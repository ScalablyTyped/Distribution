package typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.CLASS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectionClass
  extends StObject
     with InspectionInferedType
     with InspectionIdentifiableInferedType {
  
  var identifier: String
  
  @JSName("type")
  var type_InspectionClass: CLASS
}
object InspectionClass {
  
  inline def apply(identifier: String, `type`: CLASS): InspectionClass = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectionClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InspectionClass] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: CLASS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
