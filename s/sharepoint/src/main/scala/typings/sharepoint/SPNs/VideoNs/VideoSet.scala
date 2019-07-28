package typings.sharepoint.SPNs.VideoNs

import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ContentTypeId
import typings.sharepoint.SPNs.DocumentSetNs.DocumentSet
import typings.sharepoint.SPNs.File
import typings.sharepoint.SPNs.Folder
import typings.sharepoint.SPNs.List
import typings.sharepoint.SPNs.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Video.VideoSet")
@js.native
class VideoSet () extends DocumentSet

/* static members */
@JSGlobal("SP.Video.VideoSet")
@js.native
object VideoSet extends js.Object {
  def createVideo(context: ClientContext, parentFolder: Folder, name: String, ctid: ContentTypeId): StringResult = js.native
  def getEmbedCode(context: ClientContext, videoPath: String, properties: EmbedCodeConfiguration): StringResult = js.native
  def migrateVideo[T](context: ClientContext, videoFile: File): typings.sharepoint.SPNs.ListItem[T] = js.native
  def uploadVideo(
    context: ClientContext,
    list: List[_],
    fileName: String,
    file: js.Array[_],
    overwriteIfExists: Boolean,
    parentFolderPath: String
  ): StringResult = js.native
}

