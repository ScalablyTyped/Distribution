package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentsApi extends StObject {
  
  def add(workspace: String, collection: String, body: AddDocumentsRequest): AddDocumentsResponse = js.native
  def add(workspace: String, collection: String, body: AddDocumentsRequest, callback: RequestCallback): AddDocumentsResponse = js.native
  
  def remove(workspace: String, collection: String, body: DeleteDocumentsRequest): DeleteDocumentsResponse = js.native
  def remove(workspace: String, collection: String, body: DeleteDocumentsRequest, callback: RequestCallback): DeleteDocumentsResponse = js.native
}
