package typings.reactNativeDocumentPicker

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object DocumentPicker {
    
    @JSImport("react-native-document-picker", "DocumentPicker.show")
    @js.native
    def show(options: Options, callback: js.Function2[/* error */ Error, /* result */ Result, Unit]): Unit = js.native
  }
  
  object DocumentPickerUtil {
    
    @JSImport("react-native-document-picker", "DocumentPickerUtil.allFiles")
    @js.native
    def allFiles(): String = js.native
    
    @JSImport("react-native-document-picker", "DocumentPickerUtil.audio")
    @js.native
    def audio(): String = js.native
    
    @JSImport("react-native-document-picker", "DocumentPickerUtil.images")
    @js.native
    def images(): String = js.native
    
    @JSImport("react-native-document-picker", "DocumentPickerUtil.pdf")
    @js.native
    def pdf(): String = js.native
    
    @JSImport("react-native-document-picker", "DocumentPickerUtil.plainText")
    @js.native
    def plainText(): String = js.native
    
    @JSImport("react-native-document-picker", "DocumentPickerUtil.video")
    @js.native
    def video(): String = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var filetype: js.Array[String] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
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
  
  @js.native
  trait Result extends StObject {
    
    var fileName: String = js.native
    
    var fileSize: Double = js.native
    
    var `type`: String = js.native
    
    var uri: String = js.native
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
