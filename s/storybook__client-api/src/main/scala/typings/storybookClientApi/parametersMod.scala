package typings.storybookClientApi

import typings.storybookAddons.typesMod.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parametersMod {
  
  @JSImport("@storybook/client-api/dist/parameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineParameters(parameterSets: Parameters*): Parameters = ^.asInstanceOf[js.Dynamic].applyDynamic("combineParameters")(parameterSets.asInstanceOf[js.Any]).asInstanceOf[Parameters]
}
