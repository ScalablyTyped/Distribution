package typings.snyk

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typings.snyk.distLibPluginsTypesMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsMod {
  
  @JSImport("snyk/dist/lib/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadPlugin(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")().asInstanceOf[Plugin]
  inline def loadPlugin(packageManager: SupportedPackageManagers): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(packageManager.asInstanceOf[js.Any]).asInstanceOf[Plugin]
}
