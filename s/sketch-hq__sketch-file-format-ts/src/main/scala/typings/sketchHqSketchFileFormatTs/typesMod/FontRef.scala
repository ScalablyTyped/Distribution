package typings.sketchHqSketchFileFormatTs.typesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.fontReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontRef
  extends StObject
     with AnyObject {
  
  var _class: fontReference
  
  var fontData: DataRef
  
  var fontFamilyName: String
  
  var fontFileName: String
  
  var options: Double
  
  var postscriptNames: js.Array[String]
}
object FontRef {
  
  inline def apply(
    fontData: DataRef,
    fontFamilyName: String,
    fontFileName: String,
    options: Double,
    postscriptNames: js.Array[String]
  ): FontRef = {
    val __obj = js.Dynamic.literal(_class = "fontReference", fontData = fontData.asInstanceOf[js.Any], fontFamilyName = fontFamilyName.asInstanceOf[js.Any], fontFileName = fontFileName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], postscriptNames = postscriptNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontRef]
  }
  
  extension [Self <: FontRef](x: Self) {
    
    inline def setFontData(value: DataRef): Self = StObject.set(x, "fontData", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyName(value: String): Self = StObject.set(x, "fontFamilyName", value.asInstanceOf[js.Any])
    
    inline def setFontFileName(value: String): Self = StObject.set(x, "fontFileName", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Double): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPostscriptNames(value: js.Array[String]): Self = StObject.set(x, "postscriptNames", value.asInstanceOf[js.Any])
    
    inline def setPostscriptNamesVarargs(value: String*): Self = StObject.set(x, "postscriptNames", js.Array(value*))
    
    inline def set_class(value: fontReference): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
