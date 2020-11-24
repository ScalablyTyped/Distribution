package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipartBodyParser_ extends js.Object {
  
  var hash: js.UndefOr[String] = js.native
  
  var keepExtensions: js.UndefOr[Boolean] = js.native
  
  var mapFiles: js.UndefOr[Boolean] = js.native
  
  var mapParams: js.UndefOr[Boolean] = js.native
  
  var maxFieldsSize: js.UndefOr[Double] = js.native
  
  var maxFileSize: js.UndefOr[Double] = js.native
  
  var multipartFileHandler: js.UndefOr[js.Any] = js.native
  
  var multipartHandler: js.UndefOr[js.Any] = js.native
  
  var multiples: js.UndefOr[Boolean] = js.native
  
  var overrideParams: js.UndefOr[Boolean] = js.native
  
  var uploadDir: js.UndefOr[String] = js.native
}
object MultipartBodyParser_ {
  
  @scala.inline
  def apply(): MultipartBodyParser_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartBodyParser_]
  }
  
  @scala.inline
  implicit class MultipartBodyParser_Ops[Self <: MultipartBodyParser_] (val x: Self) extends AnyVal {
    
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setKeepExtensions(value: Boolean): Self = this.set("keepExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepExtensions: Self = this.set("keepExtensions", js.undefined)
    
    @scala.inline
    def setMapFiles(value: Boolean): Self = this.set("mapFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapFiles: Self = this.set("mapFiles", js.undefined)
    
    @scala.inline
    def setMapParams(value: Boolean): Self = this.set("mapParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapParams: Self = this.set("mapParams", js.undefined)
    
    @scala.inline
    def setMaxFieldsSize(value: Double): Self = this.set("maxFieldsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFieldsSize: Self = this.set("maxFieldsSize", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    
    @scala.inline
    def setMultipartFileHandler(value: js.Any): Self = this.set("multipartFileHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipartFileHandler: Self = this.set("multipartFileHandler", js.undefined)
    
    @scala.inline
    def setMultipartHandler(value: js.Any): Self = this.set("multipartHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipartHandler: Self = this.set("multipartHandler", js.undefined)
    
    @scala.inline
    def setMultiples(value: Boolean): Self = this.set("multiples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiples: Self = this.set("multiples", js.undefined)
    
    @scala.inline
    def setOverrideParams(value: Boolean): Self = this.set("overrideParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideParams: Self = this.set("overrideParams", js.undefined)
    
    @scala.inline
    def setUploadDir(value: String): Self = this.set("uploadDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadDir: Self = this.set("uploadDir", js.undefined)
  }
}
