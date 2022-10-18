package typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.CLASS
import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.ELEMENT
import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.FUNCTION
import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.IDENTIFIER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionIdentifier
  - typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionClass
  - typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionFunction
  - typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionElement
*/
trait InspectionIdentifiableInferedType extends StObject
object InspectionIdentifiableInferedType {
  
  inline def InspectionClass(identifier: String, `type`: CLASS): typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionClass = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionClass]
  }
  
  inline def InspectionElement(`type`: ELEMENT): typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionElement]
  }
  
  inline def InspectionFunction(hasParams: Boolean, params: js.Array[Any], `type`: FUNCTION): typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionFunction = {
    val __obj = js.Dynamic.literal(hasParams = hasParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionFunction]
  }
  
  inline def InspectionIdentifier(identifier: String, `type`: IDENTIFIER): typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionIdentifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionIdentifier]
  }
}
