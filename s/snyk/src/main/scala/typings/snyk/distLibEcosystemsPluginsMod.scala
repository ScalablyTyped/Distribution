package typings.snyk

import typings.snyk.distLibEcosystemsTypesMod.Ecosystem
import typings.snyk.distLibEcosystemsTypesMod.EcosystemPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEcosystemsPluginsMod {
  
  @JSImport("snyk/dist/lib/ecosystems/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPlugin(ecosystem: Ecosystem): EcosystemPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(ecosystem.asInstanceOf[js.Any]).asInstanceOf[EcosystemPlugin]
}
