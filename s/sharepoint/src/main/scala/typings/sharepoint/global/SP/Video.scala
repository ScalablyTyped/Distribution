package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Video")
@js.native
object Video extends js.Object {
  @js.native
  class EmbedCodeConfiguration ()
    extends typings.sharepoint.SP.Video.EmbedCodeConfiguration
  
  @js.native
  class VideoSet ()
    extends typings.sharepoint.SP.ClientObject
  
  /* static members */
  @js.native
  object VideoSet extends js.Object {
    def createVideo(
      context: typings.sharepoint.SP.ClientContext,
      parentFolder: typings.sharepoint.SP.Folder,
      name: String,
      ctid: typings.sharepoint.SP.ContentTypeId
    ): typings.sharepoint.SP.StringResult = js.native
    def getEmbedCode(
      context: typings.sharepoint.SP.ClientContext,
      videoPath: String,
      properties: typings.sharepoint.SP.Video.EmbedCodeConfiguration
    ): typings.sharepoint.SP.StringResult = js.native
    def migrateVideo[T](context: typings.sharepoint.SP.ClientContext, videoFile: typings.sharepoint.SP.File): typings.sharepoint.SP.ListItem[T] = js.native
    def uploadVideo(
      context: typings.sharepoint.SP.ClientContext,
      list: typings.sharepoint.SP.List[_],
      fileName: String,
      file: js.Array[_],
      overwriteIfExists: Boolean,
      parentFolderPath: String
    ): typings.sharepoint.SP.StringResult = js.native
  }
  
}

