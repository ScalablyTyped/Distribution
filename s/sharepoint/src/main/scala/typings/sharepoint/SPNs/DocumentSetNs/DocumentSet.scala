package typings.sharepoint.SPNs.DocumentSetNs

import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ContentTypeId
import typings.sharepoint.SPNs.Folder
import typings.sharepoint.SPNs.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.DocumentSet.DocumentSet")
@js.native
class DocumentSet () extends ClientObject

/* static members */
@JSGlobal("SP.DocumentSet.DocumentSet")
@js.native
object DocumentSet extends js.Object {
  def create(context: ClientContext, parentFolder: Folder, name: String, ctid: ContentTypeId): StringResult = js.native
}

