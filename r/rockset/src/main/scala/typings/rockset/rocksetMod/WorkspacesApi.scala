package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspacesApi extends js.Object {
  def child(workspace: String): ListWorkspacesResponse = js.native
  def child(workspace: String, callback: RequestCallback): ListWorkspacesResponse = js.native
  def create(body: CreateWorkspaceRequest): CreateWorkspaceRequest = js.native
  def create(body: CreateWorkspaceRequest, callback: RequestCallback): CreateWorkspaceRequest = js.native
  def get(workspace: String): GetWorkspaceResponse = js.native
  def get(workspace: String, callback: RequestCallback): GetWorkspaceResponse = js.native
  def list(): ListWorkspacesResponse = js.native
  def list(callback: RequestCallback): ListWorkspacesResponse = js.native
  def remove(workspace: String): DeleteWorkspaceResponse = js.native
  def remove(workspace: String, callback: RequestCallback): DeleteWorkspaceResponse = js.native
}

