package typings.socketIoFile.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var accepts: js.UndefOr[js.Array[String]] = js.native
  
  var chunkSize: js.UndefOr[Double] = js.native
  
  var maxFileSize: js.UndefOr[Double] = js.native
  
  var overwrite: js.UndefOr[Boolean] = js.native
  
  var rename: js.UndefOr[js.Function2[/* fileName */ String, /* fileInfo */ FileInfo, String]] = js.native
  
  var resume: js.UndefOr[Boolean] = js.native
  
  var transmissionDelay: js.UndefOr[Double] = js.native
  
  var uploadDir: String | StringDictionary[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(uploadDir: String | StringDictionary[String]): Options = {
    val __obj = js.Dynamic.literal(uploadDir = uploadDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setUploadDir(value: String | StringDictionary[String]): Self = this.set("uploadDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsVarargs(value: String*): Self = this.set("accepts", js.Array(value :_*))
    
    @scala.inline
    def setAccepts(value: js.Array[String]): Self = this.set("accepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccepts: Self = this.set("accepts", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    
    @scala.inline
    def setRename(value: (/* fileName */ String, /* fileInfo */ FileInfo) => String): Self = this.set("rename", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    
    @scala.inline
    def setResume(value: Boolean): Self = this.set("resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResume: Self = this.set("resume", js.undefined)
    
    @scala.inline
    def setTransmissionDelay(value: Double): Self = this.set("transmissionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransmissionDelay: Self = this.set("transmissionDelay", js.undefined)
  }
}
