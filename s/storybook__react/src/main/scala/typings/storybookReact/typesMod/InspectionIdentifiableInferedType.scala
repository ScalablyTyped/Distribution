package typings.storybookReact.typesMod

import typings.storybookReact.typesMod.InspectionType.CLASS
import typings.storybookReact.typesMod.InspectionType.ELEMENT
import typings.storybookReact.typesMod.InspectionType.FUNCTION
import typings.storybookReact.typesMod.InspectionType.IDENTIFIER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.storybookReact.typesMod.InspectionIdentifier
  - typings.storybookReact.typesMod.InspectionClass
  - typings.storybookReact.typesMod.InspectionFunction
  - typings.storybookReact.typesMod.InspectionElement
*/
trait InspectionIdentifiableInferedType extends StObject
object InspectionIdentifiableInferedType {
  
  inline def InspectionClass(identifier: String, `type`: CLASS): typings.storybookReact.typesMod.InspectionClass = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookReact.typesMod.InspectionClass]
  }
  
  inline def InspectionElement(`type`: ELEMENT): typings.storybookReact.typesMod.InspectionElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookReact.typesMod.InspectionElement]
  }
  
  inline def InspectionFunction(hasParams: Boolean, params: js.Array[Any], `type`: FUNCTION): typings.storybookReact.typesMod.InspectionFunction = {
    val __obj = js.Dynamic.literal(hasParams = hasParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookReact.typesMod.InspectionFunction]
  }
  
  inline def InspectionIdentifier(identifier: String, `type`: IDENTIFIER): typings.storybookReact.typesMod.InspectionIdentifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookReact.typesMod.InspectionIdentifier]
  }
}
