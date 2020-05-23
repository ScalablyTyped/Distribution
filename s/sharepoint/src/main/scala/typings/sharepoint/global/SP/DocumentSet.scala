package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.DocumentSet")
@js.native
object DocumentSet extends js.Object {
  @js.native
  class DocumentSet ()
    extends typings.sharepoint.SP.ClientObject
  
  /* static members */
  @js.native
  object DocumentSet extends js.Object {
    def create(
      context: typings.sharepoint.SP.ClientContext,
      parentFolder: typings.sharepoint.SP.Folder,
      name: String,
      ctid: typings.sharepoint.SP.ContentTypeId
    ): typings.sharepoint.SP.StringResult = js.native
  }
  
}

