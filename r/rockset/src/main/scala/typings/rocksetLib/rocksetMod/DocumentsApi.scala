package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentsApi extends js.Object {
  def add(workspace: java.lang.String, collection: java.lang.String, body: AddDocumentsRequest): AddDocumentsResponse = js.native
  def add(
    workspace: java.lang.String,
    collection: java.lang.String,
    body: AddDocumentsRequest,
    callback: RequestCallback
  ): AddDocumentsResponse = js.native
  def remove(workspace: java.lang.String, collection: java.lang.String, body: DeleteDocumentsRequest): DeleteDocumentsResponse = js.native
  def remove(
    workspace: java.lang.String,
    collection: java.lang.String,
    body: DeleteDocumentsRequest,
    callback: RequestCallback
  ): DeleteDocumentsResponse = js.native
}

