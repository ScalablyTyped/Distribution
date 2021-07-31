package typings.reactNativeHtmlToPdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-html-to-pdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convert(options: Options): js.Promise[Pdf] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Pdf]]
  
  trait Options extends StObject {
    
    var base64: js.UndefOr[Boolean] = js.undefined
    
    var bgColor: js.UndefOr[String] = js.undefined
    
    var directory: js.UndefOr[String] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    // android only
    var fonts: js.UndefOr[js.Array[String]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var html: String
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var paddingBottom: js.UndefOr[Double] = js.undefined
    
    // iOS only
    var paddingLeft: js.UndefOr[Double] = js.undefined
    
    var paddingRight: js.UndefOr[Double] = js.undefined
    
    var paddingTop: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(html: String): Options = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      @scala.inline
      def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFonts(value: js.Array[String]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      @scala.inline
      def setFontsVarargs(value: String*): Self = StObject.set(x, "fonts", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Pdf extends StObject {
    
    var base64: js.UndefOr[String] = js.undefined
    
    var filePath: js.UndefOr[String] = js.undefined
  }
  object Pdf {
    
    @scala.inline
    def apply(): Pdf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pdf]
    }
    
    @scala.inline
    implicit class PdfMutableBuilder[Self <: Pdf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    }
  }
}
