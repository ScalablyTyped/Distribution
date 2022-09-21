package typings.rockset.apiMod

import typings.rockset.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen/api", "DocumentsApi")
@js.native
open class DocumentsApi () extends BaseAPI {
  def this(configuration: Configuration) = this()
  def this(configuration: Unit, basePath: String) = this()
  def this(configuration: Configuration, basePath: String) = this()
  def this(configuration: Unit, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Unit, basePath: Unit, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: Unit, fetch: FetchAPI) = this()
  
  /**
    * Add documents to a collection in Rockset.
    * @summary Add Documents
    * @param {string} workspace name of the workspace
    * @param {string} collection name of the collection
    * @param {AddDocumentsRequest} body JSON object
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof DocumentsApi
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
    * @memberof DocumentsApi
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
    * @memberof DocumentsApi
    */
  def patchDocuments(workspace: String, collection: String, body: PatchDocumentsRequest): js.Promise[PatchDocumentsResponse] = js.native
  def patchDocuments(workspace: String, collection: String, body: PatchDocumentsRequest, options: Any): js.Promise[PatchDocumentsResponse] = js.native
}
