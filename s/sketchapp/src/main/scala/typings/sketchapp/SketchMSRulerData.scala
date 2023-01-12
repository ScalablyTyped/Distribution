package typings.sketchapp

import typings.sketchapp.sketchappStrings.rulerData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSRulerData extends StObject {
  
  var _class: rulerData
  
  var base: Double
  
  var guides: js.Array[Any]
}
object SketchMSRulerData {
  
  inline def apply(base: Double, guides: js.Array[Any]): SketchMSRulerData = {
    val __obj = js.Dynamic.literal(_class = "rulerData", base = base.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSRulerData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSRulerData] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setGuides(value: js.Array[Any]): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
    
    inline def setGuidesVarargs(value: Any*): Self = StObject.set(x, "guides", js.Array(value*))
    
    inline def set_class(value: rulerData): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
