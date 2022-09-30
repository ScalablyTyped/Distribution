package typings.storybookStore

import typings.storybookAddons.typesMod.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parametersMod {
  
  @JSImport("@storybook/store/dist/ts3.9/parameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineParameters(parameterSets: js.UndefOr[Parameters]*): Parameters = ^.asInstanceOf[js.Dynamic].applyDynamic("combineParameters")(parameterSets.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Parameters]
}
