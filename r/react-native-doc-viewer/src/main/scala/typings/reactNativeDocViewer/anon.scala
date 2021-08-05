package typings.reactNativeDocViewer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base64 extends StObject {
    
    var base64: String
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var fileType: js.UndefOr[String] = js.undefined
  }
  object Base64 {
    
    inline def apply(base64: String): Base64 = {
      val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base64]
    }
    
    extension [Self <: Base64](x: Self) {
      
      inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    }
  }
  
  trait Cache extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var fileNameOptional: js.UndefOr[String] = js.undefined
    
    var fileType: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object Cache {
    
    inline def apply(url: String): Cache = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cache]
    }
    
    extension [Self <: Cache](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameOptional(value: String): Self = StObject.set(x, "fileNameOptional", value.asInstanceOf[js.Any])
      
      inline def setFileNameOptionalUndefined: Self = StObject.set(x, "fileNameOptional", js.undefined)
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileName extends StObject {
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var fileType: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object FileName {
    
    inline def apply(url: String): FileName = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileName]
    }
    
    extension [Self <: FileName](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
