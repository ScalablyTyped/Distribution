package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipartBodyParser_ extends StObject {
  
  var hash: js.UndefOr[String] = js.undefined
  
  var keepExtensions: js.UndefOr[Boolean] = js.undefined
  
  var mapFiles: js.UndefOr[Boolean] = js.undefined
  
  var mapParams: js.UndefOr[Boolean] = js.undefined
  
  var maxFieldsSize: js.UndefOr[Double] = js.undefined
  
  var maxFileSize: js.UndefOr[Double] = js.undefined
  
  var multipartFileHandler: js.UndefOr[js.Any] = js.undefined
  
  var multipartHandler: js.UndefOr[js.Any] = js.undefined
  
  var multiples: js.UndefOr[Boolean] = js.undefined
  
  var overrideParams: js.UndefOr[Boolean] = js.undefined
  
  var uploadDir: js.UndefOr[String] = js.undefined
}
object MultipartBodyParser_ {
  
  @scala.inline
  def apply(): MultipartBodyParser_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartBodyParser_]
  }
  
  @scala.inline
  implicit class MultipartBodyParser_MutableBuilder[Self <: MultipartBodyParser_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setKeepExtensions(value: Boolean): Self = StObject.set(x, "keepExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepExtensionsUndefined: Self = StObject.set(x, "keepExtensions", js.undefined)
    
    @scala.inline
    def setMapFiles(value: Boolean): Self = StObject.set(x, "mapFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapFilesUndefined: Self = StObject.set(x, "mapFiles", js.undefined)
    
    @scala.inline
    def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
    
    @scala.inline
    def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFieldsSizeUndefined: Self = StObject.set(x, "maxFieldsSize", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    @scala.inline
    def setMultipartFileHandler(value: js.Any): Self = StObject.set(x, "multipartFileHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartFileHandlerUndefined: Self = StObject.set(x, "multipartFileHandler", js.undefined)
    
    @scala.inline
    def setMultipartHandler(value: js.Any): Self = StObject.set(x, "multipartHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartHandlerUndefined: Self = StObject.set(x, "multipartHandler", js.undefined)
    
    @scala.inline
    def setMultiples(value: Boolean): Self = StObject.set(x, "multiples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplesUndefined: Self = StObject.set(x, "multiples", js.undefined)
    
    @scala.inline
    def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
    
    @scala.inline
    def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadDirUndefined: Self = StObject.set(x, "uploadDir", js.undefined)
  }
}
