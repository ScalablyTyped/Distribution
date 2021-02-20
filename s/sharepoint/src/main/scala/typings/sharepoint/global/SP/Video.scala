package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Video {
  
  @JSGlobal("SP.Video.EmbedCodeConfiguration")
  @js.native
  class EmbedCodeConfiguration ()
    extends typings.sharepoint.SP.Video.EmbedCodeConfiguration
  
  @JSGlobal("SP.Video.VideoSet")
  @js.native
  class VideoSet ()
    extends typings.sharepoint.SP.ClientObject
  object VideoSet {
    
    /* static member */
    @JSGlobal("SP.Video.VideoSet.createVideo")
    @js.native
    def createVideo(
      context: typings.sharepoint.SP.ClientContext,
      parentFolder: typings.sharepoint.SP.Folder,
      name: String,
      ctid: typings.sharepoint.SP.ContentTypeId
    ): typings.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Video.VideoSet.getEmbedCode")
    @js.native
    def getEmbedCode(
      context: typings.sharepoint.SP.ClientContext,
      videoPath: String,
      properties: typings.sharepoint.SP.Video.EmbedCodeConfiguration
    ): typings.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Video.VideoSet.migrateVideo")
    @js.native
    def migrateVideo[T](context: typings.sharepoint.SP.ClientContext, videoFile: typings.sharepoint.SP.File): typings.sharepoint.SP.ListItem[T] = js.native
    
    /* static member */
    @JSGlobal("SP.Video.VideoSet.uploadVideo")
    @js.native
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
