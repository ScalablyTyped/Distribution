package typings.sketchapp

import typings.sketchapp.sketchappStrings.rulerData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSRulerData extends StObject {
  
  var _class: rulerData = js.native
  
  var base: Double = js.native
  
  var guides: js.Array[_] = js.native
}
object SketchMSRulerData {
  
  @scala.inline
  def apply(_class: rulerData, base: Double, guides: js.Array[_]): SketchMSRulerData = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSRulerData]
  }
  
  @scala.inline
  implicit class SketchMSRulerDataMutableBuilder[Self <: SketchMSRulerData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuides(value: js.Array[_]): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidesVarargs(value: js.Any*): Self = StObject.set(x, "guides", js.Array(value :_*))
    
    @scala.inline
    def set_class(value: rulerData): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
