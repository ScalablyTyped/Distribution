package typings.reactNativeDocumentPicker

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object DocumentPicker {
    
    @JSImport("react-native-document-picker", "DocumentPicker")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def show(options: Options, callback: js.Function2[/* error */ Error, /* result */ Result, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object DocumentPickerUtil {
    
    @JSImport("react-native-document-picker", "DocumentPickerUtil")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def allFiles(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("allFiles")().asInstanceOf[String]
    
    @scala.inline
    def audio(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("audio")().asInstanceOf[String]
    
    @scala.inline
    def images(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("images")().asInstanceOf[String]
    
    @scala.inline
    def pdf(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pdf")().asInstanceOf[String]
    
    @scala.inline
    def plainText(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("plainText")().asInstanceOf[String]
    
    @scala.inline
    def video(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("video")().asInstanceOf[String]
  }
  
  trait Options extends StObject {
    
    var filetype: js.Array[String]
    
    var left: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(filetype: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(filetype = filetype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiletype(value: js.Array[String]): Self = StObject.set(x, "filetype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiletypeVarargs(value: String*): Self = StObject.set(x, "filetype", js.Array(value :_*))
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var fileName: String
    
    var fileSize: Double
    
    var `type`: String
    
    var uri: String
  }
  object Result {
    
    @scala.inline
    def apply(fileName: String, fileSize: Double, `type`: String, uri: String): Result = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
