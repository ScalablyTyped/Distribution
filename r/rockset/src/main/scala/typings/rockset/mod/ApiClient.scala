package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiClient extends js.Object {
  var apiKeys: ApiKeysApi = js.native
  var collections: CollectionsApi = js.native
  var documents: DocumentsApi = js.native
  var integrations: IntegrationsApi = js.native
  var organizations: OrganizationsApi = js.native
  var queries: QueriesApi = js.native
  var users: UsersApi = js.native
  var workspaces: WorkspacesApi = js.native
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
    val __obj = js.Dynamic.literal(apiKeys = apiKeys.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], integrations = integrations.asInstanceOf[js.Any], organizations = organizations.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiClient]
  }
  @scala.inline
  implicit class ApiClientOps[Self <: ApiClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiKeys(value: ApiKeysApi): Self = this.set("apiKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollections(value: CollectionsApi): Self = this.set("collections", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocuments(value: DocumentsApi): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegrations(value: IntegrationsApi): Self = this.set("integrations", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizations(value: OrganizationsApi): Self = this.set("organizations", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueries(value: QueriesApi): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsers(value: UsersApi): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkspaces(value: WorkspacesApi): Self = this.set("workspaces", value.asInstanceOf[js.Any])
  }
  
}

