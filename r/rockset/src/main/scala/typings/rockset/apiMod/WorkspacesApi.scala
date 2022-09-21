package typings.rockset.apiMod

import typings.rockset.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen/api", "WorkspacesApi")
@js.native
open class WorkspacesApi () extends BaseAPI {
  def this(configuration: Configuration) = this()
  def this(configuration: Unit, basePath: String) = this()
  def this(configuration: Configuration, basePath: String) = this()
  def this(configuration: Unit, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Unit, basePath: Unit, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: Unit, fetch: FetchAPI) = this()
  
  /**
    * List workspaces under given workspace.
    * @summary List Workspaces
    * @param {string} workspace name of the workspace
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof WorkspacesApi
    */
  def childWorkspaces(workspace: String): js.Promise[ListWorkspacesResponse] = js.native
  def childWorkspaces(workspace: String, options: Any): js.Promise[ListWorkspacesResponse] = js.native
  
  /**
    * Create a new workspace in your org.
    * @summary Create Workspace
    * @param {CreateWorkspaceRequest} body workspace details
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof WorkspacesApi
    */
  def createWorkspace(body: CreateWorkspaceRequest): js.Promise[CreateWorkspaceResponse] = js.native
  def createWorkspace(body: CreateWorkspaceRequest, options: Any): js.Promise[CreateWorkspaceResponse] = js.native
  
  /**
    * Remove a workspace.
    * @summary Delete Workspace
    * @param {string} workspace name of the workspace
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof WorkspacesApi
    */
  def deleteWorkspace(workspace: String): js.Promise[DeleteWorkspaceResponse] = js.native
  def deleteWorkspace(workspace: String, options: Any): js.Promise[DeleteWorkspaceResponse] = js.native
  
  /**
    * Get information about a single workspace.
    * @summary Get Workspace
    * @param {string} workspace name of the workspace
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof WorkspacesApi
    */
  def getWorkspace(workspace: String): js.Promise[GetWorkspaceResponse] = js.native
  def getWorkspace(workspace: String, options: Any): js.Promise[GetWorkspaceResponse] = js.native
  
  /**
    * List all workspaces.
    * @summary List Workspaces
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof WorkspacesApi
    */
  def listWorkspaces(): js.Promise[ListWorkspacesResponse] = js.native
  def listWorkspaces(options: Any): js.Promise[ListWorkspacesResponse] = js.native
}
