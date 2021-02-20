package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentSet {
  
  @JSGlobal("SP.DocumentSet.DocumentSet")
  @js.native
  class DocumentSet ()
    extends typings.sharepoint.SP.ClientObject
  object DocumentSet {
    
    /* static member */
    @JSGlobal("SP.DocumentSet.DocumentSet.create")
    @js.native
    def create(
      context: typings.sharepoint.SP.ClientContext,
      parentFolder: typings.sharepoint.SP.Folder,
      name: String,
      ctid: typings.sharepoint.SP.ContentTypeId
    ): typings.sharepoint.SP.StringResult = js.native
  }
}
