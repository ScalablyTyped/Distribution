package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.integrationMod.Integration
import typings.sentryTypes.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/core/dist/integration", JSImport.Namespace)
@js.native
object integrationMod extends js.Object {
  
  def getIntegrationsToSetup(options: Options): js.Array[Integration] = js.native
  
  val installedIntegrations: js.Array[String] = js.native
  
  def setupIntegration(integration: Integration): Unit = js.native
  
  def setupIntegrations[O /* <: Options */](options: O): IntegrationIndex = js.native
  
  type IntegrationIndex = StringDictionary[Integration]
}
