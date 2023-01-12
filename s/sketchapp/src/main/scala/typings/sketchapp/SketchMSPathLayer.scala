package typings.sketchapp

import typings.sketchapp.sketchappStrings.oval
import typings.sketchapp.sketchappStrings.path
import typings.sketchapp.sketchappStrings.rectangle
import typings.sketchapp.sketchappStrings.shapePath
import typings.sketchapp.sketchappStrings.triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSPathLayer
  extends StObject
     with SketchMSLayer {
  
  @JSName("_class")
  var _class_SketchMSPathLayer: path | shapePath | rectangle | oval | triangle
  
  var edited: Boolean
  
  var isClosed: Boolean
  
  var pointRadiusBehaviour: Double
  
  var points: js.Array[SketchMSPoint]
}
object SketchMSPathLayer {
  
  inline def apply(
    _class: path | shapePath | rectangle | oval | triangle,
    booleanOperation: SketchMSLayerBooleanOperation,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    edited: Boolean,
    exportOptions: SketchMSLayerExportOptions,
    frame: SketchMSLayerFrame,
    hasClippingMask: Boolean,
    isClosed: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    name: String,
    nameIsFixed: Boolean,
    pointRadiusBehaviour: Double,
    points: js.Array[SketchMSPoint],
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle
  ): SketchMSPathLayer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], edited = edited.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], pointRadiusBehaviour = pointRadiusBehaviour.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSPathLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSPathLayer] (val x: Self) extends AnyVal {
    
    inline def setEdited(value: Boolean): Self = StObject.set(x, "edited", value.asInstanceOf[js.Any])
    
    inline def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
    
    inline def setPointRadiusBehaviour(value: Double): Self = StObject.set(x, "pointRadiusBehaviour", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[SketchMSPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: SketchMSPoint*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def set_class(value: path | shapePath | rectangle | oval | triangle): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
