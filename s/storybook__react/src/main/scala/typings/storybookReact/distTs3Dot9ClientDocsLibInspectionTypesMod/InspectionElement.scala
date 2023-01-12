package typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.ELEMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectionElement
  extends StObject
     with InspectionInferedType
     with InspectionIdentifiableInferedType {
  
  var identifier: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_InspectionElement: ELEMENT
}
object InspectionElement {
  
  inline def apply(`type`: ELEMENT): InspectionElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectionElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InspectionElement] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setType(value: ELEMENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
