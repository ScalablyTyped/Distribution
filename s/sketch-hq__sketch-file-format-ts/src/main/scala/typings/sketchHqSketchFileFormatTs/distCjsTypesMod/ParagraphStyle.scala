package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.paragraphStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParagraphStyle
  extends StObject
     with AnyObject {
  
  var _class: paragraphStyle
  
  var alignment: js.UndefOr[TextHorizontalAlignment] = js.undefined
  
  var allowsDefaultTighteningForTruncation: js.UndefOr[Double] = js.undefined
  
  var maximumLineHeight: js.UndefOr[Double] = js.undefined
  
  var minimumLineHeight: js.UndefOr[Double] = js.undefined
  
  var paragraphSpacing: js.UndefOr[Double] = js.undefined
}
object ParagraphStyle {
  
  inline def apply(): ParagraphStyle = {
    val __obj = js.Dynamic.literal(_class = "paragraphStyle")
    __obj.asInstanceOf[ParagraphStyle]
  }
  
  extension [Self <: ParagraphStyle](x: Self) {
    
    inline def setAlignment(value: TextHorizontalAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAllowsDefaultTighteningForTruncation(value: Double): Self = StObject.set(x, "allowsDefaultTighteningForTruncation", value.asInstanceOf[js.Any])
    
    inline def setAllowsDefaultTighteningForTruncationUndefined: Self = StObject.set(x, "allowsDefaultTighteningForTruncation", js.undefined)
    
    inline def setMaximumLineHeight(value: Double): Self = StObject.set(x, "maximumLineHeight", value.asInstanceOf[js.Any])
    
    inline def setMaximumLineHeightUndefined: Self = StObject.set(x, "maximumLineHeight", js.undefined)
    
    inline def setMinimumLineHeight(value: Double): Self = StObject.set(x, "minimumLineHeight", value.asInstanceOf[js.Any])
    
    inline def setMinimumLineHeightUndefined: Self = StObject.set(x, "minimumLineHeight", js.undefined)
    
    inline def setParagraphSpacing(value: Double): Self = StObject.set(x, "paragraphSpacing", value.asInstanceOf[js.Any])
    
    inline def setParagraphSpacingUndefined: Self = StObject.set(x, "paragraphSpacing", js.undefined)
    
    inline def set_class(value: paragraphStyle): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
