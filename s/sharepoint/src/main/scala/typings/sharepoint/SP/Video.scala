package typings.sharepoint.SP

import typings.sharepoint.SP.DocumentSet.DocumentSet
import typings.sharepoint.SP.Video.EmbedCodeConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Video")
@js.native
object Video extends js.Object {
  @js.native
  class EmbedCodeConfiguration () extends ClientValueObject {
    def get_autoPlay(): Boolean = js.native
    def get_displayTitle(): Boolean = js.native
    def get_linkToOwnerProfilePage(): Boolean = js.native
    def get_linkToVideoHomePage(): Boolean = js.native
    def get_loop(): Boolean = js.native
    def get_pixelHeight(): Double = js.native
    def get_pixelWidth(): Double = js.native
    def get_previewImagePath(): String = js.native
    def get_startTime(): Double = js.native
    def set_autoPlay(value: Boolean): Boolean = js.native
    def set_displayTitle(value: Boolean): Boolean = js.native
    def set_linkToOwnerProfilePage(value: Boolean): Boolean = js.native
    def set_linkToVideoHomePage(value: Boolean): Boolean = js.native
    def set_loop(value: Boolean): Boolean = js.native
    def set_pixelHeight(value: Double): Double = js.native
    def set_pixelWidth(value: Double): Double = js.native
    def set_previewImagePath(value: String): String = js.native
    def set_startTime(value: Double): Double = js.native
  }
  
  @js.native
  class VideoSet () extends DocumentSet
  
  /* static members */
  @js.native
  object VideoSet extends js.Object {
    def createVideo(context: ClientContext, parentFolder: Folder, name: String, ctid: ContentTypeId): StringResult = js.native
    def getEmbedCode(context: ClientContext, videoPath: String, properties: EmbedCodeConfiguration): StringResult = js.native
    def migrateVideo[T](context: ClientContext, videoFile: File): typings.sharepoint.SP.ListItem[T] = js.native
    def uploadVideo(
      context: ClientContext,
      list: List[_],
      fileName: String,
      file: js.Array[_],
      overwriteIfExists: Boolean,
      parentFolderPath: String
    ): StringResult = js.native
  }
  
}

