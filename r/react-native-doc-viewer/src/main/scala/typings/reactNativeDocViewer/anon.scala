package typings.reactNativeDocViewer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Base64 extends StObject {
    
    var base64: String = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var fileType: js.UndefOr[String] = js.native
  }
  object Base64 {
    
    @scala.inline
    def apply(base64: String): Base64 = {
      val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base64]
    }
    
    @scala.inline
    implicit class Base64MutableBuilder[Self <: Base64] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    }
  }
  
  @js.native
  trait Cache extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var fileNameOptional: js.UndefOr[String] = js.native
    
    var fileType: js.UndefOr[String] = js.native
    
    var url: String = js.native
  }
  object Cache {
    
    @scala.inline
    def apply(url: String): Cache = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameOptional(value: String): Self = StObject.set(x, "fileNameOptional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameOptionalUndefined: Self = StObject.set(x, "fileNameOptional", js.undefined)
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileName extends StObject {
    
    var fileName: js.UndefOr[String] = js.native
    
    var fileType: js.UndefOr[String] = js.native
    
    var url: String = js.native
  }
  object FileName {
    
    @scala.inline
    def apply(url: String): FileName = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileName]
    }
    
    @scala.inline
    implicit class FileNameMutableBuilder[Self <: FileName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
