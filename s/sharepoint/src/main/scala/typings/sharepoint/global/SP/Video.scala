package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Video")
@js.native
object Video extends js.Object {
  @js.native
  class EmbedCodeConfiguration ()
    extends typings.sharepoint.SP.Video.EmbedCodeConfiguration {
    /* CompleteClass */
    override def customFromJson(obj: js.Any): Boolean = js.native
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    /* CompleteClass */
    override def fromJson(obj: js.Any): Unit = js.native
    /* CompleteClass */
    override def get_autoPlay(): Boolean = js.native
    /* CompleteClass */
    override def get_displayTitle(): Boolean = js.native
    /* CompleteClass */
    override def get_linkToOwnerProfilePage(): Boolean = js.native
    /* CompleteClass */
    override def get_linkToVideoHomePage(): Boolean = js.native
    /* CompleteClass */
    override def get_loop(): Boolean = js.native
    /* CompleteClass */
    override def get_pixelHeight(): Double = js.native
    /* CompleteClass */
    override def get_pixelWidth(): Double = js.native
    /* CompleteClass */
    override def get_previewImagePath(): String = js.native
    /* CompleteClass */
    override def get_startTime(): Double = js.native
    /* CompleteClass */
    override def get_typeId(): String = js.native
    /* CompleteClass */
    override def set_autoPlay(value: Boolean): Boolean = js.native
    /* CompleteClass */
    override def set_displayTitle(value: Boolean): Boolean = js.native
    /* CompleteClass */
    override def set_linkToOwnerProfilePage(value: Boolean): Boolean = js.native
    /* CompleteClass */
    override def set_linkToVideoHomePage(value: Boolean): Boolean = js.native
    /* CompleteClass */
    override def set_loop(value: Boolean): Boolean = js.native
    /* CompleteClass */
    override def set_pixelHeight(value: Double): Double = js.native
    /* CompleteClass */
    override def set_pixelWidth(value: Double): Double = js.native
    /* CompleteClass */
    override def set_previewImagePath(value: String): String = js.native
    /* CompleteClass */
    override def set_startTime(value: Double): Double = js.native
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
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

