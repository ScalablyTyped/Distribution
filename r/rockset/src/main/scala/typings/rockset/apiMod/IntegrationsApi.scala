package typings.rockset.apiMod

import typings.rockset.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen/api", "IntegrationsApi")
@js.native
open class IntegrationsApi () extends BaseAPI {
  def this(configuration: Configuration) = this()
  def this(configuration: Unit, basePath: String) = this()
  def this(configuration: Configuration, basePath: String) = this()
  def this(configuration: Unit, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Unit, basePath: Unit, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: Unit, fetch: FetchAPI) = this()
  
  /**
    * Create a new integration with Rockset.
    * @summary Create Integration
    * @param {CreateIntegrationRequest} body integration credentials
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof IntegrationsApi
    */
  def createIntegration(body: CreateIntegrationRequest): js.Promise[CreateIntegrationResponse] = js.native
  def createIntegration(body: CreateIntegrationRequest, options: Any): js.Promise[CreateIntegrationResponse] = js.native
  
  /**
    * Remove an integration.
    * @summary Delete Integration
    * @param {string} integration name of the integration
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof IntegrationsApi
    */
  def deleteIntegration(integration: String): js.Promise[DeleteIntegrationResponse] = js.native
  def deleteIntegration(integration: String, options: Any): js.Promise[DeleteIntegrationResponse] = js.native
  
  /**
    * Get information about a single integration.
    * @summary Get Integration
    * @param {string} integration name of the integration
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof IntegrationsApi
    */
  def getIntegration(integration: String): js.Promise[GetIntegrationResponse] = js.native
  def getIntegration(integration: String, options: Any): js.Promise[GetIntegrationResponse] = js.native
  
  /**
    * List all integrations for organization.
    * @summary List Integrations
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof IntegrationsApi
    */
  def listIntegrations(): js.Promise[ListIntegrationsResponse] = js.native
  def listIntegrations(options: Any): js.Promise[ListIntegrationsResponse] = js.native
}
