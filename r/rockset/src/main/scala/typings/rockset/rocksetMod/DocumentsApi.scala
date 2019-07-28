package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentsApi extends js.Object {
  def add(workspace: String, collection: String, body: AddDocumentsRequest): AddDocumentsResponse = js.native
  def add(workspace: String, collection: String, body: AddDocumentsRequest, callback: RequestCallback): AddDocumentsResponse = js.native
  def remove(workspace: String, collection: String, body: DeleteDocumentsRequest): DeleteDocumentsResponse = js.native
  def remove(workspace: String, collection: String, body: DeleteDocumentsRequest, callback: RequestCallback): DeleteDocumentsResponse = js.native
}

