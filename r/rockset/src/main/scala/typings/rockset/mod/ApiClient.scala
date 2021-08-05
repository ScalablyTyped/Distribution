package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiClient extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: ApiClient](x: Self) {
    
    inline def setApiKeys(value: ApiKeysApi): Self = StObject.set(x, "apiKeys", value.asInstanceOf[js.Any])
    
    inline def setCollections(value: CollectionsApi): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setDocuments(value: DocumentsApi): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setIntegrations(value: IntegrationsApi): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setOrganizations(value: OrganizationsApi): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setQueries(value: QueriesApi): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: UsersApi): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setWorkspaces(value: WorkspacesApi): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
  }
}
