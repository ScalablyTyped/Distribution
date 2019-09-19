package typings.sketchapp

import typings.sketchapp.sketchappStrings.oval
import typings.sketchapp.sketchappStrings.path
import typings.sketchapp.sketchappStrings.rectangle
import typings.sketchapp.sketchappStrings.shapePath
import typings.sketchapp.sketchappStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPathLayer extends SketchMSLayer {
  @JSName("_class")
  var _class_SketchMSPathLayer: path | shapePath | rectangle | oval | triangle
  var edited: Boolean
  var isClosed: Boolean
  var pointRadiusBehaviour: Double
  var points: js.Array[SketchMSPoint]
}

object SketchMSPathLayer {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], booleanOperation = booleanOperation, clippingMaskMode = clippingMaskMode, do_objectID = do_objectID, edited = edited, exportOptions = exportOptions, frame = frame, hasClippingMask = hasClippingMask, isClosed = isClosed, isFixedToViewport = isFixedToViewport, isFlippedHorizontal = isFlippedHorizontal, isFlippedVertical = isFlippedVertical, isLocked = isLocked, isVisible = isVisible, layerListExpandedType = layerListExpandedType, name = name, nameIsFixed = nameIsFixed, pointRadiusBehaviour = pointRadiusBehaviour, points = points, resizingConstraint = resizingConstraint, resizingType = resizingType, rotation = rotation, shouldBreakMaskChain = shouldBreakMaskChain, style = style)
  
    __obj.asInstanceOf[SketchMSPathLayer]
  }
}

