package typings.rockset.apiMod

import typings.rockset.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen/api", "ApiKeysApi")
@js.native
open class ApiKeysApi () extends BaseAPI {
  def this(configuration: Configuration) = this()
  def this(configuration: Unit, basePath: String) = this()
  def this(configuration: Configuration, basePath: String) = this()
  def this(configuration: Unit, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Unit, basePath: Unit, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: Unit, fetch: FetchAPI) = this()
  
  /**
    * Create a new API key for the authenticated user.
    * @summary Create API Key
    * @param {CreateApiKeyRequest} body JSON object
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof ApiKeysApi
    */
  def createApiKey(body: CreateApiKeyRequest): js.Promise[CreateApiKeyResponse] = js.native
  def createApiKey(body: CreateApiKeyRequest, options: Any): js.Promise[CreateApiKeyResponse] = js.native
  
  /**
    * Create a new API key for any user (admin only).
    * @summary Create API Key for any user (admin only)
    * @param {CreateApiKeyRequest} body JSON object
    * @param {string} user
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof ApiKeysApi
    */
  def createApiKeyAdmin(body: CreateApiKeyRequest, user: String): js.Promise[CreateApiKeyResponse] = js.native
  def createApiKeyAdmin(body: CreateApiKeyRequest, user: String, options: Any): js.Promise[CreateApiKeyResponse] = js.native
  
  /**
    * Delete an API key for the authenticated user.
    * @summary Delete API Key
    * @param {string} name name of the API key
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof ApiKeysApi
    */
  def deleteApiKey(name: String): js.Promise[DeleteApiKeyResponse] = js.native
  def deleteApiKey(name: String, options: Any): js.Promise[DeleteApiKeyResponse] = js.native
  
  /**
    * Delete an API key for any user (admin only).
    * @summary Delete API Key for any user (admin only)
    * @param {string} name name of the API key
    * @param {string} user
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof ApiKeysApi
    */
  def deleteApiKeyAdmin(name: String, user: String): js.Promise[DeleteApiKeyResponse] = js.native
  def deleteApiKeyAdmin(name: String, user: String, options: Any): js.Promise[DeleteApiKeyResponse] = js.native
  
  /**
    * List all API keys for the authenticated user.
    * @summary List API Keys
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof ApiKeysApi
    */
  def listApiKeys(): js.Promise[ListApiKeysResponse] = js.native
  def listApiKeys(options: Any): js.Promise[ListApiKeysResponse] = js.native
  
  /**
    * List all API keys for any user (admin only).
    * @summary List API Keys for any user (admin only)
    * @param {string} user
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof ApiKeysApi
    */
  def listApiKeysAdmin(user: String): js.Promise[ListApiKeysResponse] = js.native
  def listApiKeysAdmin(user: String, options: Any): js.Promise[ListApiKeysResponse] = js.native
}
