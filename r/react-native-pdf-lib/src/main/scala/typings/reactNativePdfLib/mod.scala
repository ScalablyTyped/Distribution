package typings.reactNativePdfLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-pdf-lib", "default.getDocumentsDirectory")
    @js.native
    def getDocumentsDirectory(): String = js.native
  }
  
  @JSImport("react-native-pdf-lib", "PDFDocument")
  @js.native
  class PDFDocument () extends StObject {
    
    def addPages(pages: js.Array[PDFPage]): PDFDocument = js.native
    
    /* Saves the document and returns the path to the file it wrote */
    def write(): js.Promise[String] = js.native
  }
  /* static members */
  object PDFDocument {
    
    @JSImport("react-native-pdf-lib", "PDFDocument.create")
    @js.native
    def create(path: String): PDFDocument = js.native
  }
  
  @JSImport("react-native-pdf-lib", "PDFPage")
  @js.native
  class PDFPage () extends StObject {
    
    def drawImage(imageUri: String): PDFPage = js.native
    def drawImage(imageUri: String, options: ImageDrawingOptions): PDFPage = js.native
    
    def drawRectangle(): PDFPage = js.native
    def drawRectangle(options: RectangleDrawingOptions): PDFPage = js.native
    
    def drawText(text: String): PDFPage = js.native
    def drawText(text: String, options: TextDrawingOptions): PDFPage = js.native
    
    def setMediaBox(width: Double, height: Double): PDFPage = js.native
    def setMediaBox(width: Double, height: Double, options: SetMediaBoxOptions): PDFPage = js.native
  }
  /* static members */
  object PDFPage {
    
    @JSImport("react-native-pdf-lib", "PDFPage.create")
    @js.native
    def create(): PDFPage = js.native
  }
  
  @js.native
  trait ImageDrawingOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object ImageDrawingOptions {
    
    @scala.inline
    def apply(): ImageDrawingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageDrawingOptions]
    }
    
    @scala.inline
    implicit class ImageDrawingOptionsMutableBuilder[Self <: ImageDrawingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait RectangleDrawingOptions extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object RectangleDrawingOptions {
    
    @scala.inline
    def apply(): RectangleDrawingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectangleDrawingOptions]
    }
    
    @scala.inline
    implicit class RectangleDrawingOptionsMutableBuilder[Self <: RectangleDrawingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait SetMediaBoxOptions extends StObject {
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object SetMediaBoxOptions {
    
    @scala.inline
    def apply(): SetMediaBoxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetMediaBoxOptions]
    }
    
    @scala.inline
    implicit class SetMediaBoxOptionsMutableBuilder[Self <: SetMediaBoxOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait TextDrawingOptions extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var fontName: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object TextDrawingOptions {
    
    @scala.inline
    def apply(): TextDrawingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextDrawingOptions]
    }
    
    @scala.inline
    implicit class TextDrawingOptionsMutableBuilder[Self <: TextDrawingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
