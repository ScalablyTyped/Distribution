package typings.snyk

import typings.snyk.anon.Inspect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModuleInfoMod {
  
  @JSImport("snyk/dist/lib/module-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ModuleInfo(plugin: Any, policy: Any): Inspect = (^.asInstanceOf[js.Dynamic].applyDynamic("ModuleInfo")(plugin.asInstanceOf[js.Any], policy.asInstanceOf[js.Any])).asInstanceOf[Inspect]
}
