package typings.rockset

import typings.rockset.apiMod.AddDocumentsRequest
import typings.rockset.apiMod.AddDocumentsResponse
import typings.rockset.apiMod.ApiKeysApi
import typings.rockset.apiMod.CollectionsApi
import typings.rockset.apiMod.CreateApiKeyRequest
import typings.rockset.apiMod.CreateApiKeyResponse
import typings.rockset.apiMod.CreateCollectionRequest
import typings.rockset.apiMod.CreateCollectionResponse
import typings.rockset.apiMod.CreateIntegrationRequest
import typings.rockset.apiMod.CreateIntegrationResponse
import typings.rockset.apiMod.CreateQueryLambdaRequest
import typings.rockset.apiMod.CreateQueryLambdaTagRequest
import typings.rockset.apiMod.CreateUserRequest
import typings.rockset.apiMod.CreateUserResponse
import typings.rockset.apiMod.CreateWorkspaceRequest
import typings.rockset.apiMod.CreateWorkspaceResponse
import typings.rockset.apiMod.DeleteApiKeyResponse
import typings.rockset.apiMod.DeleteCollectionResponse
import typings.rockset.apiMod.DeleteDocumentsRequest
import typings.rockset.apiMod.DeleteDocumentsResponse
import typings.rockset.apiMod.DeleteIntegrationResponse
import typings.rockset.apiMod.DeleteQueryLambdaResponse
import typings.rockset.apiMod.DeleteUserResponse
import typings.rockset.apiMod.DeleteWorkspaceResponse
import typings.rockset.apiMod.DocumentsApi
import typings.rockset.apiMod.ExecuteQueryLambdaRequest
import typings.rockset.apiMod.FetchAPI
import typings.rockset.apiMod.FetchArgs
import typings.rockset.apiMod.GetCollectionResponse
import typings.rockset.apiMod.GetIntegrationResponse
import typings.rockset.apiMod.GetWorkspaceResponse
import typings.rockset.apiMod.IntegrationsApi
import typings.rockset.apiMod.ListApiKeysResponse
import typings.rockset.apiMod.ListCollectionsResponse
import typings.rockset.apiMod.ListIntegrationsResponse
import typings.rockset.apiMod.ListQueryLambdaTagsResponse
import typings.rockset.apiMod.ListQueryLambdaVersionsResponse
import typings.rockset.apiMod.ListQueryLambdasResponse
import typings.rockset.apiMod.ListUsersResponse
import typings.rockset.apiMod.ListWorkspacesResponse
import typings.rockset.apiMod.OrganizationResponse
import typings.rockset.apiMod.OrganizationsApi
import typings.rockset.apiMod.PatchDocumentsRequest
import typings.rockset.apiMod.PatchDocumentsResponse
import typings.rockset.apiMod.QueriesApi
import typings.rockset.apiMod.QueryLambdaTagResponse
import typings.rockset.apiMod.QueryLambdaVersionResponse
import typings.rockset.apiMod.QueryLambdasApi
import typings.rockset.apiMod.QueryRequest
import typings.rockset.apiMod.QueryResponse
import typings.rockset.apiMod.UpdateQueryLambdaRequest
import typings.rockset.apiMod.User
import typings.rockset.apiMod.UsersApi
import typings.rockset.apiMod.WorkspacesApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    /**
      * Retrieve information about current organization.
      * @summary Get Organization
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getOrganization(): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[OrganizationResponse]
      ] = js.native
    def getOrganization(options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[OrganizationResponse]
      ] = js.native
  }
  
  @js.native
  trait `1` extends StObject {
    
    /**
      * Retrieve information about current organization.
      * @summary Get Organization
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getOrganization(): js.Promise[OrganizationResponse] = js.native
    def getOrganization(options: Any): js.Promise[OrganizationResponse] = js.native
  }
  
  @js.native
  trait `2` extends StObject {
    
    /**
      * Make a SQL query to Rockset.
      * @summary Query
      * @param {QueryRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def query(body: QueryRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryResponse]
      ] = js.native
    def query(body: QueryRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryResponse]
      ] = js.native
  }
  
  @js.native
  trait `3` extends StObject {
    
    /**
      * Make a SQL query to Rockset.
      * @summary Query
      * @param {QueryRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def query(body: QueryRequest): js.Promise[QueryResponse] = js.native
    def query(body: QueryRequest, options: Any): js.Promise[QueryResponse] = js.native
  }
  
  @js.native
  trait AddDocuments extends StObject {
    
    /**
      * Add documents to a collection in Rockset.
      * @summary Add Documents
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {AddDocumentsRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def addDocuments(workspace: String, collection: String, body: AddDocumentsRequest): FetchArgs = js.native
    def addDocuments(workspace: String, collection: String, body: AddDocumentsRequest, options: Any): FetchArgs = js.native
    
    /**
      * Delete documents from a collection in Rockset.
      * @summary Delete Documents
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {DeleteDocumentsRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteDocuments(workspace: String, collection: String, body: DeleteDocumentsRequest): FetchArgs = js.native
    def deleteDocuments(workspace: String, collection: String, body: DeleteDocumentsRequest, options: Any): FetchArgs = js.native
    
    /**
      * Patch documents in a collection
      * @summary Patch Documents
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {PatchDocumentsRequest} body JSON Patch objects
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def patchDocuments(workspace: String, collection: String, body: PatchDocumentsRequest): FetchArgs = js.native
    def patchDocuments(workspace: String, collection: String, body: PatchDocumentsRequest, options: Any): FetchArgs = js.native
  }
  
  trait Apikeys extends StObject {
    
    var apikeys: ApiKeysApi
    
    var collections: CollectionsApi
    
    var documents: DocumentsApi
    
    var integrations: IntegrationsApi
    
    var orgs: OrganizationsApi
    
    var queries: QueriesApi
    
    var queryLambdas: QueryLambdasApi
    
    var users: UsersApi
    
    var workspaces: WorkspacesApi
  }
  object Apikeys {
    
    inline def apply(
      apikeys: ApiKeysApi,
      collections: CollectionsApi,
      documents: DocumentsApi,
      integrations: IntegrationsApi,
      orgs: OrganizationsApi,
      queries: QueriesApi,
      queryLambdas: QueryLambdasApi,
      users: UsersApi,
      workspaces: WorkspacesApi
    ): Apikeys = {
      val __obj = js.Dynamic.literal(apikeys = apikeys.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], integrations = integrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], queryLambdas = queryLambdas.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
      __obj.asInstanceOf[Apikeys]
    }
    
    extension [Self <: Apikeys](x: Self) {
      
      inline def setApikeys(value: ApiKeysApi): Self = StObject.set(x, "apikeys", value.asInstanceOf[js.Any])
      
      inline def setCollections(value: CollectionsApi): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      inline def setDocuments(value: DocumentsApi): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
      
      inline def setIntegrations(value: IntegrationsApi): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setOrgs(value: OrganizationsApi): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
      
      inline def setQueries(value: QueriesApi): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueryLambdas(value: QueryLambdasApi): Self = StObject.set(x, "queryLambdas", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: UsersApi): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setWorkspaces(value: WorkspacesApi): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ChildWorkspaces extends StObject {
    
    /**
      * List workspaces under given workspace.
      * @summary List Workspaces
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def childWorkspaces(workspace: String): FetchArgs = js.native
    def childWorkspaces(workspace: String, options: Any): FetchArgs = js.native
    
    /**
      * Create a new workspace in your org.
      * @summary Create Workspace
      * @param {CreateWorkspaceRequest} body workspace details
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createWorkspace(body: CreateWorkspaceRequest): FetchArgs = js.native
    def createWorkspace(body: CreateWorkspaceRequest, options: Any): FetchArgs = js.native
    
    /**
      * Remove a workspace.
      * @summary Delete Workspace
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteWorkspace(workspace: String): FetchArgs = js.native
    def deleteWorkspace(workspace: String, options: Any): FetchArgs = js.native
    
    /**
      * Get information about a single workspace.
      * @summary Get Workspace
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getWorkspace(workspace: String): FetchArgs = js.native
    def getWorkspace(workspace: String, options: Any): FetchArgs = js.native
    
    /**
      * List all workspaces.
      * @summary List Workspaces
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listWorkspaces(): FetchArgs = js.native
    def listWorkspaces(options: Any): FetchArgs = js.native
  }
  
  @js.native
  trait CreateApiKey extends StObject {
    
    /**
      * Create a new API key for the authenticated user.
      * @summary Create API Key
      * @param {CreateApiKeyRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createApiKey(body: CreateApiKeyRequest): FetchArgs = js.native
    def createApiKey(body: CreateApiKeyRequest, options: Any): FetchArgs = js.native
    
    /**
      * Create a new API key for any user (admin only).
      * @summary Create API Key for any user (admin only)
      * @param {CreateApiKeyRequest} body JSON object
      * @param {string} user
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createApiKeyAdmin(body: CreateApiKeyRequest, user: String): FetchArgs = js.native
    def createApiKeyAdmin(body: CreateApiKeyRequest, user: String, options: Any): FetchArgs = js.native
    
    /**
      * Delete an API key for the authenticated user.
      * @summary Delete API Key
      * @param {string} name name of the API key
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteApiKey(name: String): FetchArgs = js.native
    def deleteApiKey(name: String, options: Any): FetchArgs = js.native
    
    /**
      * Delete an API key for any user (admin only).
      * @summary Delete API Key for any user (admin only)
      * @param {string} name name of the API key
      * @param {string} user
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteApiKeyAdmin(name: String, user: String): FetchArgs = js.native
    def deleteApiKeyAdmin(name: String, user: String, options: Any): FetchArgs = js.native
    
    /**
      * List all API keys for the authenticated user.
      * @summary List API Keys
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listApiKeys(): FetchArgs = js.native
    def listApiKeys(options: Any): FetchArgs = js.native
    
    /**
      * List all API keys for any user (admin only).
      * @summary List API Keys for any user (admin only)
      * @param {string} user
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listApiKeysAdmin(user: String): FetchArgs = js.native
    def listApiKeysAdmin(user: String, options: Any): FetchArgs = js.native
  }
  
  @js.native
  trait CreateApiKeyAdmin extends StObject {
    
    /**
      * Create a new API key for the authenticated user.
      * @summary Create API Key
      * @param {CreateApiKeyRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createApiKey(body: CreateApiKeyRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateApiKeyResponse]
      ] = js.native
    def createApiKey(body: CreateApiKeyRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateApiKeyResponse]
      ] = js.native
    
    /**
      * Create a new API key for any user (admin only).
      * @summary Create API Key for any user (admin only)
      * @param {CreateApiKeyRequest} body JSON object
      * @param {string} user
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createApiKeyAdmin(body: CreateApiKeyRequest, user: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateApiKeyResponse]
      ] = js.native
    def createApiKeyAdmin(body: CreateApiKeyRequest, user: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateApiKeyResponse]
      ] = js.native
    
    /**
      * Delete an API key for the authenticated user.
      * @summary Delete API Key
      * @param {string} name name of the API key
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteApiKey(name: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteApiKeyResponse]
      ] = js.native
    def deleteApiKey(name: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteApiKeyResponse]
      ] = js.native
    
    /**
      * Delete an API key for any user (admin only).
      * @summary Delete API Key for any user (admin only)
      * @param {string} name name of the API key
      * @param {string} user
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteApiKeyAdmin(name: String, user: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteApiKeyResponse]
      ] = js.native
    def deleteApiKeyAdmin(name: String, user: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteApiKeyResponse]
      ] = js.native
    
    /**
      * List all API keys for the authenticated user.
      * @summary List API Keys
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listApiKeys(): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListApiKeysResponse]
      ] = js.native
    def listApiKeys(options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListApiKeysResponse]
      ] = js.native
    
    /**
      * List all API keys for any user (admin only).
      * @summary List API Keys for any user (admin only)
      * @param {string} user
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listApiKeysAdmin(user: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListApiKeysResponse]
      ] = js.native
    def listApiKeysAdmin(user: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListApiKeysResponse]
      ] = js.native
  }
  
  @js.native
  trait CreateCollection extends StObject {
    
    /**
      * Create new collection in a workspace.
      * @summary Create Collection
      * @param {string} workspace name of the workspace
      * @param {CreateCollectionRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createCollection(workspace: String, body: CreateCollectionRequest): FetchArgs = js.native
    def createCollection(workspace: String, body: CreateCollectionRequest, options: Any): FetchArgs = js.native
    
    /**
      * Delete a collection and all its documents from Rockset.
      * @summary Delete Collection
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteCollection(workspace: String, collection: String): FetchArgs = js.native
    def deleteCollection(workspace: String, collection: String, options: Any): FetchArgs = js.native
    
    /**
      * Get details about a collection.
      * @summary Get Collection
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getCollection(workspace: String, collection: String): FetchArgs = js.native
    def getCollection(workspace: String, collection: String, options: Any): FetchArgs = js.native
    
    /**
      * Retrieve all collections in an organization.
      * @summary List Collections
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listCollections(): FetchArgs = js.native
    def listCollections(options: Any): FetchArgs = js.native
    
    /**
      * Get all Query Lambdas that hit a specific Rockset Collection.
      * @summary Get Query Lambdas
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listQueryLambdasInCollection(workspace: String, collection: String): FetchArgs = js.native
    def listQueryLambdasInCollection(workspace: String, collection: String, options: Any): FetchArgs = js.native
    
    /**
      * Retrieve all collections in a workspace.
      * @summary List Collections for Workspace
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def workspaceCollections(workspace: String): FetchArgs = js.native
    def workspaceCollections(workspace: String, options: Any): FetchArgs = js.native
  }
  
  @js.native
  trait CreateIntegration extends StObject {
    
    /**
      * Create a new integration with Rockset.
      * @summary Create Integration
      * @param {CreateIntegrationRequest} body integration credentials
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createIntegration(body: CreateIntegrationRequest): FetchArgs = js.native
    def createIntegration(body: CreateIntegrationRequest, options: Any): FetchArgs = js.native
    
    /**
      * Remove an integration.
      * @summary Delete Integration
      * @param {string} integration name of the integration
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteIntegration(integration: String): FetchArgs = js.native
    def deleteIntegration(integration: String, options: Any): FetchArgs = js.native
    
    /**
      * Get information about a single integration.
      * @summary Get Integration
      * @param {string} integration name of the integration
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getIntegration(integration: String): FetchArgs = js.native
    def getIntegration(integration: String, options: Any): FetchArgs = js.native
    
    /**
      * List all integrations for organization.
      * @summary List Integrations
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listIntegrations(): FetchArgs = js.native
    def listIntegrations(options: Any): FetchArgs = js.native
  }
  
  @js.native
  trait CreateQueryLambda extends StObject {
    
    /**
      * Create a Query Lambda in given workspace.
      * @summary Create Query Lambda
      * @param {string} workspace name of the workspace
      * @param {CreateQueryLambdaRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createQueryLambda(workspace: String, body: CreateQueryLambdaRequest): FetchArgs = js.native
    def createQueryLambda(workspace: String, body: CreateQueryLambdaRequest, options: Any): FetchArgs = js.native
    
    /**
      * Create a tag for a specific Query Lambda version, or update if it exists
      * @summary Create Query Lambda Tag
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {CreateQueryLambdaTagRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createQueryLambdaTag(workspace: String, queryLambda: String, body: CreateQueryLambdaTagRequest): FetchArgs = js.native
    def createQueryLambdaTag(workspace: String, queryLambda: String, body: CreateQueryLambdaTagRequest, options: Any): FetchArgs = js.native
    
    /**
      * Delete a Query Lambda.
      * @summary Delete Query Lambda
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteQueryLambda(workspace: String, queryLambda: String): FetchArgs = js.native
    def deleteQueryLambda(workspace: String, queryLambda: String, options: Any): FetchArgs = js.native
    
    /**
      * Delete a tag for a specific Query Lambda
      * @summary Delete Query Lambda Tag Version
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} tag name of the tag
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteQueryLambdaTag(workspace: String, queryLambda: String, tag: String): FetchArgs = js.native
    def deleteQueryLambdaTag(workspace: String, queryLambda: String, tag: String, options: Any): FetchArgs = js.native
    
    /**
      * Delete a Query Lambda version.
      * @summary Delete Query Lambda Version
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} version version
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteQueryLambdaVersion(workspace: String, queryLambda: String, version: String): FetchArgs = js.native
    def deleteQueryLambdaVersion(workspace: String, queryLambda: String, version: String, options: Any): FetchArgs = js.native
    
    /**
      * Run a particular version of a Query Lambda.
      * @summary Run Query Lambda
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} version version
      * @param {ExecuteQueryLambdaRequest} [body] JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def executeQueryLambda(workspace: String, queryLambda: String, version: String): FetchArgs = js.native
    def executeQueryLambda(workspace: String, queryLambda: String, version: String, body: Unit, options: Any): FetchArgs = js.native
    def executeQueryLambda(workspace: String, queryLambda: String, version: String, body: ExecuteQueryLambdaRequest): FetchArgs = js.native
    def executeQueryLambda(
      workspace: String,
      queryLambda: String,
      version: String,
      body: ExecuteQueryLambdaRequest,
      options: Any
    ): FetchArgs = js.native
    
    /**
      * Run the Query Lambda version associated with a given tag.
      * @summary Run Query Lambda By Tag
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} tag tag
      * @param {ExecuteQueryLambdaRequest} [body] JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String): FetchArgs = js.native
    def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String, body: Unit, options: Any): FetchArgs = js.native
    def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String, body: ExecuteQueryLambdaRequest): FetchArgs = js.native
    def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String, body: ExecuteQueryLambdaRequest, options: Any): FetchArgs = js.native
    
    /**
      * Get the specific Query Lambda version associated with a given tag
      * @summary Get Query Lambda Tag
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} tag name of the tag
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getQueryLambdaTagVersion(workspace: String, queryLambda: String, tag: String): FetchArgs = js.native
    def getQueryLambdaTagVersion(workspace: String, queryLambda: String, tag: String, options: Any): FetchArgs = js.native
    
    /**
      * Get a specific version of a Query Lambda
      * @summary Get Query Lambda Version
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} version version
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getQueryLambdaVersion(workspace: String, queryLambda: String, version: String): FetchArgs = js.native
    def getQueryLambdaVersion(workspace: String, queryLambda: String, version: String, options: Any): FetchArgs = js.native
    
    /**
      * List all Query Lambdas.
      * @summary List Query Lambdas
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listAllQueryLambdas(): FetchArgs = js.native
    def listAllQueryLambdas(options: Any): FetchArgs = js.native
    
    /**
      * List all tags in an organization
      * @summary List Query Lambda Tags
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listOrganizationTags(): FetchArgs = js.native
    def listOrganizationTags(options: Any): FetchArgs = js.native
    
    /**
      * List all Query Lambda versions associated with a tag
      * @summary List Query Lambda Tag Versions
      * @param {string} tag name of the tag
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listQueryLambdaTagVersions(tag: String): FetchArgs = js.native
    def listQueryLambdaTagVersions(tag: String, options: Any): FetchArgs = js.native
    
    /**
      * List all tags associated with a Query Lambda
      * @summary List Query Lambda Tags
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listQueryLambdaTags(workspace: String, queryLambda: String): FetchArgs = js.native
    def listQueryLambdaTags(workspace: String, queryLambda: String, options: Any): FetchArgs = js.native
    
    /**
      * List all versions of a Query Lambda.
      * @summary List Query Lambda Versions
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listQueryLambdaVersions(workspace: String, queryLambda: String): FetchArgs = js.native
    def listQueryLambdaVersions(workspace: String, queryLambda: String, options: Any): FetchArgs = js.native
    
    /**
      * List all Query Lambdas under given workspace.
      * @summary List Query Lambdas
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listQueryLambdasInWorkspace(workspace: String): FetchArgs = js.native
    def listQueryLambdasInWorkspace(workspace: String, options: Any): FetchArgs = js.native
    
    /**
      * Create a new version of a Query Lambda in given workspace.
      * @summary Update Query Lambda
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {UpdateQueryLambdaRequest} body JSON object
      * @param {boolean} [create]
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def updateQueryLambda(workspace: String, queryLambda: String, body: UpdateQueryLambdaRequest): FetchArgs = js.native
    def updateQueryLambda(workspace: String, queryLambda: String, body: UpdateQueryLambdaRequest, create: Boolean): FetchArgs = js.native
    def updateQueryLambda(
      workspace: String,
      queryLambda: String,
      body: UpdateQueryLambdaRequest,
      create: Boolean,
      options: Any
    ): FetchArgs = js.native
    def updateQueryLambda(workspace: String, queryLambda: String, body: UpdateQueryLambdaRequest, create: Unit, options: Any): FetchArgs = js.native
  }
  
  @js.native
  trait CreateQueryLambdaTag extends StObject {
    
    /**
      * Create a Query Lambda in given workspace.
      * @summary Create Query Lambda
      * @param {string} workspace name of the workspace
      * @param {CreateQueryLambdaRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createQueryLambda(workspace: String, body: CreateQueryLambdaRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaVersionResponse]
      ] = js.native
    def createQueryLambda(workspace: String, body: CreateQueryLambdaRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaVersionResponse]
      ] = js.native
    
    /**
      * Create a tag for a specific Query Lambda version, or update if it exists
      * @summary Create Query Lambda Tag
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {CreateQueryLambdaTagRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createQueryLambdaTag(workspace: String, queryLambda: String, body: CreateQueryLambdaTagRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaTagResponse]
      ] = js.native
    def createQueryLambdaTag(workspace: String, queryLambda: String, body: CreateQueryLambdaTagRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaTagResponse]
      ] = js.native
    
    /**
      * Delete a Query Lambda.
      * @summary Delete Query Lambda
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteQueryLambda(workspace: String, queryLambda: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteQueryLambdaResponse]
      ] = js.native
    def deleteQueryLambda(workspace: String, queryLambda: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteQueryLambdaResponse]
      ] = js.native
    
    /**
      * Delete a tag for a specific Query Lambda
      * @summary Delete Query Lambda Tag Version
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} tag name of the tag
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteQueryLambdaTag(workspace: String, queryLambda: String, tag: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaTagResponse]
      ] = js.native
    def deleteQueryLambdaTag(workspace: String, queryLambda: String, tag: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaTagResponse]
      ] = js.native
    
    /**
      * Delete a Query Lambda version.
      * @summary Delete Query Lambda Version
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} version version
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteQueryLambdaVersion(workspace: String, queryLambda: String, version: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaVersionResponse]
      ] = js.native
    def deleteQueryLambdaVersion(workspace: String, queryLambda: String, version: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaVersionResponse]
      ] = js.native
    
    /**
      * Run a particular version of a Query Lambda.
      * @summary Run Query Lambda
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} version version
      * @param {ExecuteQueryLambdaRequest} [body] JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def executeQueryLambda(workspace: String, queryLambda: String, version: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryResponse]
      ] = js.native
    def executeQueryLambda(workspace: String, queryLambda: String, version: String, body: Unit, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryResponse]
      ] = js.native
    def executeQueryLambda(workspace: String, queryLambda: String, version: String, body: ExecuteQueryLambdaRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryResponse]
      ] = js.native
    def executeQueryLambda(
      workspace: String,
      queryLambda: String,
      version: String,
      body: ExecuteQueryLambdaRequest,
      options: Any
    ): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryResponse]
      ] = js.native
    
    /**
      * Run the Query Lambda version associated with a given tag.
      * @summary Run Query Lambda By Tag
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} tag tag
      * @param {ExecuteQueryLambdaRequest} [body] JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryResponse]
      ] = js.native
    def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String, body: Unit, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryResponse]
      ] = js.native
    def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String, body: ExecuteQueryLambdaRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryResponse]
      ] = js.native
    def executeQueryLambdaByTag(workspace: String, queryLambda: String, tag: String, body: ExecuteQueryLambdaRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryResponse]
      ] = js.native
    
    /**
      * Get the specific Query Lambda version associated with a given tag
      * @summary Get Query Lambda Tag
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} tag name of the tag
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getQueryLambdaTagVersion(workspace: String, queryLambda: String, tag: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaTagResponse]
      ] = js.native
    def getQueryLambdaTagVersion(workspace: String, queryLambda: String, tag: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaTagResponse]
      ] = js.native
    
    /**
      * Get a specific version of a Query Lambda
      * @summary Get Query Lambda Version
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {string} version version
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getQueryLambdaVersion(workspace: String, queryLambda: String, version: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaVersionResponse]
      ] = js.native
    def getQueryLambdaVersion(workspace: String, queryLambda: String, version: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaVersionResponse]
      ] = js.native
    
    /**
      * List all Query Lambdas.
      * @summary List Query Lambdas
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listAllQueryLambdas(): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdasResponse]
      ] = js.native
    def listAllQueryLambdas(options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdasResponse]
      ] = js.native
    
    /**
      * List all tags in an organization
      * @summary List Query Lambda Tags
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listOrganizationTags(): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdaTagsResponse]
      ] = js.native
    def listOrganizationTags(options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdaTagsResponse]
      ] = js.native
    
    /**
      * List all Query Lambda versions associated with a tag
      * @summary List Query Lambda Tag Versions
      * @param {string} tag name of the tag
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listQueryLambdaTagVersions(tag: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdaVersionsResponse]
      ] = js.native
    def listQueryLambdaTagVersions(tag: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdaVersionsResponse]
      ] = js.native
    
    /**
      * List all tags associated with a Query Lambda
      * @summary List Query Lambda Tags
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listQueryLambdaTags(workspace: String, queryLambda: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdaTagsResponse]
      ] = js.native
    def listQueryLambdaTags(workspace: String, queryLambda: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdaTagsResponse]
      ] = js.native
    
    /**
      * List all versions of a Query Lambda.
      * @summary List Query Lambda Versions
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listQueryLambdaVersions(workspace: String, queryLambda: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdaVersionsResponse]
      ] = js.native
    def listQueryLambdaVersions(workspace: String, queryLambda: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdaVersionsResponse]
      ] = js.native
    
    /**
      * List all Query Lambdas under given workspace.
      * @summary List Query Lambdas
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listQueryLambdasInWorkspace(workspace: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdasResponse]
      ] = js.native
    def listQueryLambdasInWorkspace(workspace: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdasResponse]
      ] = js.native
    
    /**
      * Create a new version of a Query Lambda in given workspace.
      * @summary Update Query Lambda
      * @param {string} workspace name of the workspace
      * @param {string} queryLambda name of the Query Lambda
      * @param {UpdateQueryLambdaRequest} body JSON object
      * @param {boolean} [create]
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def updateQueryLambda(workspace: String, queryLambda: String, body: UpdateQueryLambdaRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaVersionResponse]
      ] = js.native
    def updateQueryLambda(workspace: String, queryLambda: String, body: UpdateQueryLambdaRequest, create: Boolean): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaVersionResponse]
      ] = js.native
    def updateQueryLambda(
      workspace: String,
      queryLambda: String,
      body: UpdateQueryLambdaRequest,
      create: Boolean,
      options: Any
    ): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaVersionResponse]
      ] = js.native
    def updateQueryLambda(workspace: String, queryLambda: String, body: UpdateQueryLambdaRequest, create: Unit, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[QueryLambdaVersionResponse]
      ] = js.native
  }
  
  @js.native
  trait CreateUser extends StObject {
    
    /**
      * Create a new user for an organization.
      * @summary Create User
      * @param {CreateUserRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createUser(body: CreateUserRequest): FetchArgs = js.native
    def createUser(body: CreateUserRequest, options: Any): FetchArgs = js.native
    
    /**
      * Delete a user from an organization.
      * @summary Delete User
      * @param {string} user user email
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteUser(user: String): FetchArgs = js.native
    def deleteUser(user: String, options: Any): FetchArgs = js.native
    
    /**
      * Retrieve currently active user.
      * @summary Get Current User
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getCurrentUser(): FetchArgs = js.native
    def getCurrentUser(options: Any): FetchArgs = js.native
    
    /**
      * Retrieve all users for an organization.
      * @summary List Users
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listUsers(): FetchArgs = js.native
    def listUsers(options: Any): FetchArgs = js.native
  }
  
  @js.native
  trait CreateWorkspace extends StObject {
    
    /**
      * List workspaces under given workspace.
      * @summary List Workspaces
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def childWorkspaces(workspace: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListWorkspacesResponse]
      ] = js.native
    def childWorkspaces(workspace: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListWorkspacesResponse]
      ] = js.native
    
    /**
      * Create a new workspace in your org.
      * @summary Create Workspace
      * @param {CreateWorkspaceRequest} body workspace details
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createWorkspace(body: CreateWorkspaceRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateWorkspaceResponse]
      ] = js.native
    def createWorkspace(body: CreateWorkspaceRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateWorkspaceResponse]
      ] = js.native
    
    /**
      * Remove a workspace.
      * @summary Delete Workspace
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteWorkspace(workspace: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteWorkspaceResponse]
      ] = js.native
    def deleteWorkspace(workspace: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteWorkspaceResponse]
      ] = js.native
    
    /**
      * Get information about a single workspace.
      * @summary Get Workspace
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getWorkspace(workspace: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[GetWorkspaceResponse]
      ] = js.native
    def getWorkspace(workspace: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[GetWorkspaceResponse]
      ] = js.native
    
    /**
      * List all workspaces.
      * @summary List Workspaces
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listWorkspaces(): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListWorkspacesResponse]
      ] = js.native
    def listWorkspaces(options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListWorkspacesResponse]
      ] = js.native
  }
  
  @js.native
  trait DeleteApiKey extends StObject {
    
    /**
      * Create a new API key for the authenticated user.
      * @summary Create API Key
      * @param {CreateApiKeyRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
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
      */
    def createApiKeyAdmin(body: CreateApiKeyRequest, user: String): js.Promise[CreateApiKeyResponse] = js.native
    def createApiKeyAdmin(body: CreateApiKeyRequest, user: String, options: Any): js.Promise[CreateApiKeyResponse] = js.native
    
    /**
      * Delete an API key for the authenticated user.
      * @summary Delete API Key
      * @param {string} name name of the API key
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
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
      */
    def deleteApiKeyAdmin(name: String, user: String): js.Promise[DeleteApiKeyResponse] = js.native
    def deleteApiKeyAdmin(name: String, user: String, options: Any): js.Promise[DeleteApiKeyResponse] = js.native
    
    /**
      * List all API keys for the authenticated user.
      * @summary List API Keys
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listApiKeys(): js.Promise[ListApiKeysResponse] = js.native
    def listApiKeys(options: Any): js.Promise[ListApiKeysResponse] = js.native
    
    /**
      * List all API keys for any user (admin only).
      * @summary List API Keys for any user (admin only)
      * @param {string} user
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listApiKeysAdmin(user: String): js.Promise[ListApiKeysResponse] = js.native
    def listApiKeysAdmin(user: String, options: Any): js.Promise[ListApiKeysResponse] = js.native
  }
  
  @js.native
  trait DeleteCollection extends StObject {
    
    /**
      * Create new collection in a workspace.
      * @summary Create Collection
      * @param {string} workspace name of the workspace
      * @param {CreateCollectionRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createCollection(workspace: String, body: CreateCollectionRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateCollectionResponse]
      ] = js.native
    def createCollection(workspace: String, body: CreateCollectionRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateCollectionResponse]
      ] = js.native
    
    /**
      * Delete a collection and all its documents from Rockset.
      * @summary Delete Collection
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteCollection(workspace: String, collection: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteCollectionResponse]
      ] = js.native
    def deleteCollection(workspace: String, collection: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteCollectionResponse]
      ] = js.native
    
    /**
      * Get details about a collection.
      * @summary Get Collection
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getCollection(workspace: String, collection: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[GetCollectionResponse]
      ] = js.native
    def getCollection(workspace: String, collection: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[GetCollectionResponse]
      ] = js.native
    
    /**
      * Retrieve all collections in an organization.
      * @summary List Collections
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listCollections(): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListCollectionsResponse]
      ] = js.native
    def listCollections(options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListCollectionsResponse]
      ] = js.native
    
    /**
      * Get all Query Lambdas that hit a specific Rockset Collection.
      * @summary Get Query Lambdas
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listQueryLambdasInCollection(workspace: String, collection: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdaVersionsResponse]
      ] = js.native
    def listQueryLambdasInCollection(workspace: String, collection: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListQueryLambdaVersionsResponse]
      ] = js.native
    
    /**
      * Retrieve all collections in a workspace.
      * @summary List Collections for Workspace
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def workspaceCollections(workspace: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListCollectionsResponse]
      ] = js.native
    def workspaceCollections(workspace: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListCollectionsResponse]
      ] = js.native
  }
  
  @js.native
  trait DeleteDocuments extends StObject {
    
    /**
      * Add documents to a collection in Rockset.
      * @summary Add Documents
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {AddDocumentsRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def addDocuments(workspace: String, collection: String, body: AddDocumentsRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[AddDocumentsResponse]
      ] = js.native
    def addDocuments(workspace: String, collection: String, body: AddDocumentsRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[AddDocumentsResponse]
      ] = js.native
    
    /**
      * Delete documents from a collection in Rockset.
      * @summary Delete Documents
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {DeleteDocumentsRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteDocuments(workspace: String, collection: String, body: DeleteDocumentsRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteDocumentsResponse]
      ] = js.native
    def deleteDocuments(workspace: String, collection: String, body: DeleteDocumentsRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteDocumentsResponse]
      ] = js.native
    
    /**
      * Patch documents in a collection
      * @summary Patch Documents
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {PatchDocumentsRequest} body JSON Patch objects
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def patchDocuments(workspace: String, collection: String, body: PatchDocumentsRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[PatchDocumentsResponse]
      ] = js.native
    def patchDocuments(workspace: String, collection: String, body: PatchDocumentsRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[PatchDocumentsResponse]
      ] = js.native
  }
  
  @js.native
  trait DeleteIntegration extends StObject {
    
    /**
      * Create a new integration with Rockset.
      * @summary Create Integration
      * @param {CreateIntegrationRequest} body integration credentials
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createIntegration(body: CreateIntegrationRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateIntegrationResponse]
      ] = js.native
    def createIntegration(body: CreateIntegrationRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateIntegrationResponse]
      ] = js.native
    
    /**
      * Remove an integration.
      * @summary Delete Integration
      * @param {string} integration name of the integration
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteIntegration(integration: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteIntegrationResponse]
      ] = js.native
    def deleteIntegration(integration: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteIntegrationResponse]
      ] = js.native
    
    /**
      * Get information about a single integration.
      * @summary Get Integration
      * @param {string} integration name of the integration
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getIntegration(integration: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[GetIntegrationResponse]
      ] = js.native
    def getIntegration(integration: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[GetIntegrationResponse]
      ] = js.native
    
    /**
      * List all integrations for organization.
      * @summary List Integrations
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listIntegrations(): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListIntegrationsResponse]
      ] = js.native
    def listIntegrations(options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListIntegrationsResponse]
      ] = js.native
  }
  
  @js.native
  trait DeleteQueryLambda extends StObject {
    
    /**
      * Create a Query Lambda in given workspace.
      * @summary Create Query Lambda
      * @param {string} workspace name of the workspace
      * @param {CreateQueryLambdaRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
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
      */
    def getQueryLambdaVersion(workspace: String, queryLambda: String, version: String): js.Promise[QueryLambdaVersionResponse] = js.native
    def getQueryLambdaVersion(workspace: String, queryLambda: String, version: String, options: Any): js.Promise[QueryLambdaVersionResponse] = js.native
    
    /**
      * List all Query Lambdas.
      * @summary List Query Lambdas
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listAllQueryLambdas(): js.Promise[ListQueryLambdasResponse] = js.native
    def listAllQueryLambdas(options: Any): js.Promise[ListQueryLambdasResponse] = js.native
    
    /**
      * List all tags in an organization
      * @summary List Query Lambda Tags
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listOrganizationTags(): js.Promise[ListQueryLambdaTagsResponse] = js.native
    def listOrganizationTags(options: Any): js.Promise[ListQueryLambdaTagsResponse] = js.native
    
    /**
      * List all Query Lambda versions associated with a tag
      * @summary List Query Lambda Tag Versions
      * @param {string} tag name of the tag
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
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
      */
    def listQueryLambdaVersions(workspace: String, queryLambda: String): js.Promise[ListQueryLambdaVersionsResponse] = js.native
    def listQueryLambdaVersions(workspace: String, queryLambda: String, options: Any): js.Promise[ListQueryLambdaVersionsResponse] = js.native
    
    /**
      * List all Query Lambdas under given workspace.
      * @summary List Query Lambdas
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
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
  
  @js.native
  trait DeleteUser extends StObject {
    
    /**
      * Create a new user for an organization.
      * @summary Create User
      * @param {CreateUserRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createUser(body: CreateUserRequest): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateUserResponse]
      ] = js.native
    def createUser(body: CreateUserRequest, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[CreateUserResponse]
      ] = js.native
    
    /**
      * Delete a user from an organization.
      * @summary Delete User
      * @param {string} user user email
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteUser(user: String): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteUserResponse]
      ] = js.native
    def deleteUser(user: String, options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[DeleteUserResponse]
      ] = js.native
    
    /**
      * Retrieve currently active user.
      * @summary Get Current User
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getCurrentUser(): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[User]
      ] = js.native
    def getCurrentUser(options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[User]
      ] = js.native
    
    /**
      * Retrieve all users for an organization.
      * @summary List Users
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listUsers(): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListUsersResponse]
      ] = js.native
    def listUsers(options: Any): js.Function2[
        /* fetch */ js.UndefOr[FetchAPI], 
        /* basePath */ js.UndefOr[String], 
        js.Promise[ListUsersResponse]
      ] = js.native
  }
  
  @js.native
  trait DeleteWorkspace extends StObject {
    
    /**
      * List workspaces under given workspace.
      * @summary List Workspaces
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def childWorkspaces(workspace: String): js.Promise[ListWorkspacesResponse] = js.native
    def childWorkspaces(workspace: String, options: Any): js.Promise[ListWorkspacesResponse] = js.native
    
    /**
      * Create a new workspace in your org.
      * @summary Create Workspace
      * @param {CreateWorkspaceRequest} body workspace details
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createWorkspace(body: CreateWorkspaceRequest): js.Promise[CreateWorkspaceResponse] = js.native
    def createWorkspace(body: CreateWorkspaceRequest, options: Any): js.Promise[CreateWorkspaceResponse] = js.native
    
    /**
      * Remove a workspace.
      * @summary Delete Workspace
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteWorkspace(workspace: String): js.Promise[DeleteWorkspaceResponse] = js.native
    def deleteWorkspace(workspace: String, options: Any): js.Promise[DeleteWorkspaceResponse] = js.native
    
    /**
      * Get information about a single workspace.
      * @summary Get Workspace
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getWorkspace(workspace: String): js.Promise[GetWorkspaceResponse] = js.native
    def getWorkspace(workspace: String, options: Any): js.Promise[GetWorkspaceResponse] = js.native
    
    /**
      * List all workspaces.
      * @summary List Workspaces
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listWorkspaces(): js.Promise[ListWorkspacesResponse] = js.native
    def listWorkspaces(options: Any): js.Promise[ListWorkspacesResponse] = js.native
  }
  
  @js.native
  trait GetCollection extends StObject {
    
    /**
      * Create new collection in a workspace.
      * @summary Create Collection
      * @param {string} workspace name of the workspace
      * @param {CreateCollectionRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
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
      */
    def getCollection(workspace: String, collection: String): js.Promise[GetCollectionResponse] = js.native
    def getCollection(workspace: String, collection: String, options: Any): js.Promise[GetCollectionResponse] = js.native
    
    /**
      * Retrieve all collections in an organization.
      * @summary List Collections
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
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
      */
    def listQueryLambdasInCollection(workspace: String, collection: String): js.Promise[ListQueryLambdaVersionsResponse] = js.native
    def listQueryLambdasInCollection(workspace: String, collection: String, options: Any): js.Promise[ListQueryLambdaVersionsResponse] = js.native
    
    /**
      * Retrieve all collections in a workspace.
      * @summary List Collections for Workspace
      * @param {string} workspace name of the workspace
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def workspaceCollections(workspace: String): js.Promise[ListCollectionsResponse] = js.native
    def workspaceCollections(workspace: String, options: Any): js.Promise[ListCollectionsResponse] = js.native
  }
  
  @js.native
  trait GetCurrentUser extends StObject {
    
    /**
      * Create a new user for an organization.
      * @summary Create User
      * @param {CreateUserRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createUser(body: CreateUserRequest): js.Promise[CreateUserResponse] = js.native
    def createUser(body: CreateUserRequest, options: Any): js.Promise[CreateUserResponse] = js.native
    
    /**
      * Delete a user from an organization.
      * @summary Delete User
      * @param {string} user user email
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteUser(user: String): js.Promise[DeleteUserResponse] = js.native
    def deleteUser(user: String, options: Any): js.Promise[DeleteUserResponse] = js.native
    
    /**
      * Retrieve currently active user.
      * @summary Get Current User
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getCurrentUser(): js.Promise[User] = js.native
    def getCurrentUser(options: Any): js.Promise[User] = js.native
    
    /**
      * Retrieve all users for an organization.
      * @summary List Users
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listUsers(): js.Promise[ListUsersResponse] = js.native
    def listUsers(options: Any): js.Promise[ListUsersResponse] = js.native
  }
  
  @js.native
  trait GetIntegration extends StObject {
    
    /**
      * Create a new integration with Rockset.
      * @summary Create Integration
      * @param {CreateIntegrationRequest} body integration credentials
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def createIntegration(body: CreateIntegrationRequest): js.Promise[CreateIntegrationResponse] = js.native
    def createIntegration(body: CreateIntegrationRequest, options: Any): js.Promise[CreateIntegrationResponse] = js.native
    
    /**
      * Remove an integration.
      * @summary Delete Integration
      * @param {string} integration name of the integration
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteIntegration(integration: String): js.Promise[DeleteIntegrationResponse] = js.native
    def deleteIntegration(integration: String, options: Any): js.Promise[DeleteIntegrationResponse] = js.native
    
    /**
      * Get information about a single integration.
      * @summary Get Integration
      * @param {string} integration name of the integration
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getIntegration(integration: String): js.Promise[GetIntegrationResponse] = js.native
    def getIntegration(integration: String, options: Any): js.Promise[GetIntegrationResponse] = js.native
    
    /**
      * List all integrations for organization.
      * @summary List Integrations
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def listIntegrations(): js.Promise[ListIntegrationsResponse] = js.native
    def listIntegrations(options: Any): js.Promise[ListIntegrationsResponse] = js.native
  }
  
  @js.native
  trait GetOrganization extends StObject {
    
    /**
      * Retrieve information about current organization.
      * @summary Get Organization
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def getOrganization(): FetchArgs = js.native
    def getOrganization(options: Any): FetchArgs = js.native
  }
  
  @js.native
  trait PatchDocuments extends StObject {
    
    /**
      * Add documents to a collection in Rockset.
      * @summary Add Documents
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {AddDocumentsRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def addDocuments(workspace: String, collection: String, body: AddDocumentsRequest): js.Promise[AddDocumentsResponse] = js.native
    def addDocuments(workspace: String, collection: String, body: AddDocumentsRequest, options: Any): js.Promise[AddDocumentsResponse] = js.native
    
    /**
      * Delete documents from a collection in Rockset.
      * @summary Delete Documents
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {DeleteDocumentsRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def deleteDocuments(workspace: String, collection: String, body: DeleteDocumentsRequest): js.Promise[DeleteDocumentsResponse] = js.native
    def deleteDocuments(workspace: String, collection: String, body: DeleteDocumentsRequest, options: Any): js.Promise[DeleteDocumentsResponse] = js.native
    
    /**
      * Patch documents in a collection
      * @summary Patch Documents
      * @param {string} workspace name of the workspace
      * @param {string} collection name of the collection
      * @param {PatchDocumentsRequest} body JSON Patch objects
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def patchDocuments(workspace: String, collection: String, body: PatchDocumentsRequest): js.Promise[PatchDocumentsResponse] = js.native
    def patchDocuments(workspace: String, collection: String, body: PatchDocumentsRequest, options: Any): js.Promise[PatchDocumentsResponse] = js.native
  }
  
  @js.native
  trait Query extends StObject {
    
    /**
      * Make a SQL query to Rockset.
      * @summary Query
      * @param {QueryRequest} body JSON object
      * @param {*} [options] Override http request option.
      * @throws {RequiredError}
      */
    def query(body: QueryRequest): FetchArgs = js.native
    def query(body: QueryRequest, options: Any): FetchArgs = js.native
  }
}
