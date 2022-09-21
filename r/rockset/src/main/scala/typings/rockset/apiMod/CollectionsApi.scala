package typings.rockset.apiMod

import typings.rockset.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen/api", "CollectionsApi")
@js.native
open class CollectionsApi () extends BaseAPI {
  def this(configuration: Configuration) = this()
  def this(configuration: Unit, basePath: String) = this()
  def this(configuration: Configuration, basePath: String) = this()
  def this(configuration: Unit, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Unit, basePath: Unit, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: Unit, fetch: FetchAPI) = this()
  
  /**
    * Create new collection in a workspace.
    * @summary Create Collection
    * @param {string} workspace name of the workspace
    * @param {CreateCollectionRequest} body JSON object
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof CollectionsApi
    */
  def createCollection(workspace: String, body: CreateCollectionRequest): js.Promise[CreateCollectionResponse] = js.native
  def createCollection(workspace: String, body: CreateCollectionRequest, options: Any): js.Promise[CreateCollectionResponse] = js.native
  
  /**
    * Delete a collection and all its documents from Rockset.
    * @summary Delete Collection
    * @param {string} workspace name of the workspace
    * @param {string} collection name of the collection
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof CollectionsApi
    */
  def deleteCollection(workspace: String, collection: String): js.Promise[DeleteCollectionResponse] = js.native
  def deleteCollection(workspace: String, collection: String, options: Any): js.Promise[DeleteCollectionResponse] = js.native
  
  /**
    * Get details about a collection.
    * @summary Get Collection
    * @param {string} workspace name of the workspace
    * @param {string} collection name of the collection
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof CollectionsApi
    */
  def getCollection(workspace: String, collection: String): js.Promise[GetCollectionResponse] = js.native
  def getCollection(workspace: String, collection: String, options: Any): js.Promise[GetCollectionResponse] = js.native
  
  /**
    * Retrieve all collections in an organization.
    * @summary List Collections
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof CollectionsApi
    */
  def listCollections(): js.Promise[ListCollectionsResponse] = js.native
  def listCollections(options: Any): js.Promise[ListCollectionsResponse] = js.native
  
  /**
    * Get all Query Lambdas that hit a specific Rockset Collection.
    * @summary Get Query Lambdas
    * @param {string} workspace name of the workspace
    * @param {string} collection name of the collection
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof CollectionsApi
    */
  def listQueryLambdasInCollection(workspace: String, collection: String): js.Promise[ListQueryLambdaVersionsResponse] = js.native
  def listQueryLambdasInCollection(workspace: String, collection: String, options: Any): js.Promise[ListQueryLambdaVersionsResponse] = js.native
  
  /**
    * Retrieve all collections in a workspace.
    * @summary List Collections for Workspace
    * @param {string} workspace name of the workspace
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof CollectionsApi
    */
  def workspaceCollections(workspace: String): js.Promise[ListCollectionsResponse] = js.native
  def workspaceCollections(workspace: String, options: Any): js.Promise[ListCollectionsResponse] = js.native
}
