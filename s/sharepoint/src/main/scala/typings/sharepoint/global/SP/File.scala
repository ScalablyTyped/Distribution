package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a file in a SharePoint Web site that can be a Web Part Page, an item in a document library, or a file in a folder. */
@JSGlobal("SP.File")
@js.native
open class File ()
  extends StObject
     with typings.sharepoint.SP.File
object File {
  
  @JSGlobal("SP.File")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getContentVerFromTag(context: typings.sharepoint.SP.ClientRuntimeContext, contentTag: String): typings.sharepoint.SP.IntResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getContentVerFromTag")(context.asInstanceOf[js.Any], contentTag.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.IntResult]
}
