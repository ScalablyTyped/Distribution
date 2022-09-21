package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Video {
  
  @JSGlobal("SP.Video.EmbedCodeConfiguration")
  @js.native
  open class EmbedCodeConfiguration ()
    extends StObject
       with typings.sharepoint.SP.Video.EmbedCodeConfiguration {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
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
  
  @JSGlobal("SP.Video.VideoSet")
  @js.native
  open class VideoSet ()
    extends StObject
       with typings.sharepoint.SP.ClientObject
  object VideoSet {
    
    @JSGlobal("SP.Video.VideoSet")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createVideo(
      context: typings.sharepoint.SP.ClientContext,
      parentFolder: typings.sharepoint.SP.Folder,
      name: String,
      ctid: typings.sharepoint.SP.ContentTypeId
    ): typings.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("createVideo")(context.asInstanceOf[js.Any], parentFolder.asInstanceOf[js.Any], name.asInstanceOf[js.Any], ctid.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.StringResult]
    
    /* static member */
    inline def getEmbedCode(
      context: typings.sharepoint.SP.ClientContext,
      videoPath: String,
      properties: typings.sharepoint.SP.Video.EmbedCodeConfiguration
    ): typings.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getEmbedCode")(context.asInstanceOf[js.Any], videoPath.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.StringResult]
    
    /* static member */
    inline def migrateVideo[T](context: typings.sharepoint.SP.ClientContext, videoFile: typings.sharepoint.SP.File): typings.sharepoint.SP.ListItem[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("migrateVideo")(context.asInstanceOf[js.Any], videoFile.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.ListItem[T]]
    
    /* static member */
    inline def uploadVideo(
      context: typings.sharepoint.SP.ClientContext,
      list: typings.sharepoint.SP.List[Any],
      fileName: String,
      file: js.Array[Any],
      overwriteIfExists: Boolean,
      parentFolderPath: String
    ): typings.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadVideo")(context.asInstanceOf[js.Any], list.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], file.asInstanceOf[js.Any], overwriteIfExists.asInstanceOf[js.Any], parentFolderPath.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.StringResult]
  }
}
