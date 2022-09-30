package typings.storybookReact.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InspectionType extends StObject
@JSImport("@storybook/react/dist/ts3.9/client/docs/lib/inspection/types", "InspectionType")
@js.native
object InspectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InspectionType & String] = js.native
  
  @js.native
  sealed trait ARRAY
    extends StObject
       with InspectionType
  /* "Array" */ val ARRAY: typings.storybookReact.typesMod.InspectionType.ARRAY & String = js.native
  
  @js.native
  sealed trait CLASS
    extends StObject
       with InspectionType
  /* "Class" */ val CLASS: typings.storybookReact.typesMod.InspectionType.CLASS & String = js.native
  
  @js.native
  sealed trait ELEMENT
    extends StObject
       with InspectionType
  /* "Element" */ val ELEMENT: typings.storybookReact.typesMod.InspectionType.ELEMENT & String = js.native
  
  @js.native
  sealed trait FUNCTION
    extends StObject
       with InspectionType
  /* "Function" */ val FUNCTION: typings.storybookReact.typesMod.InspectionType.FUNCTION & String = js.native
  
  @js.native
  sealed trait IDENTIFIER
    extends StObject
       with InspectionType
  /* "Identifier" */ val IDENTIFIER: typings.storybookReact.typesMod.InspectionType.IDENTIFIER & String = js.native
  
  @js.native
  sealed trait LITERAL
    extends StObject
       with InspectionType
  /* "Literal" */ val LITERAL: typings.storybookReact.typesMod.InspectionType.LITERAL & String = js.native
  
  @js.native
  sealed trait OBJECT
    extends StObject
       with InspectionType
  /* "Object" */ val OBJECT: typings.storybookReact.typesMod.InspectionType.OBJECT & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with InspectionType
  /* "Unknown" */ val UNKNOWN: typings.storybookReact.typesMod.InspectionType.UNKNOWN & String = js.native
}
