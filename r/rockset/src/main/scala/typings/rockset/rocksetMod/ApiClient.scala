package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiClient extends js.Object {
  var apiKeys: ApiKeysApi
  var collections: CollectionsApi
  var documents: DocumentsApi
  var integrations: IntegrationsApi
  var organizations: OrganizationsApi
  var queries: QueriesApi
  var users: UsersApi
  var workspaces: WorkspacesApi
}

object ApiClient {
  @scala.inline
  def apply(
    apiKeys: ApiKeysApi,
    collections: CollectionsApi,
    documents: DocumentsApi,
    integrations: IntegrationsApi,
    organizations: OrganizationsApi,
    queries: QueriesApi,
    users: UsersApi,
    workspaces: WorkspacesApi
  ): ApiClient = {
    val __obj = js.Dynamic.literal(apiKeys = apiKeys, collections = collections, documents = documents, integrations = integrations, organizations = organizations, queries = queries, users = users, workspaces = workspaces)
  
    __obj.asInstanceOf[ApiClient]
  }
}

