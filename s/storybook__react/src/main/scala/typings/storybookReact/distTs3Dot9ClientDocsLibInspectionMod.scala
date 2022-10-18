package typings.storybookReact

import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientDocsLibInspectionMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/inspection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/inspection", "InspectionType")
  @js.native
  object InspectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType & String
      ] = js.native
    
    /* "Array" */ val ARRAY: typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.ARRAY & String = js.native
    
    /* "Class" */ val CLASS: typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.CLASS & String = js.native
    
    /* "Element" */ val ELEMENT: typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.ELEMENT & String = js.native
    
    /* "Function" */ val FUNCTION: typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.FUNCTION & String = js.native
    
    /* "Identifier" */ val IDENTIFIER: typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.IDENTIFIER & String = js.native
    
    /* "Literal" */ val LITERAL: typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.LITERAL & String = js.native
    
    /* "Object" */ val OBJECT: typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.OBJECT & String = js.native
    
    /* "Unknown" */ val UNKNOWN: typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.UNKNOWN & String = js.native
  }
  
  inline def inspectValue(value: String): InspectionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectValue")(value.asInstanceOf[js.Any]).asInstanceOf[InspectionResult]
}
