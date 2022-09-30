package typings.storybookReact

import typings.storybookReact.typesMod.InspectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectValueMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/inspection/inspectValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inspectValue(value: String): InspectionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectValue")(value.asInstanceOf[js.Any]).asInstanceOf[InspectionResult]
}
