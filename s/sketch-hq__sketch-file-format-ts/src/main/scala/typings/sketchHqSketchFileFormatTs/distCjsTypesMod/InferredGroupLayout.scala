package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutableInferredGroupLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferredGroupLayout
  extends StObject
     with AnyObject {
  
  var _class: MSImmutableInferredGroupLayout
  
  var axis: InferredLayoutAxis
  
  var layoutAnchor: InferredLayoutAnchor
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  var minSize: js.UndefOr[Double] = js.undefined
}
object InferredGroupLayout {
  
  inline def apply(axis: InferredLayoutAxis, layoutAnchor: InferredLayoutAnchor): InferredGroupLayout = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableInferredGroupLayout", axis = axis.asInstanceOf[js.Any], layoutAnchor = layoutAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferredGroupLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferredGroupLayout] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: InferredLayoutAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setLayoutAnchor(value: InferredLayoutAnchor): Self = StObject.set(x, "layoutAnchor", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def set_class(value: MSImmutableInferredGroupLayout): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
