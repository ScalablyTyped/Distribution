package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.rulerData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulerData
  extends StObject
     with AnyObject {
  
  var _class: rulerData
  
  var base: Double
  
  var guides: js.Array[Double]
}
object RulerData {
  
  inline def apply(base: Double, guides: js.Array[Double]): RulerData = {
    val __obj = js.Dynamic.literal(_class = "rulerData", base = base.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerData]
  }
  
  extension [Self <: RulerData](x: Self) {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setGuides(value: js.Array[Double]): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
    
    inline def setGuidesVarargs(value: Double*): Self = StObject.set(x, "guides", js.Array(value*))
    
    inline def set_class(value: rulerData): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
