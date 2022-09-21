package typings.rockset.apiMod

import typings.rockset.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen/api", "QueryLambdasApi")
@js.native
open class QueryLambdasApi () extends BaseAPI {
  def this(configuration: Configuration) = this()
  def this(configuration: Unit, basePath: String) = this()
  def this(configuration: Configuration, basePath: String) = this()
  def this(configuration: Unit, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Unit, basePath: Unit, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: Unit, fetch: FetchAPI) = this()
  
  /**
    * Create a Query Lambda in given workspace.
    * @summary Create Query Lambda
    * @param {string} workspace name of the workspace
    * @param {CreateQueryLambdaRequest} body JSON object
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def createQueryLambda(workspace: String, body: CreateQueryLambdaRequest): js.Promise[QueryLambdaVersionResponse] = js.native
  def createQueryLambda(workspace: String, body: CreateQueryLambdaRequest, options: Any): js.Promise[QueryLambdaVersionResponse] = js.native
  
  /**
    * Create a tag for a specific Query Lambda version, or update if it exists
    * @summary Create Query Lambda Tag
    * @param {string} workspace name of the workspace
    * @param {string} queryLambda name of the Query Lambda
    * @param {CreateQueryLambdaTagRequest} body JSON object
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def createQueryLambdaTag(workspace: String, queryLambda: String, body: CreateQueryLambdaTagRequest): js.Promise[QueryLambdaTagResponse] = js.native
  def createQueryLambdaTag(workspace: String, queryLambda: String, body: CreateQueryLambdaTagRequest, options: Any): js.Promise[QueryLambdaTagResponse] = js.native
  
  /**
    * Delete a Query Lambda.
    * @summary Delete Query Lambda
    * @param {string} workspace name of the workspace
    * @param {string} queryLambda name of the Query Lambda
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def deleteQueryLambda(workspace: String, queryLambda: String): js.Promise[DeleteQueryLambdaResponse] = js.native
  def deleteQueryLambda(workspace: String, queryLambda: String, options: Any): js.Promise[DeleteQueryLambdaResponse] = js.native
  
  /**
    * Delete a tag for a specific Query Lambda
    * @summary Delete Query Lambda Tag Version
    * @param {string} workspace name of the workspace
    * @param {string} queryLambda name of the Query Lambda
    * @param {string} tag name of the tag
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def deleteQueryLambdaTag(workspace: String, queryLambda: String, tag: String): js.Promise[QueryLambdaTagResponse] = js.native
  def deleteQueryLambdaTag(workspace: String, queryLambda: String, tag: String, options: Any): js.Promise[QueryLambdaTagResponse] = js.native
  
  /**
    * Delete a Query Lambda version.
    * @summary Delete Query Lambda Version
    * @param {string} workspace name of the workspace
    * @param {string} queryLambda name of the Query Lambda
    * @param {string} version version
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def deleteQueryLambdaVersion(workspace: String, queryLambda: String, version: String): js.Promise[QueryLambdaVersionResponse] = js.native
  def deleteQueryLambdaVersion(workspace: String, queryLambda: String, version: String, options: Any): js.Promise[QueryLambdaVersionResponse] = js.native
  
  /**
    * Run a particular version of a Query Lambda.
    * @summary Run Query Lambda
    * @param {string} workspace name of the workspace
    * @param {string} queryLambda name of the Query Lambda
    * @param {string} version version
    * @param {ExecuteQueryLambdaRequest} [body] JSON object
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def executeQueryLambda(workspace: String, queryLambda: String, version: String): js.Promise[QueryResponse] = js.native
  def executeQueryLambda(workspace: String, queryLambda: String, version: String, body: Unit, options: Any): js.Promise[QueryResponse] = js.native
  def executeQueryLambda(workspace: String, queryLambda: String, version: String, body: ExecuteQueryLambdaRequest): js.Promise[QueryResponse] = js.native
  def executeQueryLambda(
    workspace: String,
    queryLambda: String,
    version: String,
    body: ExecuteQueryLambdaRequest,
    options: Any
  ): js.Promise[QueryResponse] = js.native
  
  /**
    * Run the Query Lambda version associated with a given tag.
    * @summary Run Query Lambda By Tag
    * @param {string} workspace name of the workspace
    * @param {string} queryLambda name of the Query Lambda
    * @param {string} tag tag
    * @param {ExecuteQueryLambdaRequest} [body] JSON object
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String): js.Promise[QueryResponse] = js.native
  def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String, body: Unit, options: Any): js.Promise[QueryResponse] = js.native
  def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String, body: ExecuteQueryLambdaRequest): js.Promise[QueryResponse] = js.native
  def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String, body: ExecuteQueryLambdaRequest, options: Any): js.Promise[QueryResponse] = js.native
  
  /**
    * Get the specific Query Lambda version associated with a given tag
    * @summary Get Query Lambda Tag
    * @param {string} workspace name of the workspace
    * @param {string} queryLambda name of the Query Lambda
    * @param {string} tag name of the tag
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def getQueryLambdaTagVersion(workspace: String, queryLambda: String, tag: String): js.Promise[QueryLambdaTagResponse] = js.native
  def getQueryLambdaTagVersion(workspace: String, queryLambda: String, tag: String, options: Any): js.Promise[QueryLambdaTagResponse] = js.native
  
  /**
    * Get a specific version of a Query Lambda
    * @summary Get Query Lambda Version
    * @param {string} workspace name of the workspace
    * @param {string} queryLambda name of the Query Lambda
    * @param {string} version version
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def getQueryLambdaVersion(workspace: String, queryLambda: String, version: String): js.Promise[QueryLambdaVersionResponse] = js.native
  def getQueryLambdaVersion(workspace: String, queryLambda: String, version: String, options: Any): js.Promise[QueryLambdaVersionResponse] = js.native
  
  /**
    * List all Query Lambdas.
    * @summary List Query Lambdas
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def listAllQueryLambdas(): js.Promise[ListQueryLambdasResponse] = js.native
  def listAllQueryLambdas(options: Any): js.Promise[ListQueryLambdasResponse] = js.native
  
  /**
    * List all tags in an organization
    * @summary List Query Lambda Tags
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def listOrganizationTags(): js.Promise[ListQueryLambdaTagsResponse] = js.native
  def listOrganizationTags(options: Any): js.Promise[ListQueryLambdaTagsResponse] = js.native
  
  /**
    * List all Query Lambda versions associated with a tag
    * @summary List Query Lambda Tag Versions
    * @param {string} tag name of the tag
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def listQueryLambdaTagVersions(tag: String): js.Promise[ListQueryLambdaVersionsResponse] = js.native
  def listQueryLambdaTagVersions(tag: String, options: Any): js.Promise[ListQueryLambdaVersionsResponse] = js.native
  
  /**
    * List all tags associated with a Query Lambda
    * @summary List Query Lambda Tags
    * @param {string} workspace name of the workspace
    * @param {string} queryLambda name of the Query Lambda
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def listQueryLambdaTags(workspace: String, queryLambda: String): js.Promise[ListQueryLambdaTagsResponse] = js.native
  def listQueryLambdaTags(workspace: String, queryLambda: String, options: Any): js.Promise[ListQueryLambdaTagsResponse] = js.native
  
  /**
    * List all versions of a Query Lambda.
    * @summary List Query Lambda Versions
    * @param {string} workspace name of the workspace
    * @param {string} queryLambda name of the Query Lambda
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def listQueryLambdaVersions(workspace: String, queryLambda: String): js.Promise[ListQueryLambdaVersionsResponse] = js.native
  def listQueryLambdaVersions(workspace: String, queryLambda: String, options: Any): js.Promise[ListQueryLambdaVersionsResponse] = js.native
  
  /**
    * List all Query Lambdas under given workspace.
    * @summary List Query Lambdas
    * @param {string} workspace name of the workspace
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def listQueryLambdasInWorkspace(workspace: String): js.Promise[ListQueryLambdasResponse] = js.native
  def listQueryLambdasInWorkspace(workspace: String, options: Any): js.Promise[ListQueryLambdasResponse] = js.native
  
  /**
    * Create a new version of a Query Lambda in given workspace.
    * @summary Update Query Lambda
    * @param {string} workspace name of the workspace
    * @param {string} queryLambda name of the Query Lambda
    * @param {UpdateQueryLambdaRequest} body JSON object
    * @param {boolean} [create]
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof QueryLambdasApi
    */
  def updateQueryLambda(workspace: String, queryLambda: String, body: UpdateQueryLambdaRequest): js.Promise[QueryLambdaVersionResponse] = js.native
  def updateQueryLambda(workspace: String, queryLambda: String, body: UpdateQueryLambdaRequest, create: Boolean): js.Promise[QueryLambdaVersionResponse] = js.native
  def updateQueryLambda(
    workspace: String,
    queryLambda: String,
    body: UpdateQueryLambdaRequest,
    create: Boolean,
    options: Any
  ): js.Promise[QueryLambdaVersionResponse] = js.native
  def updateQueryLambda(workspace: String, queryLambda: String, body: UpdateQueryLambdaRequest, create: Unit, options: Any): js.Promise[QueryLambdaVersionResponse] = js.native
}
