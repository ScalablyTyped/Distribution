package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.DocumentSet")
@js.native
object DocumentSet extends js.Object {
  @js.native
  class DocumentSet () extends ClientObject
  
  /* static members */
  @js.native
  object DocumentSet extends js.Object {
    def create(context: ClientContext, parentFolder: Folder, name: String, ctid: ContentTypeId): StringResult = js.native
  }
  
}

