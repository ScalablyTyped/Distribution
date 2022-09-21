package typings.reactFileUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeTypesMod {
  
  @JSImport("react-file-utils/dist/components/FileIcon/mimeTypes", "archiveFileTypes")
  @js.native
  val archiveFileTypes: js.Array[String] = js.native
  
  @JSImport("react-file-utils/dist/components/FileIcon/mimeTypes", "codeFileTypes")
  @js.native
  val codeFileTypes: js.Array[String] = js.native
  
  @JSImport("react-file-utils/dist/components/FileIcon/mimeTypes", "excelMimeTypes")
  @js.native
  val excelMimeTypes: js.Array[String] = js.native
  
  @JSImport("react-file-utils/dist/components/FileIcon/mimeTypes", "powerpointMimeTypes")
  @js.native
  val powerpointMimeTypes: js.Array[String] = js.native
  
  @JSImport("react-file-utils/dist/components/FileIcon/mimeTypes", "wordMimeTypes")
  @js.native
  val wordMimeTypes: js.Array[String] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFileUtils.reactFileUtilsStrings.audioSlash
    - typings.reactFileUtils.reactFileUtilsStrings.videoSlash
    - typings.reactFileUtils.reactFileUtilsStrings.imageSlash
    - typings.reactFileUtils.reactFileUtilsStrings.textSlash
  */
  trait GeneralType extends StObject
  object GeneralType {
    
    inline def audioSlash: typings.reactFileUtils.reactFileUtilsStrings.audioSlash = "audio/".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.audioSlash]
    
    inline def imageSlash: typings.reactFileUtils.reactFileUtilsStrings.imageSlash = "image/".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.imageSlash]
    
    inline def textSlash: typings.reactFileUtils.reactFileUtilsStrings.textSlash = "text/".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.textSlash]
    
    inline def videoSlash: typings.reactFileUtils.reactFileUtilsStrings.videoSlash = "video/".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.videoSlash]
  }
  
  type SupportedMimeType = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[number] */ js.Any
}
