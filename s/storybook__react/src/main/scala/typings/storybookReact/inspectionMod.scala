package typings.storybookReact

import typings.storybookReact.typesMod.InspectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectionMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/inspection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/inspection", "InspectionType")
  @js.native
  object InspectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookReact.typesMod.InspectionType & String] = js.native
    
    /* "Array" */ val ARRAY: typings.storybookReact.typesMod.InspectionType.ARRAY & String = js.native
    
    /* "Class" */ val CLASS: typings.storybookReact.typesMod.InspectionType.CLASS & String = js.native
    
    /* "Element" */ val ELEMENT: typings.storybookReact.typesMod.InspectionType.ELEMENT & String = js.native
    
    /* "Function" */ val FUNCTION: typings.storybookReact.typesMod.InspectionType.FUNCTION & String = js.native
    
    /* "Identifier" */ val IDENTIFIER: typings.storybookReact.typesMod.InspectionType.IDENTIFIER & String = js.native
    
    /* "Literal" */ val LITERAL: typings.storybookReact.typesMod.InspectionType.LITERAL & String = js.native
    
    /* "Object" */ val OBJECT: typings.storybookReact.typesMod.InspectionType.OBJECT & String = js.native
    
    /* "Unknown" */ val UNKNOWN: typings.storybookReact.typesMod.InspectionType.UNKNOWN & String = js.native
  }
  
  inline def inspectValue(value: String): InspectionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectValue")(value.asInstanceOf[js.Any]).asInstanceOf[InspectionResult]
}
