package typings.reactNativePdfLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-pdf-lib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDocumentsDirectory(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentsDirectory")().asInstanceOf[String]
  }
  
  @JSImport("react-native-pdf-lib", "PDFDocument")
  @js.native
  open class PDFDocument () extends StObject {
    
    def addPages(pages: js.Array[PDFPage]): PDFDocument = js.native
    
    /* Saves the document and returns the path to the file it wrote */
    def write(): js.Promise[String] = js.native
  }
  /* static members */
  object PDFDocument {
    
    @JSImport("react-native-pdf-lib", "PDFDocument")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(path: String): PDFDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(path.asInstanceOf[js.Any]).asInstanceOf[PDFDocument]
  }
  
  @JSImport("react-native-pdf-lib", "PDFPage")
  @js.native
  open class PDFPage () extends StObject {
    
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
    
    @JSImport("react-native-pdf-lib", "PDFPage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): PDFPage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PDFPage]
  }
  
  trait ImageDrawingOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object ImageDrawingOptions {
    
    inline def apply(): ImageDrawingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageDrawingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageDrawingOptions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait RectangleDrawingOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object RectangleDrawingOptions {
    
    inline def apply(): RectangleDrawingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectangleDrawingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RectangleDrawingOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait SetMediaBoxOptions extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object SetMediaBoxOptions {
    
    inline def apply(): SetMediaBoxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetMediaBoxOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetMediaBoxOptions] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait TextDrawingOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var fontName: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object TextDrawingOptions {
    
    inline def apply(): TextDrawingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextDrawingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextDrawingOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
