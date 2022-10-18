package typings.ramlDefinitionSystem

import typings.ramlDefinitionSystem.mod.Universe
import typings.tsStructureModel.mod.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTsStruct2DefMod {
  
  @JSImport("raml-definition-system/dist/tsStruct2Def", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toDefSystem(ts: Module, q: Any): Universe = (^.asInstanceOf[js.Dynamic].applyDynamic("toDefSystem")(ts.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[Universe]
}
