package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspacesApi extends js.Object {
  def child(workspace: java.lang.String): ListWorkspacesResponse = js.native
  def child(workspace: java.lang.String, callback: RequestCallback): ListWorkspacesResponse = js.native
  def create(body: CreateWorkspaceRequest): CreateWorkspaceRequest = js.native
  def create(body: CreateWorkspaceRequest, callback: RequestCallback): CreateWorkspaceRequest = js.native
  def get(workspace: java.lang.String): GetWorkspaceResponse = js.native
  def get(workspace: java.lang.String, callback: RequestCallback): GetWorkspaceResponse = js.native
  def list(): ListWorkspacesResponse = js.native
  def list(callback: RequestCallback): ListWorkspacesResponse = js.native
  def remove(workspace: java.lang.String): DeleteWorkspaceResponse = js.native
  def remove(workspace: java.lang.String, callback: RequestCallback): DeleteWorkspaceResponse = js.native
}

