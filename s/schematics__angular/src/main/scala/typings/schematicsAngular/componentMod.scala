package typings.schematicsAngular

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typings.schematicsAngular.componentSchemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@schematics/angular/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Schema): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
}
