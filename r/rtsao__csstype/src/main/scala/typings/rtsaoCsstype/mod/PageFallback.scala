package typings.rtsaoCsstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageFallback[TLength] extends StObject {
  
  var bleed: js.UndefOr[PageBleedProperty[TLength] | js.Array[PageBleedProperty[TLength]]] = js.undefined
  
  var marks: js.UndefOr[PageMarksProperty | js.Array[PageMarksProperty]] = js.undefined
}
object PageFallback {
  
  inline def apply[TLength](): PageFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageFallback[TLength]]
  }
  
  extension [Self <: PageFallback[?], TLength](x: Self & PageFallback[TLength]) {
    
    inline def setBleed(value: PageBleedProperty[TLength] | js.Array[PageBleedProperty[TLength]]): Self = StObject.set(x, "bleed", value.asInstanceOf[js.Any])
    
    inline def setBleedUndefined: Self = StObject.set(x, "bleed", js.undefined)
    
    inline def setBleedVarargs(value: PageBleedProperty[TLength]*): Self = StObject.set(x, "bleed", js.Array(value*))
    
    inline def setMarks(value: PageMarksProperty | js.Array[PageMarksProperty]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    inline def setMarksVarargs(value: PageMarksProperty*): Self = StObject.set(x, "marks", js.Array(value*))
  }
}
