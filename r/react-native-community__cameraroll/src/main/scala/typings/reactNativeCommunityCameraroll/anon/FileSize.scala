package typings.reactNativeCommunityCameraroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSize extends js.Object {
  
  /** Only set if the `include` parameter contains `fileSize`. */
  var fileSize: Double | Null = js.native
  
  /** Only set if the `include` parameter contains `filename`. */
  var filename: String | Null = js.native
  
  /** Only set if the `include` parameter contains `imageSize`. */
  var height: Double = js.native
  
  /**
    * Only set if the `include` parameter contains `playableDuration`.
    * Will be null for images.
    */
  var playableDuration: Double | Null = js.native
  
  var uri: String = js.native
  
  /** Only set if the `include` parameter contains `imageSize`. */
  var width: Double = js.native
}
object FileSize {
  
  @scala.inline
  def apply(height: Double, uri: String, width: Double): FileSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSize]
  }
  
  @scala.inline
  implicit class FileSizeOps[Self <: FileSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeNull: Self = this.set("fileSize", null)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameNull: Self = this.set("filename", null)
    
    @scala.inline
    def setPlayableDuration(value: Double): Self = this.set("playableDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayableDurationNull: Self = this.set("playableDuration", null)
  }
}
