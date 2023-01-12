package typings.reactFileUtils

import typings.reactFileUtils.anon.Height
import typings.reactFileUtils.anon.LastModified
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type FileLike = Blob | File
  
  trait FileUpload
    extends StObject
       with UploadInfo {
    
    var file: LastModified
  }
  object FileUpload {
    
    inline def apply(file: LastModified, id: String, state: UploadState): FileUpload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUpload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUpload] (val x: Self) extends AnyVal {
      
      inline def setFile(value: LastModified): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageUpload
    extends StObject
       with UploadInfo {
    
    var file: Height
    
    var previewUri: js.UndefOr[String] = js.undefined
  }
  object ImageUpload {
    
    inline def apply(file: Height, id: String, state: UploadState): ImageUpload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageUpload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageUpload] (val x: Self) extends AnyVal {
      
      inline def setFile(value: Height): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setPreviewUri(value: String): Self = StObject.set(x, "previewUri", value.asInstanceOf[js.Any])
      
      inline def setPreviewUriUndefined: Self = StObject.set(x, "previewUri", js.undefined)
    }
  }
  
  trait UploadInfo extends StObject {
    
    var id: String
    
    var state: UploadState
    
    var url: js.UndefOr[String] = js.undefined
  }
  object UploadInfo {
    
    inline def apply(id: String, state: UploadState): UploadInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setState(value: UploadState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFileUtils.reactFileUtilsStrings.uploading
    - typings.reactFileUtils.reactFileUtilsStrings.finished
    - typings.reactFileUtils.reactFileUtilsStrings.failed
  */
  trait UploadState extends StObject
  object UploadState {
    
    inline def failed: typings.reactFileUtils.reactFileUtilsStrings.failed = "failed".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.failed]
    
    inline def finished: typings.reactFileUtils.reactFileUtilsStrings.finished = "finished".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.finished]
    
    inline def uploading: typings.reactFileUtils.reactFileUtilsStrings.uploading = "uploading".asInstanceOf[typings.reactFileUtils.reactFileUtilsStrings.uploading]
  }
}
