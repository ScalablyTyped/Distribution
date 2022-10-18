package typings.schematicsAngular

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typings.schematicsAngular.resolverSchemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("@schematics/angular/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Schema): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
}
