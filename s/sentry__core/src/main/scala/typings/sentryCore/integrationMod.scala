package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.integrationMod.Integration
import typings.sentryTypes.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationMod {
  
  @JSImport("@sentry/core/dist/integration", "getIntegrationsToSetup")
  @js.native
  def getIntegrationsToSetup(options: Options): js.Array[Integration] = js.native
  
  @JSImport("@sentry/core/dist/integration", "installedIntegrations")
  @js.native
  val installedIntegrations: js.Array[String] = js.native
  
  @JSImport("@sentry/core/dist/integration", "setupIntegration")
  @js.native
  def setupIntegration(integration: Integration): Unit = js.native
  
  @JSImport("@sentry/core/dist/integration", "setupIntegrations")
  @js.native
  def setupIntegrations[O /* <: Options */](options: O): IntegrationIndex = js.native
  
  type IntegrationIndex = StringDictionary[Integration]
}
