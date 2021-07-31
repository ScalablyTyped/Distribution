package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUploadDoneData extends StObject {
  
  val progress: Double
  
  val url: js.UndefOr[String] = js.undefined
}
object FileUploadDoneData {
  
  @scala.inline
  def apply(progress: Double): FileUploadDoneData = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadDoneData]
  }
  
  @scala.inline
  implicit class FileUploadDoneDataMutableBuilder[Self <: FileUploadDoneData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
