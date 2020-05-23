package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a file in a SharePoint Web site that can be a Web Part Page, an item in a document library, or a file in a folder. */
@JSGlobal("SP.File")
@js.native
class File ()
  extends typings.sharepoint.SP.File

/* static members */
@JSGlobal("SP.File")
@js.native
object File extends js.Object {
  def getContentVerFromTag(context: typings.sharepoint.SP.ClientRuntimeContext, contentTag: String): typings.sharepoint.SP.IntResult = js.native
}

