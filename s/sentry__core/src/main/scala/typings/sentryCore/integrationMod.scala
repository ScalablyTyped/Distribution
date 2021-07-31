package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.integrationMod.Integration
import typings.sentryTypes.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationMod {
  
  @JSImport("@sentry/core/dist/integration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getIntegrationsToSetup(options: Options): js.Array[Integration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntegrationsToSetup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Integration]]
  
  @JSImport("@sentry/core/dist/integration", "installedIntegrations")
  @js.native
  val installedIntegrations: js.Array[String] = js.native
  
  @scala.inline
  def setupIntegration(integration: Integration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupIntegration")(integration.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setupIntegrations[O /* <: Options */](options: O): IntegrationIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("setupIntegrations")(options.asInstanceOf[js.Any]).asInstanceOf[IntegrationIndex]
  
  type IntegrationIndex = StringDictionary[Integration]
}
