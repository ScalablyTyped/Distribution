package typings.schematicsAngular

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typings.schematicsAngular.pipeSchemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipeMod {
  
  @JSImport("@schematics/angular/pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Schema): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
}
