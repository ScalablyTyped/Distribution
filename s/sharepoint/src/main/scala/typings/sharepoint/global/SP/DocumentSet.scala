package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentSet {
  
  @JSGlobal("SP.DocumentSet.DocumentSet")
  @js.native
  open class DocumentSet ()
    extends StObject
       with typings.sharepoint.SP.ClientObject
  object DocumentSet {
    
    @JSGlobal("SP.DocumentSet.DocumentSet")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(
      context: typings.sharepoint.SP.ClientContext,
      parentFolder: typings.sharepoint.SP.Folder,
      name: String,
      ctid: typings.sharepoint.SP.ContentTypeId
    ): typings.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(context.asInstanceOf[js.Any], parentFolder.asInstanceOf[js.Any], name.asInstanceOf[js.Any], ctid.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.StringResult]
  }
}
