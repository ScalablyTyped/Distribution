package typings.snyk

import typings.snyk.distLibEcosystemsTypesMod.Analytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEcosystemsPluginAnalyticsMod {
  
  @JSImport("snyk/dist/lib/ecosystems/plugin-analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractAndApplyPluginAnalytics(pluginAnalytics: js.Array[Analytics]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAndApplyPluginAnalytics")(pluginAnalytics.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def extractAndApplyPluginAnalytics(pluginAnalytics: js.Array[Analytics], asyncRequestToken: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extractAndApplyPluginAnalytics")(pluginAnalytics.asInstanceOf[js.Any], asyncRequestToken.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
